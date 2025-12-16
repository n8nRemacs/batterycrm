package com.avito.android.extended_profile_adverts.mvi;

import com.avito.android.remote.model.SearchParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileAdvertsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f150932a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f150933b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f150934c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f150935d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f150936e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_adverts.d> f150937f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f150938g;

    public g(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5, dagger.internal.l lVar6, Provider provider) {
        this.f150932a = lVar;
        this.f150933b = lVar2;
        this.f150934c = lVar3;
        this.f150935d = lVar4;
        this.f150936e = lVar5;
        this.f150937f = provider;
        this.f150938g = lVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((String) this.f150932a.f393949a, (String) this.f150933b.f393949a, ((Boolean) this.f150934c.f393949a).booleanValue(), (String) this.f150935d.f393949a, (String) this.f150936e.f393949a, this.f150937f.get(), (SearchParams) this.f150938g.f393949a);
    }
}
