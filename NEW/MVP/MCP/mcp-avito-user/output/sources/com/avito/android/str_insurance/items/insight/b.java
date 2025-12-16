package com.avito.android.str_insurance.items.insight;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrInsuranceInsightBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f288591a;

    public b(e eVar) {
        this.f288591a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f288591a.get());
    }
}
