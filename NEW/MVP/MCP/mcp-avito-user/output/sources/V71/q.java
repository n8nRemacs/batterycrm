package V71;

import java.io.Serializable;
import java.util.HashMap;

/* compiled from: InstanceOf.java */
/* loaded from: classes7.dex */
public class q implements org.mockito.d<Object>, Serializable {

    /* compiled from: InstanceOf.java */
    public static class a extends q implements B {
    }

    @Override // org.mockito.d
    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        Class<?> cls = obj.getClass();
        HashMap map = Y71.k.f19337b;
        if (!map.containsKey(cls) || !map.containsKey(null)) {
            throw null;
        }
        Y71.k.a(cls);
        Y71.k.a(null);
        throw null;
    }

    public final String toString() {
        return null;
    }
}
