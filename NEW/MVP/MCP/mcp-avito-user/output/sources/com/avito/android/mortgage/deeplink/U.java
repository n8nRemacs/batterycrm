package com.avito.android.mortgage.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import t00.InterfaceC48454a;

/* compiled from: MortgageLandingV2DeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class U implements dagger.internal.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f198776a;

    /* renamed from: b, reason: collision with root package name */
    public final t00.c f198777b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f198778c;

    public U(dv.b bVar, t00.c cVar, C25721c c25721c) {
        this.f198776a = bVar;
        this.f198777b = cVar;
        this.f198778c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new T((a.InterfaceC4053a) this.f198776a.get(), (InterfaceC48454a) this.f198777b.get(), (C25719a) this.f198778c.get());
    }
}
