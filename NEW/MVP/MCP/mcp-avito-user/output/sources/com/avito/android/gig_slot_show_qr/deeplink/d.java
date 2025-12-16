package com.avito.android.gig_slot_show_qr.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_slot_show_qr.ui.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigSlotShowQrDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f160866a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f160867b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.gig_slot_show_qr.ui.h f160868c;

    public d(dv.b bVar, dv.b bVar2, com.avito.android.gig_slot_show_qr.ui.h hVar) {
        this.f160866a = bVar;
        this.f160867b = bVar2;
        this.f160868c = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f160866a.get(), (a.b) this.f160867b.get(), (f) this.f160868c.get());
    }
}
