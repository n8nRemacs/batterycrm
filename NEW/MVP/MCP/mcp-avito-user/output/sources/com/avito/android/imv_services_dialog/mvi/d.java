package com.avito.android.imv_services_dialog.mvi;

import com.avito.android.imv_services_dialog.ImvServicesDialogScreenParams;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvServicesDialogBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f170794a;

    public d(l lVar) {
        this.f170794a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((ImvServicesDialogScreenParams) this.f170794a.f393949a);
    }
}
