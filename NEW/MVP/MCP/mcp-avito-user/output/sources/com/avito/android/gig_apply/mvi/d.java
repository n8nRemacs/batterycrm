package com.avito.android.gig_apply.mvi;

import com.avito.android.gig_apply.ui.GigApplyOpenParams;

/* compiled from: GigApplyActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_apply.domain.d f159720a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f159721b;

    public d(com.avito.android.gig_apply.domain.d dVar, dagger.internal.l lVar) {
        this.f159720a = dVar;
        this.f159721b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.gig_apply.domain.c) this.f159720a.get(), (GigApplyOpenParams) this.f159721b.f393949a);
    }
}
