package com.avito.android.item_report;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemReportIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f173875a;

    public i(C30102l3 c30102l3) {
        this.f173875a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((Context) this.f173875a.get());
    }
}
