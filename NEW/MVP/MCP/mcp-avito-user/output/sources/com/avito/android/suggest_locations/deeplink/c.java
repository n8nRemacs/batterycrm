package com.avito.android.suggest_locations.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.suggest_locations.C35141f;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestLocationsAddressLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C35141f f292294a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f292295b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f292296c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f292297d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f292298e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f292299f;

    public c(C35141f c35141f, dv.b bVar, dv.b bVar2, dv.b bVar3, dv.b bVar4, Provider provider) {
        this.f292294a = c35141f;
        this.f292295b = bVar;
        this.f292296c = bVar2;
        this.f292297d = bVar3;
        this.f292298e = bVar4;
        this.f292299f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC35139d) this.f292294a.get(), (a.InterfaceC4053a) this.f292295b.get(), (a.d) this.f292296c.get(), (a.b) this.f292297d.get(), (a.f) this.f292298e.get(), this.f292299f.get());
    }
}
