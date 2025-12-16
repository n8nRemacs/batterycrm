package com.avito.android.installments.onboarding.deeplink;

import com.avito.android.beduin.ui.universal.j;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsOnboardingShowDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f172835a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f172836b;

    /* renamed from: c, reason: collision with root package name */
    public final f f172837c;

    /* renamed from: d, reason: collision with root package name */
    public final j f172838d;

    public c(dv.b bVar, dv.b bVar2, f fVar, j jVar) {
        this.f172835a = bVar;
        this.f172836b = bVar2;
        this.f172837c = fVar;
        this.f172838d = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f172835a.get(), (a.b) this.f172836b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f172837c.get(), (com.avito.android.beduin.ui.universal.h) this.f172838d.get());
    }
}
