package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: SoloDoOnLifecycle.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.w1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41105w1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloDoOnLifecycle.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.w1$a */
    public final class a extends AbstractC41053f<T> implements org.reactivestreams.d<T> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super T> f397799b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f397800c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f397801d;

        public a(org.reactivestreams.d<? super T> dVar) {
            this.f397799b = dVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397800c, eVar)) {
                this.f397800c = eVar;
                if (eVar instanceof QueueSubscription) {
                }
                try {
                    C41105w1.this.getClass();
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    eVar.cancel();
                    this.f397799b.K(EmptySubscription.f404811b);
                    onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397801d) {
                return;
            }
            this.f397801d = true;
            try {
                C41105w1.this.getClass();
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397799b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f397801d) {
                C47998a.b(th2);
                return;
            }
            this.f397801d = true;
            try {
                C41105w1.this.getClass();
                throw null;
            } finally {
                try {
                } catch (Throwable th3) {
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f397801d) {
                return;
            }
            try {
                C41105w1.this.getClass();
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397800c.cancel();
                onError(th2);
            }
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
