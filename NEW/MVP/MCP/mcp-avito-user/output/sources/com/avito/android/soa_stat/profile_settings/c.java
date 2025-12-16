package com.avito.android.soa_stat.profile_settings;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SoaStatIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f284076a;

    public c(C30102l3 c30102l3) {
        this.f284076a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f284076a.get());
    }
}
