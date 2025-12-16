package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.K;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: UnsignedType.kt */
@s0
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final p f407402a = new p();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Set<kotlin.reflect.jvm.internal.impl.name.f> f407403b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Set<kotlin.reflect.jvm.internal.impl.name.f> f407404c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f407405d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f407406e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashSet f407407f;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.f407186c);
        }
        f407403b = C42745f0.P0(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.f407182b);
        }
        f407404c = C42745f0.P0(arrayList2);
        f407405d = new HashMap<>();
        f407406e = new HashMap<>();
        P0.e(new Q(UnsignedArrayType.f407176c, kotlin.reflect.jvm.internal.impl.name.f.e("ubyteArrayOf")), new Q(UnsignedArrayType.f407177d, kotlin.reflect.jvm.internal.impl.name.f.e("ushortArrayOf")), new Q(UnsignedArrayType.f407178e, kotlin.reflect.jvm.internal.impl.name.f.e("uintArrayOf")), new Q(UnsignedArrayType.f407179f, kotlin.reflect.jvm.internal.impl.name.f.e("ulongArrayOf")));
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.f407187d.i());
        }
        f407407f = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> map = f407405d;
            kotlin.reflect.jvm.internal.impl.name.b bVar = unsignedType3.f407187d;
            kotlin.reflect.jvm.internal.impl.name.b bVar2 = unsignedType3.f407185b;
            map.put(bVar, bVar2);
            f407406e.put(bVar2, unsignedType3.f407187d);
        }
    }

    @X41.n
    public static final boolean a(@Y61.k O o12) {
        InterfaceC42853f interfaceC42853fB;
        if (G0.n(o12) || (interfaceC42853fB = o12.H0().b()) == null) {
            return false;
        }
        f407402a.getClass();
        InterfaceC42882k interfaceC42882kF = interfaceC42853fB.f();
        return (interfaceC42882kF instanceof K) && L.f(((K) interfaceC42882kF).d(), n.f407339l) && f407403b.contains(interfaceC42853fB.getName());
    }
}
