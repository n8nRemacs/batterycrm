package com.avito.android.vas_performance;

import Zx.C19616a;
import android.content.Context;
import ay.C24193b;
import com.avito.android.di.module.C30102l3;

/* compiled from: VasPerformanceIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f319850a;

    /* renamed from: b, reason: collision with root package name */
    public final C24193b f319851b;

    public G(C30102l3 c30102l3, C24193b c24193b) {
        this.f319850a = c30102l3;
        this.f319851b = c24193b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F((Context) this.f319850a.get(), (C19616a) this.f319851b.get());
    }
}
