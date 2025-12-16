package com.avito.android.help_center;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: HelpCenterUrlDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final C30753j f161602a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f161603b;

    public D(C30753j c30753j, dv.b bVar) {
        this.f161602a = c30753j;
        this.f161603b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C((InterfaceC30751h) this.f161602a.get(), (a.InterfaceC4053a) this.f161603b.get());
    }
}
