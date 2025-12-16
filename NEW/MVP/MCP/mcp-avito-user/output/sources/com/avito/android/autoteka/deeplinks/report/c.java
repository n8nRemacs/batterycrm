package com.avito.android.autoteka.deeplinks.report;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import yf.m;

/* compiled from: AutotekaReportDeepLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f96305a;

    /* renamed from: b, reason: collision with root package name */
    public final C25721c f96306b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.autoteka.data.d f96307c;

    public c(dv.b bVar, C25721c c25721c, com.avito.android.autoteka.data.d dVar) {
        this.f96305a = bVar;
        this.f96306b = c25721c;
        this.f96307c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f96305a.get(), (C25719a) this.f96306b.get(), (m) this.f96307c.get());
    }
}
