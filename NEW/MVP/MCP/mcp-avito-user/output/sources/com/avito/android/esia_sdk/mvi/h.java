package com.avito.android.esia_sdk.mvi;

import Lz.C14460d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EsiaSdkFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f148149a;

    /* renamed from: b, reason: collision with root package name */
    public final j f148150b;

    public h(e eVar, j jVar) {
        this.f148149a = eVar;
        this.f148150b = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g("EsiaSdk", C14460d.f10329a, new f((d) this.f148149a.get(), (i) this.f148150b.get()));
    }
}
