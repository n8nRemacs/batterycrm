package com.avito.android.rating_form;

import android.content.res.Resources;

/* compiled from: RatingFormResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f249768a;

    public u(dagger.internal.l lVar) {
        this.f249768a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t((Resources) this.f249768a.f393949a);
    }
}
