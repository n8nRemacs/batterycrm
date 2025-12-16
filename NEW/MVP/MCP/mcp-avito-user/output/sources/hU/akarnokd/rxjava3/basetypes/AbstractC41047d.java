package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: BasicRefNonoSubscriber.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC41047d<R> extends AbstractC41050e<Void, R> implements org.reactivestreams.d<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final org.reactivestreams.d<? super Void> f397696b;

    /* renamed from: c, reason: collision with root package name */
    public org.reactivestreams.e f397697c;

    public AbstractC41047d(org.reactivestreams.d<? super Void> dVar) {
        this.f397696b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f397697c, eVar)) {
            this.f397697c = eVar;
            this.f397696b.K(this);
        }
    }

    @Override // org.reactivestreams.d
    public final /* bridge */ /* synthetic */ void onNext(Void r12) {
    }
}
