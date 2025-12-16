package com.avito.android.publish.slots.cpa_ddu_upload;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpaReassignmentSlotBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f243352a;

    public d(Provider<e> provider) {
        this.f243352a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f243352a.get());
    }
}
