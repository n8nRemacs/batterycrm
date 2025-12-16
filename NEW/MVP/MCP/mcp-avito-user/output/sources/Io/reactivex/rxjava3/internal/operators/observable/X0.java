package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n41.InterfaceC44191h;
import p41.AbstractC46894a;
import s41.C47998a;

/* compiled from: ObservableReplay.java */
/* loaded from: classes8.dex */
public final class X0<T> extends AbstractC46894a<T> implements InterfaceC44191h<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f403901b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<i<T>> f403902c;

    /* renamed from: d, reason: collision with root package name */
    public final b<T> f403903d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.E<T> f403904e;

    /* compiled from: ObservableReplay.java */
    public interface b<T> {
        g<T> call();
    }

    /* compiled from: ObservableReplay.java */
    public static final class c<R> implements l41.g<io.reactivex.rxjava3.disposables.d> {
        public c() {
            throw null;
        }

        @Override // l41.g
        public final void accept(io.reactivex.rxjava3.disposables.d dVar) {
            throw null;
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class d<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 2728361546769921047L;

        /* renamed from: b, reason: collision with root package name */
        public final i<T> f403907b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403908c;

        /* renamed from: d, reason: collision with root package name */
        public Serializable f403909d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f403910e;

        public d(i<T> iVar, io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f403907b = iVar;
            this.f403908c = g12;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f403910e) {
                return;
            }
            this.f403910e = true;
            this.f403907b.a(this);
            this.f403909d = null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403910e;
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class e<R, U> extends io.reactivex.rxjava3.core.z<R> {
        @Override // io.reactivex.rxjava3.core.z
        public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                EmptyDisposable.d(th2, g12);
            }
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class f extends AtomicReference<f> {
        private static final long serialVersionUID = 245354315435971818L;

        /* renamed from: b, reason: collision with root package name */
        public final Object f403911b;

        public f(Object obj) {
            this.f403911b = obj;
        }
    }

    /* compiled from: ObservableReplay.java */
    public interface g<T> {
        void a(Throwable th2);

        void b(T t12);

        void e(d<T> dVar);

        void q3();
    }

    /* compiled from: ObservableReplay.java */
    public static final class h<T> implements b<T> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.b
        public final g<T> call() {
            return new m();
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class i<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: g, reason: collision with root package name */
        public static final d[] f403912g = new d[0];

        /* renamed from: h, reason: collision with root package name */
        public static final d[] f403913h = new d[0];
        private static final long serialVersionUID = -533785617179540163L;

        /* renamed from: b, reason: collision with root package name */
        public final g<T> f403914b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f403915c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<d[]> f403916d = new AtomicReference<>(f403912g);

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f403917e = new AtomicBoolean();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicReference<i<T>> f403918f;

        public i(g<T> gVar, AtomicReference<i<T>> atomicReference) {
            this.f403914b = gVar;
            this.f403918f = atomicReference;
        }

        public final void a(d<T> dVar) {
            d[] dVarArr;
            while (true) {
                AtomicReference<d[]> atomicReference = this.f403916d;
                d[] dVarArr2 = atomicReference.get();
                int length = dVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        i12 = -1;
                        break;
                    } else if (dVarArr2[i12].equals(dVar)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 < 0) {
                    return;
                }
                if (length == 1) {
                    dVarArr = f403912g;
                } else {
                    d[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr2, 0, dVarArr3, 0, i12);
                    System.arraycopy(dVarArr2, i12 + 1, dVarArr3, i12, (length - i12) - 1);
                    dVarArr = dVarArr3;
                }
                while (!atomicReference.compareAndSet(dVarArr2, dVarArr)) {
                    if (atomicReference.get() != dVarArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                for (d<T> dVar2 : this.f403916d.get()) {
                    this.f403914b.e(dVar2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            AtomicReference<i<T>> atomicReference;
            this.f403916d.set(f403913h);
            do {
                atomicReference = this.f403918f;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403915c) {
                return;
            }
            this.f403915c = true;
            g<T> gVar = this.f403914b;
            gVar.q3();
            for (d<T> dVar : this.f403916d.getAndSet(f403913h)) {
                gVar.e(dVar);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403916d.get() == f403913h;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403915c) {
                C47998a.b(th2);
                return;
            }
            this.f403915c = true;
            g<T> gVar = this.f403914b;
            gVar.a(th2);
            for (d<T> dVar : this.f403916d.getAndSet(f403913h)) {
                gVar.e(dVar);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403915c) {
                return;
            }
            g<T> gVar = this.f403914b;
            gVar.b(t12);
            for (d<T> dVar : this.f403916d.get()) {
                gVar.e(dVar);
            }
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class j<T> implements io.reactivex.rxjava3.core.E<T> {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<i<T>> f403919b;

        /* renamed from: c, reason: collision with root package name */
        public final b<T> f403920c;

        public j(AtomicReference<i<T>> atomicReference, b<T> bVar) {
            this.f403919b = atomicReference;
            this.f403920c = bVar;
        }

        @Override // io.reactivex.rxjava3.core.E
        public final void c(io.reactivex.rxjava3.core.G<? super T> g12) {
            i<T> iVar;
            loop0: while (true) {
                iVar = this.f403919b.get();
                if (iVar != null) {
                    break;
                }
                i<T> iVar2 = new i<>(this.f403920c.call(), this.f403919b);
                AtomicReference<i<T>> atomicReference = this.f403919b;
                while (!atomicReference.compareAndSet(null, iVar2)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                iVar = iVar2;
                break loop0;
            }
            d<T> dVar = new d<>(iVar, g12);
            g12.b(dVar);
            loop2: while (true) {
                AtomicReference<d[]> atomicReference2 = iVar.f403916d;
                d[] dVarArr = atomicReference2.get();
                if (dVarArr != i.f403913h) {
                    int length = dVarArr.length;
                    d[] dVarArr2 = new d[length + 1];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                    dVarArr2[length] = dVar;
                    while (!atomicReference2.compareAndSet(dVarArr, dVarArr2)) {
                        if (atomicReference2.get() != dVarArr) {
                            break;
                        }
                    }
                    break loop2;
                }
                break;
            }
            if (dVar.f403910e) {
                iVar.a(dVar);
            } else {
                iVar.f403914b.e(dVar);
            }
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class k<T> implements b<T> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.b
        public final g<T> call() {
            throw null;
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class l<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.a
        public final Object c(Object obj) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.a
        public final f d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.a
        public final Object f(Object obj) {
            return ((io.reactivex.rxjava3.schedulers.d) obj).f404958a;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.a
        public final void g() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.a
        public final void h() {
            throw null;
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class m<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* renamed from: d, reason: collision with root package name */
        public final int f403921d;

        public m() {
            f fVar = new f(null);
            this.f403905b = fVar;
            set(fVar);
            this.f403921d = 1;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.a
        public final void g() {
            if (this.f403906c > this.f403921d) {
                this.f403906c--;
                set(get().get());
            }
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class n implements b<Object> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.b
        public final g<Object> call() {
            return new o(16);
        }
    }

    /* compiled from: ObservableReplay.java */
    public static final class o<T> extends ArrayList<Object> implements g<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* renamed from: b, reason: collision with root package name */
        public volatile int f403922b;

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.g
        public final void a(Throwable th2) {
            add(NotificationLite.e(th2));
            this.f403922b++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.g
        public final void b(T t12) {
            add(t12);
            this.f403922b++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.g
        public final void e(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.G<? super T> g12 = dVar.f403908c;
            int iAddAndGet = 1;
            while (!dVar.f403910e) {
                int i12 = this.f403922b;
                Integer num = (Integer) dVar.f403909d;
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i12) {
                    if (NotificationLite.a(g12, get(iIntValue)) || dVar.f403910e) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                dVar.f403909d = Integer.valueOf(iIntValue);
                iAddAndGet = dVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.g
        public final void q3() {
            add(NotificationLite.f404825b);
            this.f403922b++;
        }
    }

    static {
        new n();
    }

    public X0(io.reactivex.rxjava3.core.E e12, io.reactivex.rxjava3.core.z zVar, AtomicReference atomicReference, b bVar) {
        this.f403904e = e12;
        this.f403901b = zVar;
        this.f403902c = atomicReference;
        this.f403903d = bVar;
    }

    public static X0 Q0(io.reactivex.rxjava3.core.z zVar) {
        h hVar = new h();
        AtomicReference atomicReference = new AtomicReference();
        return new X0(new j(atomicReference, hVar), zVar, atomicReference, hVar);
    }

    @Override // p41.AbstractC46894a
    public final void O0(l41.g<? super io.reactivex.rxjava3.disposables.d> gVar) {
        i<T> iVar;
        loop0: while (true) {
            AtomicReference<i<T>> atomicReference = this.f403902c;
            iVar = atomicReference.get();
            if (iVar != null && !iVar.getF318621e()) {
                break;
            }
            i<T> iVar2 = new i<>(this.f403903d.call(), atomicReference);
            while (!atomicReference.compareAndSet(iVar, iVar2)) {
                if (atomicReference.get() != iVar) {
                    break;
                }
            }
            iVar = iVar2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = iVar.f403917e;
        boolean z12 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            gVar.accept(iVar);
            if (z12) {
                this.f403901b.c(iVar);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (z12) {
                atomicBoolean.compareAndSet(true, false);
            }
            io.reactivex.rxjava3.exceptions.a.a(th2);
            throw io.reactivex.rxjava3.internal.util.h.f(th2);
        }
    }

    @Override // p41.AbstractC46894a
    public final void P0() {
        AtomicReference<i<T>> atomicReference = this.f403902c;
        i<T> iVar = atomicReference.get();
        if (iVar == null || !iVar.getF318621e()) {
            return;
        }
        while (!atomicReference.compareAndSet(iVar, null) && atomicReference.get() == iVar) {
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        ((j) this.f403904e).c(g12);
    }

    /* compiled from: ObservableReplay.java */
    public static abstract class a<T> extends AtomicReference<f> implements g<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* renamed from: b, reason: collision with root package name */
        public f f403905b;

        /* renamed from: c, reason: collision with root package name */
        public int f403906c;

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.g
        public final void a(Throwable th2) {
            f fVar = new f(c(NotificationLite.e(th2)));
            this.f403905b.set(fVar);
            this.f403905b = fVar;
            this.f403906c++;
            h();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.g
        public final void b(T t12) {
            f fVar = new f(c(t12));
            this.f403905b.set(fVar);
            this.f403905b = fVar;
            this.f403906c++;
            g();
        }

        public f d() {
            return get();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.g
        public final void e(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                f fVarD = (f) dVar.f403909d;
                if (fVarD == null) {
                    fVarD = d();
                    dVar.f403909d = fVarD;
                }
                while (!dVar.f403910e) {
                    f fVar = fVarD.get();
                    if (fVar != null) {
                        if (NotificationLite.a(dVar.f403908c, f(fVar.f403911b))) {
                            dVar.f403909d = null;
                            return;
                        }
                        fVarD = fVar;
                    } else {
                        dVar.f403909d = fVarD;
                        iAddAndGet = dVar.addAndGet(-iAddAndGet);
                    }
                }
                dVar.f403909d = null;
                return;
            } while (iAddAndGet != 0);
        }

        public abstract void g();

        public void h() {
            f fVar = get();
            if (fVar.f403911b != null) {
                f fVar2 = new f(null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.X0.g
        public final void q3() {
            f fVar = new f(c(NotificationLite.f404825b));
            this.f403905b.set(fVar);
            this.f403905b = fVar;
            this.f403906c++;
            h();
        }

        public Object c(Object obj) {
            return obj;
        }

        public Object f(Object obj) {
            return obj;
        }
    }
}
