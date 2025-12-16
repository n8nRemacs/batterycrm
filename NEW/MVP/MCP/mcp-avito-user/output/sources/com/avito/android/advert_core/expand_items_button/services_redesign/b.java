package com.avito.android.advert_core.expand_items_button.services_redesign;

import com.avito.android.advert_core.expand_items_button.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExpandItemsButtonServicesRedesignBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f83592a;

    public b(u uVar) {
        this.f83592a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((g) this.f83592a.get());
    }
}
