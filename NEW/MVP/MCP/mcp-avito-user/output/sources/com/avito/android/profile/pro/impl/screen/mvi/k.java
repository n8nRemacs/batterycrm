package com.avito.android.profile.pro.impl.screen.mvi;

import com.avito.android.profile.pro.impl.ProfileTabUserType;
import com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.collections.C42784z0;

/* compiled from: ProfileProFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f223720a;

    /* renamed from: b, reason: collision with root package name */
    public final h f223721b;

    /* renamed from: c, reason: collision with root package name */
    public final f f223722c;

    /* renamed from: d, reason: collision with root package name */
    public final m f223723d;

    /* renamed from: e, reason: collision with root package name */
    public final o f223724e;

    public k(dagger.internal.l lVar, h hVar, f fVar, m mVar, o oVar) {
        this.f223720a = lVar;
        this.f223721b = hVar;
        this.f223722c = fVar;
        this.f223723d = mVar;
        this.f223724e = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ProfileTabUserType profileTabUserType = (ProfileTabUserType) this.f223720a.f393949a;
        g gVar = (g) this.f223721b.get();
        a aVar = (a) this.f223722c.get();
        this.f223723d.getClass();
        l lVar = new l();
        n nVar = (n) this.f223724e.get();
        C42784z0 c42784z0 = C42784z0.f406748b;
        ProfileProWidgetsParams.f222673i.getClass();
        return new j("ProfilePro", new D90.d(null, true, null, null, false, c42784z0, null, null, 0, 0, new ProfileProWidgetsParams(null, c42784z0, c42784z0, c42784z0, c42784z0, ProfileTabUserType.f222435c, null), c42784z0, profileTabUserType), new i(gVar, aVar, nVar, lVar));
    }
}
