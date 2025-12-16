package com.avito.android.section;

import android.content.res.Resources;

/* compiled from: SectionResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f264961a;

    public y(dagger.internal.l lVar) {
        this.f264961a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new x((Resources) this.f264961a.f393949a);
    }
}
