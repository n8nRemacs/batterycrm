package com.avito.android.advert.di;

import com.avito.android.advert.item.AdvertDetailsFastOpenParams;

/* compiled from: AdvertFragmentModule_ProvideFromSpaceFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class S implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f69119a;

    public S(dagger.internal.l lVar) {
        this.f69119a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        AdvertDetailsFastOpenParams advertDetailsFastOpenParams = (AdvertDetailsFastOpenParams) this.f69119a.f393949a;
        C27710t.f69463a.getClass();
        return advertDetailsFastOpenParams.f71334k.f71345c;
    }
}
