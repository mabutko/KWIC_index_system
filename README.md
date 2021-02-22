# KWIC_index_system
The Key Word In Context index system Java implementation


The key word in context (KWIC) index system is described in [Parnas72] and [GS93] as follows:

The KWIC index system accepts an ordered set of lines, each line is an ordered set of words, and each word is an ordered set of characters. Any line may be "circularly shifted" by repeatedly removing the first word and appending it at the end of the line. The KWIC index system outputs all circular shifts of all lines in alphabetical order.
Your task is to create an object-oriented design for the KWIC system and a prototype implementation that realizes your design.

General purpose of KWIC: The KWIC index system was and is still in use for various purposes, mainly in libraries, archives, journalism, etc. One of the main purposes of the KWIC system is to list the keywords from various parts of a book, provide the context of a keyword and also the page number where the keyword is used within a book.


Requirements and assumptions for the design:

Use the principle of "information hiding" and include (at least) classes that encapsulate the following design decisions:

- The input media and data format
- The format for storing the lines in the input
- The algorithm for computing the circularly shifted lines and the format for storing the result
- The algorithm for sorting the circularly shifted lines and the format for storing the result
- The output media and data format

