package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: StandardClassIds.kt */
@s0
/* loaded from: classes8.dex */
public final class j {
    static {
        new c("java.lang").c(f.e("annotation"));
    }

    public static final b a(String str) {
        i.f409264a.getClass();
        return new b(i.f409265b, f.e(str));
    }

    public static final b b(String str) {
        i.f409264a.getClass();
        return new b(i.f409267d, f.e(str));
    }

    public static final LinkedHashMap c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iF2 = P0.f(C42745f0.q(setEntrySet, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final b d(f fVar) {
        i.f409264a.getClass();
        b bVar = i.f409273j;
        return new b(bVar.g(), f.e(fVar.c().concat(bVar.i().c())));
    }

    public static final b e(String str) {
        i.f409264a.getClass();
        return new b(i.f409266c, f.e(str));
    }

    public static final b f(b bVar) {
        i.f409264a.getClass();
        return new b(i.f409265b, f.e("U".concat(bVar.i().c())));
    }
}
