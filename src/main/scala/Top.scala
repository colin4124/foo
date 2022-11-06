import chisel3._
import chisel3.util._

class Top extends Module {
  val io = IO((DecoupledIO(UInt(10.W))))

  io <> DontCare
}

object Main extends App {
  println(getVerilogString(new Top))
}
