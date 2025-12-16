package com.avito.android.bundles.ui.recycler.item.benefit;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BundleBenefitItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f108388a;

    public j(u uVar) {
        this.f108388a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((b) this.f108388a.get());
    }
}
