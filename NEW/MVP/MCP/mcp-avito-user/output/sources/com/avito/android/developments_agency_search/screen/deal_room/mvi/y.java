package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Bw.InterfaceC13195c;
import Qw.InterfaceC14939a;
import android.content.ContentResolver;
import com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments;
import com.avito.android.util.R0;
import javax.inject.Provider;
import sw.InterfaceC48423a;

/* compiled from: DealRoomInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class y implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48423a> f137790a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14939a> f137791b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f137792c;

    /* renamed from: d, reason: collision with root package name */
    public final Ow.e f137793d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ContentResolver> f137794e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f137795f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f137796g;

    public y(Provider provider, Provider provider2, Provider provider3, Ow.e eVar, Provider provider4, dagger.internal.u uVar, dagger.internal.l lVar) {
        this.f137790a = provider;
        this.f137791b = provider2;
        this.f137792c = provider3;
        this.f137793d = eVar;
        this.f137794e = provider4;
        this.f137795f = uVar;
        this.f137796g = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v(this.f137790a.get(), this.f137791b.get(), this.f137792c.get(), (Ow.d) this.f137793d.get(), this.f137794e.get(), (InterfaceC13195c) this.f137795f.get(), (DealRoomArguments) this.f137796g.f393949a);
    }
}
