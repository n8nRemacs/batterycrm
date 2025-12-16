package com.avito.android.auto_evidence_request.deepLink;

import android.app.Application;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoEvidenceRequestDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f95048a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f95049b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f95050c;

    public b(l lVar, dv.b bVar, dv.b bVar2) {
        this.f95048a = lVar;
        this.f95049b = bVar;
        this.f95050c = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Application) this.f95048a.f393949a, (a.InterfaceC4053a) this.f95049b.get(), (a.b) this.f95050c.get());
    }
}
