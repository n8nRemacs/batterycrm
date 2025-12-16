package com.avito.android.extended_profile_serp.di;

import com.avito.android.serp.adapter.C34690c0;
import com.avito.android.serp.adapter.h1;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpModule_ProvideGridPositionProvider$_avito_extended_profile_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class w implements dagger.internal.h<h1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Integer> f152872a;

    public w(Provider<Integer> provider) {
        this.f152872a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int iIntValue = this.f152872a.get().intValue();
        C30538h.f152853a.getClass();
        return new C34690c0(iIntValue);
    }
}
