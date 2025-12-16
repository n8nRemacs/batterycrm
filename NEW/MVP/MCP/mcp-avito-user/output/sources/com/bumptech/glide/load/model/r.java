package com.bumptech.glide.load.model;

import androidx.core.util.y;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.model.n;
import j.N;
import j.P;
import j.k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes5.dex */
public class r {

    /* renamed from: e, reason: collision with root package name */
    public static final c f339256e = new c();

    /* renamed from: f, reason: collision with root package name */
    public static final n<Object, Object> f339257f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f339258a;

    /* renamed from: b, reason: collision with root package name */
    public final c f339259b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f339260c;

    /* renamed from: d, reason: collision with root package name */
    public final y.a<List<Throwable>> f339261d;

    /* compiled from: MultiModelLoaderFactory.java */
    public static class a implements n<Object, Object> {
        @Override // com.bumptech.glide.load.model.n
        @P
        public final n.a<Object> a(@N Object obj, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
            return null;
        }

        @Override // com.bumptech.glide.load.model.n
        public final boolean b(@N Object obj) {
            return false;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    public static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<Model> f339262a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<Data> f339263b;

        /* renamed from: c, reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f339264c;

        public b(@N Class<Model> cls, @N Class<Data> cls2, @N o<? extends Model, ? extends Data> oVar) {
            this.f339262a = cls;
            this.f339263b = cls2;
            this.f339264c = oVar;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    public static class c {
    }

    @k0
    public r() {
        throw null;
    }

    public r(@N y.a<List<Throwable>> aVar) {
        c cVar = f339256e;
        this.f339258a = new ArrayList();
        this.f339260c = new HashSet();
        this.f339261d = aVar;
        this.f339259b = cVar;
    }

    @N
    public final <Model, Data> n<Model, Data> a(@N b<?, ?> bVar) {
        n<Model, Data> nVar = (n<Model, Data>) bVar.f339264c.b(this);
        com.bumptech.glide.util.k.c(nVar, "Argument must not be null");
        return nVar;
    }

    @N
    public final synchronized <Model, Data> n<Model, Data> b(@N Class<Model> cls, @N Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f339258a.iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                b<?, ?> bVar = (b) it.next();
                if (this.f339260c.contains(bVar)) {
                    z12 = true;
                } else if (bVar.f339262a.isAssignableFrom(cls) && bVar.f339263b.isAssignableFrom(cls2)) {
                    this.f339260c.add(bVar);
                    arrayList.add(a(bVar));
                    this.f339260c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f339259b;
                y.a<List<Throwable>> aVar = this.f339261d;
                cVar.getClass();
                return new q(arrayList, aVar);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (z12) {
                return (n<Model, Data>) f339257f;
            }
            throw new Registry.NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th2) {
            this.f339260c.clear();
            throw th2;
        }
    }

    @N
    public final synchronized ArrayList c(@N Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f339258a.iterator();
            while (it.hasNext()) {
                b<?, ?> bVar = (b) it.next();
                if (!this.f339260c.contains(bVar) && bVar.f339262a.isAssignableFrom(cls)) {
                    this.f339260c.add(bVar);
                    arrayList.add(a(bVar));
                    this.f339260c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    @N
    public final synchronized ArrayList d(@N Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f339258a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f339263b) && bVar.f339262a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f339263b);
            }
        }
        return arrayList;
    }
}
