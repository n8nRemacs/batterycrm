package com.avito.android.profile_settings_extended.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSettingsModule_ProvidesPerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f230247a;

    /* renamed from: b, reason: collision with root package name */
    public final l f230248b;

    public e(l lVar, l lVar2) {
        this.f230247a = lVar;
        this.f230248b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f230247a.f393949a;
        r rVar = (r) this.f230248b.f393949a;
        c.f230246a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
