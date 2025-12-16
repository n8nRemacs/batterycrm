package com.avito.android.safety.safety_settings;

import com.avito.android.safety.safety_settings.mvi.A;
import com.avito.android.safety.safety_settings.mvi.B;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SafetySettingsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final B f257644a;

    public i(B b12) {
        this.f257644a = b12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((A) this.f257644a.get(), null, 2, null);
    }
}
