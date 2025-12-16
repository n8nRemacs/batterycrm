package com.avito.android.tns_gallery.di;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TnsGalleryItemModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f301532a;

    public d(e eVar) {
        this.f301532a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f301532a.get();
        int i12 = c.f301531a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
