package com.avito.android.advert_details_items.description.services_redesign;

import com.avito.android.advert_details_items.description.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsDescriptionServicesRedesignBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f84649a;

    public b(u uVar) {
        this.f84649a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f84649a.get());
    }
}
