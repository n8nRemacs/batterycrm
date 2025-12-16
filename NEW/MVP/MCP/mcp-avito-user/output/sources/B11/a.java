package B11;

import java.io.Serializable;

/* compiled from: QLog.java */
/* loaded from: classes7.dex */
public final class a {
    public static void a(Serializable serializable) {
        b();
        String.valueOf(serializable);
        b();
        String.valueOf(serializable);
    }

    public static void b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        stackTrace[2].getLineNumber();
        className.substring(className.lastIndexOf(46) + 1);
    }
}
