package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.InterfaceC44188e;
import s41.C47998a;

/* compiled from: ObservableAllSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41950g<T> extends io.reactivex.rxjava3.core.I<Boolean> implements InterfaceC44188e<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final C41957i0 f404045b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super T> f404046c;

    /* compiled from: ObservableAllSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.g$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super Boolean> f404047b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.r<? super T> f404048c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404049d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404050e;

        public a(io.reactivex.rxjava3.core.L<? super Boolean> l12, l41.r<? super T> rVar) {
            this.f404047b = l12;
            this.f404048c = rVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404049d, dVar)) {
                this.f404049d = dVar;
                this.f404047b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404049d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404050e) {
                return;
            }
            this.f404050e = true;
            this.f404047b.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404049d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404050e) {
                C47998a.b(th2);
            } else {
                this.f404050e = true;
                this.f404047b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404050e) {
                return;
            }
            try {
                if (this.f404048c.test(t12)) {
                    return;
                }
                this.f404050e = true;
                this.f404049d.dispose();
                this.f404047b.onSuccess(Boolean.FALSE);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404049d.dispose();
                onError(th2);
            }
        }
    }

    public C41950g(C41957i0 c41957i0, l41.r rVar) {
        this.f404045b = c41957i0;
        this.f404046c = rVar;
    }

    @Override // n41.InterfaceC44188e
    public final io.reactivex.rxjava3.core.z<Boolean> d() {
        return new C41947f(this.f404045b, this.f404046c);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super Boolean> l12) {
        this.f404045b.c(new a(l12, this.f404046c));
    }
}
