package com.avito.android.user_address.deeplink;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: UserAddressIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f307243a;

    public m(C30102l3 c30102l3) {
        this.f307243a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((Context) this.f307243a.get());
    }
}
