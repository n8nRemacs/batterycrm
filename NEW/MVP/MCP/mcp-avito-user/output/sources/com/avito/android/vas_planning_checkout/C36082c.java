package com.avito.android.vas_planning_checkout;

import android.content.res.Resources;

/* compiled from: ResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.vas_planning_checkout.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36082c implements dagger.internal.h<C36081b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f322819a;

    public C36082c(dagger.internal.l lVar) {
        this.f322819a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C36081b((Resources) this.f322819a.f393949a);
    }
}
