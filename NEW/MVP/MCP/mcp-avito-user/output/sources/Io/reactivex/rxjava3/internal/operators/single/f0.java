package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.O;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SingleZipArray.java */
/* loaded from: classes8.dex */
public final class f0<T, R> extends io.reactivex.rxjava3.core.I<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.O<? extends T>[] f404584b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super Object[], ? extends R> f404585c;

    /* compiled from: SingleZipArray.java */
    public final class a implements l41.o<T, R> {
        public a() {
        }

        @Override // l41.o
        public final R apply(T t12) {
            R rApply = f0.this.f404585c.apply(new Object[]{t12});
            Objects.requireNonNull(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    /* compiled from: SingleZipArray.java */
    public static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super R> f404587b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super Object[], ? extends R> f404588c;

        /* renamed from: d, reason: collision with root package name */
        public final c<T>[] f404589d;

        /* renamed from: e, reason: collision with root package name */
        public Object[] f404590e;

        public b(io.reactivex.rxjava3.core.L<? super R> l12, int i12, l41.o<? super Object[], ? extends R> oVar) {
            super(i12);
            this.f404587b = l12;
            this.f404588c = oVar;
            c<T>[] cVarArr = new c[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                cVarArr[i13] = new c<>(this, i13);
            }
            this.f404589d = cVarArr;
            this.f404590e = new Object[i12];
        }

        public final void a(int i12, Throwable th2) {
            if (getAndSet(0) <= 0) {
                C47998a.b(th2);
                return;
            }
            c<T>[] cVarArr = this.f404589d;
            int length = cVarArr.length;
            for (int i13 = 0; i13 < i12; i13++) {
                c<T> cVar = cVarArr[i13];
                cVar.getClass();
                DisposableHelper.a(cVar);
            }
            while (true) {
                i12++;
                if (i12 >= length) {
                    this.f404590e = null;
                    this.f404587b.onError(th2);
                    return;
                } else {
                    c<T> cVar2 = cVarArr[i12];
                    cVar2.getClass();
                    DisposableHelper.a(cVar2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f404589d) {
                    cVar.getClass();
                    DisposableHelper.a(cVar);
                }
                this.f404590e = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() <= 0;
        }
    }

    /* compiled from: SingleZipArray.java */
    public static final class c<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: b, reason: collision with root package name */
        public final b<T, ?> f404591b;

        /* renamed from: c, reason: collision with root package name */
        public final int f404592c;

        public c(b<T, ?> bVar, int i12) {
            this.f404591b = bVar;
            this.f404592c = i12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404591b.a(this.f404592c, th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            b<T, ?> bVar = this.f404591b;
            io.reactivex.rxjava3.core.L<? super Object> l12 = bVar.f404587b;
            Object[] objArr = bVar.f404590e;
            if (objArr != null) {
                objArr[this.f404592c] = t12;
            }
            if (bVar.decrementAndGet() == 0) {
                try {
                    Object objApply = bVar.f404588c.apply(objArr);
                    Objects.requireNonNull(objApply, "The zipper returned a null value");
                    bVar.f404590e = null;
                    l12.onSuccess(objApply);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    bVar.f404590e = null;
                    l12.onError(th2);
                }
            }
        }
    }

    public f0(l41.o oVar, io.reactivex.rxjava3.core.O[] oArr) {
        this.f404584b = oArr;
        this.f404585c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super R> l12) {
        io.reactivex.rxjava3.core.O<? extends T>[] oArr = this.f404584b;
        int length = oArr.length;
        if (length == 1) {
            oArr[0].a(new O.a(l12, new a()));
            return;
        }
        b bVar = new b(l12, length, this.f404585c);
        l12.b(bVar);
        for (int i12 = 0; i12 < length && !bVar.getF318621e(); i12++) {
            io.reactivex.rxjava3.core.O<? extends T> o12 = oArr[i12];
            if (o12 == null) {
                bVar.a(i12, new NullPointerException("One of the sources is null"));
                return;
            }
            o12.a(bVar.f404589d[i12]);
        }
    }
}
