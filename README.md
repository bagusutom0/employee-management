# Employee Management 

Aplikasi ini adalah sistem manajemen data karyawan yang dibangun dengan Spring Boot, MySQL, dan Thymeleaf. Aplikasi ini memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete) pada data karyawan.

## Fitur

- **Create**: Menambahkan data karyawan baru.
- **Read**: Menampilkan daftar karyawan.
- **Update**: Mengedit data karyawan yang sudah ada.
- **Delete**: Menghapus data karyawan.

## Teknologi yang Digunakan

- **Spring Boot**: Framework Java untuk membangun aplikasi backend.
- **MySQL**: Sistem manajemen basis data relasional.
- **Thymeleaf**: Template engine untuk rendering tampilan HTML di sisi server.
- **JPA (Java Persistence API)**: Untuk pengelolaan data dan interaksi dengan database.

## Persyaratan

- Java 17 atau yang lebih baru
- Maven
- MySQL
- IDE seperti IntelliJ IDEA atau Eclipse atau kode editor lainnya

## Instalasi

### 1. Clone Repository

```bash
git clone https://github.com/bagusutom0/spring-web.git
cd repository
```

### 2. Konfigurasi Database

Pastikan MySQL sudah terinstal dan berjalan. Buat database dengan nama `employee` atau yang sesuai dengan konfigurasi Anda.

**Contoh Skrip SQL untuk Membuat Database:**

```sql
CREATE DATABASE employee;
```

### 3. Konfigurasi Aplikasi

Buka file `src/main/resources/application.properties` dan sesuaikan pengaturan database Anda:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee?useSSL=false
spring.datasource.username=
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
```

### 4. Jalankan Aplikasi

Jalankan aplikasi Spring Boot dengan menggunakan Maven:

```bash
mvn spring-boot:run
```

Atau, jika Anda menggunakan IDE, jalankan kelas `EmployeeManagementApplication` yang berada di dalam paket `com.example.employee`.

## Struktur Proyek

- **`src/main/java/com/example/employee`**
  - **`controller`**: Kelas untuk menangani permintaan HTTP dan mengontrol alur aplikasi.
  - **`model`**: Kelas entitas untuk representasi data di database.
  - **`repository`**: Antarmuka untuk operasi CRUD dengan database.
  - **`service`**: Kelas yang berisi logika bisnis dan operasi CRUD.
- **`src/main/resources`**
  - **`templates/employee`**: Berisi file Thymeleaf untuk tampilan HTML.
  - **`application.properties`**: File konfigurasi untuk pengaturan aplikasi.

## Penggunaan

Setelah aplikasi berjalan, buka browser dan akses:

- **`http://localhost:8080/employees`**: Untuk melihat daftar karyawan.
- **`http://localhost:8080/employees/new`**: Untuk menambahkan karyawan baru.
- **`http://localhost:8080/employees/edit/{id}`**: Untuk mengedit data karyawan berdasarkan ID.
- **`http://localhost:8080/employees/delete/{id}`**: Untuk menghapus data karyawan berdasarkan ID.

## Kontribusi

Jika Anda ingin berkontribusi pada proyek ini, silakan lakukan fork dan kirim pull request. 

## Lisensi

MIT License. Lihat [LICENSE](LICENSE) untuk detail lebih lanjut.

## Kontak

Jika Anda memiliki pertanyaan atau umpan balik, silakan hubungi saya di [bagussajiwoutomo12@gmail.com](mailto:bagussajiwoutomo12@gmail.com).
