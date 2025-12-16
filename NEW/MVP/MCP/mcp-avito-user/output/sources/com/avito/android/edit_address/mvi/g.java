package com.avito.android.edit_address.mvi;

import dagger.internal.x;
import dagger.internal.y;
import jy.C42446d;

/* compiled from: EditAddressFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f145961a;

    /* renamed from: b, reason: collision with root package name */
    public final b f145962b;

    /* renamed from: c, reason: collision with root package name */
    public final i f145963c;

    /* renamed from: d, reason: collision with root package name */
    public final n f145964d;

    public g(d dVar, b bVar, i iVar, n nVar) {
        this.f145961a = dVar;
        this.f145962b = bVar;
        this.f145963c = iVar;
        this.f145964d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f145961a.get();
        a aVar = (a) this.f145962b.get();
        this.f145963c.getClass();
        h hVar = new h();
        m mVar = (m) this.f145964d.get();
        C42446d.f405933c.getClass();
        return new f("EditAddress", C42446d.f405934d, new e(cVar, aVar, mVar, hVar));
    }
}
