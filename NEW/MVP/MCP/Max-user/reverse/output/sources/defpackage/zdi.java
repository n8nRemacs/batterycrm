package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zdi {
    public static tg8 a = new zb8(3);

    public static int a(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static int b(int i) {
        return i <= 9 ? i + 48 : i + 87;
    }

    public static int c(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 97 && i <= 102) {
            return i - 87;
        }
        if (i < 65 || i > 70) {
            throw new IllegalArgumentException(wy1.e(i, "Not a hex char '", "'"));
        }
        return i - 55;
    }

    public static int d(Map map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static String e(Map map, sg8 sg8Var) {
        if (map.isEmpty()) {
            return "{}";
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (sg8Var != null) {
                value = sg8Var.d(value, str);
            }
            sb.append(str);
            sb.append('=');
            sb.append(value);
            if (!it.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    public static final void f(esg esgVar) {
        esgVar.d(112, new a4e(24));
        esgVar.d(594, new b4e(19));
        esgVar.d(595, new b4e(20));
        esgVar.d(596, new b4e(21));
        esgVar.d(597, new sdf(17));
    }
}
