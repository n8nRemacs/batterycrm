package com.avito.android.photo_gallery.grid_gallery.di;

import com.avito.android.photo_gallery.grid_gallery.di.e;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;

/* compiled from: GridGalleryModule_NavbarAdapterModule_ProvideNavbarItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f217198a;

    public j(A a12) {
        this.f217198a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f217198a.get();
        e.C6515e.f217189a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
