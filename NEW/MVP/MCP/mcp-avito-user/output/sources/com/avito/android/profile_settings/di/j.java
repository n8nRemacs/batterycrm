package com.avito.android.profile_settings.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileSettingsModule_ProvidesPerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f228434a;

    /* renamed from: b, reason: collision with root package name */
    public final l f228435b;

    public j(l lVar, l lVar2) {
        this.f228434a = lVar;
        this.f228435b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f228434a.f393949a;
        r rVar = (r) this.f228435b.f393949a;
        c.f228422a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
