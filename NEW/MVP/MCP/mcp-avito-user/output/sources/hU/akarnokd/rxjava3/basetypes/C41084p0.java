package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import m41.C43880b;
import s41.C47998a;

/* compiled from: PerhapsCreate.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41084p0<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsCreate.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.p0$a */
    public static final class a<T> extends o41.f<T> implements io.reactivex.rxjava3.core.s<T> {
        private static final long serialVersionUID = -7149477775653368644L;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f397742d;

        public a(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
            this.f397742d = new AtomicReference<>();
        }

        @Override // io.reactivex.rxjava3.core.s
        public final void e() {
            AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f397742d;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            io.reactivex.rxjava3.disposables.d andSet = atomicReference.getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.f419376b.e();
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public final void f(l41.f fVar) {
            DisposableHelper.d(this.f397742d, new C43880b(fVar));
        }

        @Override // io.reactivex.rxjava3.core.s
        public final void onError(Throwable th2) {
            AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f397742d;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            io.reactivex.rxjava3.disposables.d andSet = atomicReference.getAndSet(disposableHelper);
            if (andSet == disposableHelper) {
                C47998a.b(th2);
                return;
            }
            this.f419376b.onError(th2);
            if (andSet != null) {
                andSet.dispose();
            }
        }

        @Override // o41.f, io.reactivex.rxjava3.core.s
        public final void onSuccess(T t12) {
            AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f397742d;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            io.reactivex.rxjava3.disposables.d andSet = atomicReference.getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                l(t12);
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a(dVar);
        dVar.K(aVar);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            aVar.onError(th2);
        }
    }
}
