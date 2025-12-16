package com.avito.android.user_advert.di;

import com.avito.android.socketEvents.SocketEventParserByClass;

/* compiled from: AdvertSocketEventMappingsModule_ProvideAdvertSocketEventMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.di.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35478e implements dagger.internal.h<mx0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final C35476c f310903a;

    public C35478e(C35476c c35476c) {
        this.f310903a = c35476c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f310903a.getClass();
        return new mx0.c(eH0.g.class, new mx0.e("item.statusChanged", null, false, 6, null), new SocketEventParserByClass(eH0.g.class));
    }
}
