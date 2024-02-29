package co.edu.uniquindio.poo;

enum species{
    DOG,
    CAT,
    HAMSTER,
    OTROS
}

public record Pets(String name, String species, String breed, byte age, String gender, String color, double weight) {
    public Pets{
        assert name != null && !name.isBlank(): "Faltan datos en name.";
        assert species != null && !species.isBlank(): "Faltan datos en species.";
        assert breed != null && !breed.isBlank(): "Faltan datos en breed.";
        assert age > 0: "Faltan datos en age.";
        assert gender != null && !gender.isBlank(): "Faltan datos en gender.";
        assert color != null && !color.isBlank(): "Faltan datos en color.";
        assert weight > 0: "El peso debe ser mayor a 0";
    }

    
}
