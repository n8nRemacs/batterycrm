package defpackage;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ee4 {
    public static final float[] a = new float[0];

    public static void a(Appendable appendable, Object obj, em6 em6Var) {
        if (em6Var != null) {
            appendable.append((CharSequence) em6Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    public static boolean b(Map map, Map map2) {
        if (map == null || map2 == null || map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            da6 da6Var = (da6) entry.getKey();
            Object value = entry.getValue();
            Object obj = map2.get(da6Var);
            if (obj == null) {
                return false;
            }
            if ((value instanceof long[]) && (obj instanceof long[])) {
                if (!Arrays.equals((long[]) value, (long[]) obj)) {
                    return false;
                }
            } else if (!fni.a(value, obj)) {
                return false;
            }
        }
        return true;
    }

    public static int c(Map map) {
        if (map == null) {
            return 0;
        }
        int iHashCode = 0;
        for (Map.Entry entry : map.entrySet()) {
            da6 da6Var = (da6) entry.getKey();
            Object value = entry.getValue();
            int iHashCode2 = da6Var.hashCode() + (iHashCode * 31);
            if (value instanceof long[]) {
                for (long j : (long[]) value) {
                    iHashCode2 = (iHashCode2 * 31) + Long.hashCode(j);
                }
                iHashCode = iHashCode2;
            } else {
                iHashCode = (value != null ? value.hashCode() : 0) + (iHashCode2 * 31);
            }
        }
        return iHashCode;
    }
}
