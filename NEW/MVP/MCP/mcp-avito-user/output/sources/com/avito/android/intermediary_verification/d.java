package com.avito.android.intermediary_verification;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IntermediaryVerificationIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f173087a;

    public d(C30102l3 c30102l3) {
        this.f173087a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Context) this.f173087a.get());
    }
}
