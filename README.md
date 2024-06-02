Descrição do Projeto

O projeto "Posto de Combustível" consiste em um algoritmo simples desenvolvido em Java para simular a venda de combustível em um posto. O programa permite ao usuário selecionar o tipo de combustível (gasolina ou álcool), informar a quantidade desejada em litros e se caso tiver fidelidade para aplicar descontos.

Funcionalidades Principais
Seleção do tipo de combustível: O usuário pode escolher entre gasolina ou álcool.
Informação da quantidade em litros: Permite ao usuário inserir a quantidade de combustível desejada.
Programa de fidelidade: O usuário pode optar por utilizar o programa de fidelidade para receber descontos nas compras.
Cálculo do valor total e do desconto: Com base nas informações fornecidas, o programa calcula o valor total da compra e, se aplicável, o valor do desconto.
Executando o Programa
Para executar o programa, basta compilar o arquivo postoComb.java e rodar o arquivo resultante. O usuário será solicitado a inserir as informações necessárias para a compra.

Casos de Teste
Para garantir a qualidade do programa, foram implementados diversos casos de teste, abordando diferentes cenários e condições possíveis. Alguns dos casos de teste incluem:

1)Teste com fidelidade ativada e quantidade em litros maior que 20.
2)Teste com fidelidade desativada e quantidade em litros menor ou igual a 20.
3)Teste com tipo de combustível inválido.
4)Teste com quantidade em litros negativa.
5)Teste com desconto aplicado.
6)Teste sem desconto aplicado.
7)Teste com fidelidade desativada e quantidade em litros maior que 20.

Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) para relatar bugs ou propor novas funcionalidades. 
Além disso, pull requests para melhorias no código serão avaliados e considerados.

Este é um projeto simples para demonstrar o funcionamento de um algoritmo básico em Java e como casos de teste podem ser aplicados para garantir sua qualidade. 
Se você tiver alguma dúvida ou sugestão, não hesite em entrar em contato: https://puppejr.github.io/

                    Template de apoio à Atividade de Teste de Software
                           MOOC Introdução ao Teste de Software 


1. Apresentação do Cenário
O algoritmo do posto de combustível é um programa em Java que calcula o valor total a ser pago
pelos clientes ao abastecerem seus veículos, aplicando descontos caso o cliente tenha um cartão de
fidelidade. O algoritmo permite escolher entre três tipos de combustíveis (Gasolina, Álcool e Diesel),
calcula o desconto aplicável, e armazena as informações de venda, incluindo o total e o desconto,
para futuras referências. As principais funcionalidades incluem a escolha do combustível, a
verificação da fidelidade e o cálculo do valor final com ou sem desconto.
2. Técnicas e Critérios Utilizados
Para testar o algoritmo, utilizamos a técnica de Teste Funcional com o critério de Análise do Valor
Limite. O objetivo é garantir que o algoritmo funcione corretamente para os valores exatos e seus
limites, além de verificar o comportamento do sistema em situações de fronteira.
3. Projeto de Casos de Teste
Teste Funcional com Critério de Análise do Valor Limite
Variáveis de entrada:
 Fidelidade (1 para sim, 2 para não)
 Tipo de combustível (1 para Gasolina, 2 para Álcool, 3 para Diesel)
 Quantidade em litros
Classes de equivalência válidas e inválidas:
 Fidelidade: {1, 2} (válidas), {0, 3, -1} (inválidas)
 Tipo de combustível: {1, 2, 3} (válidas), {0, 4, -1} (inválidas)
 Quantidade em litros: {1, 20, 21} (válidas), {-5, 0, 1000} (inválidas)
Casos de Teste Considerados:
Teste Fidelidade Combustível Litros Total Esperado Desconto Esperado
1 1 1 (Gasolina) 20 4.3 * 20 * 0.92 4.3 * 20 * 0.08
2 2 1 (Gasolina) 21 4.3 * 21 0
3 1 2 (Álcool) 20 3.5 * 20 * 0.95 3.5 * 20 * 0.05
4 2 2 (Álcool) 21 3.5 * 21 0
5 1 3 (Diesel) 20 3.9 * 20 * 0.97 3.9 * 20 * 0.03
6 2 3 (Diesel) 21 3.9 * 21 0
7 1 4 (Inválido) 20 Mensagem de erro N/A
Teste Fidelidade Combustível Litros Total Esperado Desconto Esperado
8 2 1 (Gasolina) -5 Mensagem de erro N/A
4. Execução dos Testes
Ferramentas Utilizadas:
 Eclipse IDE para escrever e executar o código Java.
 JUnit para automação dos testes unitários.
Execução:
1. Configuração do Ambiente de Teste:
 Configuramos o Eclipse IDE com o JUnit.
 Escrevemos os casos de teste como métodos de teste JUnit.
2. Execução de Casos de Teste:
 Executamos cada método de teste para verificar o comportamento do algoritmo.
 Registramos os resultados e comparamos com os resultados esperados.
3. Resultados Obtidos:
 Os resultados de cada teste foram registrados automaticamente pelo JUnit.
 Os valores calculados pelo algoritmo foram comparados com os valores esperados.
Resultados do Teste:
Teste Resultado Retornado Descrição dos Erros (caso ocorram)
1
O valor final é: 79.36. O desconto foi de:
6.88
-
2 O total é: 90.3 -
3 O valor final é: 66.5. O desconto foi de: 3.5 -
4 O total é: 73.5 -
5
O valor final é: 75.66. O desconto foi de:
2.34
-
6 O total é: 81.9 -
7 Tipo de combustível inválido. -
8 Tipo de combustível inválido. Deve tratar quantidade negativa corretamente
Template de apoio à Atividade de Teste de Software
Criado para o MOOC Introdução ao Teste de Software – Plataforma Coursera
5. Análise dos Resultados e Próximos Passos
Conclusões:
 O algoritmo funciona corretamente para a maioria dos casos testados.
 O tratamento de entradas inválidas foi feito corretamente para o tipo de combustível.
 Precisa melhorar a validação para quantidade de litros negativa.
Outras Técnicas ou Ferramentas Necessárias:
 Teste de Mutação para avaliar a robustez do código.
 Teste Estrutural para cobertura de código e garantia de que todas as partes do algoritmo
são exercitadas.
Próximos Passos:
 Implementar validações adicionais para quantidade de litros.
 Executar testes de mutação para identificar possíveis pontos fracos no código.
 Realizar testes de carga para avaliar o desempenho do algoritmo com grandes volumes de
dados.


Por Paulo Fernando Puppe Junior





