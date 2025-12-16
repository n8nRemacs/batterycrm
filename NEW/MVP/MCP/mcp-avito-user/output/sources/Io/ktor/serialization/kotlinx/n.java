package io.ktor.serialization.kotlinx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.r;
import kotlinx.serialization.C;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.C43404g0;
import kotlinx.serialization.internal.V0;

/* compiled from: SerializerLookup.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-serialization-kotlinx"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n {
    public static final KSerializer<?> a(Collection<?> collection, kotlinx.serialization.modules.f fVar) {
        Collection<?> collection2 = collection;
        ArrayList arrayListC = C42745f0.C(collection2);
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListC, 10));
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), fVar));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((KSerializer) next).getF332717a().getF412799a())) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb2 = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((KSerializer) it3.next()).getF332717a().getF412799a());
            }
            sb2.append(arrayList3);
            throw new IllegalStateException(sb2.toString().toString());
        }
        KSerializer<?> kSerializer = (KSerializer) C42745f0.w0(arrayList2);
        if (kSerializer == null) {
            u0 u0Var = u0.f406856a;
            kSerializer = V0.f412822a;
        }
        if (kSerializer.getF332717a().b()) {
            return kSerializer;
        }
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator<T> it4 = collection2.iterator();
            while (it4.hasNext()) {
                if (it4.next() == null) {
                    return L51.a.a(kSerializer);
                }
            }
        }
        return kSerializer;
    }

    @Y61.k
    public static final KSerializer<Object> b(@Y61.l Object obj, @Y61.k kotlinx.serialization.modules.f fVar) {
        KSerializer<Object> kSerializerB;
        if (obj == null) {
            u0 u0Var = u0.f406856a;
            return L51.a.a(V0.f412822a);
        }
        if (obj instanceof List) {
            kSerializerB = new C43401f<>(a((Collection) obj, fVar));
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr.length == 0 ? null : objArr[0];
            if (obj2 != null) {
                return b(obj2, fVar);
            }
            u0 u0Var2 = u0.f406856a;
            kSerializerB = new C43401f<>(V0.f412822a);
        } else if (obj instanceof Set) {
            kSerializerB = new C43404g0<>(a((Collection) obj, fVar));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            kSerializerB = new C43400e0<>(a(map.keySet(), fVar), a(map.values(), fVar));
        } else {
            Class<?> cls = obj.getClass();
            n0 n0Var = m0.f406844a;
            kSerializerB = fVar.b(n0Var.b(cls), C42784z0.f406748b);
            if (kSerializerB == null) {
                return C.c(n0Var.b(obj.getClass()));
            }
        }
        return kSerializerB;
    }

    @InterfaceC43387f
    @InterfaceC43389h
    @Y61.k
    public static final KSerializer<?> c(@Y61.k kotlinx.serialization.modules.f fVar, @Y61.k U31.b bVar) {
        r rVar = bVar.f16156c;
        if (rVar != null) {
            KSerializer<?> kSerializerG = rVar.D().isEmpty() ? null : C.g(fVar, rVar);
            if (kSerializerG != null) {
                return kSerializerG;
            }
        }
        C42784z0 c42784z0 = C42784z0.f406748b;
        kotlin.reflect.d<?> dVar = bVar.f16154a;
        KSerializer<?> kSerializerB = fVar.b(dVar, c42784z0);
        r rVar2 = bVar.f16156c;
        if (kSerializerB == null) {
            kSerializerB = C.c(dVar);
            if (rVar2 != null && rVar2.d()) {
                kSerializerB = L51.a.a(kSerializerB);
            }
        } else if (rVar2 != null && rVar2.d()) {
            kSerializerB = L51.a.a(kSerializerB);
        }
        return kSerializerB;
    }
}
