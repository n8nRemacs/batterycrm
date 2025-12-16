package com.avito.android.photo_picker.camera_mvi.mvi;

import com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CameraFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f219247a;

    /* renamed from: b, reason: collision with root package name */
    public final o f219248b;

    /* renamed from: c, reason: collision with root package name */
    public final q f219249c;

    public m(j jVar, o oVar, q qVar) {
        this.f219247a = jVar;
        this.f219248b = oVar;
        this.f219249c = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f219247a.get();
        this.f219248b.getClass();
        n nVar = new n();
        this.f219249c.getClass();
        p pVar = new p();
        CameraState.f219143m.getClass();
        return new l("Camera", CameraState.f219144n, new k(aVar, pVar, nVar));
    }
}
