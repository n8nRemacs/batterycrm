package com.avito.android.short_term_rent;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrBookingIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f282227a;

    public d(dagger.internal.l lVar) {
        this.f282227a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Application) this.f282227a.f393949a);
    }
}
