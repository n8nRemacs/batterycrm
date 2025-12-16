package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: SinglePostCompleteSubscriber.java */
/* loaded from: classes8.dex */
public abstract class u<T, R> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e {
    private static final long serialVersionUID = 7917814472626990048L;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC41782o f404801b;

    /* renamed from: c, reason: collision with root package name */
    public org.reactivestreams.e f404802c;

    /* renamed from: d, reason: collision with root package name */
    public R f404803d;

    /* renamed from: e, reason: collision with root package name */
    public long f404804e;

    public u(InterfaceC41782o interfaceC41782o) {
        this.f404801b = interfaceC41782o;
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f404802c, eVar)) {
            this.f404802c = eVar;
            this.f404801b.K(this);
        }
    }

    public final void a(R r12) {
        long j12 = this.f404804e;
        if (j12 != 0) {
            io.reactivex.rxjava3.internal.util.c.e(this, j12);
        }
        while (true) {
            long j13 = get();
            if ((j13 & Long.MIN_VALUE) != 0) {
                c(r12);
                return;
            }
            if ((j13 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                InterfaceC41782o interfaceC41782o = this.f404801b;
                interfaceC41782o.onNext(r12);
                interfaceC41782o.e();
                return;
            }
            this.f404803d = r12;
            if (compareAndSet(0L, Long.MIN_VALUE)) {
                return;
            } else {
                this.f404803d = null;
            }
        }
    }

    public void cancel() {
        this.f404802c.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSuccess(T t12) {
        a(t12);
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        long j13;
        if (SubscriptionHelper.h(j12)) {
            do {
                j13 = get();
                if ((j13 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        R r12 = this.f404803d;
                        InterfaceC41782o interfaceC41782o = this.f404801b;
                        interfaceC41782o.onNext(r12);
                        interfaceC41782o.e();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j13, io.reactivex.rxjava3.internal.util.c.c(j13, j12)));
            this.f404802c.request(j12);
        }
    }

    public void c(R r12) {
    }
}
