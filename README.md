# UNIT-ED1-RevisaoPOO
Revisão de Programação Orientada Objetos da Disciplina de Estrutura de Dados Da UNIT

1. Implemente a classe abstrata Item que contenha: </br>
a.	Atributos públicos para armazenar as informações de título, ano de lançamento e comentário;</br>
b.	Construtores padrão e específico</br>
c.	Gets e Sets específicos</br>
d.	Método abstrato ListaInformacoes() sem retorno.


2. Implemente a classe Disco, subclasse de Item, que contenha :</br>
a.	O nome do artista do disco, a quantidade de faixas e a mídia (CD ou DVD) </br>
b.	Construtores padrão e específico</br>
c.	Gets e Sets específicos</br>
d.	Implementação do método abstrato ListaInformacoes() sem retorno.


3. Implemente a classe Filme, subclasse de Item, que contenha :</br>
a.	O nome do diretor, a duração (em min) e o gênero do filme (drama, comédia, terror, suspense, animação, etc). </br>
b.	Construtores padrão e específico</br>
c.	Gets e Sets específicos</br>
d.	Implementação do método abstrato ListaInformacoes() sem retorno.


4. Implemente a classe Locadora que contenha:</br>
a.	Um array de classe Disco de tamanho 2;</br>
b.	Um array de classe Filme de tamanho 2;</br>
c.	Variável inteira indiceD que controlará o array de classe Disco;</br>
d.	Variável inteira indiceF que controlará o array de classe Filme;</br>
e.	Somente o construtor padrão que inicializará as variáveis indiceD e indiceF com zero, além disso criará os dois arrays de tamanho 2;</br>
f.	Um método chamado novoDisco(Disco d) sem retorno que deve receber um Disco via parâmetro e inseri-lo no array;</br>
g.	Um método chamado novoFilme(Filme f) sem retorno que deve receber um Filme via parâmetro e inseri-lo no array;</br>
h.	Um método ListarDiscos() sem retorno que deve imprimir no console as informações de todos os discos guardados pelo array. Vai utilizar o método ListaInformacoes() de Disco;</br>
i.	Um método ListarFilmes() sem retorno que deve imprimir no console as informações de todos os filmes guardados pelo array. Vai utilizar o método ListaInformacoes() de Filme;
