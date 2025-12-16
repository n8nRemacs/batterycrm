package com.avito.android.item_report;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemReportHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final i f173872a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f173873b;

    public f(i iVar, dv.b bVar) {
        this.f173872a = iVar;
        this.f173873b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f173872a.get(), (a.InterfaceC4053a) this.f173873b.get());
    }
}
