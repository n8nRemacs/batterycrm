package com.avito.android.phone_confirmation;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: PhoneConfirmationIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f215884a;

    public S(C30102l3 c30102l3) {
        this.f215884a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q((Context) this.f215884a.get());
    }
}
