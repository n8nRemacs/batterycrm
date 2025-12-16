package com.avito.android.extended_profile_universal_widget_edit.create.mvi;

import dagger.internal.x;
import dagger.internal.y;
import hB.C40800c;

/* compiled from: UniversalWidgetCreateFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final b f153766a;

    /* renamed from: b, reason: collision with root package name */
    public final i f153767b;

    /* renamed from: c, reason: collision with root package name */
    public final k f153768c;

    /* renamed from: d, reason: collision with root package name */
    public final d f153769d;

    public g(b bVar, i iVar, k kVar, d dVar) {
        this.f153766a = bVar;
        this.f153767b = iVar;
        this.f153768c = kVar;
        this.f153769d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f153766a.get();
        this.f153767b.getClass();
        h hVar = new h();
        j jVar = (j) this.f153768c.get();
        this.f153769d.getClass();
        return new f("UniversalWidgetCreate", new C40800c(false, null, 3, null), new e(new c(), aVar, jVar, hVar));
    }
}
