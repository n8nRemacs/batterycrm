package com.avito.android.extended_profile_adverts.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.SearchParams;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import qA.InterfaceC47264a;

/* compiled from: ProfileAdvertsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f150913a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f150914b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f150915c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f150916d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f150917e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_adverts.d> f150918f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f150919g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f150920h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<E> f150921i;

    /* renamed from: j, reason: collision with root package name */
    public final u f150922j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC47264a> f150923k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f150924l;

    public e(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5, Provider provider, Provider provider2, Provider provider3, Provider provider4, u uVar, Provider provider5, dagger.internal.l lVar6) {
        this.f150913a = lVar;
        this.f150914b = lVar2;
        this.f150915c = lVar3;
        this.f150916d = lVar4;
        this.f150917e = lVar5;
        this.f150918f = provider;
        this.f150919g = provider2;
        this.f150920h = provider3;
        this.f150921i = provider4;
        this.f150922j = uVar;
        this.f150923k = provider5;
        this.f150924l = lVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((String) this.f150913a.f393949a, (String) this.f150914b.f393949a, ((Boolean) this.f150915c.f393949a).booleanValue(), (String) this.f150916d.f393949a, (String) this.f150917e.f393949a, this.f150918f.get(), this.f150919g.get(), this.f150920h.get(), this.f150921i.get(), (com.avito.android.advert_collection_toast.b) this.f150922j.get(), this.f150923k.get(), (SearchParams) this.f150924l.f393949a);
    }
}
