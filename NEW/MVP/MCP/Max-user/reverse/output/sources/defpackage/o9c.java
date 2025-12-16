package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class o9c {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(l9c.a, 0);
        map.put(l9c.b, 1);
        map.put(l9c.c, 2);
        for (l9c l9cVar : map.keySet()) {
            a.append(((Integer) b.get(l9cVar)).intValue(), l9cVar);
        }
    }

    public static int a(l9c l9cVar) {
        Integer num = (Integer) b.get(l9cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + l9cVar);
    }

    public static l9c b(int i) {
        l9c l9cVar = (l9c) a.get(i);
        if (l9cVar != null) {
            return l9cVar;
        }
        throw new IllegalArgumentException(ho7.f(i, "Unknown Priority for value "));
    }
}
