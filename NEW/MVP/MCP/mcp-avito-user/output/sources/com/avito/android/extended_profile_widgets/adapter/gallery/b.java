package com.avito.android.extended_profile_widgets.adapter.gallery;

import android.app.Activity;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GalleryItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f154399a;

    /* renamed from: b, reason: collision with root package name */
    public final l f154400b;

    public b(l lVar, u uVar) {
        this.f154399a = uVar;
        this.f154400b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f154399a.get(), (Activity) this.f154400b.f393949a);
    }
}
