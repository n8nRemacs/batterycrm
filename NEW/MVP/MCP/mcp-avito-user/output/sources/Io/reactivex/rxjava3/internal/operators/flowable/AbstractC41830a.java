package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AbstractBackpressureThrottlingSubscriber.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC41830a<T, R> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
    private static final long serialVersionUID = -5050301752721603566L;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC41782o f402589b;

    /* renamed from: c, reason: collision with root package name */
    public org.reactivestreams.e f402590c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f402591d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f402592e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f402593f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f402594g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference<R> f402595h = new AtomicReference<>();

    public AbstractC41830a(InterfaceC41782o interfaceC41782o) {
        this.f402589b = interfaceC41782o;
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f402590c, eVar)) {
            this.f402590c = eVar;
            this.f402589b.K(this);
            eVar.request(Long.MAX_VALUE);
        }
    }

    public final boolean a(boolean z12, boolean z13, InterfaceC41782o interfaceC41782o, AtomicReference atomicReference) {
        if (this.f402593f) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z12) {
            return false;
        }
        Throwable th2 = this.f402592e;
        if (th2 != null) {
            atomicReference.lazySet(null);
            interfaceC41782o.onError(th2);
            return true;
        }
        if (!z13) {
            return false;
        }
        interfaceC41782o.e();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r7 != r1.get()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r9 = r13.f402591d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r2.get() != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (a(r9, r10, r0, r2) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r7 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        io.reactivex.rxjava3.internal.util.c.e(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r4 = addAndGet(-r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r13 = this;
            int r0 = r13.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            io.reactivex.rxjava3.core.o r0 = r13.f402589b
            java.util.concurrent.atomic.AtomicLong r1 = r13.f402594g
            java.util.concurrent.atomic.AtomicReference<R> r2 = r13.f402595h
            r3 = 1
            r4 = r3
        Lf:
            r5 = 0
            r7 = r5
        L12:
            long r9 = r1.get()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L38
            boolean r9 = r13.f402591d
            r11 = 0
            java.lang.Object r11 = r2.getAndSet(r11)
            if (r11 != 0) goto L26
            r12 = r3
            goto L27
        L26:
            r12 = r10
        L27:
            boolean r9 = r13.a(r9, r12, r0, r2)
            if (r9 == 0) goto L2e
            return
        L2e:
            if (r12 == 0) goto L31
            goto L38
        L31:
            r0.onNext(r11)
            r9 = 1
            long r7 = r7 + r9
            goto L12
        L38:
            long r11 = r1.get()
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
            boolean r9 = r13.f402591d
            java.lang.Object r11 = r2.get()
            if (r11 != 0) goto L49
            r10 = r3
        L49:
            boolean r9 = r13.a(r9, r10, r0, r2)
            if (r9 == 0) goto L50
            return
        L50:
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L57
            io.reactivex.rxjava3.internal.util.c.e(r1, r7)
        L57:
            int r4 = -r4
            int r4 = r13.addAndGet(r4)
            if (r4 != 0) goto Lf
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.AbstractC41830a.b():void");
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        if (this.f402593f) {
            return;
        }
        this.f402593f = true;
        this.f402590c.cancel();
        if (getAndIncrement() == 0) {
            this.f402595h.lazySet(null);
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
        this.f402591d = true;
        b();
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        this.f402592e = th2;
        this.f402591d = true;
        b();
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        if (SubscriptionHelper.h(j12)) {
            io.reactivex.rxjava3.internal.util.c.a(this.f402594g, j12);
            b();
        }
    }
}
