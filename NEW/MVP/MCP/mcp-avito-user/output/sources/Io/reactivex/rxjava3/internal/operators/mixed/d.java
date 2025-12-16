package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ConcatMapXMainSubscriber.java */
/* loaded from: classes8.dex */
public abstract class d<T> extends AtomicInteger implements InterfaceC41782o<T> {
    private static final long serialVersionUID = -3214213361171757852L;

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.internal.util.b f403356b = new io.reactivex.rxjava3.internal.util.b();

    /* renamed from: c, reason: collision with root package name */
    public final int f403357c;

    /* renamed from: d, reason: collision with root package name */
    public final ErrorMode f403358d;

    /* renamed from: e, reason: collision with root package name */
    public q41.g<T> f403359e;

    /* renamed from: f, reason: collision with root package name */
    public org.reactivestreams.e f403360f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f403361g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f403362h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f403363i;

    public d(int i12, ErrorMode errorMode) {
        this.f403358d = errorMode;
        this.f403357c = i12;
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f403360f, eVar)) {
            this.f403360f = eVar;
            if (eVar instanceof q41.d) {
                q41.d dVar = (q41.d) eVar;
                int iV2 = dVar.v(7);
                if (iV2 == 1) {
                    this.f403359e = dVar;
                    this.f403363i = true;
                    this.f403361g = true;
                    d();
                    c();
                    return;
                }
                if (iV2 == 2) {
                    this.f403359e = dVar;
                    d();
                    this.f403360f.request(this.f403357c);
                    return;
                }
            }
            this.f403359e = new q41.h(this.f403357c);
            d();
            this.f403360f.request(this.f403357c);
        }
    }

    public abstract void b();

    public abstract void c();

    public void cancel() {
        f();
    }

    public abstract void d();

    public void dispose() {
        f();
    }

    @Override // org.reactivestreams.d
    public final void e() {
        this.f403361g = true;
        c();
    }

    public final void f() {
        this.f403362h = true;
        this.f403360f.cancel();
        b();
        this.f403356b.c();
        if (getAndIncrement() == 0) {
            this.f403359e.clear();
            a();
        }
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        if (this.f403356b.b(th2)) {
            if (this.f403358d == ErrorMode.f404819b) {
                b();
            }
            this.f403361g = true;
            c();
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        if (t12 == null || this.f403359e.offer(t12)) {
            c();
        } else {
            this.f403360f.cancel();
            onError(new MissingBackpressureException("queue full?!"));
        }
    }

    public void a() {
    }
}
