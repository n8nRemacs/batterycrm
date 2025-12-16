package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.r0;
import kotlin.reflect.jvm.internal.impl.types.s0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* compiled from: mappingUtil.kt */
@s0
/* loaded from: classes8.dex */
public final class x {
    @Y61.k
    public static final r0 a(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.k InterfaceC42851d interfaceC42851d2) {
        interfaceC42851d.r().size();
        interfaceC42851d2.r().size();
        s0.a aVar = kotlin.reflect.jvm.internal.impl.types.s0.f410245b;
        List<g0> listR = interfaceC42851d.r();
        ArrayList arrayList = new ArrayList(C42745f0.q(listR, 10));
        Iterator<T> it = listR.iterator();
        while (it.hasNext()) {
            arrayList.add(((g0) it.next()).l());
        }
        List<g0> listR2 = interfaceC42851d2.r();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listR2, 10));
        Iterator<T> it2 = listR2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new z0(((g0) it2.next()).q()));
        }
        return s0.a.b(aVar, P0.p(C42745f0.T0(arrayList, arrayList2)));
    }
}
