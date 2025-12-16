package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableAmb.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41953h<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.E<? extends T>[] f404064b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterable<? extends io.reactivex.rxjava3.core.E<? extends T>> f404065c;

    /* compiled from: ObservableAmb.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.h$a */
    public static final class a<T> implements io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404066b;

        /* renamed from: c, reason: collision with root package name */
        public final b<T>[] f404067c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f404068d = new AtomicInteger();

        public a(io.reactivex.rxjava3.core.G<? super T> g12, int i12) {
            this.f404066b = g12;
            this.f404067c = new b[i12];
        }

        public final boolean a(int i12) {
            AtomicInteger atomicInteger = this.f404068d;
            int i13 = 0;
            if (atomicInteger.get() != 0 || !atomicInteger.compareAndSet(0, i12)) {
                return false;
            }
            b<T>[] bVarArr = this.f404067c;
            int length = bVarArr.length;
            while (i13 < length) {
                int i14 = i13 + 1;
                if (i14 != i12) {
                    b<T> bVar = bVarArr[i13];
                    bVar.getClass();
                    DisposableHelper.a(bVar);
                }
                i13 = i14;
            }
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            AtomicInteger atomicInteger = this.f404068d;
            if (atomicInteger.get() != -1) {
                atomicInteger.lazySet(-1);
                for (b<T> bVar : this.f404067c) {
                    bVar.getClass();
                    DisposableHelper.a(bVar);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404068d.get() == -1;
        }
    }

    /* compiled from: ObservableAmb.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.h$b */
    public static final class b<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T> {
        private static final long serialVersionUID = -1185974347409665484L;

        /* renamed from: b, reason: collision with root package name */
        public final a<T> f404069b;

        /* renamed from: c, reason: collision with root package name */
        public final int f404070c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404071d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404072e;

        public b(a<T> aVar, int i12, io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f404069b = aVar;
            this.f404070c = i12;
            this.f404071d = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            boolean z12 = this.f404072e;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f404071d;
            if (z12) {
                g12.e();
            } else if (this.f404069b.a(this.f404070c)) {
                this.f404072e = true;
                g12.e();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            boolean z12 = this.f404072e;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f404071d;
            if (z12) {
                g12.onError(th2);
            } else if (!this.f404069b.a(this.f404070c)) {
                C47998a.b(th2);
            } else {
                this.f404072e = true;
                g12.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            boolean z12 = this.f404072e;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f404071d;
            if (z12) {
                g12.onNext(t12);
            } else if (!this.f404069b.a(this.f404070c)) {
                get().dispose();
            } else {
                this.f404072e = true;
                g12.onNext(t12);
            }
        }
    }

    public C41953h(io.reactivex.rxjava3.core.E<? extends T>[] eArr, Iterable<? extends io.reactivex.rxjava3.core.E<? extends T>> iterable) {
        this.f404064b = eArr;
        this.f404065c = iterable;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        int length;
        io.reactivex.rxjava3.core.G<? super T> g13;
        io.reactivex.rxjava3.core.E<? extends T>[] eArr = this.f404064b;
        if (eArr == null) {
            eArr = new io.reactivex.rxjava3.core.E[8];
            try {
                length = 0;
                for (io.reactivex.rxjava3.core.E<? extends T> e12 : this.f404065c) {
                    if (e12 == null) {
                        EmptyDisposable.d(new NullPointerException("One of the sources is null"), g12);
                        return;
                    }
                    if (length == eArr.length) {
                        io.reactivex.rxjava3.core.E<? extends T>[] eArr2 = new io.reactivex.rxjava3.core.E[(length >> 2) + length];
                        System.arraycopy(eArr, 0, eArr2, 0, length);
                        eArr = eArr2;
                    }
                    int i12 = length + 1;
                    eArr[length] = e12;
                    length = i12;
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                EmptyDisposable.d(th2, g12);
                return;
            }
        } else {
            length = eArr.length;
        }
        if (length == 0) {
            EmptyDisposable.a(g12);
            return;
        }
        if (length == 1) {
            eArr[0].c(g12);
            return;
        }
        a aVar = new a(g12, length);
        b<T>[] bVarArr = aVar.f404067c;
        int length2 = bVarArr.length;
        int i13 = 0;
        while (true) {
            g13 = aVar.f404066b;
            if (i13 >= length2) {
                break;
            }
            int i14 = i13 + 1;
            bVarArr[i13] = new b<>(aVar, i14, g13);
            i13 = i14;
        }
        AtomicInteger atomicInteger = aVar.f404068d;
        atomicInteger.lazySet(0);
        g13.b(aVar);
        for (int i15 = 0; i15 < length2 && atomicInteger.get() == 0; i15++) {
            eArr[i15].c(bVarArr[i15]);
        }
    }
}
