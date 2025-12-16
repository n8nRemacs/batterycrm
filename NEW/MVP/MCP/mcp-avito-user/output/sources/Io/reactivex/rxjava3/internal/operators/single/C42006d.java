package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import m41.C43880b;
import s41.C47998a;

/* compiled from: SingleCreate.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42006d<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.M<T> f404567b;

    /* compiled from: SingleCreate.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.d$a */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.K<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404568b;

        public a(io.reactivex.rxjava3.core.L<? super T> l12) {
            this.f404568b = l12;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.K
        public final void f(l41.f fVar) {
            DisposableHelper.d(this, new C43880b(fVar));
        }

        @Override // io.reactivex.rxjava3.core.K
        public final boolean g(Throwable th2) {
            io.reactivex.rxjava3.disposables.d andSet;
            if (th2 == null) {
                th2 = io.reactivex.rxjava3.internal.util.h.b("onError called with a null Throwable.");
            }
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.f404568b.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.K
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.K
        public final void onError(Throwable th2) {
            if (g(th2)) {
                return;
            }
            C47998a.b(th2);
        }

        @Override // io.reactivex.rxjava3.core.K
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.disposables.d andSet;
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404568b;
            try {
                if (t12 == null) {
                    l12.onError(io.reactivex.rxjava3.internal.util.h.b("onSuccess called with a null value."));
                } else {
                    l12.onSuccess(t12);
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

    public C42006d(io.reactivex.rxjava3.core.M<T> m12) {
        this.f404567b = m12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        a aVar = new a(l12);
        l12.b(aVar);
        try {
            this.f404567b.j(aVar);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            aVar.onError(th2);
        }
    }
}
