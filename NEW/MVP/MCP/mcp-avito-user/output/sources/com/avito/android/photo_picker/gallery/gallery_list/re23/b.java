package com.avito.android.photo_picker.gallery.gallery_list.re23;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishGalleryItemBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.gallery.gallery_list.c> f219557a;

    /* renamed from: b, reason: collision with root package name */
    public final l f219558b;

    public b(l lVar, Provider provider) {
        this.f219557a = provider;
        this.f219558b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f219557a.get(), ((Boolean) this.f219558b.f393949a).booleanValue());
    }
}
