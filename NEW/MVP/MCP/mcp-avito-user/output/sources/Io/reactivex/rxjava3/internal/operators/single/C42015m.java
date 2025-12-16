package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: SingleDoAfterSuccess.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42015m<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404609b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super T> f404610c;

    /* compiled from: SingleDoAfterSuccess.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.m$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404611b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.g<? super T> f404612c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404613d;

        public a(io.reactivex.rxjava3.core.L<? super T> l12, l41.g<? super T> gVar) {
            this.f404611b = l12;
            this.f404612c = gVar;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404613d, dVar)) {
                this.f404613d = dVar;
                this.f404611b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404613d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404613d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404611b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f404611b.onSuccess(t12);
            try {
                this.f404612c.accept(t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
        }
    }

    public C42015m(io.reactivex.rxjava3.core.I i12, l41.g gVar) {
        this.f404609b = i12;
        this.f404610c = gVar;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404609b.a(new a(l12, this.f404610c));
    }
}
