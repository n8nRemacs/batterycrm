package com.avito.android.user_advert.di;

import com.avito.android.socketEvents.SocketEventParserByClass;

/* compiled from: AdvertSocketEventMappingsModule_ProvideAdvertDeliverySettingsSocketEventMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.di.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35477d implements dagger.internal.h<mx0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final C35476c f310902a;

    public C35477d(C35476c c35476c) {
        this.f310902a = c35476c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f310902a.getClass();
        return new mx0.c(iI0.H.class, new mx0.e("item.deliverySettingsChanged", null, false, 6, null), new SocketEventParserByClass(iI0.H.class));
    }
}
