package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.model.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeHelper.java */
/* loaded from: classes5.dex */
final class i<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f339013a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f339014b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.e f339015c;

    /* renamed from: d, reason: collision with root package name */
    public Object f339016d;

    /* renamed from: e, reason: collision with root package name */
    public int f339017e;

    /* renamed from: f, reason: collision with root package name */
    public int f339018f;

    /* renamed from: g, reason: collision with root package name */
    public Class<?> f339019g;

    /* renamed from: h, reason: collision with root package name */
    public m.c f339020h;

    /* renamed from: i, reason: collision with root package name */
    public com.bumptech.glide.load.k f339021i;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.util.b f339022j;

    /* renamed from: k, reason: collision with root package name */
    public Class<Transcode> f339023k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f339024l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f339025m;

    /* renamed from: n, reason: collision with root package name */
    public com.bumptech.glide.load.h f339026n;

    /* renamed from: o, reason: collision with root package name */
    public Priority f339027o;

    /* renamed from: p, reason: collision with root package name */
    public l f339028p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f339029q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f339030r;

    public final ArrayList a() {
        boolean z12 = this.f339025m;
        ArrayList arrayList = this.f339014b;
        if (!z12) {
            this.f339025m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i12 = 0; i12 < size; i12++) {
                n.a aVar = (n.a) arrayListB.get(i12);
                if (!arrayList.contains(aVar.f339240a)) {
                    arrayList.add(aVar.f339240a);
                }
                int i13 = 0;
                while (true) {
                    List<com.bumptech.glide.load.h> list = aVar.f339241b;
                    if (i13 < list.size()) {
                        if (!arrayList.contains(list.get(i13))) {
                            arrayList.add(list.get(i13));
                        }
                        i13++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z12 = this.f339024l;
        ArrayList arrayList = this.f339013a;
        if (!z12) {
            this.f339024l = true;
            arrayList.clear();
            Registry registry = this.f339015c.f338742b;
            List listB = registry.f338670a.b(this.f339016d);
            int size = listB.size();
            for (int i12 = 0; i12 < size; i12++) {
                n.a aVarA = ((com.bumptech.glide.load.model.n) listB.get(i12)).a(this.f339016d, this.f339017e, this.f339018f, this.f339021i);
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data> u<Data, ?, Transcode> c(Class<Data> cls) {
        u<Data, ?, Transcode> uVar;
        Registry registry = this.f339015c.f338742b;
        Class<?> cls2 = this.f339019g;
        Class cls3 = this.f339023k;
        com.bumptech.glide.provider.c cVar = registry.f338678i;
        com.bumptech.glide.util.j andSet = cVar.f339526b.getAndSet(null);
        if (andSet == null) {
            andSet = new com.bumptech.glide.util.j();
        }
        andSet.f339646a = cls;
        andSet.f339647b = cls2;
        andSet.f339648c = cls3;
        synchronized (cVar.f339525a) {
            uVar = (u) cVar.f339525a.get(andSet);
        }
        cVar.f339526b.set(andSet);
        registry.f338678i.getClass();
        if (com.bumptech.glide.provider.c.f339524c.equals(uVar)) {
            return null;
        }
        if (uVar != null) {
            return uVar;
        }
        ArrayList arrayList = new ArrayList();
        com.bumptech.glide.provider.e eVar = registry.f338672c;
        Iterator it = eVar.d(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            com.bumptech.glide.load.resource.transcode.f fVar = registry.f338675f;
            Iterator it2 = fVar.b(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                arrayList.add(new k(cls, cls4, cls5, eVar.b(cls, cls4), fVar.a(cls4, cls5), registry.f338679j));
                cls4 = cls4;
                fVar = fVar;
            }
        }
        u<Data, ?, Transcode> uVar2 = arrayList.isEmpty() ? null : new u<>(cls, cls2, cls3, arrayList, registry.f338679j);
        com.bumptech.glide.provider.c cVar2 = registry.f338678i;
        synchronized (cVar2.f339525a) {
            cVar2.f339525a.put(new com.bumptech.glide.util.j(cls, cls2, cls3), uVar2 != null ? uVar2 : com.bumptech.glide.provider.c.f339524c);
        }
        return uVar2;
    }

    public final <Z> com.bumptech.glide.load.n<Z> d(Class<Z> cls) {
        com.bumptech.glide.load.n<Z> nVar = (com.bumptech.glide.load.n) this.f339022j.get(cls);
        if (nVar == null) {
            Iterator it = this.f339022j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    nVar = (com.bumptech.glide.load.n) entry.getValue();
                    break;
                }
            }
        }
        if (nVar != null) {
            return nVar;
        }
        if (!this.f339022j.isEmpty() || !this.f339029q) {
            return com.bumptech.glide.load.resource.c.f339420b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
