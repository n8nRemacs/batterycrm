package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: MultiplexProducer.java */
@J41.d
@Nullsafe
/* loaded from: classes15.dex */
public abstract class S<K, T extends Closeable> implements i0<T> {

    /* renamed from: a, reason: collision with root package name */
    @J41.a
    @j.k0
    public final HashMap f340596a;

    /* renamed from: b, reason: collision with root package name */
    public final i0<T> f340597b;

    /* renamed from: c, reason: collision with root package name */
    public final String f340598c;

    /* renamed from: d, reason: collision with root package name */
    public final String f340599d;

    /* compiled from: MultiplexProducer.java */
    @j.k0
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final K f340600a;

        /* renamed from: b, reason: collision with root package name */
        public final CopyOnWriteArraySet<Pair<InterfaceC36410l<T>, k0>> f340601b = new CopyOnWriteArraySet<>();

        /* renamed from: c, reason: collision with root package name */
        @J41.a
        @I41.h
        public T f340602c;

        /* renamed from: d, reason: collision with root package name */
        @J41.a
        public float f340603d;

        /* renamed from: e, reason: collision with root package name */
        @J41.a
        public int f340604e;

        /* renamed from: f, reason: collision with root package name */
        @J41.a
        @I41.h
        public C36399d f340605f;

        /* renamed from: g, reason: collision with root package name */
        @J41.a
        @I41.h
        public S<K, T>.b.a f340606g;

