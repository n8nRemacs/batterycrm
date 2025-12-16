package com.avito.android.messenger.search.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.messenger.channels.mvi.di.N;
import com.avito.android.messenger.search.InterfaceC32569e;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ChannelsSearchModule_ProvideChannelsSearchInteractor$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<InterfaceC32569e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f197070a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f197071b;

    public f(dagger.internal.f fVar, l lVar) {
        this.f197070a = lVar;
        this.f197071b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f197070a.f393949a;
        N n12 = (N) this.f197071b.get();
        int i12 = c.f197067a;
        return (InterfaceC32569e) new P0(fragment, n12).a(com.avito.android.messenger.search.h.class);
    }
}
