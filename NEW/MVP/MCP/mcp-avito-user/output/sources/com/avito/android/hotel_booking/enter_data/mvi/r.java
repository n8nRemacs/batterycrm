package com.avito.android.hotel_booking.enter_data.mvi;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EnterDataValidateInputsUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f163593a;

    public r(Provider<R0> provider) {
        this.f163593a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f163593a.get());
    }
}
