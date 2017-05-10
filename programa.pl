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

%REGLAS
% X=material y Y=extintor de y C=tipo incendio
puedoApagar(X, Y) :- material(C, X), extintor(C, Y).