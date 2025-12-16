package com.avito.android.user_adverts.tab_screens.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAdvertsListItemsModule_ProvideShortcutTitleBlueprint$_avito_user_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f315906a;

    public i(u uVar) {
        this.f315906a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.g gVar = (com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.g) this.f315906a.get();
        d.f315895a.getClass();
        return new com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.c(gVar);
    }
}
