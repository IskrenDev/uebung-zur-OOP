# Projektidee: Bibliotheksverwaltungssystem

## Beschreibung:
Ein System zur Verwaltung von Büchern in einer Bibliothek. Nutzer können Bücher suchen, ausleihen und zurückgeben. Das System verfolgt auch, welche Bücher aktuell ausgeliehen sind und von wem.

## Konzepte und deren Anwendung:

### Klassen und Objekte:

Klasse Buch: Enthält Eigenschaften wie Titel, Autor, ISBN-Nummer und Status (ausgeliehen oder verfügbar).
Klasse Nutzer: Enthält Informationen über den Nutzer wie Name, Mitgliedsnummer und ausgeliehene Bücher.
### Vererbung:

Klasse Fachbuch erbt von Buch: Ein spezielles Buch mit zusätzlichen Eigenschaften wie Fachgebiet oder Schwierigkeitsgrad.
Klasse Roman erbt von Buch: Ein spezielles Buch mit zusätzlichen Eigenschaften wie Genre oder Hauptcharaktere.
### Modifier static:

In der Klasse Bibliothek: Eine statische Methode, die die Gesamtzahl der Bücher in der Bibliothek zurückgibt.
In der Klasse Nutzer: Eine statische Methode, die die Gesamtzahl der registrierten Nutzer zurückgibt.
### Interfaces:

Interface Ausleihbar: Enthält Methoden wie ausleihen(), zurückgeben() und istAusgeliehen(). Die Klassen Buch, Fachbuch und Roman implementieren dieses Interface.
Interface Suchbar: Enthält eine Methode suchen(), die von der Klasse Bibliothek implementiert wird, um Bücher nach verschiedenen Kriterien zu suchen.