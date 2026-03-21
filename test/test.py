import subprocess
import time

def ejecutar():
    resultado = subprocess.run(
        ["java", "sorteo_dado.SorteoDado"],
        cwd="..",
        capture_output=True,
        text=True
    )
    return resultado.stdout

print(ejecutar())

n = 10

inicio = time.perf_counter()

for i in range(n):
    salida = ejecutar()
    print(f"\n--- Ejecución {i+1} ---")
    print(salida)

fin = time.perf_counter()

print("\n=== TIEMPO TOTAL ===")
print(f"{fin - inicio:.6f} segundos")

print("=== TIEMPO PROMEDIO ===")
print(f"{(fin - inicio)/n:.6f} segundos")
