package com.avito.android.developments_advice.deeplink;

import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.developments_advice.l;
import com.avito.android.developments_advice.o;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConsultationFormLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f136016a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f136017b;

    /* renamed from: c, reason: collision with root package name */
    public final o f136018c;

    /* renamed from: d, reason: collision with root package name */
    public final O f136019d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f136020e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.f f136021f;

    public b(dv.b bVar, dv.b bVar2, o oVar, O o12, dv.b bVar3, dagger.internal.f fVar) {
        this.f136016a = bVar;
        this.f136017b = bVar2;
        this.f136018c = oVar;
        this.f136019d = o12;
        this.f136020e = bVar3;
        this.f136021f = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f136016a.get(), (a.InterfaceC4053a) this.f136017b.get(), (l) this.f136018c.get(), (L) this.f136019d.get(), (a.i) this.f136020e.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f136021f.get());
    }
}
