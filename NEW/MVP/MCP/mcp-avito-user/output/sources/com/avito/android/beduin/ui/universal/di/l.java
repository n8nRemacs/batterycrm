package com.avito.android.beduin.ui.universal.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalBeduinFragmentTrackerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f104480a;

    /* renamed from: b, reason: collision with root package name */
    public final u f104481b;

    public l(dagger.internal.l lVar, u uVar) {
        this.f104480a = lVar;
        this.f104481b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f104480a.f393949a;
        Screen screen = (Screen) this.f104481b.get();
        k.f104479a.getClass();
        if (screen != null) {
            return new C28478k(screen, rVar, "load-page");
        }
        return null;
    }
}
