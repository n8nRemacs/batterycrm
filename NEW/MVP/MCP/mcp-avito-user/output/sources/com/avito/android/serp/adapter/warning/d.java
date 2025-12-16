package com.avito.android.serp.adapter.warning;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SerpWarningItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f273726a;

    public d(u uVar) {
        this.f273726a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((f) this.f273726a.get());
    }
}
