package com.avito.android.video_picker.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VideoPickerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f325976a;

    /* renamed from: b, reason: collision with root package name */
    public final g f325977b;

    /* renamed from: c, reason: collision with root package name */
    public final i f325978c;

    public e(b bVar, g gVar, i iVar) {
        this.f325976a = bVar;
        this.f325977b = gVar;
        this.f325978c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f325976a.getClass();
        a aVar = new a();
        this.f325977b.getClass();
        f fVar = new f();
        this.f325978c.getClass();
        h hVar = new h();
        fN0.d.f395875b.getClass();
        return new d("VideoPicker", fN0.d.f395876c, new c(aVar, hVar, fVar));
    }
}
