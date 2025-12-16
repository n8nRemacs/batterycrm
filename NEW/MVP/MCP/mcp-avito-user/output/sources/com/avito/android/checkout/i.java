package com.avito.android.checkout;

import com.avito.android.checkout.mvi.l;
import com.avito.android.checkout.mvi.m;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CheckoutViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final m f118331a;

    public i(m mVar) {
        this.f118331a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f118331a.get();
        i2.f411430a.getClass();
        return new h(lVar, i2.a.f411433c);
    }
}
