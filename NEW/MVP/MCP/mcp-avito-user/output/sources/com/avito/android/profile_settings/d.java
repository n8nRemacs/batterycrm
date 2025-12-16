package com.avito.android.profile_settings;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileSettingsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f228386a;

    public d(dagger.internal.l lVar) {
        this.f228386a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Application) this.f228386a.f393949a);
    }
}
