package com.avito.android.publish.scanner.mvi;

import dagger.internal.x;
import dagger.internal.y;
import ze0.C50556d;

/* compiled from: ScannerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f239258a;

    /* renamed from: b, reason: collision with root package name */
    public final k f239259b;

    /* renamed from: c, reason: collision with root package name */
    public final i f239260c;

    public g(d dVar, k kVar, i iVar) {
        this.f239258a = dVar;
        this.f239259b = kVar;
        this.f239260c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f239258a.get();
        this.f239259b.getClass();
        j jVar = new j();
        this.f239260c.getClass();
        return new f("Scanner", new C50556d(false), new e(aVar, jVar, new h()));
    }
}
