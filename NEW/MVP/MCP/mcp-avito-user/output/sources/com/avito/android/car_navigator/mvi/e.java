package com.avito.android.car_navigator.mvi;

import Dm.C13416c;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CarNavigatorFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f115200a;

    /* renamed from: b, reason: collision with root package name */
    public final g f115201b;

    /* renamed from: c, reason: collision with root package name */
    public final i f115202c;

    public e(b bVar, g gVar, i iVar) {
        this.f115200a = bVar;
        this.f115201b = gVar;
        this.f115202c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f115200a.get();
        this.f115201b.getClass();
        f fVar = new f();
        this.f115202c.getClass();
        h hVar = new h();
        C13416c.f3430e.getClass();
        return new d("CarNavigator", C13416c.f3431f, new c(aVar, fVar, hVar));
    }
}
