package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class bj5 {
    public static final aj5 a = new aj5("No further exceptions");

    public static NullPointerException a(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw a(str);
        }
    }

    public static String c(long j, TimeUnit timeUnit) {
        StringBuilder sbL = az1.l(j, "The source did not signal an event for ", " ");
        sbL.append(timeUnit.toString().toLowerCase());
        sbL.append(" and has been terminated.");
        return sbL.toString();
    }

    public static RuntimeException d(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
