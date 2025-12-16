package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes5.dex */
class x implements h, d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final h.a f339170b;

    /* renamed from: c, reason: collision with root package name */
    public final i<?> f339171c;

    /* renamed from: d, reason: collision with root package name */
    public int f339172d;

    /* renamed from: e, reason: collision with root package name */
    public int f339173e = -1;

    /* renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.load.h f339174f;

    /* renamed from: g, reason: collision with root package name */
    public List<com.bumptech.glide.load.model.n<File, ?>> f339175g;

    /* renamed from: h, reason: collision with root package name */
    public int f339176h;

    /* renamed from: i, reason: collision with root package name */
    public volatile n.a<?> f339177i;

    /* renamed from: j, reason: collision with root package name */
    public File f339178j;

    /* renamed from: k, reason: collision with root package name */
    public y f339179k;

    public x(i<?> iVar, h.a aVar) {
        this.f339171c = iVar;
        this.f339170b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.h
    public final boolean a() {
        List<Class<?>> list;
        ArrayList arrayListD;
        ArrayList arrayListA = this.f339171c.a();
        boolean z12 = false;
        if (arrayListA.isEmpty()) {
            return false;
        }
        i<?> iVar = this.f339171c;
        Registry registry = iVar.f339015c.f338742b;
        Class<?> cls = iVar.f339016d.getClass();
        Class<?> cls2 = iVar.f339019g;
        Class<?> cls3 = iVar.f339023k;
        com.bumptech.glide.provider.d dVar = registry.f338677h;
        com.bumptech.glide.util.j andSet = dVar.f339527a.getAndSet(null);
        if (andSet == null) {
            andSet = new com.bumptech.glide.util.j(cls, cls2, cls3);
        } else {
            andSet.f339646a = cls;
            andSet.f339647b = cls2;
            andSet.f339648c = cls3;
        }
        synchronized (dVar.f339528b) {
            list = dVar.f339528b.get(andSet);
        }
        dVar.f339527a.set(andSet);
        List<Class<?>> list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            com.bumptech.glide.load.model.p pVar = registry.f338670a;
            synchronized (pVar) {
                arrayListD = pVar.f339243a.d(cls);
            }
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                Iterator it2 = registry.f338672c.d((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!registry.f338675f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            com.bumptech.glide.provider.d dVar2 = registry.f338677h;
            List<Class<?>> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (dVar2.f339528b) {
                dVar2.f339528b.put(new com.bumptech.glide.util.j(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f339171c.f339023k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f339171c.f339016d.getClass() + " to " + this.f339171c.f339023k);
        }
        while (true) {
            List<com.bumptech.glide.load.model.n<File, ?>> list3 = this.f339175g;
            if (list3 != null && this.f339176h < list3.size()) {
                this.f339177i = null;
                while (!z12 && this.f339176h < this.f339175g.size()) {
                    List<com.bumptech.glide.load.model.n<File, ?>> list4 = this.f339175g;
                    int i12 = this.f339176h;
                    this.f339176h = i12 + 1;
                    com.bumptech.glide.load.model.n<File, ?> nVar = list4.get(i12);
                    File file = this.f339178j;
                    i<?> iVar2 = this.f339171c;
                    this.f339177i = nVar.a(file, iVar2.f339017e, iVar2.f339018f, iVar2.f339021i);
                    if (this.f339177i != null && this.f339171c.c(this.f339177i.f339242c.a()) != null) {
                        this.f339177i.f339242c.e(this.f339171c.f339027o, this);
                        z12 = true;
                    }
                }
                return z12;
            }
            int i13 = this.f339173e + 1;
            this.f339173e = i13;
            if (i13 >= list2.size()) {
                int i14 = this.f339172d + 1;
                this.f339172d = i14;
                if (i14 >= arrayListA.size()) {
                    return false;
                }
                this.f339173e = 0;
            }
            com.bumptech.glide.load.h hVar = (com.bumptech.glide.load.h) arrayListA.get(this.f339172d);
            Class<?> cls5 = list2.get(this.f339173e);
            com.bumptech.glide.load.n<Z> nVarD = this.f339171c.d(cls5);
            i<?> iVar3 = this.f339171c;
            this.f339179k = new y(iVar3.f339015c.f338741a, hVar, iVar3.f339026n, iVar3.f339017e, iVar3.f339018f, nVarD, cls5, iVar3.f339021i);
            File fileB = iVar3.f339020h.a().b(this.f339179k);
            this.f339178j = fileB;
            if (fileB != null) {
                this.f339174f = hVar;
                this.f339175g = this.f339171c.f339015c.f338742b.f338670a.b(fileB);
                this.f339176h = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Object obj) {
        this.f339170b.c(this.f339174f, obj, this.f339177i.f339242c, DataSource.f338830e, this.f339179k);
    }

    @Override // com.bumptech.glide.load.engine.h
    public final void cancel() {
        n.a<?> aVar = this.f339177i;
        if (aVar != null) {
            aVar.f339242c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(@N Exception exc) {
        ((j) this.f339170b).b(this.f339179k, exc, this.f339177i.f339242c, DataSource.f338830e);
    }
}
