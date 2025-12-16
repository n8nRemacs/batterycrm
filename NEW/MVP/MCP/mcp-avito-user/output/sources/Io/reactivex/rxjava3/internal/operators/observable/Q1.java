package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import s41.C47998a;

/* compiled from: ObservableWithLatestFromMany.java */
/* loaded from: classes8.dex */
public final class Q1<T, R> extends AbstractC41932a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    @j41.f
    public final io.reactivex.rxjava3.core.E<?>[] f403809c;

    /* renamed from: d, reason: collision with root package name */
    @j41.e
    public final l41.o<? super Object[], R> f403810d;

    /* compiled from: ObservableWithLatestFromMany.java */
    public final class a implements l41.o<T, R> {
        public a() {
        }

        @Override // l41.o
        public final R apply(T t12) {
            R rApply = Q1.this.f403810d.apply(new Object[]{t12});
            Objects.requireNonNull(rApply, "The combiner returned a null value");
            return rApply;
        }
    }

    /* compiled from: ObservableWithLatestFromMany.java */
    public static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 1577321883966341961L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f403812b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super Object[], R> f403813c;

        /* renamed from: d, reason: collision with root package name */
        public final c[] f403814d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceArray<Object> f403815e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403816f;

        /* renamed from: g, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403817g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f403818h;

        public b(io.reactivex.rxjava3.core.G<? super R> g12, l41.o<? super Object[], R> oVar, int i12) {
            this.f403812b = g12;
            this.f403813c = oVar;
            c[] cVarArr = new c[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                cVarArr[i13] = new c(this, i13);
            }
            this.f403814d = cVarArr;
            this.f403815e = new AtomicReferenceArray<>(i12);
            this.f403816f = new AtomicReference<>();
            this.f403817g = new io.reactivex.rxjava3.internal.util.b();
        }

        public final void a(int i12) {
            int i13 = 0;
            while (true) {
                c[] cVarArr = this.f403814d;
                if (i13 >= cVarArr.length) {
                    return;
                }
                if (i13 != i12) {
                    c cVar = cVarArr[i13];
                    cVar.getClass();
                    DisposableHelper.a(cVar);
                }
                i13++;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403816f, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f403816f);
            for (c cVar : this.f403814d) {
                cVar.getClass();
                DisposableHelper.a(cVar);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403818h) {
                return;
            }
            this.f403818h = true;
            a(-1);
            io.reactivex.rxjava3.internal.util.i.a(this.f403812b, this, this.f403817g);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f403816f.get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403818h) {
                C47998a.b(th2);
                return;
            }
            this.f403818h = true;
            a(-1);
            io.reactivex.rxjava3.internal.util.i.c(this.f403812b, th2, this, this.f403817g);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403818h) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f403815e;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i12 = 0;
            objArr[0] = t12;
            while (i12 < length) {
                Object obj = atomicReferenceArray.get(i12);
                if (obj == null) {
                    return;
                }
                i12++;
                objArr[i12] = obj;
            }
            try {
                R rApply = this.f403813c.apply(objArr);
                Objects.requireNonNull(rApply, "combiner returned a null value");
                io.reactivex.rxjava3.internal.util.i.e(this.f403812b, rApply, this, this.f403817g);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                dispose();
                onError(th2);
            }
        }
    }

    /* compiled from: ObservableWithLatestFromMany.java */
    public static final class c extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* renamed from: b, reason: collision with root package name */
        public final b<?, ?> f403819b;

        /* renamed from: c, reason: collision with root package name */
        public final int f403820c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f403821d;

        public c(b<?, ?> bVar, int i12) {
            this.f403819b = bVar;
            this.f403820c = i12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            b<?, ?> bVar = this.f403819b;
            int i12 = this.f403820c;
            if (this.f403821d) {
                bVar.getClass();
                return;
            }
            bVar.f403818h = true;
            bVar.a(i12);
            io.reactivex.rxjava3.internal.util.i.a(bVar.f403812b, bVar, bVar.f403817g);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            b<?, ?> bVar = this.f403819b;
            int i12 = this.f403820c;
            bVar.f403818h = true;
            DisposableHelper.a(bVar.f403816f);
            bVar.a(i12);
            io.reactivex.rxjava3.internal.util.i.c(bVar.f403812b, th2, bVar, bVar.f403817g);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            if (!this.f403821d) {
                this.f403821d = true;
            }
            this.f403819b.f403815e.set(this.f403820c, obj);
        }
    }

    public Q1(@j41.e com.jakewharton.rxrelay3.c cVar, @j41.e io.reactivex.rxjava3.core.E[] eArr, @j41.e l41.o oVar) {
        super(cVar);
        this.f403809c = eArr;
        this.f403810d = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        io.reactivex.rxjava3.core.E<?>[] eArr = this.f403809c;
        if (eArr == null) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                EmptyDisposable.d(th2, g12);
                return;
            }
        }
        int length = eArr.length;
        if (length == 0) {
            new B0(this.f403951b, new a()).w0(g12);
            return;
        }
        b bVar = new b(g12, this.f403810d, length);
        g12.b(bVar);
        c[] cVarArr = bVar.f403814d;
        AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = bVar.f403816f;
        for (int i12 = 0; i12 < length && !DisposableHelper.b(atomicReference.get()) && !bVar.f403818h; i12++) {
            eArr[i12].c(cVarArr[i12]);
        }
        this.f403951b.c(bVar);
    }
}
