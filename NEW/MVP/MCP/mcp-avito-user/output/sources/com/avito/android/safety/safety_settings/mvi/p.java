package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: SafetySettingsActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safety.safety_settings.domain.c f257784a;

    /* renamed from: b, reason: collision with root package name */
    public final cv.e f257785b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f257786c;

    public p(com.avito.android.safety.safety_settings.domain.c cVar, cv.e eVar, dagger.internal.f fVar) {
        this.f257784a = cVar;
        this.f257785b = eVar;
        this.f257786c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((com.avito.android.safety.safety_settings.domain.a) this.f257784a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f257785b.get(), (InterfaceC28373a) this.f257786c.get());
    }
}
