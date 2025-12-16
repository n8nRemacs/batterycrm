package com.avito.android.gig_shift_action.mvi;

import com.avito.android.gig_shift_action.ui.GigShiftActionOpenParams;

/* compiled from: GigShiftActionBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_shift_action.domain.b f160490a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f160491b;

    public m(com.avito.android.gig_shift_action.domain.b bVar, dagger.internal.l lVar) {
        this.f160490a = bVar;
        this.f160491b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.gig_shift_action.domain.a) this.f160490a.get(), (GigShiftActionOpenParams) this.f160491b.f393949a);
    }
}
