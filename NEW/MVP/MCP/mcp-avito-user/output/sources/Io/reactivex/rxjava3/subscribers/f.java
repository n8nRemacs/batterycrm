package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.s;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: TestSubscriber.java */
/* loaded from: classes8.dex */
public class f<T> extends io.reactivex.rxjava3.observers.a<T, f<T>> implements InterfaceC41782o<T>, org.reactivestreams.e {

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f405049g;

    /* renamed from: f, reason: collision with root package name */
    public final org.reactivestreams.d<? super T> f405048f = a.f405052b;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference<org.reactivestreams.e> f405050h = new AtomicReference<>();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f405051i = new AtomicLong(Long.MAX_VALUE);

    @Override // org.reactivestreams.d
    public final void K(@j41.e org.reactivestreams.e eVar) {
        Thread.currentThread();
        s sVar = this.f404860d;
        if (eVar == null) {
            sVar.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        AtomicReference<org.reactivestreams.e> atomicReference = this.f405050h;
        while (!atomicReference.compareAndSet(null, eVar)) {
            if (atomicReference.get() != null) {
                eVar.cancel();
                if (atomicReference.get() != SubscriptionHelper.f404813b) {
                    sVar.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + eVar));
                    return;
                }
                return;
            }
        }
        this.f405048f.getClass();
        long andSet = this.f405051i.getAndSet(0L);
        if (andSet != 0) {
            eVar.request(andSet);
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        if (this.f405049g) {
            return;
        }
        this.f405049g = true;
        SubscriptionHelper.a(this.f405050h);
    }

    @Override // org.reactivestreams.d
    public final void e() {
        CountDownLatch countDownLatch = this.f404858b;
        if (!this.f404861e) {
            this.f404861e = true;
            if (this.f405050h.get() == null) {
                this.f404860d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.f405048f.getClass();
        } finally {
            countDownLatch.countDown();
        }
    }

    @Override // org.reactivestreams.d
    public final void onError(@j41.e Throwable th2) {
        CountDownLatch countDownLatch = this.f404858b;
        boolean z12 = this.f404861e;
        s sVar = this.f404860d;
        if (!z12) {
            this.f404861e = true;
            if (this.f405050h.get() == null) {
                sVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (th2 == null) {
                sVar.add(new NullPointerException("onError received a null Throwable"));
            } else {
                sVar.add(th2);
            }
            this.f405048f.getClass();
            countDownLatch.countDown();
        } catch (Throwable th3) {
            countDownLatch.countDown();
            throw th3;
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(@j41.e T t12) {
        boolean z12 = this.f404861e;
        s sVar = this.f404860d;
        if (!z12) {
            this.f404861e = true;
            if (this.f405050h.get() == null) {
                sVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        this.f404859c.add(t12);
        if (t12 == null) {
            sVar.add(new NullPointerException("onNext received a null value"));
        }
        this.f405048f.getClass();
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        SubscriptionHelper.b(this.f405050h, this.f405051i, j12);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TestSubscriber.java */
    public static final class a implements InterfaceC41782o<Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f405052b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f405053c;

        static {
            a aVar = new a("INSTANCE", 0);
            f405052b = aVar;
            f405053c = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f405053c.clone();
        }

        @Override // org.reactivestreams.d
        public final void e() {
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
        }
    }
}
