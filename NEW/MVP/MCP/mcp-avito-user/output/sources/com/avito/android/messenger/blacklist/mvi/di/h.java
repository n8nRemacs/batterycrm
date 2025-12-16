package com.avito.android.messenger.blacklist.mvi.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.messenger.blacklist.mvi.C31686p;
import com.avito.android.messenger.blacklist.mvi.InterfaceC31683m;
import com.avito.android.messenger.channels.mvi.di.N;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BlacklistFragmentModule_ProvideBlacklistInteractor$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<InterfaceC31683m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f186420a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f186421b;

    public h(dagger.internal.f fVar, dagger.internal.l lVar) {
        this.f186420a = lVar;
        this.f186421b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f186420a.f393949a;
        N n12 = (N) this.f186421b.get();
        e.f186415a.getClass();
        return (InterfaceC31683m) new P0(fragment, n12).a(C31686p.class);
    }
}
