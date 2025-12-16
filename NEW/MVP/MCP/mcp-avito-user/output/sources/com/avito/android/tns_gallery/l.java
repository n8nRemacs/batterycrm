package com.avito.android.tns_gallery;

import android.app.Activity;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TnsGalleryItemSizeHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f301546a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f301547b;

    public l(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f301546a = lVar;
        this.f301547b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Activity) this.f301546a.f393949a, (r) this.f301547b.f393949a);
    }
}
