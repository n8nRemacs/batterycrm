package com.avito.android.credits;

import com.avito.android.L;
import com.avito.android.O;

/* compiled from: CreditBrokerIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final O f128861a;

    public i(O o12) {
        this.f128861a = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((L) this.f128861a.get());
    }
}
