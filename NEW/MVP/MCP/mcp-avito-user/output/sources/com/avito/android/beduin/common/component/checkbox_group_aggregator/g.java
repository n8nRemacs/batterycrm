package com.avito.android.beduin.common.component.checkbox_group_aggregator;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckboxGroupAggregatorParametersExtractionStrategy_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f100968a;

    public g(dagger.internal.f fVar) {
        this.f100968a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.b(this.f100968a));
    }
}
