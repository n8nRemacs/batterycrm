package com.avito.android.guests_selector.items.adults_stepper;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdultsStepperBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f161461a;

    public b(e eVar) {
        this.f161461a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f161461a.get());
    }
}
