package defpackage;

import android.view.View;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract class uog {
    public static final o97 a = new o97(HttpStatus.SC_NOT_FOUND, "SC_NOT_FOUND");
    public static final o97 b = new o97(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "SC_REQUESTED_RANGE_NOT_SATISFIABLE");
    public static final o97 c = new o97(500, "SC_INTERNAL_SERVER_ERROR");
    public static final o97 d = new o97(HttpStatus.SC_NOT_IMPLEMENTED, "IMAGE_SIZE_TOO_SMALL");
    public static final o97 e = new o97(HttpStatus.SC_BAD_REQUEST, "SC_BAD_REQUEST");
    public static final o97 f = new o97(HttpStatus.SC_PRECONDITION_FAILED, "SC_PRECONDITION_FAILED");
    public static final o97 g = new o97(HttpStatus.SC_FORBIDDEN, "SC_FORBIDDEN");
    public static final o97 h = new o97(HttpStatus.SC_CONFLICT, "SC_CONFLICT");
    public static final o97 i = new o97(HttpStatus.SC_REQUEST_TOO_LONG, "SC_REQUEST_ENTITY_TOO_LARGE");
    public static final o97 j = new o97(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, "SC_UNSUPPORTED_MEDIA_TYPE");
    public static final o97 k = new o97(HttpStatus.SC_NOT_ACCEPTABLE, "SC_NOT_ACCEPTABLE");
    public static final o97 l = new o97(-1, "UNKNOWN_ERROR");
    public static final o97 m = new o97(-100, "FILE_NOT_FOUND");
    public static final o97 n = new o97(-101, "FILE_ZERO_LENGTH");

    public static Collection a(Object obj) {
        if ((obj instanceof my7) && !(obj instanceof ny7)) {
            k(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            fni.i(e2, uog.class.getName());
            throw e2;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof my7) && !(obj instanceof oy7)) {
            k(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            fni.i(e2, uog.class.getName());
            throw e2;
        }
    }

    public static Map c(Map map) {
        if (!(map instanceof my7) || (map instanceof qy7)) {
            return map;
        }
        k(map, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void d(int i2, Object obj) {
        if (obj == null || g(i2, obj)) {
            return;
        }
        k(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static o97 e(int i2, String str) {
        o97 o97Var = i2 != 400 ? i2 != 406 ? i2 != 409 ? i2 != 403 ? i2 != 404 ? i2 != 412 ? i2 != 413 ? i2 != 415 ? i2 != 416 ? i2 != 500 ? i2 != 501 ? new o97(i2, null) : d : c : b : j : i : f : a : g : h : k : e;
        return str == null ? o97Var : new o97(o97Var.a, o97Var.b, str);
    }

    public static boolean f(o97 o97Var) {
        return i.equals(o97Var) || j.equals(o97Var) || k.equals(o97Var) || c.equals(o97Var) || m.equals(o97Var) || n.equals(o97Var) || d.equals(o97Var);
    }

    public static boolean g(int i2, Object obj) {
        if (obj instanceof xm6) {
            if ((obj instanceof fn6 ? ((fn6) obj).getArity() : obj instanceof cm6 ? 0 : obj instanceof em6 ? 1 : obj instanceof sm6 ? 2 : obj instanceof um6 ? 3 : obj instanceof wm6 ? 4 : obj instanceof ym6 ? 5 : obj instanceof zm6 ? 6 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static final String h(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (ozi.c(cCharAt)) {
                sb.append(cCharAt);
            } else {
                sb.append('*');
            }
        }
        return sb.toString();
    }

    public static final boolean i(View view, r07 r07Var) {
        Object ipdVar;
        try {
            ipdVar = Boolean.valueOf(view.performHapticFeedback(r07Var.a()));
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Object obj = Boolean.FALSE;
        if (ipdVar instanceof ipd) {
            ipdVar = obj;
        }
        return ((Boolean) ipdVar).booleanValue();
    }

    public static final String j(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (Character.isHighSurrogate(cCharAt)) {
                int i3 = i2 + 1;
                if (i3 < str.length() && Character.isLowSurrogate(str.charAt(i3))) {
                    sb.append(cCharAt);
                    sb.append(str.charAt(i3));
                    i2 = i3;
                }
            } else if (!Character.isLowSurrogate(cCharAt)) {
                sb.append(cCharAt);
            }
            i2++;
        }
        return sb.toString();
    }

    public static void k(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(u45.k(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        fni.i(classCastException, uog.class.getName());
        throw classCastException;
    }
}
