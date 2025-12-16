package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableSwitchIfEmpty.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.r1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41984r1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f404260c;

    /* compiled from: ObservableSwitchIfEmpty.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.r1$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404261b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.z f404262c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404264e = true;

        /* renamed from: d, reason: collision with root package name */
        public final m41.d f404263d = new m41.d();

        public a(io.reactivex.rxjava3.core.z zVar, io.reactivex.rxjava3.core.G g12) {
            this.f404261b = g12;
            this.f404262c = zVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            m41.d dVar2 = this.f404263d;
            dVar2.getClass();
            DisposableHelper.d(dVar2, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (!this.f404264e) {
                this.f404261b.e();
            } else {
                this.f404264e = false;
                this.f404262c.c(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404261b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404264e) {
                this.f404264e = false;
            }
            this.f404261b.onNext(t12);
        }
    }

    public C41984r1(io.reactivex.rxjava3.core.z zVar, io.reactivex.rxjava3.core.z zVar2) {
        super(zVar);
        this.f404260c = zVar2;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a(this.f404260c, g12);
        g12.b(aVar.f404263d);
        this.f403951b.c(aVar);
    }
}
