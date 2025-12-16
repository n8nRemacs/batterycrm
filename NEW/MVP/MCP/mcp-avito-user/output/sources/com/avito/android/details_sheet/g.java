package com.avito.android.details_sheet;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DetailsSheetDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final k f135951a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f135952b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f135953c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f135954d;

    public g(k kVar, dv.b bVar, dagger.internal.f fVar, dv.b bVar2) {
        this.f135951a = kVar;
        this.f135952b = bVar;
        this.f135953c = fVar;
        this.f135954d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((h) this.f135951a.get(), (a.InterfaceC4053a) this.f135952b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f135953c.get(), (a.b) this.f135954d.get());
    }
}
