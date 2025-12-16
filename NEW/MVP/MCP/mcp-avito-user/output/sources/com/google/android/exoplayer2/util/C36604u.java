package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.C36599o;
import com.google.android.exoplayer2.util.C36604u;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ListenerSet.java */
/* renamed from: com.google.android.exoplayer2.util.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36604u<T> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36589e f348153a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36601q f348154b;

    /* renamed from: c, reason: collision with root package name */
    public final b<T> f348155c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f348156d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque<Runnable> f348157e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque<Runnable> f348158f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f348159g;

    /* compiled from: ListenerSet.java */
    /* renamed from: com.google.android.exoplayer2.util.u$a */
    public interface a<T> {
        void invoke(T t12);
    }

    /* compiled from: ListenerSet.java */
    /* renamed from: com.google.android.exoplayer2.util.u$b */
    public interface b<T> {
        void e(T t12, C36599o c36599o);
    }

    /* compiled from: ListenerSet.java */
    /* renamed from: com.google.android.exoplayer2.util.u$c */
    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f348160a;

        /* renamed from: b, reason: collision with root package name */
        public C36599o.b f348161b = new C36599o.b();

        /* renamed from: c, reason: collision with root package name */
        public boolean f348162c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f348163d;

        public c(T t12) {
            this.f348160a = t12;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f348160a.equals(((c) obj).f348160a);
        }

        public final int hashCode() {
            return this.f348160a.hashCode();
        }
    }

    public C36604u(Looper looper, InterfaceC36589e interfaceC36589e, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC36589e, bVar);
    }

    public final void a(T t12) {
        if (this.f348159g) {
            return;
        }
        t12.getClass();
        this.f348156d.add(new c<>(t12));
    }

    public final void b() {
        ArrayDeque<Runnable> arrayDeque = this.f348158f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        InterfaceC36601q interfaceC36601q = this.f348154b;
        if (!interfaceC36601q.g()) {
            interfaceC36601q.i(interfaceC36601q.h(0));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f348157e;
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
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f348156d);
        this.f348158f.add(new Runnable() { // from class: com.google.android.exoplayer2.util.s
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    C36604u.c cVar = (C36604u.c) it.next();
                    if (!cVar.f348163d) {
                        int i13 = i12;
                        if (i13 != -1) {
                            cVar.f348161b.a(i13);
                        }
                        cVar.f348162c = true;
                        aVar.invoke(cVar.f348160a);
                    }
                }
            }
        });
    }

    public final void d() {
        CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = this.f348156d;
        Iterator<c<T>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            next.f348163d = true;
            if (next.f348162c) {
                C36599o c36599oB = next.f348161b.b();
                this.f348155c.e(next.f348160a, c36599oB);
            }
        }
        copyOnWriteArraySet.clear();
        this.f348159g = true;
    }

    public final void e(T t12) {
        CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = this.f348156d;
        Iterator<c<T>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f348160a.equals(t12)) {
                next.f348163d = true;
                if (next.f348162c) {
                    C36599o c36599oB = next.f348161b.b();
                    this.f348155c.e(next.f348160a, c36599oB);
                }
                copyOnWriteArraySet.remove(next);
            }
        }
    }

    public final void f(int i12, a<T> aVar) {
        c(i12, aVar);
        b();
    }

    public C36604u(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, InterfaceC36589e interfaceC36589e, b<T> bVar) {
        this.f348153a = interfaceC36589e;
        this.f348156d = copyOnWriteArraySet;
        this.f348155c = bVar;
        this.f348157e = new ArrayDeque<>();
        this.f348158f = new ArrayDeque<>();
        this.f348154b = interfaceC36589e.b(looper, new Handler.Callback() { // from class: com.google.android.exoplayer2.util.t
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C36604u c36604u = this.f348152b;
                Iterator it = c36604u.f348156d.iterator();
                while (it.hasNext()) {
                    C36604u.c cVar = (C36604u.c) it.next();
                    if (!cVar.f348163d && cVar.f348162c) {
                        C36599o c36599oB = cVar.f348161b.b();
                        cVar.f348161b = new C36599o.b();
                        cVar.f348162c = false;
                        c36604u.f348155c.e(cVar.f348160a, c36599oB);
                    }
                    if (c36604u.f348154b.g()) {
                        return true;
                    }
                }
                return true;
            }
        });
    }
}
