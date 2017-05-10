%HECHOS
material(a, papel).
material(a, madera).
material(a, tela).

material(b, aceite).
material(b, gas).
material(b, lubricante).

material(c, magnesio).
material(c, sodio).
material(c, postasio).

extintor(a, agua).
extintor(a, sustancia-quimica-seca).

extintor(b, co2).
extintor(b, sustancia-quimica-seca).

extintor(c, co2).
extintor(c, espuma).

puedo(apagar).

%HECHOS 2 - Entrada de usuario
seQuema(papel).
extintorDe(agua).

%REGLAS
tipoIncendio(Y) :- material(Y, X), seQuema(X).
tipoExtintor(Y) :- extintor(Y, X), extintorDe(X).
puedoApagar(Z) :- tipoIncendio(X), tipoExtintor(X), puedo(Z).
