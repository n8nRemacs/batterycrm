package com.avito.android.rating_ui.button.services_redesign;

import com.avito.android.rating_ui.button.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingButtonServicesRedesignItemBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f250002a;

    public b(u uVar) {
        this.f250002a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f250002a.get());
    }
}
