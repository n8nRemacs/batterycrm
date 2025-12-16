package com.avito.android.photo_picker.gallery.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryPickerModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f219493a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f219494b;

    public e(u uVar, Provider provider) {
        this.f219493a = uVar;
        this.f219494b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f219493a.get();
        com.avito.konveyor.a aVar2 = this.f219494b.get();
        int i12 = d.f219492a;
        j jVar = new j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
