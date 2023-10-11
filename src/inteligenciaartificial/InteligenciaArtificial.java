/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inteligenciaartificial;

import java.util.Scanner;

/**
 *
 * @author papop
 */
public class InteligenciaArtificial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("\tBienvenido a la Inteligencia Artificial Sobre Hilo\n");
        
        while(true)
        {
            Scanner Pre = new Scanner(System.in);

            System.out.println("Que deseas que te responda\n");

            String Pregunta = Pre.nextLine();

            System.out.println(" ");

            Scanner Tip = new Scanner(System.in);

            System.out.println("La Respuesta a su pregunta la desea en base a Java o Phyton\n");

            String Tipo = Tip.nextLine();

            boolean Opcion = true;
            
            switch (Pregunta)
            {
                case "¿En que se basa la programacion en hilos?"://1
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Tambien conocidos como threads son caracteristicas o subprocesos de java que permiten la ejecucion al mismo tiempo de diversas partes de un programa y con ello llevando al maximo de utilizacion de recursos de una CPU.\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("La programacion en hilos, tambien conocida como programacion multihilo o concurrencia, se basa en la capacidad de un programa para ejecutar multiples hilos de ejecucion simultaneamente.\n ");
                            break;
                        }
                    }
                    break;
                }
                case "¿Cuales son los ciclos de un hilo?"://2
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Al ser considerado como subprocesos estos cuentan con ciclos de vida que básicamente es la division de los procesos tales como:\n"
                                    + "\n" + "Nuevo: Este proceso tambien es conocido como hilo nacido, y es el momento anterior al inicio del hilo" 
                                    + "\n" + "Ejecutable: Una vez pasada la parte del nacimiento de hilo, inicia la parte ejecutable del hilo, inicializando su tarea programada" 
                                    + "\n" + "Espera: Un hilo puede entrar en estado de espera si es que este requiere la ejecucion otro hilo, mientras que el segundo hilo termina su ejecucion se encuentra en espera de continuacion de su ejecucion" 
                                    + "\n" + "Espera Cronometrada: Este proceso se basa en detener un hilo que esta siendo ejecutado en un estado de espera dependiente de un intervalo de tiempo establecido por el programador, vuelvo a su proceso de ejecución cuando el tiempo finalice" 
                                    + "\n" + "Terminado (Finalizado): El ultimo proceso en un ciclo de vida de un hilo se da cuando este termina la tarea.");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("En Python, los ciclos de un hilo se refieren a las diferentes fases o estados que puede atravesar un hilo durante su ciclo de vida tales como :\n "
                            +"\n"+ " nuevo:En este estado, el hilo ha sido creado, pero aun no ha comenzado su ejecucion."
                            +"\n"+ "listo:En este estado, el hilo esta listo para ejecutarse, pero aun no ha sido seleccionado para ejecutarse por el planificador de hilos."
                            +"\n"+ "ejecucion:En este estado, el hilo se esta ejecutando activamente en la CPU. Solo un hilo puede estar en este estado a la vez en un nucleo de CPU"
                            +"\n"+ "bloqueado:Un hilo puede entrar en este estado cuando se bloquea temporalmente, por ejemplo, cuando esta esperando la finalización de una operación de E/S."
                            +"\n"+ "terminado:Cuando un hilo ha completado su ejecucion o se ha detenido explicitamente, entra en este estado y se considera muerto." );
                            break;
                        }
                    }
                    break;
                }
                case "¿Como funcionan las prioridades de un hilo?"://3
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("En java los subprocesos o hilos se establecen en un orden para ayudar a identificar el orden de programacion de un hilo, para ello se dividen en tres categorias: \n"
                                    + "\n"
                                    + "MIN_PRIORITY (constante de 1).\n"
                                    + "NORMAL_PRIORITY (constante de 5).\n"
                                    + "MAX_PRIORITY (constante de 10).\n"
                                    + "\n"
                                    + "Generalmente a la hora de programar se le asigna un periodo de tiempo de ejecución menor a los hilos de mayor prioridad que a los de menor prioridad.\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("En Python, los hilos no tienen prioridades nativas en el sentido en que los hilos, la prioridad de ejecucion de los hilos en Python se gestionan de la siguiente manera:\n "
                            +"\n"+ "Planificador del sistema operativo"
                            +"\n"+"Prioridades dinamicas"
                            +"\n"+"GIL ");
                            break;
                        }
                    }
                    break;
                }
                case "¿De que forma puedo crear un hilo?"://4
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Para la creación de un hilo en java se pueden utilizar dos formas distintas de hacerlo, la primera forma consiste en crear una subclase de nombre Thread y programar la tarea mediante un metodo run() donde se desarrollara la mayor parte de la programacion de nuestro hilo. La segunda forma se basa en la utilizacion de Runnable que proviene de otro objeto e instancia el paquete de java.lang.Runnable.\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Puedes crear un hilo en Python utilizando el modulo threading, que proporciona una API para trabajar con hilos.\n ");
                            break;
                        }
                    }
                    break;
                }
                case "Creacion de hilo por medio de la subclase Thread"://5
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Para la creacion de un hilo debemos crear una subclase de nuestro programa principal como en el siguiente ejemplo:\n" +
 "\n"
                                    + "public class HiloEjemplo extends Thread {\n"
                                    + "\n"
                                    + "public void run () { // Codigo a ejecutar\n"
                                    + "	try {\n"
                                    + "	       System.out.println(Hola soy un hilo); \n"
                                    + "                   Thread.sleep(4000);\n"
                                    + "	       }catch (InterruptedException e) {\n"
                                    + "                         e.printStackTrace();\n"
                                    + "                   {\n"
                                    + "	}\n"
                                    + "}\n"
                                    + "\n"
                                    + "public class Main { // programa principal\n"
                                    + " \n"
                                    + "   public estatic void main (String[] args) {\n"
                                    + "	HiloEjemplo Hilo = new HiloEjemplo (); // Instanciar la subclae\n"
                                    + "	Hlilo.start(); // Iniciar Hilo\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Puedes crear un hilo en Python mediante la creacion de una subclase de la clase Thread del modulo threading. Al hacerlo, puedes personalizar el comportamiento del hilo al sobrescribir el metodo run() de la subclase.\n ");
                            break;
                        }
                    }
                    break;
                }
                case "Creacion de hilo por medio de Runnable"://6
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Para la creacion de un hilo debemos crear un objeto de nuestro programa principal como en el siguiente ejemplo:\n" +
 "\n"
                                    + "public class HiloEjemplo implements Runnable {\n"
                                    + "\n"
                                    + "public void run () { // Codigo a ejecutar\n"
                                    + "	try {\n"
                                    + "	       System.out.println(Hola soy              un hilo); \n"
                                    + "                   Thread.sleep(4000);\n"
                                    + "	       }catch (InterruptedException e) {\n"
                                    + "                         e.printStackTrace();\n"
                                    + "                   {\n"
                                    + "	}\n"
                                    + "}\n"
                                    + "\n"
                                    + "public class Main { // programa principal\n"
                                    + " \n"
                                    + "   public estatic void main (String[] args) {\n"
                                    + "	HiloEjemplo Hilo = new HiloEjemplo ();\n"
                                    + "Thread thread = new Thread(Hilo);\n"
                                    + "Thread.start(); // Iniciar hilo;\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("En Python, no existe un concepto directo de Runnable como lo encontrarias en lenguajes como Java. para hacerlo tienes que hacer:\n "
                                    + "# Define una funcion que se ejecutara en el hilo\n"
                                    + "# Crea dos hilos utilizando la funcion como target\n"
                                    + "# Inicia los hilos\n"
                                    + "# Espera a que ambos hilos terminen \n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Que es una implementacion Anonima de Runnable?"://7
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Una implementacion anonima de la interfaz Runnable hace referencia a la instancia de esta en cualquier lugar del codigo sin la necesidad de crear una clase diferente a la principal, con el fin de ejecutar un conjunto de codigos que no van a ser reutilizados más adelante en el programa.\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("La implementacion anonima de un Runnable es un concepto que proviene de lenguajes de programacion como Java, donde Runnable es una interfaz que se utiliza para definir un hilo de ejecucion en un programa multihilo.\n ");
                            break;
                        }
                    }
                    break;
                }
                case "Ejemplo de como realizar una instancia Anonima de la interfaz Runnable"://8
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Un ejemplo de instanciar anonimamente una interfaz Runnable es el siguiente:\n" +
"\n" 
                                    + "Runnable hilo = new Runnable (){\n"
                                    + "	public void run() {\n"
                                    + "		System.out.println(Hola soy un hilo anónimo); \n"
                                    + "	}\n"
                                    + "}\n");
                            break;
                        }
                        case "Phyton":
                        {
                            System.out.println("En Python, no existe una interfaz Runnable como en Java, por lo que el concepto de instancia anonima de Runnable no se aplica directamente.\n"
                                    + "# Crea un hilo utilizando una funcion lambda\n"
                                    + "# Inicia el hilo\n"
                                    + "# Espera a que el hilo termine\n ");
                            break;
                        }
                    }
                    break;
                }
                case "Es posible hacer una implementacion anonima de la interfaz Runnable por medio de una expresion Lambda"://9
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Si es posible ya que estas expresiones sirven para la simplificacion de clases anonimas y debido a que la interfaz Runnable se considera una sola interfaz funcional por medio de la expresion lambda permite compactar sus comportamientos.\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Si, es posible lograr una implementacion similar a una interfaz Runnable utilizando una expresion lambda en Python. Aunque Python no tiene una interfaz Runnable como Java, puedes usar funciones lambda para definir tareas simples que se ejecuten en hilos.\n ");
                            break;
                        }
                    }
                    break;
                }
                case "Ejemplo de instanciar una interfaz Runnable por medio de una expresion Lambda": //10
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Claro, con justo te puedo ayudar mostrandote de forma sencilla y concreta como se debe instanciar una interfaz Runnable con una expresion Lambda:\n" +
 "\n"
                                    + "Runnable hilo = ()  { System.out.println(Hola soy un ejecutable runnable lambda);};\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println(" En Python, no existe una interfaz Runnable como en Java, por lo que no es necesario instanciar una interfaz en el sentido en que se haria en Java. Sin embargo, puedes utilizar funciones lambda para crear objetos con comportamiento similar al de una interfaz Runnable de Java.\n "
                            +"# Define una funcion lambda que actua como una interfaz Runnable\n"
                            + "runnable = lambda: print(Tarea en un hilo)\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Para que es util la implementacion de un hilo con un ejecutable?"://11
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Cuando se desea que nuestro programa realice ciertas acciones de forma concurrente o periodica se utiliza este tipo de programacion de hilos no solo logrando este objetivo si no tambien para mejorar la eficiencia a la hora de funcionar nuestro programa.\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("La implementacion de un hilo con un ejecutable en Python puede ser util en diversas situaciones en las que deseas ejecutar codigo en un hilo separado para lograr concurrencia en tu programa.\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿De que forma puedo declarar un hilo con un ejecutable?"://12
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Para poder declarar un hilo con un ejecutable debes seguir la siguiente estructura:\n" +
 "\n"
                                    + "Runnable runnable = new Hilo ();\n"
                                    + "Thread thread = new Thread(runnable);\n"
                                    + "Thread.start(); // Iniciar hilo;\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("En Python, puedes declarar e iniciar un hilo con un ejecutable mediante la creacion de una instancia de la clase Thread del modulo threading\n"
                            +"# Define una funcion que servira como el ejecutable del hilo\n"
                            +"# Crea un objeto Thread y pasa la funcion ejecutable como target\n"
                            +"# threading.Thread target=ejecutable\n"
                            +"# Inicia el hilo\n"
                            +"  mi_hilo.start()\n"
                            +"# Espera a que el hilo termine \n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Por que mi codigo de hilo no ejecuta si estoy iniciando mi hilo con la linea mihilo.run()?"://13
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("El metodo mihilo.run() esta siendo inicializado y ejecutado por el proceso o clase principal, por lo tanto tu subclase o en este caso mihilo no esta ejecutando el funcionamiento o acción que le programaste, para poder corregir esto debes reemplazar mihilo.run(); por mihilo.start();\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Si se esta utilizando mi_hilo.run() en lugar de mi_hilo.start() para iniciar el hilo en Python, el codigo de el hilo se ejecutara, pero no se ejecutara en un hilo separado.\n "
                            );
                            break;
                        }
                    }
                    break;
                }
                case "De que forma puedo inicializar de forma separada la ejecucion de un subproceso"://14
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("El metodo public void start() en java cumple la función de iniciar la ejecución del subproceso de forma separada invocando el método run () el objeto subproceso\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Para inicializar de forma separada la ejecucion de un subproceso en Python, puedes utilizar el modulo subprocess, que permite crear y controlar procesos secundarios de manera independiente\n ");
                            break;
                        }
                    }
                    break;
                }
                case "Que metodo puedo utilizar para especificar el codigo que se va ha ejecutar en un hilo."://15
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("En este caso se utiliza el metodo public void run(), ya que este especifica el punto de entrada del hilo, donde dentro de este método se encuentra el codigo a ejecutar de ese hilo especifico donde fue creado\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Para especificar el codigo que se ejecutara en un hilo en Python, generalmente utilizas el metodo target al crear una instancia de la clase Thread del modulo threading. El metodo target recibe una funcion que sera  el punto de entrada del hilo y se ejecutara cuando el hilo sea iniciado con start().\n "
                            +"# Define una función que será ejecutada en el hilo\n"
                            +"def mi_funcion()\n"
                            +"# Crea un objeto Thread y pasa la función como target\n"
                            +"threading.Thread(target=mi_funcion)\n"
                            +"# Inicia el hilo\n"
                            +"mi_hilo.start()\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Como puedo acceder o modificar el nombre de mi hilo por medio de un metodo?"://16
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("En java para cambiar el nombre del objeto Thread proporcionando un identificar legible se utiliza el metodo public final void setName(String name) que a su vez facilita la depuracion y localizacion de hilos en un multihilos\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Para acceder o modificar el nombre de un hilo en Python, puedes utilizar los atributos name y setName() proporcionados por la clase Thread del modulo threading.\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿De que forma puede asignar o decir la prioridad de mi hilo?"://17
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("En java para poder asignar el rango de prioridad de un hilo se usa el metodo public final void setPriority(int priority) teniendo valores entre 1 y 10\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("En Python, el módulo threading no proporciona una forma directa de asignar o definir la prioridad de un hilo. Esto se debe a que la gestion de prioridades de hilos se deja al planificador del sistema operativo subyacente y no está expuesta directamente en la API de threading. pero se puede hacer de la siguente forma:\n"
                            + "# Define una función que servirá como el ejecutable del hilo\n"
                            + "def ejecutable()"
                            + "# Crea un objeto Thread y pasa la función ejecutable como target\n"
                            + ""
                            + "threading.Thread(target=ejecutable)\n"
                            + "# Obtiene el identificador del hilo\n"
                            + "hilo_id = mi_hilo.ident\n"
                            + "# Define la prioridad deseada del hilo (en este ejemplo, usamos 10)\n"
                            + "prioridad_deseada = 10\n"
                            + "# Asigna la prioridad del hilo utilizando\n "
                            + "ctypes y pthread_setschedparam\n"
                            + "libc = ctypes.CDLL(\"libc.so.6\")  # Librería\n "
                            + "estándar de C en sistemas Unix/Linux\n"
                            + "sched_param = ctypes.c_int(prioridad_deseada)\n"
                            + "libc.pthread_setschedparam(hilo_id, 0, ctypes.byref(sched_param))\n"
                            +"# Inicia el hilo\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Se puede establecer si un hilo deber ser daemon o no?"://18
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Si se puede establecer un hilo como daemon o no por medio de metodo public final void setDaemon(boolean on), de esta forma indicando si el hilo es un hilo de fondo o un hilo de usuario\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Si, en Python puedes establecer si un hilo debe ser un hilo demonio (daemon thread) o no. Un hilo demonio es un hilo que se ejecutará en segundo plano y no impedira que el programa principal termine incluso si el hilo aun esta en ejecucion.\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Como puedo hacer que mi hilo actual pare su ejecucion mientras, se ejecuta otro hilo?"://19
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Para ello se debe invocar el metodo public final void join(long millisec) en el segundo hilo, deteniendo la ejecución en el hilo actual hasta la finalización de este nuevo hilo o se haya terminado la duración de los milisegundos especificados en el metodo\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("En Python, puedes hacer que un hilo espere a que otro hilo termine su ejecución utilizando el metodo join() del hilo que deseas esperar. El método join() hace que el hilo actual espere hasta que el hilo en el que se llama termine su ejecución.\n ");
                            break;
                        }
                    }
                    break;
                }
                case "Necesito controlar la ejecucion de un hilo, hay alguna forma de poder hacerlo"://20
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Por medio del metodo public void interrupt() puedo solicitar la interrupcion controlada de un hilo, pero sin detenerlo de forma inmediata, sino generando una forma de bandera de interrupcion en el hilo\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println(" Si, en Python, puedes controlar la ejecución de un hilo utilizando diversas tecnicas y mecanismos de sincronizacion. Algunas de las formas mas comunes de controlar la ejecucion de un hilo incluyen:\n"
                            +"Utilizar semáforos"
                                    + "Utilizar bloqueos\n  "
                                    + "Utilizar condiciones\n "
                                    + "Utilizar eventos\n "
                                    + "Utilizar colas \n "
                                    + "Utilizar variables compartidas \n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Como logro identificar si mi hilo termino su ejecucion o todavia se encuentra ejecutando?"://21
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Con el uso del metodo public final boolean isAlive() se logra identificar si el hilo se encuentra en ejecución o ya la finalizo, ya que este metodo retorna un true si aun el hilo se encuentra en ejecucion o un false si es que ya la ha finalizado\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Para identificar si un hilo ha terminado su ejecucion o todavía se encuentra en ejecucion en Python, puedes utilizar el método is_alive() proporcionado por la clase Thread del modulo threading.\n ");
                            break;
                        }
                    }
                    break;
                }
                case "Cual es la diferencia entre un hilo daemon y un hilo de usuario en Java"://22
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("La finalidad de un hilo daemon se basa en evitar la finalización de ejecucion del programa principal, mientras que un hilo de usuario mantendra el programa en ejecucion hasta que haya terminado su operacion\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("En Python, la diferencia entre un hilo demonio y un hilo de usuario se refiere principalmente a cómo se manejan estos hilos cuando el programa principal (hilo principal) finaliza su ejecución. Aquí está la diferencia clave:\n"
                            +"Los hilos de usuario son hilos que se ejecutan en segundo plano y no afectan la terminacion del programa principal.\n"
                            +"Los hilos demonio son hilos que se ejecutan en segundo plano, pero cuando el programa principal (hilo principal) finaliza su ejecucion, los hilos demonio se detienen automáticamente, independientemente de si han terminado su trabajo o no.\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Que es un bloqueo o bloqueo (lock) en programacion de hilos?"://23
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Es la forma en la que un hilo puede obtener un unico acceso a recursos compartidos, con la finalidad de que un unico hilo sea capaz de acceder a una seccion critica del codigo\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Un bloqueo, tambien conocido como lock en inglés, es un mecanismo de sincronizacion utilizado en programacion de hilos para evitar que varios hilos accedan simultaneamente a una sección crítica de codigo o a recursos compartidos.\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Que es la espera activa (busy waiting) y cuando es apropiada en programacion de hilos?"://24
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Es la verificacion de una condicion de forma efectiva y rapida de un hilo y la forma correcta de usarla es cuando se requiere el menor consumo de recursos en bloquear o no un hilo\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("La espera activa, conocida como busy waiting en ingles, es una técnica en programación de hilos en la que un hilo realiza repetidamente comprobaciones para determinar si se ha cumplido una condicion antes de continuar con su ejecucion. En lugar de poner el hilo en un estado de espera pasiva (como dormir o bloquear) mientras espera a que ocurra algun evento, el hilo de espera activa continúa ejecutándose y verifica periodicamente si la condicion deseada se ha cumplido.\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Que es un semaforo en programacion de hilos y como se utiliza para controlar el acceso a recursos compartidos?"://25
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Es una forma de controlar el acceso a recursos compartidos a multiples hilos, por lo tanto, se puede bloquear o permitir el acceso a estos recursos de forma estable y controlada\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Un semaforo es un mecanismo de sincronizacion utilizado en programación de hilos y sistemas concurrentes para controlar el acceso a recursos compartidos y coordinar la ejecución de múltiples hilos. Los semaforos proporcionan una forma de limitar la cantidad de hilos que pueden acceder simultaneamente a una seccion critica de codigo o a un recurso compartido.\n");
                            break;
                        }
                    }
                    break;
                }
                 case "¿Que es la concurrencia y como se diferencia de la paralelizacion en programacion de hilos?"://26
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Al referirse a concurrencia se quiere decir a la realizacion de diversas tareas en un unico procesador por otro lado, la paralelizacion es la realizacion y distribucion de diversas tareas en multiples procesadores\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("La concurrencia se refiere a la capacidad de un sistema para manejar múltiples tareas o procesos al mismo tiempo. En el contexto de hilos, la concurrencia implica que múltiples hilos se ejecutan de manera intercalada, y el sistema de planificacion de hilos decide cuándo se ejecuta cada hilo.\n"
                            +"La concurrencia y la paralelización son dos conceptos relacionados en programacion de hilos y procesos, pero tienen diferencias importantes en términos de cómo se ejecutan múltiples tareas de manera simultanea en un sistema.\n");
                            break;
                        }
                    }
                    break;
                }
                 case "¿Que es el bloqueo justo (fairness) en programacion de hilos y por que es importante?"://27
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Cuando se requiere repartir de alguna manera proporcional los recursos compartidos en un sistema de multihilos se hace uso de un bloqueo justo (fairness), de esta forma evitan que un unico hilo tome la mayor parte de recursos y deje en espera a los otros\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("El concepto de bloqueo justo en programacion de hilos se refiere a la propiedad de un sistema de hilos en el que todos los hilos tienen una oportunidad equitativa de acceder a recursos compartidos o ejecutar su codigo en situaciones de concurrencia. En un sistema justo, ningun hilo debería quedar permanentemente excluido de la oportunidad de ejecutar su trabajo, incluso si hay multiples hilos compitiendo por recursos o acceso a secciones criticas del codigo.\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Que es un recurso compartido en programacion de hilos y cuales son los desafios asociados con su acceso concurrente?"://28
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Se conoce como recurso compartido a aquel elemento al que los hilos tienen acceso y la complejidad de su programacion se ve en elementos como condiciones de carrera y los bloqueos necesarios para garantizar un acceso seguro y sincronizado por parte de los hilos\n");
                            break;

                        }
                        case "Phyton":
                        {
                            System.out.println("Un recurso compartido en programacion de hilos es cualquier dato, objeto o recurso que puede ser accedido y modificado por múltiples hilos de ejecucion concurrentemente en un programa. Los recursos compartidos pueden incluir variables, estructuras de datos, archivos, bases de datos, sockets de red y otros elementos que necesitan ser compartidos y manipulados por varios hilos.\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Cómo se puede leer un archivo de texto línea por línea en Python y en Java?"://29
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                          System.out.println("public class LeerArchivo {\n"
                          + " public static void main(String[] args) { \n"
                          + "try { \n"
                          + "BufferedReader archivo = new \n"
                          + "BufferedReader(newFileReader(\"archivo.txt\"));\n"
                          + "String linea;"
                          + "while ((linea = archivo.readLine())!= null) {\n "
                          + "System.out.println(linea); }\n"
                          + "archivo.close();\n"
                          + "} catch (IOException e){e.printStackTrace();\n"
                          +"}\n"
                          +"}"
                          +"}");
                          break;
                        }
                        case "Phyton":
                        {
                            System.out.println("# Abre el archivo en modo lectura\n"
                            +"with open('archivo.txt', 'r') as archivo:\n"
                            +"# Lee el archivo linea por linea\n"
                            +"for linea in archivo:\n"
                            +"print(linea.strip())  # strip()\n "
                            +"\n");
                            break;
                        }
                    }
                    break;
                }
                case "¿Cuál es la diferencia entre una clase abstracta y una interfaz en Python y Java.":
                {
                    switch (Tipo)
                    {
                        case "Java":
                        {
                            System.out.println("Clase Abstracta:\n"
                            +"Puede contener metodos abstractos (metodos sin implementacion) y metodos concretos (metodos con implementacion).Puede tener variables miembro (campos).\n" 
                            +"Se utiliza cuando deseas proporcionar una implementacion base comun para varias clases relacionadas.\n"
                            +"\n"
                            +"Interfaz:\n"
                            +"Contiene solo metodos abstractos (sin implementacion) y constantes (variables finales y estaticas).\n"
                            +"Se utiliza cuando deseas definir un contrato que las clases deben seguir.\n");
                            break;
                        }
                        case "Phyton":
                        {
                            System.out.println("Clase Abstracta:\n"
                            +"Puede contener metodos abstractos (metodos sin implementacion) y metodos concretos (metodos con implementacion).\n"
                            +"Se utiliza cuando deseas proporcionar una implementacion base comun para varias clases relacionadas.\n"
                            +"\n"
                            +"Interfaz:\n"
                            +"En Python, no existe una declaracion formal de interfaz como en Java.\n"
                            +"Se logra mediante clases que solo contienen metodos abstractos (no se usan constantes).\n");
                            break;
                        }
                    }
                    break;
                }
                    
               
                  default: {
                    System.out.println(" Tu pregunta no se ralciona con hilos...");
                    break;
                }
                
            }
        }

        
        
       

    }

}
