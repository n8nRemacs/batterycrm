package com.avito.android.safety.safety_settings.mvi;

/* compiled from: SafetySettingsBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safety.safety_settings.domain.c f257803a;

    /* renamed from: b, reason: collision with root package name */
    public final cv.e f257804b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.safety.safety_settings.domain.c f257805c;

    public w(com.avito.android.safety.safety_settings.domain.c cVar, cv.e eVar, com.avito.android.safety.safety_settings.domain.c cVar2) {
        this.f257803a = cVar;
        this.f257804b = eVar;
        this.f257805c = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v((com.avito.android.safety.safety_settings.domain.a) this.f257803a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f257804b.get(), (com.avito.android.safety.safety_settings.domain.a) this.f257805c.get());
    }
}
