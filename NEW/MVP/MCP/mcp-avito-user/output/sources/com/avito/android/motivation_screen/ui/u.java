package com.avito.android.motivation_screen.ui;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: MotivationIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f206454a;

    public u(C30102l3 c30102l3) {
        this.f206454a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t((Context) this.f206454a.get());
    }
}
