package V71;

import java.lang.reflect.Array;

/* compiled from: Equality.java */
/* loaded from: classes7.dex */
public final class k {
    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (!obj.getClass().isArray()) {
            return obj.equals(obj2);
        }
        if (obj2.getClass().isArray() && Array.getLength(obj) == Array.getLength(obj2)) {
            for (int i12 = 0; i12 < Array.getLength(obj); i12++) {
                if (a(Array.get(obj, i12), Array.get(obj2, i12))) {
                }
            }
            return true;
        }
        return false;
    }
}
