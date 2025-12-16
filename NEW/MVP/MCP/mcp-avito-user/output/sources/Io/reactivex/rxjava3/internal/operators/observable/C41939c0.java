package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import s41.C47998a;

/* compiled from: ObservableFlattenIterable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41939c0<T, R> extends AbstractC41932a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends Iterable<? extends R>> f403999c;

    /* compiled from: ObservableFlattenIterable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.c0$a */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f404000b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends Iterable<? extends R>> f404001c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404002d;

        public a(io.reactivex.rxjava3.core.G<? super R> g12, l41.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f404000b = g12;
            this.f404001c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404002d, dVar)) {
                this.f404002d = dVar;
                this.f404000b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404002d.dispose();
            this.f404002d = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            io.reactivex.rxjava3.disposables.d dVar = this.f404002d;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                return;
            }
            this.f404002d = disposableHelper;
            this.f404000b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404002d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.disposables.d dVar = this.f404002d;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                C47998a.b(th2);
            } else {
                this.f404002d = disposableHelper;
                this.f404000b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404002d == DisposableHelper.f401986b) {
                return;
            }
            try {
                for (R r12 : this.f404001c.apply(t12)) {
                    try {
                        try {
                            Objects.requireNonNull(r12, "The iterator returned a null value");
                            this.f404000b.onNext(r12);
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.a(th2);
                            this.f404002d.dispose();
                            onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.a.a(th3);
                        this.f404002d.dispose();
                        onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                io.reactivex.rxjava3.exceptions.a.a(th4);
                this.f404002d.dispose();
                onError(th4);
            }
        }
    }

    public C41939c0(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        super(zVar);
        this.f403999c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        this.f403951b.c(new a(g12, this.f403999c));
    }
}
