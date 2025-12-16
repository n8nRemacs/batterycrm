package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;

/* compiled from: FlowableBufferExactBoundary.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41875p<T, U extends Collection<? super T>, B> extends AbstractC41833b<T, U> {

    /* compiled from: FlowableBufferExactBoundary.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.p$a */
    public static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.subscribers.b<B> {
        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(B b12) {
            throw null;
        }
    }

    /* compiled from: FlowableBufferExactBoundary.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.p$b */
    public static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.internal.subscribers.o<T, U, U> implements InterfaceC41782o<T>, org.reactivestreams.e, io.reactivex.rxjava3.disposables.d {

        /* renamed from: h, reason: collision with root package name */
        public org.reactivestreams.e f402927h;

        /* renamed from: i, reason: collision with root package name */
        public U f402928i;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402927h, eVar)) {
                this.f402927h = eVar;
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    this.f404797f = true;
                    eVar.cancel();
                    EmptySubscription.b(th2, this.f404795d);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.o, io.reactivex.rxjava3.internal.util.o
        public final boolean a(io.reactivex.rxjava3.subscribers.e eVar, Object obj) {
            this.f404795d.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f404797f) {
                return;
            }
            this.f404797f = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            synchronized (this) {
                try {
                    U u12 = this.f402928i;
                    if (u12 == null) {
                        return;
                    }
                    this.f402928i = null;
                    this.f404796e.offer(u12);
                    this.f404798g = true;
                    if (b()) {
                        io.reactivex.rxjava3.internal.util.p.c(this.f404796e, this.f404795d, this, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404797f;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            cancel();
            this.f404795d.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            synchronized (this) {
                try {
                    U u12 = this.f402928i;
                    if (u12 == null) {
                        return;
                    }
                    u12.add(t12);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super U> dVar) {
        this.f402624c.q(new b(new io.reactivex.rxjava3.subscribers.e((InterfaceC41782o) dVar), new io.reactivex.rxjava3.internal.queue.a()));
    }
}