        /* compiled from: MultiplexProducer.java */
        public class a extends AbstractC36395b<T> {
            public a(a aVar) {
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC36395b
            public final void g() {
                try {
                    com.facebook.imagepipeline.systrace.b.a();
                    b bVar = b.this;
                    synchronized (bVar) {
                        try {
                            if (bVar.f340606g == this) {
                                bVar.f340606g = null;
                                bVar.f340605f = null;
                                b.b(bVar.f340602c);
                                bVar.f340602c = null;
                                bVar.i(TriState.f339862d);
                            }
                        } finally {
                        }
                    }
                } finally {
                    com.facebook.imagepipeline.systrace.b.a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC36395b
            public final void h(Throwable th2) {
                try {
                    com.facebook.imagepipeline.systrace.b.a();
                    b.this.f(this, th2);
                } finally {
                    com.facebook.imagepipeline.systrace.b.a();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.imagepipeline.producers.AbstractC36395b
            public final void i(int i12, @I41.h Object obj) {
                Closeable closeable = (Closeable) obj;
                try {
                    com.facebook.imagepipeline.systrace.b.a();
                    b.this.g(this, closeable, i12);
                } finally {
                    com.facebook.imagepipeline.systrace.b.a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC36395b
            public final void j(float f12) {
                try {
                    com.facebook.imagepipeline.systrace.b.a();
                    b.this.h(this, f12);
                } finally {
                    com.facebook.imagepipeline.systrace.b.a();
                }
            }
        }

        public b(K k12) {
            this.f340600a = k12;
        }

        public static void b(@I41.h Closeable closeable) throws IOException {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e12) {
                    throw new RuntimeException(e12);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a(InterfaceC36410l<T> interfaceC36410l, k0 k0Var) {
            b bVar;
            Pair<InterfaceC36410l<T>, k0> pairCreate = Pair.create(interfaceC36410l, k0Var);
            synchronized (this) {
                try {
                    S s5 = S.this;
                    K k12 = this.f340600a;
                    synchronized (s5) {
                        bVar = (b) s5.f340596a.get(k12);
                    }
                    if (bVar != this) {
                        return false;
                    }
                    this.f340601b.add(pairCreate);
                    ArrayList arrayListK = k();
                    ArrayList arrayListL = l();
                    ArrayList arrayListJ = j();
                    Closeable closeableC = this.f340602c;
                    float f12 = this.f340603d;
                    int i12 = this.f340604e;
                    C36399d.p(arrayListK);
                    C36399d.q(arrayListL);
                    C36399d.o(arrayListJ);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                if (closeableC != this.f340602c) {
                                    closeableC = null;
                                } else if (closeableC != null) {
                                    closeableC = S.this.c(closeableC);
                                }
                            }
                            if (closeableC != null) {
                                if (f12 > 0.0f) {
                                    interfaceC36410l.d(f12);
                                }
                                interfaceC36410l.c(i12, closeableC);
                                b(closeableC);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        } finally {
                        }
                    }
                    k0Var.b(new T(this, pairCreate));
                    return true;
                } finally {
                }
            }
        }

        public final synchronized boolean c() {
            Iterator<Pair<InterfaceC36410l<T>, k0>> it = this.f340601b.iterator();
            while (it.hasNext()) {
                if (((k0) it.next().second).h()) {
                    return true;
                }
            }
            return false;
        }

        public final synchronized boolean d() {
            Iterator<Pair<InterfaceC36410l<T>, k0>> it = this.f340601b.iterator();
            while (it.hasNext()) {
                if (!((k0) it.next().second).m()) {
                    return false;
                }
            }
            return true;
        }

        public final synchronized Priority e() {
            Priority priority;
            priority = Priority.f340259b;
            Iterator<Pair<InterfaceC36410l<T>, k0>> it = this.f340601b.iterator();
            while (it.hasNext()) {
                Priority priority2 = ((k0) it.next().second).getPriority();
                if (priority.ordinal() <= priority2.ordinal()) {
                    priority = priority2;
                }
            }
            return priority;
        }

        public final void f(S<K, T>.b.a aVar, Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f340606g != aVar) {
                        return;
                    }
                    Iterator<Pair<InterfaceC36410l<T>, k0>> it = this.f340601b.iterator();
                    this.f340601b.clear();
                    S.this.e(this.f340600a, this);
                    b(this.f340602c);
                    this.f340602c = null;
                    while (it.hasNext()) {
                        Pair<InterfaceC36410l<T>, k0> next = it.next();
                        synchronized (next) {
                            ((k0) next.second).i().h((k0) next.second, S.this.f340598c, th2, null);
                            ((InterfaceC36410l) next.first).a(th2);
                        }
                    }
                } finally {
                }
            }
        }

        public final void g(S<K, T>.b.a aVar, @I41.h T t12, int i12) {
            synchronized (this) {
                try {
                    if (this.f340606g != aVar) {
                        return;
                    }
                    b(this.f340602c);
                    this.f340602c = null;
                    Iterator<Pair<InterfaceC36410l<T>, k0>> it = this.f340601b.iterator();
                    int size = this.f340601b.size();
                    if (AbstractC36395b.f(i12)) {
                        this.f340602c = (T) S.this.c(t12);
                        this.f340604e = i12;
                    } else {
                        this.f340601b.clear();
                        S.this.e(this.f340600a, this);
                    }
                    while (it.hasNext()) {
                        Pair<InterfaceC36410l<T>, k0> next = it.next();
                        synchronized (next) {
                            try {
                                if (AbstractC36395b.e(i12)) {
                                    ((k0) next.second).i().j((k0) next.second, S.this.f340598c, null);
                                    C36399d c36399d = this.f340605f;
                                    if (c36399d != null) {
                                        ((k0) next.second).d(c36399d.f340660g);
                                    }
                                    ((k0) next.second).e(Integer.valueOf(size), S.this.f340599d);
                                }
                                ((InterfaceC36410l) next.first).c(i12, t12);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final void h(S<K, T>.b.a aVar, float f12) {
            synchronized (this) {
                try {
                    if (this.f340606g != aVar) {
                        return;
                    }
                    this.f340603d = f12;
                    Iterator<Pair<InterfaceC36410l<T>, k0>> it = this.f340601b.iterator();
                    while (it.hasNext()) {
                        Pair<InterfaceC36410l<T>, k0> next = it.next();
                        synchronized (next) {
                            ((InterfaceC36410l) next.first).d(f12);
                        }
                    }
                } finally {
                }
            }
        }

        public final void i(TriState triState) {
            boolean z12;
            synchronized (this) {
                try {
                    if (!(this.f340605f == null)) {
                        throw new IllegalArgumentException();
                    }
                    if (!(this.f340606g == null)) {
                        throw new IllegalArgumentException();
                    }
                    if (this.f340601b.isEmpty()) {
                        S.this.e(this.f340600a, this);
                        return;
                    }
                    k0 k0Var = (k0) this.f340601b.iterator().next().second;
                    C36399d c36399d = new C36399d(k0Var.j(), k0Var.getId(), null, k0Var.i(), k0Var.a(), k0Var.n(), d(), c(), e(), k0Var.c());
                    this.f340605f = c36399d;
                    c36399d.d(k0Var.getExtras());
                    if (triState != TriState.f339862d) {
                        C36399d c36399d2 = this.f340605f;
                        int iOrdinal = triState.ordinal();
                        if (iOrdinal == 0) {
                            z12 = true;
                        } else {
                            if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    throw new IllegalStateException("No boolean equivalent for UNSET");
                                }
                                throw new IllegalStateException("Unrecognized TriState value: " + triState);
                            }
                            z12 = false;
                        }
                        c36399d2.e(Boolean.valueOf(z12), "started_as_prefetch");
                    }
                    S<K, T>.b.a aVar = new a(null);
                    this.f340606g = aVar;
                    S.this.f340597b.b(aVar, this.f340605f);
                } finally {
                }
            }
        }

        @I41.h
        public final synchronized ArrayList j() {
            C36399d c36399d = this.f340605f;
            ArrayList arrayList = null;
            if (c36399d == null) {
                return null;
            }
            boolean zC2 = c();
            synchronized (c36399d) {
                if (zC2 != c36399d.f340663j) {
                    c36399d.f340663j = zC2;
                    arrayList = new ArrayList(c36399d.f340665l);
                }
            }
            return arrayList;
        }

        @I41.h
        public final synchronized ArrayList k() {
            C36399d c36399d = this.f340605f;
            ArrayList arrayList = null;
            if (c36399d == null) {
                return null;
            }
            boolean zD2 = d();
            synchronized (c36399d) {
                if (zD2 != c36399d.f340661h) {
                    c36399d.f340661h = zD2;
                    arrayList = new ArrayList(c36399d.f340665l);
                }
            }
            return arrayList;
        }

        @I41.h
        public final synchronized ArrayList l() {
            ArrayList arrayList;
            C36399d c36399d = this.f340605f;
            if (c36399d == null) {
                return null;
            }
            Priority priorityE = e();
            synchronized (c36399d) {
                if (priorityE == c36399d.f340662i) {
                    arrayList = null;
                } else {
                    c36399d.f340662i = priorityE;
                    arrayList = new ArrayList(c36399d.f340665l);
                }
            }
            return arrayList;
        }
    }

    public S() {
        throw null;
    }

    public S(i0 i0Var, String str, @k0.a String str2) {
        this.f340597b = i0Var;
        this.f340596a = new HashMap();
        this.f340598c = str;
        this.f340599d = str2;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<T> interfaceC36410l, k0 k0Var) {
        b bVar;
        boolean z12;
        try {
            com.facebook.imagepipeline.systrace.b.a();
            k0Var.i().c(k0Var, this.f340598c);
            Pair pairD = d(k0Var);
            do {
                synchronized (this) {
                    synchronized (this) {
                        bVar = (b) this.f340596a.get(pairD);
                    }
                }
                if (bVar == null) {
                    synchronized (this) {
                        bVar = new b(pairD);
                        this.f340596a.put(pairD, bVar);
                        z12 = true;
                    }
                } else {
                    z12 = false;
                }
            } while (!bVar.a(interfaceC36410l, k0Var));
            if (z12) {
                bVar.i(k0Var.m() ? TriState.f339860b : TriState.f339861c);
            }
        } finally {
            com.facebook.imagepipeline.systrace.b.a();
        }
    }

    @I41.h
    public abstract T c(@I41.h T t12);

    public abstract Pair d(k0 k0Var);

    public final synchronized void e(K k12, S<K, T>.b bVar) {
        if (this.f340596a.get(k12) == bVar) {
            this.f340596a.remove(k12);
        }
    }
}
