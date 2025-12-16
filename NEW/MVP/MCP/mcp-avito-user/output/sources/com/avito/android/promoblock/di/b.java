package com.avito.android.promoblock.di;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TnsPromoBlockItemModulePerActivity_ProvideActionsRelayFactory.java */
@e
@x
@y
/* loaded from: classes16.dex */
public final class b implements h<com.jakewharton.rxrelay3.d<com.avito.android.promoblock.a>> {

    /* compiled from: TnsPromoBlockItemModulePerActivity_ProvideActionsRelayFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f231783a = new b();
    }

    public static b a() {
        return a.f231783a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = com.avito.android.promoblock.di.a.f231782a;
        return new com.jakewharton.rxrelay3.c();
    }
}
