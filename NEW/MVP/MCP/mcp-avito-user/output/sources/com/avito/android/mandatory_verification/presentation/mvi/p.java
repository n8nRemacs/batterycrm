package com.avito.android.mandatory_verification.presentation.mvi;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MandatoryVerificationViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f184808a;

    public p(C30102l3 c30102l3) {
        this.f184808a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((Context) this.f184808a.get());
    }
}
