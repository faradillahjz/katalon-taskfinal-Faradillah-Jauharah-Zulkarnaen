A. Project-Katalon-API-Testing

Panduan Penggunaan Aplikasi

Requirement yang harus disipkan sebelum running aplikasi ini adalah : Menggunakan Bahasa Groovy based Katalon Studio versi 9.7.3 Testing dilakukan pada End-Point API yang disediakan oleh https://restful-booker.herokuapp.com/apidoc Testing dilaksanakan dengan Website Browser Google Chrome

End Point Keseluruhan Endpoint pada https://restful-booker.herokuapp.com/apidoc diuji pada project ini adalah :

Create Token Untuk mendapatkan token, yang digunakan untuk autentifikasi saat Post, DELETE, PUT, dan PATCH https://restful-booker.herokuapp.com/auth Akan menghasilkan response code 200 OK dan result token

Create Booking Untuk membuat data booking https://restful-booker.herokuapp.com/booking Akan menghasilkan response code 200 OK dan result bookingnya

GetBookingIds Untuk menampilkan seluruh data booking https://restful-booker.herokuapp.com/booking Akan menghasilkan response code 200 OK dan result bookingnya

Get Booking Untuk menampilkan data sesuai dengan id yang kita masukkan https://restful-booker.herokuapp.com/booking/${id} Akan menghasilkan response code 200 OK dan result bookingnya

Jika id yang kita masukkan tidak ada Akan menghasilkan response code 404 Not Found

Delete Booking Agar dapat menjalankan endpoint ini perlu memasukkan username, password, dan juga Authorizationnya Untuk menghapus data sesuai dengan id yang kita masukkan https://restful-booker.herokuapp.com/booking/${id} Akan menghasilkan response code 201 Created
Jika id yang kita masukkan tidak ada Akan menghasilkan response code 405 Method Not Allowed

Update Booking Agar dapat menjalankan endpoint ini perlu memasukkan username, password, dan juga Authorizationnya Untuk mengupdate data sesuai dengan id yang kita masukkan https://restful-booker.herokuapp.com/booking/${id} Akan menghasilkan response code 200 OK dan result bookingnya
Jika id yang kita masukkan tidak ada Akan menghasilkan response code 405 Method Not Allowed

Partial Update Booking Agar dapat menjalankan endpoint ini perlu memasukkan username, password, dan juga Authorizationnya Untuk mengupdate data sesuai dengan id yang kita masukkan dan hanya dibeberapa data saja https://restful-booker.herokuapp.com/booking/${id} Akan menghasilkan response code 200 OK dan result bookingnya
Jika id yang kita masukkan tidak ada Akan menghasilkan response code 405 Method Not Allowed

Health Check Agar dapat mengetahui apakah APInya running atau tidak https://restful-booker.herokuapp.com/ping Akan menghasilkan response code 201 Created
Report Pada pengujian, jika harus satu-satu test case di test akan memakan waktu lama, sehingga dibuat Test Suite agar dapat menjalankan beberapa test case secara bersamaan yaitu TS-01-Activities

B. Project-Katalon-Web-Testing
Panduan Penggunaan Aplikasi

Requirement yang harus disipkan sebelum running aplikasi ini adalah : Menggunakan Bahasa Groovy based Katalon Studio versi 9.7.3 
Testing dilakukan pada Web https://juice-shop.herokuapp.com
Testing dilaksanakan dengan Website Browser Google Chrome

C. Project-Katalon-Mobile-Testing
Panduan Penggunaan Aplikasi

Requirement yang harus disipkan sebelum running aplikasi ini adalah : Menggunakan Bahasa Groovy based Katalon Studio versi 9.7.3 
Testing dilakukan pada Aplikasi https://bit.ly/todo20APK
Testing dilaksanakan dengan Mobile Android
