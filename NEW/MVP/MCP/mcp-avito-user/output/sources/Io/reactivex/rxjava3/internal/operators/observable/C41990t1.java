package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import s41.C47998a;

/* compiled from: ObservableTake.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.t1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41990t1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final long f404310c;

    /* compiled from: ObservableTake.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.t1$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404311b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404312c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404313d;

        /* renamed from: e, reason: collision with root package name */
        public long f404314e;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, long j12) {
            this.f404311b = g12;
            this.f404314e = j12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404313d, dVar)) {
                this.f404313d = dVar;
                long j12 = this.f404314e;
                io.reactivex.rxjava3.core.G<? super T> g12 = this.f404311b;
                if (j12 != 0) {
                    g12.b(this);
                    return;
                }
                this.f404312c = true;
                dVar.dispose();
                EmptyDisposable.a(g12);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404313d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404312c) {
                return;
            }
            this.f404312c = true;
            this.f404313d.dispose();
            this.f404311b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404313d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404312c) {
                C47998a.b(th2);
                return;
            }
            this.f404312c = true;
            this.f404313d.dispose();
            this.f404311b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404312c) {
                return;
            }
            long j12 = this.f404314e;
            long j13 = j12 - 1;
            this.f404314e = j13;
            if (j12 > 0) {
                boolean z12 = j13 == 0;
                this.f404311b.onNext(t12);
                if (z12) {
                    e();
                }
            }
        }
    }

    public C41990t1(io.reactivex.rxjava3.core.z zVar, long j12) {
        super(zVar);
        this.f404310c = j12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f404310c));
    }
}
