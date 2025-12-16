package com.avito.android.realty_agency.checkerboard;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckerboardIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f251208a;

    public m(C30102l3 c30102l3) {
        this.f251208a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Context) this.f251208a.get());
    }
}
