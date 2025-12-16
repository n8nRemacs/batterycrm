package com.avito.android.photo_gallery_carousel.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CarouselPhotoGalleryViewModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f217747a;

    /* renamed from: b, reason: collision with root package name */
    public final A f217748b;

    public f(c cVar, A a12) {
        this.f217747a = cVar;
        this.f217748b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f217748b.get();
        this.f217747a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
