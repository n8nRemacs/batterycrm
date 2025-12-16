package com.avito.android.passport.profile_add.create_flow;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import vM0.InterfaceC49236c;

/* compiled from: ProfileCreateExtendedAsyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.d f211350a;

    /* renamed from: b, reason: collision with root package name */
    public final vM0.d f211351b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f211352c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f211353d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f211354e;

    /* renamed from: f, reason: collision with root package name */
    public final r60.f f211355f;

    public c(com.avito.android.passport.profile_add.d dVar, vM0.d dVar2, dv.b bVar, C25721c c25721c, dv.b bVar2, r60.f fVar) {
        this.f211350a = dVar;
        this.f211351b = dVar2;
        this.f211352c = bVar;
        this.f211353d = c25721c;
        this.f211354e = bVar2;
        this.f211355f = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.passport.profile_add.b) this.f211350a.get(), (InterfaceC49236c) this.f211351b.get(), (a.InterfaceC4053a) this.f211352c.get(), (C25719a) this.f211353d.get(), (a.b) this.f211354e.get(), (r60.d) this.f211355f.get());
    }
}
