package com.avito.android.comfortable_deal.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: DealIncomeDetailsDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class D implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f121854a;

    public D(dv.b bVar) {
        this.f121854a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B((a.d) this.f121854a.get());
    }
}
