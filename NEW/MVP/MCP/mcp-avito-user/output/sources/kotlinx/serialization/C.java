package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.X;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlinx.serialization.internal.C0;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.C43404g0;
import kotlinx.serialization.internal.C43414l0;
import kotlinx.serialization.internal.C43441z0;
import kotlinx.serialization.internal.D0;
import kotlinx.serialization.internal.M0;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.P;
import kotlinx.serialization.internal.S;
import kotlinx.serialization.internal.Z0;

@Metadata(d1 = {"kotlinx/serialization/D", "kotlinx/serialization/F"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class C {
    @X
    @Y61.k
    public static final KSerializer<?> a(@Y61.k kotlinx.serialization.modules.f fVar, @Y61.k kotlin.reflect.d<?> dVar) {
        KSerializer<?> kSerializerB = fVar.b(dVar, C42784z0.f406748b);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        String strL0 = dVar.l0();
        if (strL0 == null) {
            strL0 = "<local class name not available>";
        }
        throw new SerializationException(AK.c.k("Serializer for class '", strL0, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    @Y61.l
    public static final KSerializer b(@Y61.k kotlin.reflect.d dVar, @Y61.k ArrayList arrayList, @Y61.k Y41.a aVar) {
        KSerializer z02;
        KSerializer n02;
        n0 n0Var = m0.f406844a;
        if (L.f(dVar, n0Var.b(Collection.class)) ? true : L.f(dVar, n0Var.b(List.class)) ? true : L.f(dVar, n0Var.b(List.class)) ? true : L.f(dVar, n0Var.b(ArrayList.class))) {
            z02 = new C43401f((KSerializer) arrayList.get(0));
        } else if (L.f(dVar, n0Var.b(HashSet.class))) {
            z02 = new S((KSerializer) arrayList.get(0));
        } else {
            if (L.f(dVar, n0Var.b(Set.class)) ? true : L.f(dVar, n0Var.b(Set.class)) ? true : L.f(dVar, n0Var.b(LinkedHashSet.class))) {
                z02 = new C43404g0((KSerializer) arrayList.get(0));
            } else if (L.f(dVar, n0Var.b(HashMap.class))) {
                z02 = new P((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            } else {
                if (L.f(dVar, n0Var.b(Map.class)) ? true : L.f(dVar, n0Var.b(Map.class)) ? true : L.f(dVar, n0Var.b(LinkedHashMap.class))) {
                    z02 = new C43400e0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                } else {
                    if (L.f(dVar, n0Var.b(Map.Entry.class))) {
                        n02 = new C43414l0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                    } else if (L.f(dVar, n0Var.b(Q.class))) {
                        n02 = new C43441z0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                    } else if (L.f(dVar, n0Var.b(C42829l0.class))) {
                        z02 = new Z0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
                    } else if (((InterfaceC42819t) dVar).f().isArray()) {
                        n02 = new N0((kotlin.reflect.d) aVar.invoke(), (KSerializer) arrayList.get(0));
                    } else {
                        z02 = null;
                    }
                    z02 = n02;
                }
            }
        }
        if (z02 != null) {
            return z02;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        return C0.a(((InterfaceC42819t) dVar).f(), (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
    }

    @InterfaceC43389h
    @Y61.k
    public static final <T> KSerializer<T> c(@Y61.k kotlin.reflect.d<T> dVar) {
        KSerializer<T> kSerializerF = f(dVar);
        if (kSerializerF != null) {
            return kSerializerF;
        }
        String strL0 = dVar.l0();
        if (strL0 == null) {
            strL0 = "<local class name not available>";
        }
        throw new SerializationException(AK.c.k("Serializer for class '", strL0, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    @Y61.k
    public static final KSerializer<Object> d(@Y61.k kotlinx.serialization.modules.f fVar, @Y61.k Type type) {
        KSerializer<Object> kSerializerC = D.c(fVar, type, true);
        if (kSerializerC != null) {
            return kSerializerC;
        }
        String strL0 = m0.f406844a.b(D.a(type)).l0();
        if (strL0 == null) {
            strL0 = "<local class name not available>";
        }
        throw new SerializationException(AK.c.k("Serializer for class '", strL0, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    @Y61.k
    public static final KSerializer<Object> e(@Y61.k kotlinx.serialization.modules.f fVar, @Y61.k kotlin.reflect.r rVar) {
        KSerializer<Object> kSerializerA = F.a(fVar, rVar, true);
        if (kSerializerA != null) {
            return kSerializerA;
        }
        String strL0 = D0.c(rVar).l0();
        if (strL0 == null) {
            strL0 = "<local class name not available>";
        }
        throw new SerializationException(AK.c.k("Serializer for class '", strL0, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Y61.l
    @InterfaceC43389h
    public static final <T> KSerializer<T> f(@Y61.k kotlin.reflect.d<T> dVar) {
        KSerializer<T> kSerializerA = C0.a(((InterfaceC42819t) dVar).f(), (KSerializer[]) Arrays.copyOf(new KSerializer[0], 0));
        return kSerializerA == null ? (KSerializer) M0.f412792a.get(dVar) : kSerializerA;
    }

    @Y61.l
    public static final KSerializer<Object> g(@Y61.k kotlinx.serialization.modules.f fVar, @Y61.k kotlin.reflect.r rVar) {
        return F.a(fVar, rVar, false);
    }

    @Y61.l
    public static final ArrayList h(@Y61.k kotlinx.serialization.modules.f fVar, @Y61.k List list, boolean z12) {
        ArrayList arrayList;
        if (z12) {
            List list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(e(fVar, (kotlin.reflect.r) it.next()));
            }
        } else {
            List list3 = list;
            arrayList = new ArrayList(C42745f0.q(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                KSerializer<Object> kSerializerA = F.a(fVar, (kotlin.reflect.r) it2.next(), false);
                if (kSerializerA == null) {
                    return null;
                }
                arrayList.add(kSerializerA);
            }
        }
        return arrayList;
    }
}
