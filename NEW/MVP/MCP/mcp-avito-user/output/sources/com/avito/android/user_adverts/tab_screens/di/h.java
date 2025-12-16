package com.avito.android.user_adverts.tab_screens.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAdvertsListItemsModule_ProvideLoadingItemBlueprint$_avito_user_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<com.avito.android.user_adverts.tab_screens.advert_list.loading.f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f315905a;

    public h(u uVar) {
        this.f315905a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.user_adverts.tab_screens.advert_list.loading.h hVar = (com.avito.android.user_adverts.tab_screens.advert_list.loading.h) this.f315905a.get();
        d dVar = d.f315895a;
        return new com.avito.android.user_adverts.tab_screens.advert_list.loading.f(hVar);
    }
}
