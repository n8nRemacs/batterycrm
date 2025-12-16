package com.avito.android.payment.deeplink;

/* compiled from: DeliveryOrderPaymentSuccessLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.deeplink.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32972c implements dagger.internal.h<C32971b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f214010a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f214011b;

    public C32972c(dagger.internal.f fVar, dagger.internal.f fVar2) {
        this.f214010a = fVar;
        this.f214011b = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32971b((com.avito.android.deeplink_handler.handler.composite.a) this.f214010a.get(), (com.avito.android.deep_linking.x) this.f214011b.get());
    }
}
