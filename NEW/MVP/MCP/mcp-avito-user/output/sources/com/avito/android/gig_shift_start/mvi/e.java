package com.avito.android.gig_shift_start.mvi;

import com.avito.android.gig_shift_start.ui.GigShiftStartOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigShiftStartActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f160795a;

    /* renamed from: b, reason: collision with root package name */
    public final FH.b f160796b;

    public e(dagger.internal.l lVar, FH.b bVar) {
        this.f160795a = lVar;
        this.f160796b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((GigShiftStartOpenParams) this.f160795a.f393949a, (FH.a) this.f160796b.get());
    }
}
