package com.avito.android.gig_slot_show_qr.mvi;

import com.avito.android.gig_slot_show_qr.ui.models.GigSlotShowQrOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigSlotShowQrActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_slot_show_qr.domain.b f160886a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f160887b;

    public c(com.avito.android.gig_slot_show_qr.domain.b bVar, dagger.internal.l lVar) {
        this.f160886a = bVar;
        this.f160887b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.gig_slot_show_qr.domain.a) this.f160886a.get(), (GigSlotShowQrOpenParams) this.f160887b.f393949a);
    }
}
