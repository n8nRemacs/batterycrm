package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: ObservableAny.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41956i<T> extends AbstractC41932a<T, Boolean> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super T> f404084c;

    /* compiled from: ObservableAny.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.i$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Boolean> f404085b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.r<? super T> f404086c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404087d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404088e;

        public a(io.reactivex.rxjava3.core.G<? super Boolean> g12, l41.r<? super T> rVar) {
            this.f404085b = g12;
            this.f404086c = rVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404087d, dVar)) {
                this.f404087d = dVar;
                this.f404085b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404087d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404088e) {
                return;
            }
            this.f404088e = true;
            Boolean bool = Boolean.FALSE;
            io.reactivex.rxjava3.core.G<? super Boolean> g12 = this.f404085b;
            g12.onNext(bool);
            g12.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404087d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404088e) {
                C47998a.b(th2);
            } else {
                this.f404088e = true;
                this.f404085b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404088e) {
                return;
            }
            try {
                if (this.f404086c.test(t12)) {
                    this.f404088e = true;
                    this.f404087d.dispose();
                    Boolean bool = Boolean.TRUE;
                    io.reactivex.rxjava3.core.G<? super Boolean> g12 = this.f404085b;
                    g12.onNext(bool);
                    g12.e();
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404087d.dispose();
                onError(th2);
            }
        }
    }

    public C41956i(C41957i0 c41957i0, l41.r rVar) {
        super(c41957i0);
        this.f404084c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super Boolean> g12) {
        this.f403951b.c(new a(g12, this.f404084c));
    }
}
