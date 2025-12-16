package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: ObservableOnErrorNext.java */
/* loaded from: classes8.dex */
public final class K0<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super Throwable, ? extends io.reactivex.rxjava3.core.E<? extends T>> f403683c;

    /* compiled from: ObservableOnErrorNext.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403684b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super Throwable, ? extends io.reactivex.rxjava3.core.E<? extends T>> f403685c;

        /* renamed from: d, reason: collision with root package name */
        public final m41.d f403686d = new m41.d();

        /* renamed from: e, reason: collision with root package name */
        public boolean f403687e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f403688f;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.o<? super Throwable, ? extends io.reactivex.rxjava3.core.E<? extends T>> oVar) {
            this.f403684b = g12;
            this.f403685c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            m41.d dVar2 = this.f403686d;
            dVar2.getClass();
            DisposableHelper.c(dVar2, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403688f) {
                return;
            }
            this.f403688f = true;
            this.f403687e = true;
            this.f403684b.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            boolean z12 = this.f403687e;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403684b;
            if (z12) {
                if (this.f403688f) {
                    C47998a.b(th2);
                    return;
                } else {
                    g12.onError(th2);
                    return;
                }
            }
            this.f403687e = true;
            try {
                io.reactivex.rxjava3.core.E<? extends T> eApply = this.f403685c.apply(th2);
                if (eApply != null) {
                    eApply.c(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th2);
                g12.onError(nullPointerException);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                g12.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403688f) {
                return;
            }
            this.f403684b.onNext(t12);
        }
    }

    public K0(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        super(zVar);
        this.f403683c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a(g12, this.f403683c);
        g12.b(aVar.f403686d);
        this.f403951b.c(aVar);
    }
}
