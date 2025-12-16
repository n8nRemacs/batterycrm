package com.avito.android.advert.item.select.controls.default_type;

import com.avito.android.advert.item.select.controls.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectControlsDefaultBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f79407a;

    public b(d dVar) {
        this.f79407a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.advert.item.select.controls.b) this.f79407a.get());
    }
}
