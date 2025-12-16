package com.avito.android.developments_agency_search.deeplink;

import Qw.InterfaceC14939a;
import android.content.res.Resources;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import rw.C47925c;
import rw.InterfaceC47923a;

/* compiled from: RealtyAgencySearchLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f136474a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f136475b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f136476c;

    /* renamed from: d, reason: collision with root package name */
    public final C47925c f136477d;

    /* renamed from: e, reason: collision with root package name */
    public final Xu.c f136478e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC14939a> f136479f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f136480g;

    public w(dv.b bVar, dv.b bVar2, dv.b bVar3, C47925c c47925c, Xu.c cVar, Provider provider, Provider provider2) {
        this.f136474a = bVar;
        this.f136475b = bVar2;
        this.f136476c = bVar3;
        this.f136477d = c47925c;
        this.f136478e = cVar;
        this.f136479f = provider;
        this.f136480g = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v((a.InterfaceC4053a) this.f136474a.get(), (a.g) this.f136475b.get(), (a.i) this.f136476c.get(), (InterfaceC47923a) this.f136477d.get(), (Resources) this.f136478e.get(), this.f136479f.get(), this.f136480g.get());
    }
}
