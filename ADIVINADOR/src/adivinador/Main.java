/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinador;

import java.util.Scanner;

/**
 *
 * @author Mervi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Bienvenidos a Mehdi el adivinador!");
        System.out.println("");
        System.out.println("Piensa en un miembro de la familia Zaidane o UN PERSONAJE NO REAL. \nPulsa ENTER para empezar:");
        String listo = sc.nextLine();
        
        
        System.out.println("¿ES REAL?");
        String real = sc.nextLine();
        if (real.contains("i")){
        System.out.println("¿ES HOMBRE o MUJER?");
        String gender = sc.nextLine();
        if (gender.equals("mujer") || gender.equals("MUJER") || gender.contains("ujer")){
            System.out.println("¿ES JOVEN O VIEJA?");
            String edad = sc.nextLine();
            if (edad.equals("JOVEN") || edad.equals("joven") || edad.equals("Joven")){
                System.out.println("¿SE LE CONOCE EN CASA POR TENER 1241514 NOVIOS?");
                String respuesta1 = sc.nextLine();
                if (respuesta1.contains ("i")){
                    System.out.println("ESTAS PENSANDO EN MERYAM.");
                    
                }else{
                    System.out.println("¿TIENE 4 OJOS? O ¿USA GAFAS?");
                    String respuesta2 = sc.nextLine();
                    if (respuesta2.contains("i")){
                        System.out.println("ESTAS PENSANDO EN JAMILA.");
                    } else {
                        System.out.println("¿SE LE CONOCE POR COMER TODO LO QUE HAYA DE LA NEVERA?");
                        String respuesta3 = sc.nextLine();
                        if (respuesta3.contains("i")){
                            System.out.println("ESTAS PENSANDO EN NADIA.");
                        } else {
                            System.out.println("ESTAS PENSANDO EN FATIMA.");
                        }
                    }
                }
            } else {
                System.out.println("¿VIVE EN MARRUECOS?");
                String respuesta4 = sc.nextLine();
                if (respuesta4.contains("i")){
                    System.out.println("ESTAS PENSANDO EN MOI.");
                } else {
                    System.out.println("ESTAS PENSANDO EN MAMA.");
                }
            }
        } else {
            System.out.println("¿ES JOVEN O VIEJO?");
            String edad2 = sc.nextLine();
            if (edad2.equals("JOVEN") || edad2.equals("joven") || edad2.equals("Joven")){
                System.out.println("¿VIVE EN ESPAÑA AHORA MISMO?");
                String respuesta4 = sc.nextLine();
                if (respuesta4.contains("i")){
                    System.out.println("ESTAS PENSANDO EN MOHAMMED.");
                } else {
                    System.out.println("¿ES EL MEJOR JUGADOR DE FUTBOL DE LA CASA?");
                    String respuesta5 = sc.nextLine();
                    if (respuesta5.contains("i")){
                        System.out.println("ESTAS PENSANDO EN MEHDI.");
                    } else
                        System.out.println("ESTAS PENSANDO EN EL TONTO DE ZAKARIA.");
                }
            } else {
                System.out.println("ESTAS PENSANDO EN BABA.");
            }
        }
    } else {
            System.out.println("¿ES UNA PERSONA EN ESA SERIE?");
            String persona = sc.nextLine();
            if (persona.contains("i")){
                System.out.println("¿ES UN CHICA O CHICO?");
                String gender3 = sc.nextLine();
                if (gender3.contains("hico")){
                    System.out.println("¿SE LE CONOCIA POR SER TONTO o UN PRINGADO?");
                    String pringado = sc.nextLine();
                    if (pringado.contains("i")){
                        System.out.println("¿APARECE EN LA SERIE SINCHAN?");
                        String sinchan = sc.nextLine();
                        if (sinchan.contains("i")){
                            System.out.println("¿MOSTRABA LA TROMPA?");
                            String trompa = sc.nextLine();
                            if (trompa.contains("i")){
                                System.out.println("ESTAS PENSANDO EN EL TRAVIESO DE SIN CHAN.");
                            } else {
                                System.out.println("¿SE LE CAI LOS MOCOS?");
                                String mocos = sc.nextLine();
                                if (mocos.contains ("i")){
                                    System.out.println("ESTAS PENSANDO EN EL MOCO DE BOCHAN.");
                                } else {
                                    System.out.println("ESTAS PENSANDO EN MASAO.");
                                }
                            }
                        } else {
                            System.out.println("ESTAS PENSANDO EN NOBITA.");
                        }
                    } else {
                        System.out.println("¿JUEGA AL FUTBOL?");
                        String futbol = sc.nextLine();
                        if (futbol.contains("i")){
                            System.out.println("¿ES PORTERO?");
                            String portero = sc.nextLine();
                            if (portero.contains("i")){
                                System.out.println("ESTAS PENSANDO EN MARK EVANS.");
                            } else {
                                System.out.println("¿SUS HABILIDADES TIENE FUEGO?");
                                String fuego = sc.nextLine();
                                if (fuego.contains ("i")){
                                    System.out.println("ESTAS PENSANDO EN AXEL BLAZE.");
                                } else {
                                    System.out.println("¿SUS HABILIDADES TIENEN HIELO?");
                                    String hielo = sc.nextLine();
                                    if (hielo.contains("i")){
                                        System.out.println("ESTAS PENSANDO EN SHAWN FROST.");
                                    } else {
                                        System.out.println("ESTAS PENSANDO EN JUDTH SHARP.");
                                    }
                                }
                            }
                        } else {
                            System.out.println("¿USA GORRA?");
                            String gorra = sc.nextLine();
                            if (gorra.contains("i")){
                                System.out.println("ESTAS PENSANDO EN ASH KETCHUMP.");
                            } else {
                                System.out.println("¿APARECE EN LA FAMOSO SERIE LLAMADA DORAEMON?");
                                String doraemon = sc.nextLine();
                                if (doraemon.contains("i")){
                                    System.out.println("¿ES GORDO?");
                                    String gordo = sc.nextLine();
                                    if (gordo.contains("i")){
                                        System.out.println("ESTAS PENSANDO EN GIGANTE.");
                                    } else {
                                        System.out.println("ESTAS PENSANDO EN SUNEO.");
                                    }
                                } else {
                                    System.out.println("¿ES PADRE?");
                                    String padre = sc.nextLine();
                                    if (padre.contains("i")){
                                        System.out.println("ES EL PADRE DE SIN CHAN.");
                                    } else {
                                        System.out.println("ESTAS PENSANDO EN KAZAMA.");
                                    }
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("¿ES MADRE?");
                    String madre = sc.nextLine();
                    if (madre.contains("i")){
                        System.out.println("¿PEGA A SU HIJO?");
                        String pega = sc.nextLine();
                        if (pega.contains("i")){
                            System.out.println("ESTAS PENSANDO EN LA MADRE DE SINCHAN.");
                        } else {
                            System.out.println("ESTAS PENSANDO EN LA MADRE DE NOBITA.");
                        }
                    } else {
                        System.out.println("¿APARECE EN SINCHAN?");
                        String aparece = sc.nextLine();
                        if (aparece.contains("i")){
                            System.out.println("¿ES UN BEBE?");
                            String nene = sc.nextLine();
                            if (nene.contains("i")){
                                System.out.println("ESTAS PENSANDO EN HIMAGUARI.");
                            } else {
                                System.out.println("ESTAS PENSANDO EN NENE.");
                            }
                        } else {
                            System.out.println("ESTAS PENSANDO EN SIZUKA.");
                        }
                    }
                }
            } else {
                System.out.println("¿ES UN ANIMAL?");
                String animal = sc.nextLine();
                if (animal.contains("i")){
                    System.out.println("¿ES MACHO?");
                    String macho = sc.nextLine();
                    if (macho.contains("i")){
                        System.out.println("¿VIVE EN EL FONDO DEL MAR?");
                        String fondo = sc.nextLine();
                        if (fondo.contains("i")){
                            System.out.println("¿SIRVE TAMBIEN PARA LIMPIAR?");
                            String limpiar = sc.nextLine();
                            if (limpiar.contains("i")){
                                System.out.println("ESTAS PENSANDO EN BOB ESPONJA.");
                            } else {
                                System.out.println("¿ES EL MEJOR AMIGO DE BOB ESPONJA?");
                                String bob = sc.nextLine();
                                if (bob.contains("i")){
                                    System.out.println("ESTAS PENSANDO EN PATRICIO ESTRELLA.");
                                    
                                } else {
                                    System.out.println("¿ES MUY MUY MUY PEQUEÑO?");
                                    String pequeño = sc.nextLine();
                                    if (pequeño.contains("i")){
                                        System.out.println("ESTAS PENSANDO EN PLANTOM.");
                                        
                                    } else {
                                        System.out.println("¿VIVE EN UNA CASA CON SU CARA?");
                                        String cara = sc.nextLine();
                                        if (cara.contains("i")){
                                            System.out.println("ESTAS PENSANDO EN CALAMARDO.");
                                        } else {
                                            System.out.println("ESTAS PENSANDO EN EL SEÑOR CANGREJO.");
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("¿ES UN GATO?");
                            String gato = sc.nextLine();
                            if (gato.contains("i")){
                                System.out.println("¿TIENE OREJAS?");
                                String orejas = sc.nextLine();
                                if (orejas.contains("i")){
                                    System.out.println("ESTAS PENSANDO EN GUMBALL.");
                                } else {
                                    System.out.println("ESTAS PENSANDO EN DORAEMON.");
                                }
                            } else {
                                System.out.println("¿ES BLANCO?");
                                String blanco = sc.nextLine();
                                if (blanco.contains("i")){
                                    System.out.println("ESTAS PENSANDO EN NEVADO.");
                                } else {
                                    System.out.println("ESTAS PENSANDO EN DARWIN.");
                                }
                            }
                        }
                    } else {
                        System.out.println("¿ES UNA GATA?");
                        String gata = sc.nextLine();
                        if (gata.contains("i")){
                            System.out.println("¿ES AMARILLA?");
                            String amarilla = sc.nextLine();
                            if (amarilla.contains("i")){
                                System.out.println("ESTAS PENSANDO EN DORAMI.");
                            } else {
                                System.out.println("ESTAS PENSANDO EN ANAIS."); 
                                      
                            }
                        } else {
                            System.out.println("ESTAS PENSANDO EN ARENITA.");
                        }
                    }
                } else {
                    System.out.println("¿ES ROJO?");
                    String rojo = sc.nextLine();
                    if (rojo.contains("i")){
                        System.out.println("¿ES UNA EVOLUCION?");
                        String evolucion = sc.nextLine();
                        if (evolucion.contains("i")){
                            System.out.println("ESTAS PENSANDO EN CHARIZARD.");
                        } else{
                            System.out.println("ESTAS PENSANDO EN CHARMANDER.");
                        }
                    } else {
                        System.out.println("¿ES EL MEJOR AMIGO DE ASH?");
                        String amigo = sc.nextLine();
                        if (amigo.contains("i")){
                            System.out.println("ESTAS PENSANDO EN PIKACHU.");
                        } else {
                            System.out.println("¿SALE EN EL MEME DE VAMO A CALMARNO?");
                            String meme = sc.nextLine();
                            if (meme.contains("i")){
                                System.out.println("ESTAS PENSANDO EN SQUIRTLE.");
                            } else {
                                System.out.println("ESTAS PENSANDO EN DIOS.");
                            }
                        }
                    }
                }
            }
        }
}
}
