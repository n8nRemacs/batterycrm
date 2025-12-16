package com.avito.android.player.mvi;

import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.analytics.PlayerAnalyticsInteractor;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PlayerOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f220202a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ExoPlayerController> f220203b;

    /* renamed from: c, reason: collision with root package name */
    public final u f220204c;

    public k(u uVar, u uVar2, Provider provider) {
        this.f220202a = uVar;
        this.f220203b = provider;
        this.f220204c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((PlayerAnalyticsInteractor) this.f220202a.get(), this.f220203b.get(), (J80.b) this.f220204c.get());
    }
}
