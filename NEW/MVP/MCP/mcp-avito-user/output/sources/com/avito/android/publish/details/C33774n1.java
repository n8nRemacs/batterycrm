package com.avito.android.publish.details;

import android.content.res.Resources;

/* compiled from: PublishDetailsResourceProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.n1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33774n1 implements dagger.internal.h<C33771m1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f234854a;

    public C33774n1(dagger.internal.l lVar) {
        this.f234854a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C33771m1((Resources) this.f234854a.f393949a);
    }
}
