package com.avito.android.messenger.channels.mvi.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: ChannelsModule_ProvideFoldersPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class y implements dagger.internal.h<com.avito.android.messenger.channels.mvi.presenter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f187448a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f187449b;

    public y(dagger.internal.f fVar, dagger.internal.l lVar) {
        this.f187448a = fVar;
        this.f187449b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        N n12 = (N) this.f187448a.get();
        Fragment fragment = (Fragment) this.f187449b.f393949a;
        r.f187438a.getClass();
        return (com.avito.android.messenger.channels.mvi.presenter.a) new P0(fragment, n12).a(com.avito.android.messenger.channels.mvi.presenter.b.class);
    }
}
