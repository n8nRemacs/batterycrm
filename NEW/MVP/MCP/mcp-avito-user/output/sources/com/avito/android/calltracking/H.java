package com.avito.android.calltracking;

import android.content.res.Resources;

/* compiled from: CalltrackingResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f113575a;

    public H(dagger.internal.l lVar) {
        this.f113575a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new G((Resources) this.f113575a.f393949a);
    }
}
