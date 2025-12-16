package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.AbstractC41806d;
import java.util.Objects;

/* compiled from: ObservableFromArray.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41945e0<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final T[] f404020b;

    /* compiled from: ObservableFromArray.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.e0$a */
    public static final class a<T> extends AbstractC41806d<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404021b;

        /* renamed from: c, reason: collision with root package name */
        public final T[] f404022c;

        /* renamed from: d, reason: collision with root package name */
        public int f404023d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404024e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f404025f;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, T[] tArr) {
            this.f404021b = g12;
            this.f404022c = tArr;
        }

        @Override // q41.g
        public final void clear() {
            this.f404023d = this.f404022c.length;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404025f = true;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404025f;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f404023d == this.f404022c.length;
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            int i12 = this.f404023d;
            T[] tArr = this.f404022c;
            if (i12 == tArr.length) {
                return null;
            }
            this.f404023d = i12 + 1;
            T t12 = tArr[i12];
            Objects.requireNonNull(t12, "The array element is null");
            return t12;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            this.f404024e = true;
            return 1;
        }
    }

    public C41945e0(T[] tArr) {
        this.f404020b = tArr;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a(g12, this.f404020b);
        g12.b(aVar);
        if (aVar.f404024e) {
            return;
        }
        T[] tArr = aVar.f404022c;
        int length = tArr.length;
        for (int i12 = 0; i12 < length && !aVar.f404025f; i12++) {
            T t12 = tArr[i12];
            if (t12 == null) {
                aVar.f404021b.onError(new NullPointerException(androidx.camera.camera2.internal.G.e(i12, "The element at index ", " is null")));
                return;
            }
            aVar.f404021b.onNext(t12);
        }
        if (aVar.f404025f) {
            return;
        }
        aVar.f404021b.e();
    }
}
