package androidx.media3.session;

import androidx.collection.C20199a;
import androidx.media3.common.H;
import androidx.media3.common.util.C23110a;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ConnectedControllersManager.java */
/* renamed from: androidx.media3.session.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23225h<T> {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference<T0> f52479d;

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public final C20199a<T, O0.g> f52477b = new C20199a<>();

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public final C20199a<O0.g, b<T>> f52478c = new C20199a<>();

    /* renamed from: a, reason: collision with root package name */
    public final Object f52476a = new Object();

    /* compiled from: ConnectedControllersManager.java */
    /* renamed from: androidx.media3.session.h$a */
    public interface a {
        com.google.common.util.concurrent.D0<Void> run();
    }

    /* compiled from: ConnectedControllersManager.java */
    /* renamed from: androidx.media3.session.h$b */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f52480a;

        /* renamed from: b, reason: collision with root package name */
        public final J1 f52481b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayDeque f52482c = new ArrayDeque();

        /* renamed from: d, reason: collision with root package name */
        public L1 f52483d;

        /* renamed from: e, reason: collision with root package name */
        public H.c f52484e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f52485f;

        public b(T t12, J1 j12, L1 l12, H.c cVar) {
            this.f52480a = t12;
            this.f52481b = j12;
            this.f52483d = l12;
            this.f52484e = cVar;
        }
    }

    public C23225h(T0 t02) {
        this.f52479d = new WeakReference<>(t02);
    }

    public final void a(T t12, O0.g gVar, L1 l12, H.c cVar) {
        synchronized (this.f52476a) {
            try {
                O0.g gVarE = e(t12);
                if (gVarE == null) {
                    this.f52477b.put(t12, gVar);
                    this.f52478c.put(gVar, new b<>(t12, new J1(), l12, cVar));
                } else {
                    b<T> bVar = this.f52478c.get(gVarE);
                    C23110a.h(bVar);
                    bVar.f52483d = l12;
                    bVar.f52484e = cVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @j.B
    public final void b(b<T> bVar) {
        T0 t02 = this.f52479d.get();
        if (t02 == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            a aVar = (a) bVar.f52482c.poll();
            if (aVar == null) {
                bVar.f52485f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            androidx.media3.common.util.M.I(t02.f52297k, new RunnableC23253q0(t02, e(bVar.f52480a), new RunnableC23219f(this, aVar, atomicBoolean2, bVar, atomicBoolean)));
            atomicBoolean2.set(false);
        }
    }

    @j.P
    public final H.c c(O0.g gVar) {
        synchronized (this.f52476a) {
            try {
                b<T> bVar = this.f52478c.get(gVar);
                if (bVar == null) {
                    return null;
                }
                return bVar.f52484e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final AbstractC37401r1<O0.g> d() {
        AbstractC37401r1<O0.g> abstractC37401r1V;
        synchronized (this.f52476a) {
            abstractC37401r1V = AbstractC37401r1.v(this.f52477b.values());
        }
        return abstractC37401r1V;
    }

    @j.P
    public final O0.g e(T t12) {
        O0.g gVar;
        synchronized (this.f52476a) {
            gVar = this.f52477b.get(t12);
        }
        return gVar;
    }

    @j.P
    public final J1 f(O0.g gVar) {
        b<T> bVar;
        synchronized (this.f52476a) {
            bVar = this.f52478c.get(gVar);
        }
        if (bVar != null) {
            return bVar.f52481b;
        }
        return null;
    }

    public final boolean g(O0.g gVar) {
        boolean z12;
        synchronized (this.f52476a) {
            z12 = this.f52478c.get(gVar) != null;
        }
        return z12;
    }

    public final boolean h(O0.g gVar, int i12) {
        b<T> bVar;
        synchronized (this.f52476a) {
            bVar = this.f52478c.get(gVar);
        }
        T0 t02 = this.f52479d.get();
        return bVar != null && bVar.f52484e.a(i12) && t02 != null && t02.f52302p.n().a(i12);
    }

    public final boolean i(O0.g gVar, int i12) {
        b<T> bVar;
        synchronized (this.f52476a) {
            bVar = this.f52478c.get(gVar);
        }
        return bVar != null && bVar.f52483d.a(i12);
    }

    public final boolean j(O0.g gVar, K1 k12) {
        b<T> bVar;
        synchronized (this.f52476a) {
            bVar = this.f52478c.get(gVar);
        }
        if (bVar != null) {
            L1 l12 = bVar.f52483d;
            l12.getClass();
            k12.getClass();
            if (l12.f52126b.contains(k12)) {
                return true;
            }
        }
        return false;
    }

    public final void k(O0.g gVar) {
        synchronized (this.f52476a) {
            try {
                b<T> bVarRemove = this.f52478c.remove(gVar);
                if (bVarRemove == null) {
                    return;
                }
                this.f52477b.remove(bVarRemove.f52480a);
                bVarRemove.f52481b.b();
                T0 t02 = this.f52479d.get();
                if (t02 == null || t02.f()) {
                    return;
                }
                androidx.media3.common.util.M.I(t02.f52297k, new RunnableC23216e(t02, gVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
