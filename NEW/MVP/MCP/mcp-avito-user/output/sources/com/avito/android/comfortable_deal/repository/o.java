package com.avito.android.comfortable_deal.repository;

import dagger.internal.x;
import dagger.internal.y;
import qp.C47424a;
import qp.C47425b;

/* compiled from: PromoRepository_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final C47425b f122628a;

    public o(C47425b c47425b) {
        this.f122628a = c47425b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((C47424a) this.f122628a.get());
    }
}
