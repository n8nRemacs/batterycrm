package com.avito.android.extended_profile_serp;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: ExtendedProfileSerpIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile_serp.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30551n implements dagger.internal.h<C30549l> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f153068a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.O f153069b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.extended_profile_tabs.h f153070c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.navigation.c f153071d;

    /* renamed from: e, reason: collision with root package name */
    public final gD.h f153072e;

    public C30551n(C30102l3 c30102l3, com.avito.android.O o12, com.avito.android.extended_profile_tabs.h hVar, com.avito.android.navigation.c cVar, gD.h hVar2) {
        this.f153068a = c30102l3;
        this.f153069b = o12;
        this.f153070c = hVar;
        this.f153071d = cVar;
        this.f153072e = hVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30549l((Context) this.f153068a.get(), (com.avito.android.L) this.f153069b.get(), (com.avito.android.extended_profile_tabs.e) this.f153070c.get(), (com.avito.android.navigation.a) this.f153071d.get(), (gD.f) this.f153072e.get());
    }
}
