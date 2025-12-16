package com.avito.android.review_gallery.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReviewGalleryModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f255479a;

    /* renamed from: b, reason: collision with root package name */
    public final l f255480b;

    public h(l lVar, l lVar2) {
        this.f255479a = lVar;
        this.f255480b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f255479a.f393949a;
        r rVar = (r) this.f255480b.f393949a;
        e.f255477a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
