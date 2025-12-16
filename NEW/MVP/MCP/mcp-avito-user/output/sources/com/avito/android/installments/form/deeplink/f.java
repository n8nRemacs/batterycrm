package com.avito.android.installments.form.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.InterfaceC49066a;

/* compiled from: InstallmentsFormShowDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final RN.c f172625a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f172626b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f172627c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Gson> f172628d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC49066a> f172629e;

    public f(RN.c cVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f172625a = cVar;
        this.f172626b = bVar;
        this.f172627c = bVar2;
        this.f172628d = provider;
        this.f172629e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((RN.a) this.f172625a.get(), (a.InterfaceC4053a) this.f172626b.get(), (a.b) this.f172627c.get(), dagger.internal.g.b(this.f172628d), this.f172629e.get());
    }
}
