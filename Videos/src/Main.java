import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Models.Users;
import Models.Videos;

public class Main {

	static Scanner sc = new Scanner(System.in);
	int userId,videoId;

	public static void main(String[] args) {
		
		int menu,userId=0,id,videoId=0;
		String firstName,lastName,phoneNumber,password,name,uRL,tag;
		LocalDate fecha;
		List<Users> users = new ArrayList<>();
		List<List<Videos>> videos = new ArrayList<>();
		List<String> tags;
		
		do {
		System.out.println("Menu de usuario\n"
				+ "1.Nuevo usuario\n"
				+ "2.Listado de usuarios\n"
				+ "3.Añadir video\n"
				+ "4.Listado de videos\n"
				+ "5.Salir");
		menu = sc.nextInt();
		switch (menu) {
			case 1:
				System.out.println("Nombre");
				firstName = sc.next();
				System.out.println("Apellido");
				lastName = sc.next();
				System.out.println("Teléfono");
				phoneNumber = sc.next();
				System.out.println("Password");
				password = sc.next();
				fecha = LocalDate.now();
				Users user = new Users (firstName,lastName,phoneNumber,password,fecha,userId);
				users.add(user);
				userId++;
				videos.add(new ArrayList<>());
				break;
			case 2:
				System.out.println(users);
				break;
			case 3:
				System.out.println("Escriba el nombre del video:");
				name = sc.next();
				System.out.println("Escriba la URL del video:");
				uRL = sc.next();
				System.out.println("Escriba los tags separados por ',':");
				tag = sc.next();
				tags = new ArrayList<String>(Arrays.asList(tag.split(",")));
				System.out.println("Escriba el número de Id del usuario:");
				id = sc.nextInt();
				if (!Users.compareId(userId,id)) {
					System.out.println("Id de usuario no existe");
				} else {
					Videos video = new Videos (name,uRL,videoId,tags);
					videos.get(id).add(video);
					users.get(id).setVideos(videos.get(id));
				}
				videoId++;
				break;
			case 4:
				System.out.println(videos);
				break;
			case 5:
				System.out.println("Hasta pronto");
		}

	} while (menu!=5);

	}

	}
