package com.avito.android.cpt.mass_activation.deeplink;

import Zx.C19616a;
import ay.C24193b;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMassActivationDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f126500a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f126501b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f126502c;

    /* renamed from: d, reason: collision with root package name */
    public final C24193b f126503d;

    public c(dv.b bVar, dv.b bVar2, dagger.internal.f fVar, C24193b c24193b) {
        this.f126500a = bVar;
        this.f126501b = bVar2;
        this.f126502c = fVar;
        this.f126503d = c24193b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f126500a.get(), (a.f) this.f126501b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f126502c.get(), (C19616a) this.f126503d.get());
    }
}
