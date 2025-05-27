package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            // Crear una nueva instancia de la clase
            Exercise29 exercise = new Exercise29();

            // Llamar al método para imprimir el mensaje
            exercise.printMessage();
        } catch (Exception e) {
            // Controlar cualquier excepción que ocurra
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    public void printMessage() {
        System.out.println("Mensaje desde printMessage()");
    }
}