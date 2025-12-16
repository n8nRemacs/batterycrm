package com.avito.android.player.view;

import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.analytics.PlayerAnalyticsInteractor;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PlayerViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.player.mvi.i f220315a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PlayerAnalyticsInteractor> f220316b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ExoPlayerController> f220317c;

    public k(com.avito.android.player.mvi.i iVar, Provider provider, Provider provider2) {
        this.f220315a = iVar;
        this.f220316b = provider;
        this.f220317c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.player.mvi.h) this.f220315a.get(), this.f220316b.get(), this.f220317c.get());
    }
}
