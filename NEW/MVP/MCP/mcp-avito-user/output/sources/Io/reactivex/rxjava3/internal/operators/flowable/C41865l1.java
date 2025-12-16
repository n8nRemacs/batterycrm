package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k41.AbstractC42503a;
import n41.InterfaceC44192i;
import s41.C47998a;

/* compiled from: FlowableReplay.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41865l1<T> extends AbstractC42503a<T> implements InterfaceC44192i<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final l41.s f402860c = null;

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$b */
    public static final class b implements l41.s<Object> {
        @Override // l41.s
        public final Object get() {
            return new m(16);
        }
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$c */
    public static final class c<T> extends AtomicLong implements org.reactivestreams.e, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -4453897557930727610L;

        /* renamed from: b, reason: collision with root package name */
        public final i<T> f402864b;

        /* renamed from: c, reason: collision with root package name */
        public final org.reactivestreams.d<? super T> f402865c;

        /* renamed from: d, reason: collision with root package name */
        public Serializable f402866d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f402867e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        public boolean f402868f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f402869g;

        public c(i<T> iVar, org.reactivestreams.d<? super T> dVar) {
            this.f402864b = iVar;
            this.f402865c = dVar;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            c<T>[] cVarArr;
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                i<T> iVar = this.f402864b;
                loop0: while (true) {
                    AtomicReference<c<T>[]> atomicReference = iVar.f402876d;
                    c<T>[] cVarArr2 = atomicReference.get();
                    int length = cVarArr2.length;
                    if (length != 0) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                i12 = -1;
                                break;
                            } else if (cVarArr2[i12].equals(this)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (i12 < 0) {
                            break;
                        }
                        if (length == 1) {
                            cVarArr = i.f402872h;
                        } else {
                            c<T>[] cVarArr3 = new c[length - 1];
                            System.arraycopy(cVarArr2, 0, cVarArr3, 0, i12);
                            System.arraycopy(cVarArr2, i12 + 1, cVarArr3, i12, (length - i12) - 1);
                            cVarArr = cVarArr3;
                        }
                        while (!atomicReference.compareAndSet(cVarArr2, cVarArr)) {
                            if (atomicReference.get() != cVarArr2) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                iVar.a();
                this.f402866d = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (!SubscriptionHelper.h(j12) || io.reactivex.rxjava3.internal.util.c.b(this, j12) == Long.MIN_VALUE) {
                return;
            }
            io.reactivex.rxjava3.internal.util.c.a(this.f402867e, j12);
            i<T> iVar = this.f402864b;
            iVar.a();
            iVar.f402874b.e(this);
        }
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$d */
    public static final class d<R, U> extends AbstractC41777j<R> {

        /* compiled from: FlowableReplay.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$d$a */
        public final class a implements l41.g<io.reactivex.rxjava3.disposables.d> {
            public a() {
                throw null;
            }

            @Override // l41.g
            public final void accept(io.reactivex.rxjava3.disposables.d dVar) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.AbstractC41777j
        public final void u(org.reactivestreams.d<? super R> dVar) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                EmptySubscription.b(th2, dVar);
            }
        }
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$e */
    public static final class e extends AtomicReference<e> {
        private static final long serialVersionUID = 245354315435971818L;

        /* renamed from: b, reason: collision with root package name */
        public final Object f402870b;

        /* renamed from: c, reason: collision with root package name */
        public final long f402871c;

        public e(Object obj, long j12) {
            this.f402870b = obj;
            this.f402871c = j12;
        }
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$f */
    public interface f<T> {
        void a(Throwable th2);

        void b(T t12);

        void e(c<T> cVar);

        void q3();
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$g */
    public static final class g<T> implements l41.s<f<T>> {
        @Override // l41.s
        public final Object get() {
            throw null;
        }
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$h */
    public static final class h<T> implements org.reactivestreams.c<T> {
        @Override // org.reactivestreams.c
        public final void d(org.reactivestreams.d<? super T> dVar) {
            throw null;
        }
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$i */
    public static final class i<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: h, reason: collision with root package name */
        public static final c[] f402872h = new c[0];

        /* renamed from: i, reason: collision with root package name */
        public static final c[] f402873i = new c[0];
        private static final long serialVersionUID = 7224554242710036740L;

        /* renamed from: b, reason: collision with root package name */
        public final f<T> f402874b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402875c;

        /* renamed from: f, reason: collision with root package name */
        public long f402878f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<i<T>> f402879g;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f402877e = new AtomicInteger();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<c<T>[]> f402876d = new AtomicReference<>(f402872h);

        public i(f<T> fVar, AtomicReference<i<T>> atomicReference) {
            this.f402874b = fVar;
            this.f402879g = atomicReference;
            new AtomicBoolean();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this, eVar)) {
                a();
                for (c<T> cVar : this.f402876d.get()) {
                    this.f402874b.e(cVar);
                }
            }
        }

        public final void a() {
            AtomicInteger atomicInteger = this.f402877e;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!getF318621e()) {
                org.reactivestreams.e eVar = get();
                if (eVar != null) {
                    long j12 = this.f402878f;
                    long jMax = j12;
                    for (c<T> cVar : this.f402876d.get()) {
                        jMax = Math.max(jMax, cVar.f402867e.get());
                    }
                    long j13 = jMax - j12;
                    if (j13 != 0) {
                        this.f402878f = jMax;
                        eVar.request(j13);
                    }
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            AtomicReference<i<T>> atomicReference;
            this.f402876d.set(f402873i);
            do {
                atomicReference = this.f402879g;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402875c) {
                return;
            }
            this.f402875c = true;
            f<T> fVar = this.f402874b;
            fVar.q3();
            for (c<T> cVar : this.f402876d.getAndSet(f402873i)) {
                fVar.e(cVar);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402876d.get() == f402873i;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402875c) {
                C47998a.b(th2);
                return;
            }
            this.f402875c = true;
            f<T> fVar = this.f402874b;
            fVar.a(th2);
            for (c<T> cVar : this.f402876d.getAndSet(f402873i)) {
                fVar.e(cVar);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402875c) {
                return;
            }
            f<T> fVar = this.f402874b;
            fVar.b(t12);
            for (c<T> cVar : this.f402876d.get()) {
                fVar.e(cVar);
            }
        }
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$j */
    public static final class j<T> implements l41.s<f<T>> {
        @Override // l41.s
        public final Object get() {
            throw null;
        }
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$k */
    public static final class k<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.a
        public final Object c(Object obj, boolean z12) {
            if (z12) {
                return new io.reactivex.rxjava3.schedulers.d(obj, Long.MAX_VALUE, null);
            }
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.a
        public final e d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.a
        public final Object f(Object obj) {
            return ((io.reactivex.rxjava3.schedulers.d) obj).f404958a;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.a
        public final void g() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.a
        public final void h() {
            throw null;
        }
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$l */
    public static final class l<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.a
        public final void g() {
            if (this.f402862c > 0) {
                e eVar = get().get();
                if (eVar == null) {
                    throw new IllegalStateException("Empty list!");
                }
                this.f402862c--;
                set(eVar);
            }
        }
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$m */
    public static final class m<T> extends ArrayList<Object> implements f<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* renamed from: b, reason: collision with root package name */
        public volatile int f402880b;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.f
        public final void a(Throwable th2) {
            add(NotificationLite.e(th2));
            this.f402880b++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.f
        public final void b(T t12) {
            add(t12);
            this.f402880b++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.f
        public final void e(c<T> cVar) {
            synchronized (cVar) {
                try {
                    if (cVar.f402868f) {
                        cVar.f402869g = true;
                        return;
                    }
                    cVar.f402868f = true;
                    org.reactivestreams.d<? super T> dVar = cVar.f402865c;
                    while (!cVar.getF318621e()) {
                        int i12 = this.f402880b;
                        Integer num = (Integer) cVar.f402866d;
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j12 = cVar.get();
                        long j13 = j12;
                        long j14 = 0;
                        while (j13 != 0 && iIntValue < i12) {
                            Object obj = get(iIntValue);
                            try {
                                if (NotificationLite.b(obj, dVar) || cVar.getF318621e()) {
                                    return;
                                }
                                iIntValue++;
                                j13--;
                                j14++;
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.a(th2);
                                cVar.dispose();
                                if (NotificationLite.i(obj) || NotificationLite.h(obj)) {
                                    C47998a.b(th2);
                                    return;
                                } else {
                                    dVar.onError(th2);
                                    return;
                                }
                            }
                        }
                        if (j14 != 0) {
                            cVar.f402866d = Integer.valueOf(iIntValue);
                            if (j12 != Long.MAX_VALUE) {
                                io.reactivex.rxjava3.internal.util.c.f(cVar, j14);
                            }
                        }
                        synchronized (cVar) {
                            try {
                                if (!cVar.f402869g) {
                                    cVar.f402868f = false;
                                    return;
                                }
                                cVar.f402869g = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.f
        public final void q3() {
            add(NotificationLite.f404825b);
            this.f402880b++;
        }
    }

    static {
        new b();
    }

    public C41865l1() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }

    /* compiled from: FlowableReplay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l1$a */
    public static abstract class a<T> extends AtomicReference<e> implements f<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* renamed from: b, reason: collision with root package name */
        public e f402861b;

        /* renamed from: c, reason: collision with root package name */
        public int f402862c;

        /* renamed from: d, reason: collision with root package name */
        public long f402863d;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.f
        public final void a(Throwable th2) {
            Object objC = c(NotificationLite.e(th2), true);
            long j12 = this.f402863d + 1;
            this.f402863d = j12;
            e eVar = new e(objC, j12);
            this.f402861b.set(eVar);
            this.f402861b = eVar;
            this.f402862c++;
            h();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.f
        public final void b(T t12) {
            Object objC = c(t12, false);
            long j12 = this.f402863d + 1;
            this.f402863d = j12;
            e eVar = new e(objC, j12);
            this.f402861b.set(eVar);
            this.f402861b = eVar;
            this.f402862c++;
            g();
        }

        public e d() {
            return get();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.f
        public final void e(c<T> cVar) {
            synchronized (cVar) {
                try {
                    if (cVar.f402868f) {
                        cVar.f402869g = true;
                        return;
                    }
                    cVar.f402868f = true;
                    while (true) {
                        long j12 = cVar.get();
                        boolean z12 = j12 == Long.MAX_VALUE;
                        e eVarD = (e) cVar.f402866d;
                        if (eVarD == null) {
                            eVarD = d();
                            cVar.f402866d = eVarD;
                            io.reactivex.rxjava3.internal.util.c.a(cVar.f402867e, eVarD.f402871c);
                        }
                        long j13 = 0;
                        while (j12 != 0) {
                            if (!cVar.getF318621e()) {
                                e eVar = eVarD.get();
                                if (eVar == null) {
                                    break;
                                }
                                Object objF = f(eVar.f402870b);
                                try {
                                    if (NotificationLite.b(objF, cVar.f402865c)) {
                                        cVar.f402866d = null;
                                        return;
                                    } else {
                                        j13++;
                                        j12--;
                                        eVarD = eVar;
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.a.a(th2);
                                    cVar.f402866d = null;
                                    cVar.dispose();
                                    if (NotificationLite.i(objF) || NotificationLite.h(objF)) {
                                        C47998a.b(th2);
                                        return;
                                    } else {
                                        cVar.f402865c.onError(th2);
                                        return;
                                    }
                                }
                            } else {
                                cVar.f402866d = null;
                                return;
                            }
                        }
                        if (j12 == 0 && cVar.getF318621e()) {
                            cVar.f402866d = null;
                            return;
                        }
                        if (j13 != 0) {
                            cVar.f402866d = eVarD;
                            if (!z12) {
                                io.reactivex.rxjava3.internal.util.c.f(cVar, j13);
                            }
                        }
                        synchronized (cVar) {
                            try {
                                if (!cVar.f402869g) {
                                    cVar.f402868f = false;
                                    return;
                                }
                                cVar.f402869g = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public abstract void g();

        public void h() {
            e eVar = get();
            if (eVar.f402870b != null) {
                e eVar2 = new e(null, 0L);
                eVar2.lazySet(eVar.get());
                set(eVar2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41865l1.f
        public final void q3() {
            Object objC = c(NotificationLite.f404825b, true);
            long j12 = this.f402863d + 1;
            this.f402863d = j12;
            e eVar = new e(objC, j12);
            this.f402861b.set(eVar);
            this.f402861b = eVar;
            this.f402862c++;
            h();
        }

        public Object f(Object obj) {
            return obj;
        }

        public Object c(Object obj, boolean z12) {
            return obj;
        }
    }
}
