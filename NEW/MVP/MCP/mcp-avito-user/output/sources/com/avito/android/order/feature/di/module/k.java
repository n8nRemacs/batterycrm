package com.avito.android.order.feature.di.module;

import com.avito.android.socketEvents.SocketEventParserByClass;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrderSocketEventMappingsModule_ProvideOrderSocketEventMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<mx0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final j f209575a;

    public k(j jVar) {
        this.f209575a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f209575a.getClass();
        return new mx0.c(M40.a.class, new mx0.e("orderPage.Changed", null, false, 6, null), new SocketEventParserByClass(M40.a.class));
    }
}
