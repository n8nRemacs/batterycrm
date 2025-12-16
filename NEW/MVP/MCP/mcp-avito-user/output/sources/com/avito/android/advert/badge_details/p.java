package com.avito.android.advert.badge_details;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BadgeDetailsResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f68810a;

    public p(dagger.internal.l lVar) {
        this.f68810a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((Resources) this.f68810a.f393949a);
    }
}
