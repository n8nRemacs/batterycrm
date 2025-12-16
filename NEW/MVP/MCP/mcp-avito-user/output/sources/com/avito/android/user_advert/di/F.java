package com.avito.android.user_advert.di;

/* compiled from: MyAdvertItemsModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class F implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.items.J f310797a;

    public F(com.avito.android.user_advert.advert.items.J j12) {
        this.f310797a = j12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f310797a.getClass();
        com.avito.android.user_advert.advert.items.I i12 = new com.avito.android.user_advert.advert.items.I();
        B.f310787a.getClass();
        return new com.avito.android.recycler.data_aware.i(new com.avito.android.recycler.data_aware.g(), null, false, i12, 2, null);
    }
}
