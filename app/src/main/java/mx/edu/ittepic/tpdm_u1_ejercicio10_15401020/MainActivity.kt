package mx.edu.ittepic.tpdm_u1_ejercicio10_15401020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import java.util.*

class MainActivity : AppCompatActivity() {

    var img : ImageView?=null
    var usuario : EditText?=null
    var contra : EditText?=null
    var autenticar : Button?=null
    var vectorUsuarios = arrayOf("valeria","victor","pablo","tapia","arleth")
    var vectorContra = arrayOf("123","contra","321","isc","tpdm")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img = findViewById(R.id.img)
        usuario = findViewById(R.id.usuario)
        contra = findViewById(R.id.contra)
        autenticar = findViewById(R.id.autenticar)

        var cont = 0
        var alert = AlertDialog.Builder(this)
        autenticar?.setOnClickListener {
            if(usuario?.text.toString().equals(vectorUsuarios.get(0))) { //valeria
                if(contra?.text.toString().equals(vectorContra.get(0))) {
                    alert.setTitle("Autenticación").setMessage("ACEPTADO").setPositiveButton("Aceptar"){dialog,which->}.show()
                    img?.setImageDrawable(resources.getDrawable(R.drawable.user4))
                    cont=0
                }else{
                    cont++
                    alert.setTitle("Autenticación").setMessage("RECHAZADO\n Intento $cont").setPositiveButton("Aceptar"){dialog,which->}.show()
                    if(cont>3){
                        finish()
                    }
                }
            }
            if(usuario?.text.toString().equals(vectorUsuarios.get(1))) { //victor
                if(contra?.text.toString().equals(vectorContra.get(1))) {
                    alert.setTitle("Autenticación").setMessage("ACEPTADO").setPositiveButton("Aceptar"){dialog,which->}.show()
                    img?.setImageDrawable(resources.getDrawable(R.drawable.user3))
                    cont=0
                }else{
                    cont++
                    alert.setTitle("Autenticación").setMessage("RECHAZADO\n Intento $cont").setPositiveButton("Aceptar"){dialog,which->}.show()
                    if(cont>3){
                        finish()
                    }
                }
            }
            if(usuario?.text.toString().equals(vectorUsuarios.get(2))) { //pablo
                if(contra?.text.toString().equals(vectorContra.get(2))) {
                    alert.setTitle("Autenticación").setMessage("ACEPTADO").setPositiveButton("Aceptar"){dialog,which->}.show()
                    img?.setImageDrawable(resources.getDrawable(R.drawable.user1))
                    cont=0
                }else{
                    cont++
                    alert.setTitle("Autenticación").setMessage("RECHAZADO\n Intento $cont").setPositiveButton("Aceptar"){dialog,which->}.show()
                    if(cont>3){
                        finish()
                    }
                }
            }
            if(usuario?.text.toString().equals(vectorUsuarios.get(3))) { //tapia
                if(contra?.text.toString().equals(vectorContra.get(3))) {
                    alert.setTitle("Autenticación").setMessage("ACEPTADO").setPositiveButton("Aceptar"){dialog,which->}.show()
                    img?.setImageDrawable(resources.getDrawable(R.drawable.user2))
                    cont=0
                }else{
                    cont++
                    alert.setTitle("Autenticación").setMessage("RECHAZADO\n Intento $cont").setPositiveButton("Aceptar"){dialog,which->}.show()
                    if(cont>3){
                        finish()
                    }
                }
            }
            if(usuario?.text.toString().equals(vectorUsuarios.get(4))) { //arleth
                if (contra?.text.toString().equals(vectorContra.get(4))) {
                    alert.setTitle("Autenticación").setMessage("ACEPTADO")
                        .setPositiveButton("Aceptar") { dialog, which -> }.show()
                    img?.setImageDrawable(resources.getDrawable(R.drawable.user5))
                    cont=0
                } else {
                    cont++
                    alert.setTitle("Autenticación").setMessage("RECHAZADO\n Intento $cont")
                        .setPositiveButton("Aceptar") { dialog, which -> }.show()
                    if(cont>3){
                        finish()
                    }
                }
            }
        }

    }
}
