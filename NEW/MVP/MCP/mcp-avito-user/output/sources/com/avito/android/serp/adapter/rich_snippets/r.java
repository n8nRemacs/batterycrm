package com.avito.android.serp.adapter.rich_snippets;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerInfoParamsFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f270889a;

    public r(dagger.internal.l lVar) {
        this.f270889a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new q((Resources) this.f270889a.f393949a);
    }
}
