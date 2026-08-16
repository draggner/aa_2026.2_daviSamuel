#### Investigando Força Bruta - ComparaBuscas.java
| Tamanho do Vetor | Busca Linear (ms) | Busca Binária (ms) |
|------------------|-------------------|--------------------|
| 10               | 1600              | 15600              |
| 100              | 1600              | 14800              |
| 1.000            | X                 | X                  |
| 10.000           | X                 | X                  |
| 100.000          | X                 | X                  |
| 1.000.000        | X                 | X                  |

##### Busca Linear e Busca Binária
**Complexidade aplicada - Busca Linear**: A busca linear consiste resumidamente em comparar elemento por elemtno, logo se o tamanho do vetor dobra, o tempo médio de execução também dobra.

**Complexidade aplicada - Busca Binária**:  Diferente da **Busca Linear**, a Binária busca dividir o espaço de busca pela metade, ou seja, mesmo se houver o aumento do vetor, terá uma busca bem mais eficiente.
