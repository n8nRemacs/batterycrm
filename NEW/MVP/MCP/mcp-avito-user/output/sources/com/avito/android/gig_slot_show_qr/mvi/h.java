package com.avito.android.gig_slot_show_qr.mvi;

import com.avito.android.gig_slot_show_qr.mvi.o;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigSlotShowQrFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final c f160896a;

    /* renamed from: b, reason: collision with root package name */
    public final l f160897b;

    /* renamed from: c, reason: collision with root package name */
    public final e f160898c;

    /* renamed from: d, reason: collision with root package name */
    public final n f160899d;

    public h(c cVar, l lVar, e eVar, n nVar) {
        this.f160896a = cVar;
        this.f160897b = lVar;
        this.f160898c = eVar;
        this.f160899d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f160896a.get();
        k kVar = (k) this.f160897b.get();
        d dVar = (d) this.f160898c.get();
        this.f160899d.getClass();
        return new g("GigSlotShowQr", o.c.f160917a, new f(bVar, kVar, dVar, new m()));
    }
}
