package com.avito.android.beduin.di;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: BeduinConstructorAdvertModule_ProvideConstructorAdvertItemSpanCountProviderImplFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.di.u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28858u implements dagger.internal.h<com.avito.android.constructor_advert.ui.serp.constructor.m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.beduin.context.di.e f104002a;

    public C28858u(com.avito.android.beduin.context.di.e eVar) {
        this.f104002a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f104002a.get();
        C28852n.f103953a.getClass();
        return new com.avito.android.constructor_advert.ui.serp.constructor.m(resources.getInteger(R.integer.serp_columns));
    }
}
