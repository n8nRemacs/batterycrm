package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;
import kotlin.reflect.jvm.internal.impl.builtins.functions.f;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.x;
import kotlin.reflect.jvm.internal.impl.types.C42996v;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* compiled from: functionTypes.kt */
@s0
/* loaded from: classes8.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(@Y61.k O o12) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarF = o12.getAnnotations().F(n.a.f407392r);
        if (cVarF == null) {
            return 0;
        }
        return ((Number) ((kotlin.reflect.jvm.internal.impl.resolve.constants.n) ((kotlin.reflect.jvm.internal.impl.resolve.constants.g) P0.d(cVarF.b(), n.f407332e))).f409586a).intValue();
    }

    @X41.j
    @Y61.k
    public static final Y b(@Y61.k k kVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.l O o12, @Y61.k List list, @Y61.k ArrayList arrayList, @Y61.k O o13, boolean z12) {
        InterfaceC42851d interfaceC42851dJ;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (o12 != null ? 1 : 0) + 1);
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new z0((O) it.next()));
        }
        arrayList2.addAll(arrayList3);
        kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList2, o12 != null ? new z0(o12) : null);
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList2.add(new z0((O) obj));
            i12 = i13;
        }
        arrayList2.add(new z0(o13));
        int size = list.size() + arrayList.size() + (o12 == null ? 0 : 1);
        if (z12) {
            interfaceC42851dJ = kVar.u(size);
        } else {
            kotlin.reflect.jvm.internal.impl.name.f fVar = n.f407328a;
            interfaceC42851dJ = kVar.j("Function" + size);
        }
        if (o12 != null) {
            kotlin.reflect.jvm.internal.impl.name.c cVar = n.a.f407391q;
            if (!gVar.i3(cVar)) {
                g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2;
                ArrayList arrayListG0 = C42745f0.g0(gVar, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k(kVar, cVar, P0.c(), false, 8, null));
                aVar.getClass();
                gVar = g.a.a(arrayListG0);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            kotlin.reflect.jvm.internal.impl.name.c cVar2 = n.a.f407392r;
            if (!gVar.i3(cVar2)) {
                g.a aVar2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2;
                ArrayList arrayListG02 = C42745f0.g0(gVar, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k(kVar, cVar2, Collections.singletonMap(n.f407332e, new kotlin.reflect.jvm.internal.impl.resolve.constants.n(size2)), false, 8, null));
                aVar2.getClass();
                gVar = g.a.a(arrayListG02);
            }
        }
        return P.d(C42996v.f410262a.a(gVar), interfaceC42851dJ, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static final kotlin.reflect.jvm.internal.impl.name.f c(@Y61.k O o12) {
        String str;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarF = o12.getAnnotations().F(n.a.f407393s);
        if (cVarF == null) {
            return null;
        }
        Object objV0 = C42745f0.v0(cVarF.b().values());
        x xVar = objV0 instanceof x ? (x) objV0 : null;
        if (xVar != null && (str = (String) xVar.f409586a) != null) {
            if (!kotlin.reflect.jvm.internal.impl.name.f.f(str)) {
                str = null;
            }
            if (str != null) {
                return kotlin.reflect.jvm.internal.impl.name.f.e(str);
            }
        }
        return null;
    }

    @Y61.k
    public static final List<O> d(@Y61.k O o12) {
        h(o12);
        int iA2 = a(o12);
        if (iA2 == 0) {
            return C42784z0.f406748b;
        }
        List<x0> listSubList = o12.F0().subList(0, iA2);
        ArrayList arrayList = new ArrayList(C42745f0.q(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((x0) it.next()).getType());
        }
        return arrayList;
    }

    @Y61.l
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.e e(@Y61.k InterfaceC42853f interfaceC42853f) {
        if (!(interfaceC42853f instanceof InterfaceC42851d) || !k.H(interfaceC42853f)) {
            return null;
        }
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        kotlin.reflect.jvm.internal.impl.name.d dVarG = kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42853f);
        if (!dVarG.d() || dVarG.f409248a.isEmpty()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.functions.f.f407219c.getClass();
        f.b bVarA = kotlin.reflect.jvm.internal.impl.builtins.functions.f.f407220d.a(dVarG.f().b(), dVarG.g().e());
        if (bVarA != null) {
            return bVarA.f407223a;
        }
        return null;
    }

    @Y61.l
    public static final O f(@Y61.k O o12) {
        h(o12);
        if (o12.getAnnotations().F(n.a.f407391q) != null) {
            return o12.F0().get(a(o12)).getType();
        }
        return null;
    }

    @Y61.k
    public static final List<x0> g(@Y61.k O o12) {
        h(o12);
        List<x0> listF0 = o12.F0();
        return listF0.subList(((!h(o12) || o12.getAnnotations().F(n.a.f407391q) == null) ? 0 : 1) + a(o12), listF0.size() - 1);
    }

    public static final boolean h(@Y61.k O o12) {
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        if (interfaceC42853fB == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.builtins.functions.e eVarE = e(interfaceC42853fB);
        return L.f(eVarE, e.a.f407215c) || L.f(eVarE, e.d.f407218c);
    }
}
