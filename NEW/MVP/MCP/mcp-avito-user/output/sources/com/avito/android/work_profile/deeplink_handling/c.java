package com.avito.android.work_profile.deeplink_handling;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import fQ0.InterfaceC40329a;

/* compiled from: JobSeekerCvsDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final fQ0.c f330626a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f330627b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f330628c;

    public c(fQ0.c cVar, dv.b bVar, C25721c c25721c) {
        this.f330626a = cVar;
        this.f330627b = bVar;
        this.f330628c = c25721c;
    }

    public static c a(fQ0.c cVar, dv.b bVar, C25721c c25721c) {
        return new c(cVar, bVar, c25721c);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC40329a) this.f330626a.get(), (a.InterfaceC4053a) this.f330627b.get(), (C25719a) this.f330628c.get());
    }
}
