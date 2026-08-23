## Exercício 02 - Unidade 01
#### Tabela de Resultados - BuscaVetor
| Tamanho do Vetor | Busca Linear (ms) | Busca Binária (ms) |
|------------------|-------------------|--------------------|
| 10.000.000       | 7781200           | 105300             |

#### Análises
Ao aumentar a base de dados (tamanho) para **10 milhôes de elementos**, a disparidade entre os métodos fica evidente que:

1. **Busca Linear**: Percorre elementos por elementos sequencialmnete. Para $10^7$ posições, o tempo cresce em proporção direta ao tamanho do vetor.

2. **Busca Binária**: Ao contrário da linear, ao dividir o espaço de busca pela mentade, mesmo com 10 milhoes de posições, são necessárias no máximo $24$ comparações, tornando a execução praticamente instantânea.
