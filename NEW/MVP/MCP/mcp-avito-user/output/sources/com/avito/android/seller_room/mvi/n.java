package com.avito.android.seller_room.mvi;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: SellerRoomViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final j f268208a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n.a> f268209b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Set<FV0.h>> f268210c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f268211d;

    /* renamed from: e, reason: collision with root package name */
    public final C31151u0 f268212e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<B> f268213f;

    /* renamed from: g, reason: collision with root package name */
    public final C31144q0 f268214g;

    public n(j jVar, Provider provider, Provider provider2, Provider provider3, C31151u0 c31151u0, Provider provider4, C31144q0 c31144q0) {
        this.f268208a = jVar;
        this.f268209b = provider;
        this.f268210c = provider2;
        this.f268211d = provider3;
        this.f268212e = c31151u0;
        this.f268213f = provider4;
        this.f268214g = c31144q0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((i) this.f268208a.get(), this.f268209b.get(), this.f268210c.get(), this.f268211d.get(), (ZS.b) this.f268212e.get(), this.f268213f.get(), (aU0.b) this.f268214g.get());
    }
}
