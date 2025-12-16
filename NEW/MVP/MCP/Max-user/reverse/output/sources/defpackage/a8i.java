package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public abstract class a8i {
    public static final Object a = new Object();

    public static String a(String str, Throwable th) {
        String strI = i(th);
        if (TextUtils.isEmpty(strI)) {
            return str;
        }
        StringBuilder sbO = ho7.o(str, "\n  ");
        sbO.append(strI.replace("\n", "\n  "));
        sbO.append('\n');
        return sbO.toString();
    }

    public static final void b(CharSequence charSequence, yeb yebVar) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, spanned.length(), u6g.class)) {
                ((u6g) obj).onThemeChanged(yebVar);
            }
        }
    }

    public static void c(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || '~' < cCharAt) {
                throw new IllegalArgumentException(yxg.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static void d(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || '~' < cCharAt)) {
                StringBuilder sb = new StringBuilder();
                sb.append(yxg.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                sb.append(yxg.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static void e(String str, String str2) {
        synchronized (a) {
            Log.d(str, a(str2, null));
        }
    }

    public static void f(String str, String str2, Exception exc) {
        synchronized (a) {
            Log.d(str, a(str2, exc));
        }
    }

    public static void g(String str, String str2) {
        synchronized (a) {
            Log.e(str, a(str2, null));
        }
    }

    public static void h(String str, String str2, Throwable th) {
        synchronized (a) {
            Log.e(str, a(str2, th));
        }
    }

    public static String i(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (a) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                } finally {
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    public static void j(String str, String str2) {
        synchronized (a) {
            Log.i(str, a(str2, null));
        }
    }

    public static j17 k(String... strArr) throws CloneNotSupportedException {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        String[] strArr2 = (String[]) objClone;
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            String str = strArr2[i];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            strArr2[i] = vmf.c0(str).toString();
        }
        ro7 ro7VarG = n7j.g(new to7(0, strArr2.length - 1, 1), 2);
        int i2 = ro7VarG.a;
        int i3 = ro7VarG.b;
        int i4 = ro7VarG.c;
        if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
            while (true) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                c(str2);
                d(str3, str2);
                if (i2 == i3) {
                    break;
                }
                i2 += i4;
            }
        }
        return new j17(strArr2);
    }

    public static void l(String str, String str2) {
        synchronized (a) {
            Log.w(str, a(str2, null));
        }
    }

    public static void m(String str, String str2, Throwable th) {
        synchronized (a) {
            Log.w(str, a(str2, th));
        }
    }
}
