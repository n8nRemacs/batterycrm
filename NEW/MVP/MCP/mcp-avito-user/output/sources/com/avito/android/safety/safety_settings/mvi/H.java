package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: SafetySettingsReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final y f257655a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f257656b;

    public H(y yVar, dagger.internal.f fVar) {
        this.f257655a = yVar;
        this.f257656b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f257655a.getClass();
        return new G(new x(), (InterfaceC28373a) this.f257656b.get());
    }
}
