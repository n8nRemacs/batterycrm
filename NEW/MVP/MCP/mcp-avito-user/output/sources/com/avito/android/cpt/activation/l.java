package com.avito.android.cpt.activation;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f126284a;

    public l(C30102l3 c30102l3) {
        this.f126284a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Context) this.f126284a.get());
    }
}
