package com.avito.android.extended_profile.deep_linking;

import com.avito.android.C28727b1;
import com.avito.android.Z0;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.extended_profile.C30479q;
import com.avito.android.extended_profile.InterfaceC30476n;
import com.google.gson.Gson;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublicProfileLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30479q f149510a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f149511b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f149512c;

    /* renamed from: d, reason: collision with root package name */
    public final C28727b1 f149513d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Gson> f149514e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.f f149515f;

    public c(C30479q c30479q, dv.b bVar, dv.b bVar2, C28727b1 c28727b1, Provider provider, dagger.internal.f fVar) {
        this.f149510a = c30479q;
        this.f149511b = bVar;
        this.f149512c = bVar2;
        this.f149513d = c28727b1;
        this.f149514e = provider;
        this.f149515f = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC30476n) this.f149510a.get(), (a.InterfaceC4053a) this.f149511b.get(), (a.b) this.f149512c.get(), (Z0) this.f149513d.get(), this.f149514e.get(), (com.avito.android.deep_linking.x) this.f149515f.get());
    }
}
