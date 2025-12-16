package com.avito.android.installmentsblock.mvi;

import com.avito.android.installments_block.entity.InstallmentsBlock;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsBlockBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f172996a;

    public g(dagger.internal.l lVar) {
        this.f172996a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((InstallmentsBlock) this.f172996a.f393949a);
    }
}
