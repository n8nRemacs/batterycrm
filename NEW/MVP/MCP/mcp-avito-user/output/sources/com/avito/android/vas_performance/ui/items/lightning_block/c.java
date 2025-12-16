package com.avito.android.vas_performance.ui.items.lightning_block;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LightningBlockItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f321715a;

    public c(u uVar) {
        this.f321715a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f321715a.get());
    }
}
