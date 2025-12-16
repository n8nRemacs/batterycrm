package com.avito.android.short_term_rent.bookingform;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BookingFormIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f281445a;

    public h(C30102l3 c30102l3) {
        this.f281445a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Context) this.f281445a.get());
    }
}
