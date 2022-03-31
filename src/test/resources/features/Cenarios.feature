# language:pt
Funcionalidade:Fazer uma busca

  Cenario: Realizar uma busca
    Dado que eu esteja no site
    Quando insiro uma palavra para pesquisar
    Entao eu espero que as informações referentes a busca que eu solicitei sejam apresentadas

    Cenario: Busca credenciado
      Dado que eu esteja no site
      E acesse a rede socnet na aba funcionalidade
      E clico em credenciados
      Quando preencho os filtros para buscar um credenciado
      Entao espero que o site retorne os credenciados de acordo