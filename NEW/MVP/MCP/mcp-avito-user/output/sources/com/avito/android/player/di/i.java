package com.avito.android.player.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PlayerFragmentModule_ProvidePerfData$_avito_player_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f220131a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f220132b;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f220131a = lVar;
        this.f220132b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f220131a.f393949a;
        r rVar = (r) this.f220132b.f393949a;
        h.f220130a.getClass();
        return new C28478k(screen, rVar, "player");
    }
}
