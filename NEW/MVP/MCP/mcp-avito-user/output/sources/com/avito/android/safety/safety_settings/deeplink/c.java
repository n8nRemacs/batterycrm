package com.avito.android.safety.safety_settings.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import fo0.C40457c;
import fo0.InterfaceC40455a;
import nI0.InterfaceC44261b;
import po0.InterfaceC47119a;

/* compiled from: PasswordChangeAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C40457c f257555a;

    /* renamed from: b, reason: collision with root package name */
    public final nI0.d f257556b;

    /* renamed from: c, reason: collision with root package name */
    public final fo0.g f257557c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f257558d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f257559e;

    /* renamed from: f, reason: collision with root package name */
    public final C25721c f257560f;

    public c(C40457c c40457c, nI0.d dVar, fo0.g gVar, dv.b bVar, dv.b bVar2, C25721c c25721c) {
        this.f257555a = c40457c;
        this.f257556b = dVar;
        this.f257557c = gVar;
        this.f257558d = bVar;
        this.f257559e = bVar2;
        this.f257560f = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC40455a) this.f257555a.get(), (InterfaceC44261b) this.f257556b.get(), (InterfaceC47119a) this.f257557c.get(), (a.InterfaceC4053a) this.f257558d.get(), (a.b) this.f257559e.get(), (C25719a) this.f257560f.get());
    }
}
