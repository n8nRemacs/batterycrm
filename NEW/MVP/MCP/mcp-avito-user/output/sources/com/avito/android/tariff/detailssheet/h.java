package com.avito.android.tariff.detailssheet;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffDetailsSheetIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f297424a;

    public h(C30102l3 c30102l3) {
        this.f297424a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Context) this.f297424a.get());
    }
}
