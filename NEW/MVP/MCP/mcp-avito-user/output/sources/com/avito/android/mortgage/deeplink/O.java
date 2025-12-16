package com.avito.android.mortgage.deeplink;

import com.avito.android.deeplink_handler.view.a;
import t00.InterfaceC48454a;

/* compiled from: MortgageLandingDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class O implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f198757a;

    /* renamed from: b, reason: collision with root package name */
    public final t00.c f198758b;

    public O(dv.b bVar, t00.c cVar) {
        this.f198757a = bVar;
        this.f198758b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N((a.InterfaceC4053a) this.f198757a.get(), (InterfaceC48454a) this.f198758b.get());
    }
}
