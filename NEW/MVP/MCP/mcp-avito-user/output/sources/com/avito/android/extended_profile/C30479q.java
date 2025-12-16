package com.avito.android.extended_profile;

import android.app.Application;

/* compiled from: ExtendedProfileIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile.q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30479q implements dagger.internal.h<C30477o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f150443a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.O f150444b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.extended_profile_tabs.h f150445c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.navigation.c f150446d;

    /* renamed from: e, reason: collision with root package name */
    public final gD.h f150447e;

    public C30479q(dagger.internal.l lVar, com.avito.android.O o12, com.avito.android.extended_profile_tabs.h hVar, com.avito.android.navigation.c cVar, gD.h hVar2) {
        this.f150443a = lVar;
        this.f150444b = o12;
        this.f150445c = hVar;
        this.f150446d = cVar;
        this.f150447e = hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C30477o((Application) this.f150443a.f393949a, (com.avito.android.L) this.f150444b.get(), (com.avito.android.extended_profile_tabs.e) this.f150445c.get(), (com.avito.android.navigation.a) this.f150446d.get(), (gD.f) this.f150447e.get());
    }
}
