package com.avito.android.user_adverts.tab_screens.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAdvertsListItemsModule_ProvideDisclaimerBlueprint$_avito_user_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<com.avito.android.user_adverts.tab_screens.advert_list.disclaimer.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f315896a;

    public f(u uVar) {
        this.f315896a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.conveyor_shared_item.single_text.b bVar = (com.avito.android.conveyor_shared_item.single_text.b) this.f315896a.get();
        d.f315895a.getClass();
        return new com.avito.android.user_adverts.tab_screens.advert_list.disclaimer.a(bVar);
    }
}
