package com.avito.android.messenger.blacklist.mvi.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.messenger.blacklist.mvi.G;
import com.avito.android.messenger.blacklist.mvi.H;
import com.avito.android.messenger.channels.mvi.di.N;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BlacklistFragmentModule_ProvideBlacklistPresenter$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f186422a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f186423b;

    public i(dagger.internal.f fVar, dagger.internal.l lVar) {
        this.f186422a = lVar;
        this.f186423b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f186422a.f393949a;
        N n12 = (N) this.f186423b.get();
        e.f186415a.getClass();
        return (G) new P0(fragment, n12).a(H.class);
    }
}
