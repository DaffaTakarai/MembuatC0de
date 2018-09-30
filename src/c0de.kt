fun main(args: Array<String>){
	print(IDsaya("Daffa Takarai",100,33))
}
fun IDsaya(nama: String,code1: Int,code2:Int):String{
	val template="""
	Nama:$nama
	CODE1:$code1
	CODE2:$code2
	Jumlah Code Saya ${code1+code2}
	""".trimIndent()
	return template
}