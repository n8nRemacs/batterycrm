package androidx.media3.common.util;

import android.text.TextUtils;
import android.util.Log;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: Log.java */
@J
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f47943a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public static final b f47944b = b.f47945a;

    /* compiled from: Log.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: Log.java */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f47945a = new a();

        /* compiled from: Log.java */
        public class a implements b {
        }
    }

    @Pure
    public static String a(String str, @P Throwable th2) {
        String strE = e(th2);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        StringBuilder sbZ = androidx.appcompat.app.r.z(str, "\n  ");
        sbZ.append(strE.replace("\n", "\n  "));
        sbZ.append('\n');
        return sbZ.toString();
    }

    @Pure
    public static void b() {
        synchronized (f47943a) {
            f47944b.getClass();
        }
    }

    @Pure
    public static void c() {
        synchronized (f47943a) {
            f47944b.getClass();
        }
    }

    @Pure
    public static void d(String str, @P Throwable th2) {
        a(str, th2);
        c();
    }

    @P
    @Pure
    public static String e(@P Throwable th2) {
        boolean z12;
        synchronized (f47943a) {
            try {
                if (th2 == null) {
                    return null;
                }
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        z12 = false;
                        break;
                    }
                    if (cause instanceof UnknownHostException) {
                        z12 = true;
                        break;
                    }
                    cause = cause.getCause();
                }
                if (z12) {
                    return "UnknownHostException (no network)";
                }
                return Log.getStackTraceString(th2).trim().replace("\t", "    ");
            } finally {
            }
        }
    }

    @Pure
    public static void f() {
        synchronized (f47943a) {
            f47944b.getClass();
        }
    }

    @Pure
    public static void g() {
        synchronized (f47943a) {
            f47944b.getClass();
        }
    }

    @Pure
    public static void h(String str, @P Throwable th2) {
        a(str, th2);
        g();
    }
}
