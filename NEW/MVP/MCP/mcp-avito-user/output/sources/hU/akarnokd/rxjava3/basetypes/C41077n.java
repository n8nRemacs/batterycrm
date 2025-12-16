package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CountDownLatch;

/* compiled from: NonoBlockingAwaitSubscriber.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41077n extends CountDownLatch implements org.reactivestreams.d<Void> {

    /* renamed from: b, reason: collision with root package name */
    public org.reactivestreams.e f397731b;

    public C41077n() {
        super(1);
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f397731b, eVar)) {
            this.f397731b = eVar;
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
        countDown();
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        countDown();
    }

    @Override // org.reactivestreams.d
    public final /* bridge */ /* synthetic */ void onNext(Void r12) {
    }
}
