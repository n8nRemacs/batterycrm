package com.avito.android.sx_address.new_address;

import android.content.res.Resources;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SxNewAddressResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f293673a;

    public f(l lVar) {
        this.f293673a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Resources) this.f293673a.f393949a);
    }
}
