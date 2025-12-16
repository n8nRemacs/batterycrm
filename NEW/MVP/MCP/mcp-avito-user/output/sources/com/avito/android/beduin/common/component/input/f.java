package com.avito.android.beduin.common.component.input;

import com.avito.android.AbstractC35201t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InputParametersExtractionStrategy_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AbstractC35201t> f101547a;

    public f(Provider<AbstractC35201t> provider) {
        this.f101547a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f101547a.get();
        return new e();
    }
}
