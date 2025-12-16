package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yandex.mobile.ads.impl.nw;
import j.InterfaceC42154j;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes8.dex */
public final class m90<T> {

    /* renamed from: a, reason: collision with root package name */
    private final hj f387877a;

    /* renamed from: b, reason: collision with root package name */
    private final bz f387878b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f387879c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f387880d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f387881e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f387882f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f387883g;

    public interface a<T> {
        void invoke(T t12);
    }

    public interface b<T> {
        void a(T t12, nw nwVar);
    }

    public m90(Looper looper, hj hjVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, hjVar, bVar);
    }

    @InterfaceC42154j
    public final m90<T> a(Looper looper, b<T> bVar) {
        return new m90<>(this.f387880d, looper, this.f387877a, bVar);
    }

    private m90(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, hj hjVar, b<T> bVar) {
        this.f387877a = hjVar;
        this.f387880d = copyOnWriteArraySet;
        this.f387879c = bVar;
        this.f387881e = new ArrayDeque<>();
        this.f387882f = new ArrayDeque<>();
        this.f387878b = hjVar.a(looper, new Handler.Callback() { // from class: com.yandex.mobile.ads.impl.W0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f383336b.a(message);
            }
        });
    }

    public final void b(T t12) {
        Iterator<c<T>> it = this.f387880d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f387884a.equals(t12)) {
                next.b(this.f387879c);
                this.f387880d.remove(next);
            }
        }
    }

    public final void a(T t12) {
        if (this.f387883g) {
            return;
        }
        t12.getClass();
        this.f387880d.add(new c<>(t12));
    }

    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f387884a;

        /* renamed from: b, reason: collision with root package name */
        private nw.a f387885b = new nw.a();

        /* renamed from: c, reason: collision with root package name */
        private boolean f387886c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f387887d;

        public c(T t12) {
            this.f387884a = t12;
        }

        public final void a(int i12, a<T> aVar) {
            if (this.f387887d) {
                return;
            }
            if (i12 != -1) {
                this.f387885b.a(i12);
            }
            this.f387886c = true;
            aVar.invoke(this.f387884a);
        }

        public final void b(b<T> bVar) {
            this.f387887d = true;
            if (this.f387886c) {
                bVar.a(this.f387884a, this.f387885b.a());
            }
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f387884a.equals(((c) obj).f387884a);
        }

        public final int hashCode() {
            return this.f387884a.hashCode();
        }

        public final void a(b<T> bVar) {
            if (this.f387887d || !this.f387886c) {
                return;
            }
            nw nwVarA = this.f387885b.a();
            this.f387885b = new nw.a();
            this.f387886c = false;
            bVar.a(this.f387884a, nwVarA);
        }
    }

    public final void a(final int i12, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f387880d);
        this.f387882f.add(new Runnable() { // from class: com.yandex.mobile.ads.impl.V0
            @Override // java.lang.Runnable
            public final void run() {
                m90.a(copyOnWriteArraySet, i12, aVar);
            }
        });
    }

    public final void b() {
        Iterator<c<T>> it = this.f387880d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f387879c);
        }
        this.f387880d.clear();
        this.f387883g = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i12, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i12, aVar);
        }
    }

    public final void a() {
        if (this.f387882f.isEmpty()) {
            return;
        }
        if (!this.f387878b.b()) {
            bz bzVar = this.f387878b;
            bzVar.a(bzVar.b(0));
        }
        boolean zIsEmpty = this.f387881e.isEmpty();
        this.f387881e.addAll(this.f387882f);
        this.f387882f.clear();
        if (zIsEmpty) {
            while (!this.f387881e.isEmpty()) {
                this.f387881e.peekFirst().run();
                this.f387881e.removeFirst();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        Iterator<c<T>> it = this.f387880d.iterator();
        while (it.hasNext()) {
            it.next().a(this.f387879c);
            if (this.f387878b.b()) {
                return true;
            }
        }
        return true;
    }
}
