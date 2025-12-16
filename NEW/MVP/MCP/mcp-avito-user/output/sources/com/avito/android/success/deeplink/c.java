package com.avito.android.success.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuccessDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.success.e f291582a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f291583b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f291584c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f291585d;

    /* renamed from: e, reason: collision with root package name */
    public final f f291586e;

    public c(com.avito.android.success.e eVar, dv.b bVar, C25721c c25721c, dv.b bVar2, f fVar) {
        this.f291582a = eVar;
        this.f291583b = bVar;
        this.f291584c = c25721c;
        this.f291585d = bVar2;
        this.f291586e = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.success.c) this.f291582a.get(), (a.InterfaceC4053a) this.f291583b.get(), (C25719a) this.f291584c.get(), (a.b) this.f291585d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f291586e.get());
    }
}
