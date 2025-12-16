package com.google.firebase.components;

import aZ0.InterfaceC19845a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import pZ0.InterfaceC47039a;
import tZ0.C48621a;
import tZ0.InterfaceC48623c;
import tZ0.InterfaceC48624d;
import wZ0.InterfaceC49583a;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes13.dex */
public class l implements c, InterfaceC47039a {

    /* renamed from: h, reason: collision with root package name */
    public static final i f360752h = new i(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f360753a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f360754b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f360755c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f360756d;

    /* renamed from: e, reason: collision with root package name */
    public final o f360757e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference<Boolean> f360758f;

    /* renamed from: g, reason: collision with root package name */
    public final h f360759g;

    /* compiled from: ComponentRuntime.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f360760a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f360761b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f360762c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public h f360763d = h.f360745k2;

        public b(Executor executor) {
            this.f360760a = executor;
        }

        @InterfaceC19845a
        public final void a(com.google.firebase.components.b bVar) {
            this.f360762c.add(bVar);
        }
    }

    public l() {
        throw null;
    }

    public l(Executor executor, Iterable iterable, Collection collection, h hVar, a aVar) {
        this.f360753a = new HashMap();
        this.f360754b = new HashMap();
        this.f360755c = new HashMap();
        this.f360756d = new HashSet();
        this.f360758f = new AtomicReference<>();
        o oVar = new o(executor);
        this.f360757e = oVar;
        this.f360759g = hVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.firebase.components.b.c(oVar, o.class, InterfaceC48624d.class, InterfaceC48623c.class));
        arrayList.add(com.google.firebase.components.b.c(this, InterfaceC47039a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            com.google.firebase.components.b bVar = (com.google.firebase.components.b) it.next();
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((wZ0.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.f360759g.c(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it3.remove();
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((com.google.firebase.components.b) it4.next()).f360726b.toArray();
                int length = array.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        Object obj = array[i12];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f360756d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f360756d.add(obj.toString());
                        }
                        i12++;
                    }
                }
            }
            if (this.f360753a.isEmpty()) {
                m.a(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f360753a.keySet());
                arrayList4.addAll(arrayList);
                m.a(arrayList4);
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                final com.google.firebase.components.b bVar2 = (com.google.firebase.components.b) it5.next();
                this.f360753a.put(bVar2, new p(new wZ0.b() { // from class: com.google.firebase.components.j
                    @Override // wZ0.b
                    public final Object get() {
                        l lVar = this.f360747a;
                        b bVar3 = bVar2;
                        return bVar3.f360730f.a(new w(bVar3, lVar));
                    }
                }));
            }
            arrayList3.addAll(m(arrayList));
            arrayList3.addAll(n());
            l();
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = this.f360758f.get();
        if (bool != null) {
            j(this.f360753a, bool.booleanValue());
        }
    }

    @Override // com.google.firebase.components.c
    public final <T> InterfaceC49583a<T> c(u<T> uVar) {
        wZ0.b<T> bVarI = i(uVar);
        return bVarI == null ? new s(s.f360782c, s.f360783d) : bVarI instanceof s ? (s) bVarI : new s(null, bVarI);
    }

    @Override // com.google.firebase.components.c
    public final synchronized <T> wZ0.b<Set<T>> e(u<T> uVar) {
        q qVar = (q) this.f360755c.get(uVar);
        if (qVar != null) {
            return qVar;
        }
        return f360752h;
    }

    @Override // com.google.firebase.components.c
    public final synchronized <T> wZ0.b<T> i(u<T> uVar) {
        return (wZ0.b) this.f360754b.get(uVar);
    }

    public final void j(HashMap map, boolean z12) {
        ArrayDeque<C48621a> arrayDeque;
        Set<Map.Entry> setEmptySet;
        for (Map.Entry entry : map.entrySet()) {
            com.google.firebase.components.b bVar = (com.google.firebase.components.b) entry.getKey();
            wZ0.b bVar2 = (wZ0.b) entry.getValue();
            int i12 = bVar.f360728d;
            if (i12 == 1 || (i12 == 2 && z12)) {
                bVar2.get();
            }
        }
        o oVar = this.f360757e;
        synchronized (oVar) {
            arrayDeque = oVar.f360773b;
            if (arrayDeque != null) {
                oVar.f360773b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            for (C48621a c48621a : arrayDeque) {
                c48621a.getClass();
                synchronized (oVar) {
                    try {
                        ArrayDeque arrayDeque2 = oVar.f360773b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(c48621a);
                        } else {
                            synchronized (oVar) {
                                try {
                                    Map map2 = (Map) oVar.f360772a.get(null);
                                    setEmptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                                } finally {
                                }
                            }
                            for (Map.Entry entry2 : setEmptySet) {
                                ((Executor) entry2.getValue()).execute(new k(2, entry2, c48621a));
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final void k(boolean z12) {
        HashMap map;
        AtomicReference<Boolean> atomicReference = this.f360758f;
        Boolean boolValueOf = Boolean.valueOf(z12);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.f360753a);
        }
        j(map, z12);
    }

    public final void l() {
        for (com.google.firebase.components.b bVar : this.f360753a.keySet()) {
            for (n nVar : bVar.f360727c) {
                boolean z12 = nVar.f360770b == 2;
                u<?> uVar = nVar.f360769a;
                if (z12) {
                    HashMap map = this.f360755c;
                    if (!map.containsKey(uVar)) {
                        Set setEmptySet = Collections.emptySet();
                        q qVar = new q();
                        qVar.f360779b = null;
                        qVar.f360778a = Collections.newSetFromMap(new ConcurrentHashMap());
                        qVar.f360778a.addAll(setEmptySet);
                        map.put(uVar, qVar);
                    }
                }
                HashMap map2 = this.f360754b;
                if (map2.containsKey(uVar)) {
                    continue;
                } else {
                    int i12 = nVar.f360770b;
                    if (i12 == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + bVar + ": " + uVar);
                    }
                    if (i12 != 2) {
                        map2.put(uVar, new s(s.f360782c, s.f360783d));
                    }
                }
            }
        }
    }

    public final ArrayList m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.google.firebase.components.b bVar = (com.google.firebase.components.b) it.next();
            if (bVar.f360729e == 0) {
                wZ0.b bVar2 = (wZ0.b) this.f360753a.get(bVar);
                Iterator it2 = bVar.f360726b.iterator();
                while (it2.hasNext()) {
                    u uVar = (u) it2.next();
                    HashMap map = this.f360754b;
                    if (map.containsKey(uVar)) {
                        arrayList2.add(new k(0, (s) ((wZ0.b) map.get(uVar)), bVar2));
                    } else {
                        map.put(uVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList n() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f360753a.entrySet()) {
            com.google.firebase.components.b bVar = (com.google.firebase.components.b) entry.getKey();
            if (bVar.f360729e != 0) {
                wZ0.b bVar2 = (wZ0.b) entry.getValue();
                Iterator it = bVar.f360726b.iterator();
                while (it.hasNext()) {
                    u uVar = (u) it.next();
                    if (!map.containsKey(uVar)) {
                        map.put(uVar, new HashSet());
                    }
                    ((Set) map.get(uVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f360755c;
            if (map2.containsKey(key)) {
                q qVar = (q) map2.get(entry2.getKey());
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new k(1, qVar, (wZ0.b) it2.next()));
                }
            } else {
                u uVar2 = (u) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                q qVar2 = new q();
                qVar2.f360779b = null;
                qVar2.f360778a = Collections.newSetFromMap(new ConcurrentHashMap());
                qVar2.f360778a.addAll(set);
                map2.put(uVar2, qVar2);
            }
        }
        return arrayList;
    }
}
