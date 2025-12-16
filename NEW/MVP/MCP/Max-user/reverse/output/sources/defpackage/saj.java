package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class saj {
    public static void a(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = jt7.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = t2c.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public ty9 b(yy9 yy9Var) {
        ByteBuffer byteBuffer = yy9Var.o;
        byteBuffer.getClass();
        hsi.b(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return c(yy9Var, byteBuffer);
    }

    public abstract ty9 c(yy9 yy9Var, ByteBuffer byteBuffer);
}
