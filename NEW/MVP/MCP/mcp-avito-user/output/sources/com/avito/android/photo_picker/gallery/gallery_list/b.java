package com.avito.android.photo_picker.gallery.gallery_list;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryItemBluePrint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f219529a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f219530b;

    public b(dagger.internal.l lVar, Provider provider) {
        this.f219529a = provider;
        this.f219530b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f219529a.get(), ((Boolean) this.f219530b.f393949a).booleanValue());
    }
}
