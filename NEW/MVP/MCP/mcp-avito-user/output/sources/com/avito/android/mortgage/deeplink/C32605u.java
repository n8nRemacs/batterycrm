package com.avito.android.mortgage.deeplink;

import android.content.res.Resources;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: MortgageConsultationDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.mortgage.deeplink.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32605u implements dagger.internal.h<C32604t> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f198894a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f198895b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f198896c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f198897d;

    /* renamed from: e, reason: collision with root package name */
    public final Xu.c f198898e;

    public C32605u(dv.b bVar, dv.b bVar2, dv.b bVar3, C25721c c25721c, Xu.c cVar) {
        this.f198894a = bVar;
        this.f198895b = bVar2;
        this.f198896c = bVar3;
        this.f198897d = c25721c;
        this.f198898e = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32604t((a.d) this.f198894a.get(), (a.e) this.f198895b.get(), (a.i) this.f198896c.get(), (C25719a) this.f198897d.get(), (Resources) this.f198898e.get());
    }
}
