package com.avito.android.player;

import com.avito.android.player.ExoPlayerController;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExoPlayerControllerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f220135a;

    /* renamed from: b, reason: collision with root package name */
    public final u f220136b;

    /* renamed from: c, reason: collision with root package name */
    public final l f220137c;

    public f(l lVar, u uVar, u uVar2) {
        this.f220135a = uVar;
        this.f220136b = uVar2;
        this.f220137c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC35745a5) this.f220135a.get(), (com.avito.android.player_holder.a) this.f220136b.get(), (ExoPlayerController.State) this.f220137c.f393949a);
    }
}
