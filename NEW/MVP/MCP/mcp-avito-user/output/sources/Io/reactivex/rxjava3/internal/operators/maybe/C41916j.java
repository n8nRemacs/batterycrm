package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import m41.C43880b;
import s41.C47998a;

/* compiled from: MaybeCreate.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41916j<T> extends io.reactivex.rxjava3.core.q<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.u<T> f403251b;

    /* compiled from: MaybeCreate.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.j$a */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.s<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403252b;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar) {
            this.f403252b = tVar;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.s
        public final void e() {
            io.reactivex.rxjava3.disposables.d andSet;
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.f403252b.e();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public final void f(l41.f fVar) {
            DisposableHelper.d(this, new C43880b(fVar));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.s
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.disposables.d andSet;
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                C47998a.b(th2);
                return;
            }
            try {
                this.f403252b.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.s
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.disposables.d andSet;
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403252b;
            try {
                if (t12 == null) {
                    tVar.onError(io.reactivex.rxjava3.internal.util.h.b("onSuccess called with a null value."));
                } else {
                    tVar.onSuccess(t12);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th2) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th2;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return androidx.media3.exoplayer.analytics.m.l(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public C41916j(io.reactivex.rxjava3.core.u<T> uVar) {
        this.f403251b = uVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        a aVar = new a(tVar);
        tVar.b(aVar);
        try {
            this.f403251b.a(aVar);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            aVar.onError(th2);
        }
    }
}
