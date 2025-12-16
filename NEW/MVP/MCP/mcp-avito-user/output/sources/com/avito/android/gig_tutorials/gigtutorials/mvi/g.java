package com.avito.android.gig_tutorials.gigtutorials.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigTutorialsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f161155a;

    /* renamed from: b, reason: collision with root package name */
    public final b f161156b;

    /* renamed from: c, reason: collision with root package name */
    public final i f161157c;

    /* renamed from: d, reason: collision with root package name */
    public final k f161158d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f161155a = dVar;
        this.f161156b = bVar;
        this.f161157c = iVar;
        this.f161158d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f161155a.get();
        a aVar = (a) this.f161156b.get();
        this.f161157c.getClass();
        h hVar = new h();
        return new f("GigTutorials", new OH.c(false, false, null, null, null, 31, null), new e(cVar, aVar, (j) this.f161158d.get(), hVar));
    }
}
