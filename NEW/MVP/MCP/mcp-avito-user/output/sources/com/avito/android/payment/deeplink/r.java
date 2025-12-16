package com.avito.android.payment.deeplink;

/* compiled from: PaymentRedirectDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f214035a;

    public r(dagger.internal.f fVar) {
        this.f214035a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((com.avito.android.deeplink_handler.handler.composite.a) this.f214035a.get());
    }
}
