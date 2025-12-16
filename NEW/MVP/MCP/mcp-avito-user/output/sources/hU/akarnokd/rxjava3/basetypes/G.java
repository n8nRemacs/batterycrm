package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: NonoFromObservable.java */
/* loaded from: classes8.dex */
final class G extends AbstractC41062i {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }

    /* compiled from: NonoFromObservable.java */
    public static final class a extends AbstractC41038a implements io.reactivex.rxjava3.core.G<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397575b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397576c;

        public a(org.reactivestreams.d<? super Void> dVar) {
            this.f397575b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f397576c, dVar)) {
                this.f397576c = dVar;
                this.f397575b.K(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f397575b.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f397575b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
        }
    }
}
