package com.avito.android.profile_settings_basic.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BasicProfileSettingsModule_ProvidesPerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f228742a;

    /* renamed from: b, reason: collision with root package name */
    public final l f228743b;

    public d(l lVar, l lVar2) {
        this.f228742a = lVar;
        this.f228743b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f228742a.f393949a;
        r rVar = (r) this.f228743b.f393949a;
        b.f228739a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
