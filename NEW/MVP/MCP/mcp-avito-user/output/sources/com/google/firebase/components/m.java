package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* loaded from: classes13.dex */
class m {

    /* compiled from: CycleDetector.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.firebase.components.b<?> f360764a;

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f360765b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f360766c = new HashSet();

        public b(com.google.firebase.components.b<?> bVar) {
            this.f360764a = bVar;
        }
    }

    /* compiled from: CycleDetector.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final u<?> f360767a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f360768b;

        public c() {
            throw null;
        }

        public c(u uVar, boolean z12, a aVar) {
            this.f360767a = uVar;
            this.f360768b = z12;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f360767a.equals(this.f360767a) && cVar.f360768b == this.f360768b;
        }

        public final int hashCode() {
            return ((this.f360767a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f360768b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i12 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (n nVar : bVar.f360764a.f360727c) {
                            if (nVar.f360771c == 0) {
                                Set<b> set = (Set) map.get(new c(nVar.f360769a, nVar.f360770b == 2, null));
                                if (set != null) {
                                    for (b bVar2 : set) {
                                        bVar.f360765b.add(bVar2);
                                        bVar2.f360766c.add(bVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    b bVar3 = (b) it4.next();
                    if (bVar3.f360766c.isEmpty()) {
                        hashSet2.add(bVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    b bVar4 = (b) hashSet2.iterator().next();
                    hashSet2.remove(bVar4);
                    i12++;
                    Iterator it5 = bVar4.f360765b.iterator();
                    while (it5.hasNext()) {
                        b bVar5 = (b) it5.next();
                        bVar5.f360766c.remove(bVar4);
                        if (bVar5.f360766c.isEmpty()) {
                            hashSet2.add(bVar5);
                        }
                    }
                }
                if (i12 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    b bVar6 = (b) it6.next();
                    if (!bVar6.f360766c.isEmpty() && !bVar6.f360765b.isEmpty()) {
                        arrayList2.add(bVar6.f360764a);
                    }
                }
                throw new DependencyCycleException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            com.google.firebase.components.b bVar7 = (com.google.firebase.components.b) it.next();
            b bVar8 = new b(bVar7);
            Iterator it7 = bVar7.f360726b.iterator();
            while (it7.hasNext()) {
                u uVar = (u) it7.next();
                c cVar = new c(uVar, !(bVar7.f360729e == 0), null);
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f360768b) {
                    throw new IllegalArgumentException("Multiple components provide " + uVar + ".");
                }
                set2.add(bVar8);
            }
        }
    }
}
