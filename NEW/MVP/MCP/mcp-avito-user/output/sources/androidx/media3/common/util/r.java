package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C23107s;
import androidx.media3.common.H;
import androidx.media3.common.util.r;
import j.P;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ListenerSet.java */
@J
/* loaded from: classes.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC23115f f47930a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC23123n f47931b;

    /* renamed from: c, reason: collision with root package name */
    public final b<T> f47932c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f47933d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque<Runnable> f47934e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque<Runnable> f47935f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f47936g;

    /* renamed from: h, reason: collision with root package name */
    @j.B
    public boolean f47937h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f47938i;

    /* compiled from: ListenerSet.java */
    public interface a<T> {
        void invoke(T t12);
    }

    /* compiled from: ListenerSet.java */
    public interface b<T> {
        void c(T t12, C23107s c23107s);
    }

    /* compiled from: ListenerSet.java */
    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f47939a;

        /* renamed from: b, reason: collision with root package name */
        public C23107s.b f47940b = new C23107s.b();

        /* renamed from: c, reason: collision with root package name */
        public boolean f47941c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f47942d;

        public c(T t12) {
            this.f47939a = t12;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f47939a.equals(((c) obj).f47939a);
        }

        public final int hashCode() {
            return this.f47939a.hashCode();
        }
    }

    public r(Looper looper, InterfaceC23115f interfaceC23115f, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC23115f, bVar, true);
    }

    public final void a(T t12) {
        t12.getClass();
        synchronized (this.f47936g) {
            try {
                if (this.f47937h) {
                    return;
                }
                this.f47933d.add(new c<>(t12));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque<Runnable> arrayDeque = this.f47935f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        InterfaceC23123n interfaceC23123n = this.f47931b;
        if (!interfaceC23123n.g()) {
            interfaceC23123n.i(interfaceC23123n.h(0));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f47934e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                arrayDeque2.peekFirst().run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(final int i12, final a<T> aVar) {
        g();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f47933d);
        this.f47935f.add(new Runnable() { // from class: androidx.media3.common.util.q
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    r.c cVar = (r.c) it.next();
                    if (!cVar.f47942d) {
                        int i13 = i12;
                        if (i13 != -1) {
                            cVar.f47940b.a(i13);
                        }
                        cVar.f47941c = true;
                        aVar.invoke(cVar.f47939a);
                    }
                }
            }
        });
    }

    public final void d() {
        g();
        synchronized (this.f47936g) {
            this.f47937h = true;
        }
        Iterator<c<T>> it = this.f47933d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.f47932c;
            next.f47942d = true;
            if (next.f47941c) {
                next.f47941c = false;
                bVar.c(next.f47939a, next.f47940b.c());
            }
        }
        this.f47933d.clear();
    }

    public final void e(H.g gVar) {
        g();
        CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = this.f47933d;
        Iterator<c<T>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f47939a.equals(gVar)) {
                next.f47942d = true;
                if (next.f47941c) {
                    next.f47941c = false;
                    C23107s c23107sC = next.f47940b.c();
                    this.f47932c.c(next.f47939a, c23107sC);
                }
                copyOnWriteArraySet.remove(next);
            }
        }
    }

    public final void f(int i12, a<T> aVar) {
        c(i12, aVar);
        b();
    }

    public final void g() {
        if (this.f47938i) {
            C23110a.g(Thread.currentThread() == this.f47931b.getLooper().getThread());
        }
    }

    public r(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, InterfaceC23115f interfaceC23115f, b<T> bVar, boolean z12) {
        this.f47930a = interfaceC23115f;
        this.f47933d = copyOnWriteArraySet;
        this.f47932c = bVar;
        this.f47936g = new Object();
        this.f47934e = new ArrayDeque<>();
        this.f47935f = new ArrayDeque<>();
        this.f47931b = interfaceC23115f.b(looper, new Handler.Callback() { // from class: androidx.media3.common.util.p
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                r rVar = this.f47926b;
                Iterator it = rVar.f47933d.iterator();
                while (it.hasNext()) {
                    r.c cVar = (r.c) it.next();
                    if (!cVar.f47942d && cVar.f47941c) {
                        C23107s c23107sC = cVar.f47940b.c();
                        cVar.f47940b = new C23107s.b();
                        cVar.f47941c = false;
                        rVar.f47932c.c(cVar.f47939a, c23107sC);
                    }
                    if (rVar.f47931b.g()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f47938i = z12;
    }
}
