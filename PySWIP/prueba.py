from pyswip import Prolog



prolog = Prolog()
prolog.consult("programa.pl")
print list(prolog.query("seQuema(papel)"))
print list(prolog.query("extintorDe(agua)"))
print list(prolog.query("puedoApagar(X)"))


        
