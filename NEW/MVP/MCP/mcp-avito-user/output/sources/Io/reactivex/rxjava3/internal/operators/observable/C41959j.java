package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.InterfaceC44188e;
import s41.C47998a;

/* compiled from: ObservableAnySingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41959j<T> extends io.reactivex.rxjava3.core.I<Boolean> implements InterfaceC44188e<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final C41957i0 f404096b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super T> f404097c;

    /* compiled from: ObservableAnySingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.j$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super Boolean> f404098b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.r<? super T> f404099c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404100d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404101e;

        public a(io.reactivex.rxjava3.core.L<? super Boolean> l12, l41.r<? super T> rVar) {
            this.f404098b = l12;
            this.f404099c = rVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404100d, dVar)) {
                this.f404100d = dVar;
                this.f404098b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404100d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404101e) {
                return;
            }
            this.f404101e = true;
            this.f404098b.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404100d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404101e) {
                C47998a.b(th2);
            } else {
                this.f404101e = true;
                this.f404098b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404101e) {
                return;
            }
            try {
                if (this.f404099c.test(t12)) {
                    this.f404101e = true;
                    this.f404100d.dispose();
                    this.f404098b.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404100d.dispose();
                onError(th2);
            }
        }
    }

    public C41959j(C41957i0 c41957i0, l41.r rVar) {
        this.f404096b = c41957i0;
        this.f404097c = rVar;
    }

    @Override // n41.InterfaceC44188e
    public final io.reactivex.rxjava3.core.z<Boolean> d() {
        return new C41956i(this.f404096b, this.f404097c);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super Boolean> l12) {
        this.f404096b.c(new a(l12, this.f404097c));
    }
}
