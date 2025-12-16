package com.avito.android.passport.passport_toast;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import k60.C42524a;
import k60.C42526c;

/* compiled from: PassportToastHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C42526c f211150a;

    public d(C42526c c42526c) {
        this.f211150a = c42526c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((C42524a) this.f211150a.get());
    }
}
