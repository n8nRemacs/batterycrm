package com.avito.android.paid_services_impl;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaidServicesIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f210649a;

    public g(C30102l3 c30102l3) {
        this.f210649a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Context) this.f210649a.get());
    }
}
