package com.avito.android.promoblock.di;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TnsPromoBlockItemModulePerFragment_ProvideActionsRelayFactory.java */
@e
@x
@y
/* loaded from: classes16.dex */
public final class d implements h<com.jakewharton.rxrelay3.d<com.avito.android.promoblock.a>> {

    /* compiled from: TnsPromoBlockItemModulePerFragment_ProvideActionsRelayFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f231785a = new d();
    }

    public static d a() {
        return a.f231785a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = c.f231784a;
        return new com.jakewharton.rxrelay3.c();
    }
}
