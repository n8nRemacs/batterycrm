package io.noties.markwon;

import io.noties.markwon.j;
import j.N;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: RegistryImpl.java */
/* loaded from: classes8.dex */
class x implements j.b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f401937a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f401938b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f401939c = new HashSet(3);

    public x(@N ArrayList arrayList) {
        this.f401937a = arrayList;
        this.f401938b = new ArrayList(arrayList.size());
    }

    @Override // io.noties.markwon.j.b
    @N
    public final j a() {
        return d(io.noties.markwon.core.p.class);
    }

    @Override // io.noties.markwon.j.b
    public final <P extends j> void b(@N Class<P> cls, @N j.a<? super P> aVar) {
        aVar.a(d(cls));
    }

    public final void c(@N j jVar) {
        ArrayList arrayList = this.f401938b;
        if (arrayList.contains(jVar)) {
            return;
        }
        HashSet hashSet = this.f401939c;
        if (hashSet.contains(jVar)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
        }
        hashSet.add(jVar);
        jVar.configure(this);
        hashSet.remove(jVar);
        if (arrayList.contains(jVar)) {
            return;
        }
        if (io.noties.markwon.core.p.class.isAssignableFrom(jVar.getClass())) {
            arrayList.add(0, jVar);
        } else {
            arrayList.add(jVar);
        }
    }

    @N
    public final <P extends j> P d(@N Class<P> cls) {
        j jVar;
        P p12;
        Iterator it = this.f401938b.iterator();
        while (true) {
            jVar = null;
            if (!it.hasNext()) {
                p12 = null;
                break;
            }
            p12 = (P) it.next();
            if (cls.isAssignableFrom(p12.getClass())) {
                break;
            }
        }
        if (p12 != null) {
            return p12;
        }
        ArrayList arrayList = this.f401937a;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            j jVar2 = (j) it2.next();
            if (cls.isAssignableFrom(jVar2.getClass())) {
                jVar = jVar2;
                break;
            }
        }
        if (jVar != null) {
            c(jVar);
            return (P) jVar;
        }
        throw new IllegalStateException("Requested plugin is not added: " + cls.getName() + ", plugins: " + arrayList);
    }
}
