package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: SingleDoOnLifecycle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42020s<T> extends io.reactivex.rxjava3.core.I<T> {

    /* compiled from: SingleDoOnLifecycle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.s$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404636b;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
                this.f404636b.dispose();
                this.f404636b = DisposableHelper.f401986b;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404636b.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(@j41.e Throwable th2) {
            io.reactivex.rxjava3.disposables.d dVar = this.f404636b;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                C47998a.b(th2);
            } else {
                this.f404636b = disposableHelper;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(@j41.e T t12) {
            io.reactivex.rxjava3.disposables.d dVar = this.f404636b;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                return;
            }
            this.f404636b = disposableHelper;
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        throw null;
    }
}
