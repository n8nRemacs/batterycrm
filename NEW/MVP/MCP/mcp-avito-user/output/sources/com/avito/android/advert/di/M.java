package com.avito.android.advert.di;

/* compiled from: AdvertFragmentModule_ProvideExpandItemsButtonBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class M implements dagger.internal.h<com.avito.android.advert_core.expand_items_button.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f69114a;

    public M(dagger.internal.u uVar) {
        this.f69114a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_core.expand_items_button.f fVar = (com.avito.android.advert_core.expand_items_button.f) this.f69114a.get();
        C27710t.f69463a.getClass();
        return new com.avito.android.advert_core.expand_items_button.d(new com.avito.android.advert_core.expand_items_button.i(fVar));
    }
}
