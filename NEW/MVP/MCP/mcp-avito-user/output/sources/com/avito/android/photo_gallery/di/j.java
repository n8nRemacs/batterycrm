package com.avito.android.photo_gallery.di;

import W70.c;

/* compiled from: GalleryTrackerModule_ProvideGalleryTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<W70.c> {

    /* renamed from: a, reason: collision with root package name */
    public final W70.e f217027a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f217028b;

    public j(W70.e eVar, dagger.internal.l lVar) {
        this.f217027a = eVar;
        this.f217028b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f217028b.f393949a).booleanValue();
        int i12 = i.f217026a;
        Object obj = zBooleanValue ? (W70.c) this.f217027a.get() : c.a.f17752a;
        dagger.internal.t.d(obj);
        return obj;
    }
}
