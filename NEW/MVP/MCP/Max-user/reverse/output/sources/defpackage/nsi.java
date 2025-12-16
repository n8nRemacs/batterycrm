package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class nsi {
    public static int a(int i) {
        if (i < 3) {
            u4j.a(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static long c(boolean z, boolean z2, boolean z3, boolean z4) {
        long j = z ? 1L : 0L;
        if (z2) {
            j |= 2;
        }
        if (z3) {
            j |= 4;
        }
        return z4 ? 8 | j : j;
    }

    public static final v4i d(r5i r5iVar) {
        return new v4i(r5iVar.a, r5iVar.t);
    }
}
