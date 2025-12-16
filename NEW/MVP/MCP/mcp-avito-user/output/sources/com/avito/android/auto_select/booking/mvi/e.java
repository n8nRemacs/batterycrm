package com.avito.android.auto_select.booking.mvi;

import com.avito.android.auto_select.booking.domain.models.AutoSelectConfirmationDialogData;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectBookingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f95842a;

    public e(dagger.internal.l lVar) {
        this.f95842a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((AutoSelectConfirmationDialogData) this.f95842a.f393949a);
    }
}
