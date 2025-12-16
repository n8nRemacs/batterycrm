package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: ObservableTakeWhile.java */
/* loaded from: classes8.dex */
public final class z1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super T> f404425c;

    /* compiled from: ObservableTakeWhile.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404426b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.r<? super T> f404427c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404428d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404429e;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.r<? super T> rVar) {
            this.f404426b = g12;
            this.f404427c = rVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404428d, dVar)) {
                this.f404428d = dVar;
                this.f404426b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404428d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404429e) {
                return;
            }
            this.f404429e = true;
            this.f404426b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404428d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404429e) {
                C47998a.b(th2);
            } else {
                this.f404429e = true;
                this.f404426b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404429e) {
                return;
            }
            try {
                boolean zTest = this.f404427c.test(t12);
                io.reactivex.rxjava3.core.G<? super T> g12 = this.f404426b;
                if (zTest) {
                    g12.onNext(t12);
                    return;
                }
                this.f404429e = true;
                this.f404428d.dispose();
                g12.e();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404428d.dispose();
                onError(th2);
            }
        }
    }

    public z1(C41977p c41977p, l41.r rVar) {
        super(c41977p);
        this.f404425c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f404425c));
    }
}
