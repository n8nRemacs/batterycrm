package com.avito.android.success;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuccessIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f291617a;

    public e(C30102l3 c30102l3) {
        this.f291617a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Context) this.f291617a.get());
    }
}
