package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;

/* compiled from: CompanionObjectMapping.kt */
@s0
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f407192a = new c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashSet f407193b;

    static {
        Set<PrimitiveType> set = PrimitiveType.f407159f;
        ArrayList arrayList = new ArrayList(C42745f0.q(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(n.f407339l.c(((PrimitiveType) it.next()).f407170b));
        }
        ArrayList arrayListI0 = C42745f0.i0(n.a.f407385k.g(), C42745f0.i0(n.a.f407383i.g(), C42745f0.i0(n.a.f407381g.g(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayListI0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(kotlin.reflect.jvm.internal.impl.name.b.j((kotlin.reflect.jvm.internal.impl.name.c) it2.next()));
        }
        f407193b = linkedHashSet;
    }
}
