package com.avito.android.messenger.search.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.messenger.channels.mvi.di.N;
import com.avito.android.messenger.search.s;
import com.avito.android.messenger.search.t;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ChannelsSearchModule_ProvideChannelsSearchPresenter$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final l f197072a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f197073b;

    public g(dagger.internal.f fVar, l lVar) {
        this.f197072a = lVar;
        this.f197073b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f197072a.f393949a;
        N n12 = (N) this.f197073b.get();
        int i12 = c.f197067a;
        return (s) new P0(fragment, n12).a(t.class);
    }
}
