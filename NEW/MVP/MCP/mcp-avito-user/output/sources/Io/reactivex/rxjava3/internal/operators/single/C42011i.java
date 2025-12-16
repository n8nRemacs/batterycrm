package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SingleDelayWithPublisher.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42011i<T, U> extends io.reactivex.rxjava3.core.I<T> {

    /* compiled from: SingleDelayWithPublisher.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.i$a */
    public static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41782o<U>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404602b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404603c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f404604d;

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f404602b = l12;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404604d, eVar)) {
                this.f404604d = eVar;
                this.f404602b.b(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404604d.cancel();
            DisposableHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404603c) {
                return;
            }
            this.f404603c = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404603c) {
                C47998a.b(th2);
            } else {
                this.f404603c = true;
                this.f404602b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(U u12) {
            this.f404604d.cancel();
            e();
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        new a(l12);
        throw null;
    }
}
