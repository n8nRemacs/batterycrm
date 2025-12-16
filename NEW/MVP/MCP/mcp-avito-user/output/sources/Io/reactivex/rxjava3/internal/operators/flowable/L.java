package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import s41.C47998a;

/* compiled from: FlowableDematerialize.java */
/* loaded from: classes8.dex */
public final class L<T, R> extends AbstractC41833b<T, R> {

    /* compiled from: FlowableDematerialize.java */
    public static final class a<T, R> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402402b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402403c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402404d;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402402b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402404d, eVar)) {
                this.f402404d = eVar;
                this.f402402b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402404d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402403c) {
                return;
            }
            this.f402403c = true;
            this.f402402b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402403c) {
                C47998a.b(th2);
            } else {
                this.f402403c = true;
                this.f402402b.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (!this.f402403c) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    this.f402404d.cancel();
                    onError(th2);
                    return;
                }
            }
            if (t12 instanceof io.reactivex.rxjava3.core.y) {
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) t12;
                if (NotificationLite.i(yVar.f401975a)) {
                    C47998a.b(yVar.b());
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402404d.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
