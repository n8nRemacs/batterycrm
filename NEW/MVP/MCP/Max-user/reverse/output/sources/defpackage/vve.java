package defpackage;

import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class vve {
    public static final IdentityHashMap d = new IdentityHashMap();
    public Object a;
    public int b;
    public final fod c;

    public vve(Object obj, fod fodVar, boolean z) {
        obj.getClass();
        this.a = obj;
        this.c = fodVar;
        this.b = 1;
        if (z) {
            IdentityHashMap identityHashMap = d;
            synchronized (identityHashMap) {
                try {
                    Integer num = (Integer) identityHashMap.get(obj);
                    if (num == null) {
                        identityHashMap.put(obj, 1);
                    } else {
                        identityHashMap.put(obj, Integer.valueOf(num.intValue() + 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized Object a() {
        return this.a;
    }
}
