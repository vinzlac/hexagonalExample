# hexagonalExample
- A simple example inspired from https://github.com/tpierrain/hexagonalThis project (live-code with Alistair about Hexagonal Architecture)
- In java instead of C#

## Steps (carpaccio style)

### Alistair wants an application that provides poetry.

#### Steps:
1. Test-drive the design of our 1st port (i.e. the intention, represented in Java with an interface: __IRequestVerses__ and a first method: __GiveMeSomePoetry()__). 
    - This very first version of the business logic (i.e.: the __PoetryReader__ type) returns an hard-coded result.
    - The left-side adapter is both the unit test framework and the test calling the port


