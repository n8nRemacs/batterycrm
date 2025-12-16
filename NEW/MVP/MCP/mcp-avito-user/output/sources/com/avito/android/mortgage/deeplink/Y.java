package com.avito.android.mortgage.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: MortgageManagerUspDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Y implements dagger.internal.h<X> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f198781a;

    public Y(dv.b bVar) {
        this.f198781a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new X((a.d) this.f198781a.get());
    }
}
