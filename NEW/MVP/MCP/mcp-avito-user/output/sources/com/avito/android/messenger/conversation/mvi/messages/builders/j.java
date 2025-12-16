package com.avito.android.messenger.conversation.mvi.messages.builders;

import com.avito.android.U0;
import com.avito.android.messenger.conversation.adapter.C;
import com.avito.android.messenger.conversation.adapter.C31915a;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationMessageDataBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C31915a> f192150a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f192151b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<U0> f192152c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f192153d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f192154e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f192155f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<GeoMarker> f192156g;

    /* renamed from: h, reason: collision with root package name */
    public final u f192157h;

    public j(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f192150a = provider;
        this.f192151b = provider2;
        this.f192152c = provider3;
        this.f192153d = lVar;
        this.f192154e = lVar2;
        this.f192155f = lVar3;
        this.f192156g = provider4;
        this.f192157h = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f192150a.get(), this.f192151b.get(), this.f192152c.get(), (String) this.f192153d.f393949a, (String) this.f192154e.f393949a, (String) this.f192155f.f393949a, this.f192156g.get(), (String) this.f192157h.get());
    }
}
