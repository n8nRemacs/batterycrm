package com.avito.android.advert.specifications;

import com.avito.android.remote.model.ModelSpecifications;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SpecificationsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f80998a;

    /* renamed from: b, reason: collision with root package name */
    public final u f80999b;

    public f(l lVar, u uVar) {
        this.f80998a = lVar;
        this.f80999b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((ModelSpecifications) this.f80998a.f393949a, (U9.b) this.f80999b.get());
    }
}
