package com.avito.android.gig_shift_action.mvi;

import com.avito.android.gig_shift_action.ui.GigShiftActionOpenParams;

/* compiled from: GigShiftActionActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_shift_action.domain.b f160485a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f160486b;

    /* renamed from: c, reason: collision with root package name */
    public final AH.b f160487c;

    public k(com.avito.android.gig_shift_action.domain.b bVar, dagger.internal.l lVar, AH.b bVar2) {
        this.f160485a = bVar;
        this.f160486b = lVar;
        this.f160487c = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.gig_shift_action.domain.a) this.f160485a.get(), (GigShiftActionOpenParams) this.f160486b.f393949a, (AH.a) this.f160487c.get());
    }
}
