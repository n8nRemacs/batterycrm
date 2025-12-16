package com.avito.android.gig_shift_cancel.mvi;

import com.avito.android.gig_shift_cancel.ui.GigShiftCancelOpenParams;

/* compiled from: GigShiftCancelBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_shift_cancel.domain.b f160656a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f160657b;

    public m(com.avito.android.gig_shift_cancel.domain.b bVar, dagger.internal.l lVar) {
        this.f160656a = bVar;
        this.f160657b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.gig_shift_cancel.domain.a) this.f160656a.get(), (GigShiftCancelOpenParams) this.f160657b.f393949a);
    }
}
