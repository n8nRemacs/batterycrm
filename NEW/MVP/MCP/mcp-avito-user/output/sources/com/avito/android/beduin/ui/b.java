package com.avito.android.beduin.ui;

import com.avito.android.beduin.ui.universal.j;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinUniversalPageLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f104065a;

    /* renamed from: b, reason: collision with root package name */
    public final j f104066b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f104067c;

    public b(dv.b bVar, j jVar, dv.b bVar2) {
        this.f104065a = bVar;
        this.f104066b = jVar;
        this.f104067c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f104065a.get(), (com.avito.android.beduin.ui.universal.h) this.f104066b.get(), (a.InterfaceC4053a) this.f104067c.get());
    }
}
