package com.avito.android.gig_slot_show_qr.mvi;

import com.avito.android.gig_slot_show_qr.ui.models.GigSlotShowQrOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigSlotShowQrBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_slot_show_qr.domain.b f160890a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f160891b;

    public e(com.avito.android.gig_slot_show_qr.domain.b bVar, dagger.internal.l lVar) {
        this.f160890a = bVar;
        this.f160891b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.gig_slot_show_qr.domain.a) this.f160890a.get(), (GigSlotShowQrOpenParams) this.f160891b.f393949a);
    }
}
