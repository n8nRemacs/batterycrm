package com.avito.android.player.mvi;

import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.router.PlayerArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PlayerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f220187a;

    /* renamed from: b, reason: collision with root package name */
    public final u f220188b;

    public f(dagger.internal.l lVar, u uVar) {
        this.f220187a = lVar;
        this.f220188b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((PlayerArguments) this.f220187a.f393949a, (ExoPlayerController) this.f220188b.get());
    }
}
