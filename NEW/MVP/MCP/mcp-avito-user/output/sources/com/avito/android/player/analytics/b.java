package com.avito.android.player.analytics;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.player.analytics.PlayerAnalyticsInteractor;
import com.avito.android.player.router.PlayerArguments;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PlayerAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f220046a;

    /* renamed from: b, reason: collision with root package name */
    public final u f220047b;

    /* renamed from: c, reason: collision with root package name */
    public final u f220048c;

    /* renamed from: d, reason: collision with root package name */
    public final l f220049d;

    public b(l lVar, u uVar, u uVar2, l lVar2) {
        this.f220046a = lVar;
        this.f220047b = uVar;
        this.f220048c = uVar2;
        this.f220049d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((PlayerArguments) this.f220046a.f393949a, (InterfaceC28373a) this.f220047b.get(), (E) this.f220048c.get(), (PlayerAnalyticsInteractor.State) this.f220049d.f393949a);
    }
}
