package com.avito.android.send_esia_data_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import dr0.C39792d;

/* compiled from: SendEsiaDataFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f268281a;

    /* renamed from: b, reason: collision with root package name */
    public final k f268282b;

    /* renamed from: c, reason: collision with root package name */
    public final m f268283c;

    public i(f fVar, k kVar, m mVar) {
        this.f268281a = fVar;
        this.f268282b = kVar;
        this.f268283c = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f268281a.get();
        this.f268282b.getClass();
        j jVar = new j();
        this.f268283c.getClass();
        return new h("SendEsiaDataScreen", new C39792d(false, false, 3, null), new g(eVar, jVar, new l()));
    }
}
