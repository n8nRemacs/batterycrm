package com.avito.android.evidence_request.deeplink;

import cA.InterfaceC26995a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceRequestDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f148222a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.evidence_request.h f148223b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f148224c;

    public b(dv.b bVar, com.avito.android.evidence_request.h hVar, dv.b bVar2) {
        this.f148222a = bVar;
        this.f148223b = hVar;
        this.f148224c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f148222a.get(), (InterfaceC26995a) this.f148223b.get(), (a.InterfaceC4053a) this.f148224c.get());
    }
}
