package com.avito.android.auto_select.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectConfirmationLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f96054a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f96055b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f96056c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f96057d;

    public j(dv.b bVar, dv.b bVar2, dagger.internal.f fVar, C25721c c25721c) {
        this.f96054a = bVar;
        this.f96055b = bVar2;
        this.f96056c = fVar;
        this.f96057d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((a.d) this.f96054a.get(), (a.f) this.f96055b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f96056c.get(), (C25719a) this.f96057d.get());
    }
}
