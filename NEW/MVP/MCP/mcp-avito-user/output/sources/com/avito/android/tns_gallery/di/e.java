package com.avito.android.tns_gallery.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TnsGalleryItemModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301533a;

    public e(u uVar) {
        this.f301533a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tns_gallery.f fVar = (com.avito.android.tns_gallery.f) this.f301533a.get();
        int i12 = c.f301531a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.tns_gallery.b(fVar));
        return c10493a.a();
    }
}
