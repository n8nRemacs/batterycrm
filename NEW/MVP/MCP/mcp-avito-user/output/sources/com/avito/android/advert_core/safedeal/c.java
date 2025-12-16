package com.avito.android.advert_core.safedeal;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MyAdvertSafeDealResourceProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f84186a;

    public c(dagger.internal.l lVar) {
        this.f84186a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Resources) this.f84186a.f393949a);
    }
}
