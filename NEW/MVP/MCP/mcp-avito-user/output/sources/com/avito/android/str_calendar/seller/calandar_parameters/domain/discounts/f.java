package com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DurationDiscountsParameterHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f286945a;

    public f(Provider<InterfaceC35863o4> provider) {
        this.f286945a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f286945a.get());
    }
}
