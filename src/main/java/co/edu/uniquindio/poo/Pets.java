package co.edu.uniquindio.poo;

public record Pets(String name, Species species, Breed breed, byte age, Gender gender, Colour colour, double weight,String dniCode) {

    public Pets{
    assert name != null && !name.isBlank(): "Faltan datos en name.";
    assert species != null: "Faltan datos en species.";
    assert breed != null: "Faltan datos en breed.";
    assert age > 0: "Faltan datos en age.";
    assert gender != null: "Faltan datos en gender.";
    assert colour != null: "Faltan datos en color.";
    assert weight > 0: "El peso debe ser mayor a 0";
    assert dniCode != null && !dniCode.isBlank(): "Faltan datos en name.";
    }

    public void add(Pets pets) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
