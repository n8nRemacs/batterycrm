package com.avito.android.service_orders.link;

import Hu0.C14036c;
import Hu0.InterfaceC14034a;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShowServiceOrdersLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f279185a;

    /* renamed from: b, reason: collision with root package name */
    public final C14036c f279186b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f279187c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f279188d;

    public c(dv.b bVar, C14036c c14036c, dv.b bVar2, C25721c c25721c) {
        this.f279185a = bVar;
        this.f279186b = c14036c;
        this.f279187c = bVar2;
        this.f279188d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f279185a.get(), (InterfaceC14034a) this.f279186b.get(), (a.b) this.f279187c.get(), (C25719a) this.f279188d.get());
    }
}
