package com.avito.android.services_onboarding.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesCpxOnboardingLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f279817a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f279818b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f279819c;

    public b(C30102l3 c30102l3, dv.b bVar, dv.b bVar2) {
        this.f279817a = bVar;
        this.f279818b = c30102l3;
        this.f279819c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f279818b.get(), (a.InterfaceC4053a) this.f279817a.get(), (a.b) this.f279819c.get());
    }
}
