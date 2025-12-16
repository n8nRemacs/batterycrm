package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingGetSubscriber.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41056g<T> extends CountDownLatch implements org.reactivestreams.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public org.reactivestreams.e f397711b;

    /* renamed from: c, reason: collision with root package name */
    public T f397712c;

    public C41056g() {
        super(1);
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f397711b, eVar)) {
            this.f397711b = eVar;
            eVar.request(Long.MAX_VALUE);
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
    public final void onNext(T t12) {
        this.f397712c = t12;
    }
}
