package com.avito.android.tariff.cpa.info;

import com.avito.android.tariff.cpa.info.mvi.k;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpaInfoViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final k f294709a;

    public j(k kVar) {
        this.f294709a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.tariff.cpa.info.mvi.j) this.f294709a.get(), null, 2, null);
    }
}
