package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: NonoFromSingle.java */
/* loaded from: classes8.dex */
final class I extends AbstractC41062i {

    /* compiled from: NonoFromSingle.java */
    public static final class a extends AbstractC41038a implements io.reactivex.rxjava3.core.L<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397580b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397581c;

        public a(org.reactivestreams.d<? super Void> dVar) {
            this.f397580b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f397581c, dVar)) {
                this.f397581c = dVar;
                this.f397580b.K(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f397580b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(Object obj) {
            this.f397580b.e();
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
