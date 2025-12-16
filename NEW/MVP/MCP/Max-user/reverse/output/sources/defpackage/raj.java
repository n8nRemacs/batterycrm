package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class raj {
    public static void c(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public sy9 a(xy9 xy9Var) {
        ByteBuffer byteBuffer = xy9Var.d;
        byteBuffer.getClass();
        fsi.b(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (xy9Var.j(Integer.MIN_VALUE)) {
            return null;
        }
        return b(xy9Var, byteBuffer);
    }

    public abstract sy9 b(xy9 xy9Var, ByteBuffer byteBuffer);
}
