package com.avito.android.gig_shift_cancel.mvi;

import com.avito.android.gig_shift_cancel.ui.GigShiftCancelOpenParams;

/* compiled from: GigShiftCancelActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_shift_cancel.domain.b f160651a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f160652b;

    /* renamed from: c, reason: collision with root package name */
    public final CH.b f160653c;

    public k(com.avito.android.gig_shift_cancel.domain.b bVar, dagger.internal.l lVar, CH.b bVar2) {
        this.f160651a = bVar;
        this.f160652b = lVar;
        this.f160653c = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.gig_shift_cancel.domain.a) this.f160651a.get(), (GigShiftCancelOpenParams) this.f160652b.f393949a, (CH.a) this.f160653c.get());
    }
}
