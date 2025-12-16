package com.avito.android.rating_form.deep_link.rating_model;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.rating_form.o;
import com.avito.android.rating_form.q;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingModelDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f248080a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f248081b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f248082c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f248083d;

    /* renamed from: e, reason: collision with root package name */
    public final q f248084e;

    public c(dv.b bVar, dv.b bVar2, C25721c c25721c, dv.b bVar3, q qVar) {
        this.f248080a = bVar;
        this.f248081b = bVar2;
        this.f248082c = c25721c;
        this.f248083d = bVar3;
        this.f248084e = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f248080a.get(), (a.b) this.f248081b.get(), (C25719a) this.f248082c.get(), (a.i) this.f248083d.get(), (o) this.f248084e.get());
    }
}
