package com.avito.android.vas_planning.remove.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.vas_planning.remove.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPlannerRemoveDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f322485a;

    /* renamed from: b, reason: collision with root package name */
    public final j f322486b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f322487c;

    public b(dv.b bVar, j jVar, dv.b bVar2) {
        this.f322485a = bVar;
        this.f322486b = jVar;
        this.f322487c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f322485a.get(), (com.avito.android.vas_planning.remove.h) this.f322486b.get(), (a.InterfaceC4053a) this.f322487c.get());
    }
}
