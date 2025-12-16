package com.avito.android.profile_settings_extended.deep_linking;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import l90.o;
import l90.q;

/* compiled from: ExtendedProfileSettingsLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final q f230052a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.profile_settings.d f230053b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f230054c;

    public c(q qVar, com.avito.android.profile_settings.d dVar, dv.b bVar) {
        this.f230052a = qVar;
        this.f230053b = dVar;
        this.f230054c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((o) this.f230052a.get(), (com.avito.android.profile_settings.b) this.f230053b.get(), (a.InterfaceC4053a) this.f230054c.get());
    }
}
