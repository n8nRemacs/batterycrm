package com.avito.android.comparison;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComparisonResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f123910a;

    public g(dagger.internal.l lVar) {
        this.f123910a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Resources) this.f123910a.f393949a);
    }
}
