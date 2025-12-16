package com.bumptech.glide.load.model;

import androidx.core.util.y;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.n;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes5.dex */
class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f339247a;

    /* renamed from: b, reason: collision with root package name */
    public final y.a<List<Throwable>> f339248b;

    /* compiled from: MultiModelLoader.java */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f339249b;

        /* renamed from: c, reason: collision with root package name */
        public final y.a<List<Throwable>> f339250c;

        /* renamed from: d, reason: collision with root package name */
        public int f339251d;

        /* renamed from: e, reason: collision with root package name */
        public Priority f339252e;

        /* renamed from: f, reason: collision with root package name */
        public d.a<? super Data> f339253f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public List<Throwable> f339254g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f339255h;

        public a(@N ArrayList arrayList, @N y.a aVar) {
            this.f339250c = aVar;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f339249b = arrayList;
            this.f339251d = 0;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final Class<Data> a() {
            return ((com.bumptech.glide.load.data.d) this.f339249b.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            List<Throwable> list = this.f339254g;
            if (list != null) {
                this.f339250c.a(list);
            }
            this.f339254g = null;
            Iterator it = this.f339249b.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void c(@P Data data) {
            if (data != null) {
                this.f339253f.c(data);
            } else {
                g();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f339255h = true;
            Iterator it = this.f339249b.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public final DataSource d() {
            return ((com.bumptech.glide.load.data.d) this.f339249b.get(0)).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(@N Priority priority, @N d.a<? super Data> aVar) {
            this.f339252e = priority;
            this.f339253f = aVar;
            this.f339254g = this.f339250c.b();
            ((com.bumptech.glide.load.data.d) this.f339249b.get(this.f339251d)).e(priority, this);
            if (this.f339255h) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void f(@N Exception exc) {
            List<Throwable> list = this.f339254g;
            com.bumptech.glide.util.k.c(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        public final void g() {
            if (this.f339255h) {
                return;
            }
            if (this.f339251d < this.f339249b.size() - 1) {
                this.f339251d++;
                e(this.f339252e, this.f339253f);
            } else {
                com.bumptech.glide.util.k.b(this.f339254g);
                this.f339253f.f(new GlideException("Fetch failed", new ArrayList(this.f339254g)));
            }
        }
    }

    public q(@N ArrayList arrayList, @N y.a aVar) {
        this.f339247a = arrayList;
        this.f339248b = aVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a<Data> a(@N Model model, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        n.a<Data> aVarA;
        ArrayList arrayList = this.f339247a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        com.bumptech.glide.load.h hVar = null;
        for (int i14 = 0; i14 < size; i14++) {
            n nVar = (n) arrayList.get(i14);
            if (nVar.b(model) && (aVarA = nVar.a(model, i12, i13, kVar)) != null) {
                arrayList2.add(aVarA.f339242c);
                hVar = aVarA.f339240a;
            }
        }
        if (arrayList2.isEmpty() || hVar == null) {
            return null;
        }
        return new n.a<>(hVar, new a(arrayList2, this.f339248b));
    }

    @Override // com.bumptech.glide.load.model.n
    public final boolean b(@N Model model) {
        Iterator it = this.f339247a.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f339247a.toArray()) + '}';
    }
}
