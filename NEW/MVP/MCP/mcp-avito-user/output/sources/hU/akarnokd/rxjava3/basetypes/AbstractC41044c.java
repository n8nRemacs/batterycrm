package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: BasicNonoSubscriber.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC41044c extends AbstractC41038a implements org.reactivestreams.d<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final org.reactivestreams.d<? super Void> f397685b;

    /* renamed from: c, reason: collision with root package name */
    public org.reactivestreams.e f397686c;

    public AbstractC41044c(org.reactivestreams.d<? super Void> dVar) {
        this.f397685b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f397686c, eVar)) {
            this.f397686c = eVar;
            this.f397685b.K(this);
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(Object obj) {
    }
}
