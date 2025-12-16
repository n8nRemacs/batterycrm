package com.avito.android.beduin.di.screen;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinScreenTrackerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f103969a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f103970b;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f103969a = lVar;
        this.f103970b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f103969a.f393949a;
        r rVar = (r) this.f103970b.f393949a;
        l.f103968a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
