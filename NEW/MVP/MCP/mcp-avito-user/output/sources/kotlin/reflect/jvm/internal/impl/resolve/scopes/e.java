package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.m;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: GivenFunctionsMemberScope.kt */
/* loaded from: classes8.dex */
final class e extends N implements Y41.a<List<? extends InterfaceC42882k>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f409674l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(0);
        this.f409674l = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    @Override // Y41.a
    public final List<? extends InterfaceC42882k> invoke() {
        Collection arrayList;
        g gVar = this.f409674l;
        List<InterfaceC42905x> listH = gVar.h();
        List<InterfaceC42905x> list = listH;
        ArrayList arrayList2 = new ArrayList(3);
        Collection<O> collectionC = gVar.f409678b.l().C();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            C42745f0.h(m.a.a(((O) it.next()).n(), null, 3), arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof CallableMemberDescriptor) {
                arrayList4.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            kotlin.reflect.jvm.internal.impl.name.f name = ((CallableMemberDescriptor) next2).getName();
            Object arrayList5 = linkedHashMap.get(name);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(name, arrayList5);
            }
            ((List) arrayList5).add(next2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : list2) {
                Boolean boolValueOf = Boolean.valueOf(((CallableMemberDescriptor) obj) instanceof InterfaceC42905x);
                Object arrayList6 = linkedHashMap2.get(boolValueOf);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList6);
                }
                ((List) arrayList6).add(obj);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                OverridingUtil overridingUtil = OverridingUtil.f409560e;
                List list4 = list3;
                if (zBooleanValue) {
                    arrayList = new ArrayList();
                    for (Object obj2 : listH) {
                        if (L.f(((InterfaceC42905x) obj2).getName(), fVar)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = C42784z0.f406748b;
                }
                overridingUtil.h(fVar, list4, arrayList, gVar.f409678b, new f(arrayList2, gVar));
            }
        }
        return C42745f0.h0(kotlin.reflect.jvm.internal.impl.utils.a.b(arrayList2), list);
    }
}
