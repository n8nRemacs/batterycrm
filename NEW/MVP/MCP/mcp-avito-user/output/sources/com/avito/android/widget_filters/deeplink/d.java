package com.avito.android.widget_filters.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WidgetFiltersLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f329759a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f329760b;

    /* renamed from: c, reason: collision with root package name */
    public final KP0.b f329761c;

    /* renamed from: d, reason: collision with root package name */
    public final u f329762d;

    public d(dv.b bVar, dv.b bVar2, KP0.b bVar3, u uVar) {
        this.f329759a = bVar;
        this.f329760b = bVar2;
        this.f329761c = bVar3;
        this.f329762d = uVar;
    }

    public static d a(dv.b bVar, dv.b bVar2, KP0.b bVar3, u uVar) {
        return new d(bVar, bVar2, bVar3, uVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f329759a.get(), (a.b) this.f329760b.get(), (KP0.a) this.f329761c.get(), (R0) this.f329762d.get());
    }
}
