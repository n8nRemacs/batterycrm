package com.avito.android.messenger.channels.mvi.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.messenger.channels.mvi.interactor.C31770h;
import com.avito.android.messenger.channels.mvi.interactor.InterfaceC31766d;

/* compiled from: ChannelsModule_ProvideChannelsErrorInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<InterfaceC31766d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f187439a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f187440b;

    public t(dagger.internal.f fVar, dagger.internal.l lVar) {
        this.f187439a = fVar;
        this.f187440b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        N n12 = (N) this.f187439a.get();
        Fragment fragment = (Fragment) this.f187440b.f393949a;
        r.f187438a.getClass();
        return (InterfaceC31766d) new P0(fragment, n12).a(C31770h.class);
    }
}
