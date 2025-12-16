package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class x8a extends fjb implements c8a {
    public static x8a b() {
        return new x8a(new TreeMap(fjb.b));
    }

    public static x8a k(ao3 ao3Var) {
        TreeMap treeMap = new TreeMap(fjb.b);
        for (s90 s90Var : ao3Var.e()) {
            Set<zn3> setG = ao3Var.g(s90Var);
            ArrayMap arrayMap = new ArrayMap();
            for (zn3 zn3Var : setG) {
                arrayMap.put(zn3Var, ao3Var.h(s90Var, zn3Var));
            }
            treeMap.put(s90Var, arrayMap);
        }
        return new x8a(treeMap);
    }

    public final void m(s90 s90Var, zn3 zn3Var, Object obj) {
        zn3 zn3Var2;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(s90Var);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(s90Var, arrayMap);
            arrayMap.put(zn3Var, obj);
            return;
        }
        zn3 zn3Var3 = (zn3) Collections.min(map.keySet());
        if (Objects.equals(map.get(zn3Var3), obj) || zn3Var3 != (zn3Var2 = zn3.c) || zn3Var != zn3Var2) {
            map.put(zn3Var, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + s90Var.a + ", existing value (" + zn3Var3 + ")=" + map.get(zn3Var3) + ", conflicting (" + zn3Var + ")=" + obj);
    }

    public final void n(s90 s90Var, Object obj) {
        m(s90Var, zn3.d, obj);
    }
}
