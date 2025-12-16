package com.avito.android.advert.di;

import androidx.fragment.app.Fragment;
import androidx.view.T0;

/* compiled from: AdvertFragmentModule_ProvideViewModelStoreOwner$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class p0 implements dagger.internal.h<T0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f69460a;

    public p0(dagger.internal.u uVar) {
        this.f69460a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_core.advert.l lVar = (com.avito.android.advert_core.advert.l) this.f69460a.get();
        C27710t.f69463a.getClass();
        Fragment fragmentB = lVar.b();
        dagger.internal.t.d(fragmentB);
        return fragmentB;
    }
}
