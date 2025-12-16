package com.avito.android.rating_form.deep_link.rating_form;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.rating_form.o;
import com.avito.android.rating_form.q;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f248064a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f248065b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f248066c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f248067d;

    /* renamed from: e, reason: collision with root package name */
    public final q f248068e;

    /* renamed from: f, reason: collision with root package name */
    public final f f248069f;

    public d(dv.b bVar, dv.b bVar2, C25721c c25721c, dv.b bVar3, q qVar, f fVar) {
        this.f248064a = bVar;
        this.f248065b = bVar2;
        this.f248066c = c25721c;
        this.f248067d = bVar3;
        this.f248068e = qVar;
        this.f248069f = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f248064a.get(), (a.b) this.f248065b.get(), (C25719a) this.f248066c.get(), (a.i) this.f248067d.get(), (o) this.f248068e.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f248069f.get());
    }
}
