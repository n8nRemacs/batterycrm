package com.avito.android.advert.item.icebreakers.services_redesign;

import com.avito.android.advert.item.icebreakers.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IceBreakersServicesRedesignBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f76511a;

    public b(Provider<d> provider) {
        this.f76511a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f76511a.get());
    }
}
