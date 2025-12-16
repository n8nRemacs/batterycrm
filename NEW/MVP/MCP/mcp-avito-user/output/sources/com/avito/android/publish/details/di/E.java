package com.avito.android.publish.details.di;

/* compiled from: PublishDetailsListModule_ProvideCarInfoShortItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class E implements dagger.internal.h<com.avito.android.publish.slots.car_info_short.item.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f233616a;

    public E(dagger.internal.u uVar) {
        this.f233616a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.car_info_short.item.d dVar = (com.avito.android.publish.slots.car_info_short.item.d) this.f233616a.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.car_info_short.item.b(dVar);
    }
}
