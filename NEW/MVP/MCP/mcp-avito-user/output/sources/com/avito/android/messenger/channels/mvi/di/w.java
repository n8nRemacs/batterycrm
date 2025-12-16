package com.avito.android.messenger.channels.mvi.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: ChannelsModule_ProvideFoldersInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<com.avito.android.messenger.channels.mvi.interactor.k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f187445a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f187446b;

    public w(dagger.internal.f fVar, dagger.internal.l lVar) {
        this.f187445a = fVar;
        this.f187446b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        N n12 = (N) this.f187445a.get();
        Fragment fragment = (Fragment) this.f187446b.f393949a;
        r.f187438a.getClass();
        return (com.avito.android.messenger.channels.mvi.interactor.k) new P0(fragment, n12).a(com.avito.android.messenger.channels.mvi.interactor.l.class);
    }
}
