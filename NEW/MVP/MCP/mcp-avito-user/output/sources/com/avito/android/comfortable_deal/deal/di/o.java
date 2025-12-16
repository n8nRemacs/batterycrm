package com.avito.android.comfortable_deal.deal.di;

import dagger.internal.x;
import dagger.internal.y;
import java.util.UUID;

/* compiled from: DealModule_Companion_ProvideProcessIdFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<String> {

    /* compiled from: DealModule_Companion_ProvideProcessIdFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final o f121070a = new o();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m.f121066a.getClass();
        return UUID.randomUUID().toString();
    }
}
