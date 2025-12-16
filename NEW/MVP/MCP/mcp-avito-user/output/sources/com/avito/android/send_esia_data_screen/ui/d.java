package com.avito.android.send_esia_data_screen.ui;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SendEsiaDataIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f268299a;

    public d(C30102l3 c30102l3) {
        this.f268299a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Context) this.f268299a.get());
    }
}
