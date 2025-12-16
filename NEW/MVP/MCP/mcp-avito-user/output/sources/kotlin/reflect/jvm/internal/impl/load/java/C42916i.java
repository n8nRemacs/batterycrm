package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;

/* compiled from: BuiltinSpecialProperties.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42916i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42916i f408064a = new C42916i();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Object f408065b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f408066c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Set<kotlin.reflect.jvm.internal.impl.name.c> f408067d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Set<kotlin.reflect.jvm.internal.impl.name.f> f408068e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.Map] */
    static {
        kotlin.reflect.jvm.internal.impl.name.d dVar = n.a.f407385k;
        Q q12 = new Q(dVar.b(kotlin.reflect.jvm.internal.impl.name.f.e("name")).g(), kotlin.reflect.jvm.internal.impl.builtins.n.f407331d);
        Q q13 = new Q(dVar.b(kotlin.reflect.jvm.internal.impl.name.f.e("ordinal")).g(), kotlin.reflect.jvm.internal.impl.name.f.e("ordinal"));
        Q q14 = new Q(n.a.f407347C.c(kotlin.reflect.jvm.internal.impl.name.f.e("size")), kotlin.reflect.jvm.internal.impl.name.f.e("size"));
        kotlin.reflect.jvm.internal.impl.name.c cVar = n.a.f407351G;
        Map mapG = P0.g(q12, q13, q14, new Q(cVar.c(kotlin.reflect.jvm.internal.impl.name.f.e("size")), kotlin.reflect.jvm.internal.impl.name.f.e("size")), new Q(n.a.f407380f.b(kotlin.reflect.jvm.internal.impl.name.f.e("length")).g(), kotlin.reflect.jvm.internal.impl.name.f.e("length")), new Q(cVar.c(kotlin.reflect.jvm.internal.impl.name.f.e("keys")), kotlin.reflect.jvm.internal.impl.name.f.e("keySet")), new Q(cVar.c(kotlin.reflect.jvm.internal.impl.name.f.e("values")), kotlin.reflect.jvm.internal.impl.name.f.e("values")), new Q(cVar.c(kotlin.reflect.jvm.internal.impl.name.f.e("entries")), kotlin.reflect.jvm.internal.impl.name.f.e("entrySet")));
        f408065b = mapG;
        Set<Map.Entry> setEntrySet = mapG.entrySet();
        ArrayList arrayList = new ArrayList(C42745f0.q(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Q(((kotlin.reflect.jvm.internal.impl.name.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Q q15 = (Q) it.next();
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) q15.f406620c;
            Object arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            ((List) arrayList2).add((kotlin.reflect.jvm.internal.impl.name.f) q15.f406619b);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), C42745f0.v((Iterable) entry2.getValue()));
        }
        f408066c = linkedHashMap2;
        ?? r02 = f408065b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r02.entrySet()) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f407238a;
            kotlin.reflect.jvm.internal.impl.name.d dVarI = ((kotlin.reflect.jvm.internal.impl.name.c) entry3.getKey()).e().i();
            cVar2.getClass();
            linkedHashSet.add(kotlin.reflect.jvm.internal.impl.builtins.jvm.c.e(dVarI).b().c((kotlin.reflect.jvm.internal.impl.name.f) entry3.getValue()));
        }
        Set<kotlin.reflect.jvm.internal.impl.name.c> setKeySet = f408065b.keySet();
        f408067d = setKeySet;
        Set<kotlin.reflect.jvm.internal.impl.name.c> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((kotlin.reflect.jvm.internal.impl.name.c) it2.next()).f());
        }
        f408068e = C42745f0.P0(arrayList3);
    }
}
