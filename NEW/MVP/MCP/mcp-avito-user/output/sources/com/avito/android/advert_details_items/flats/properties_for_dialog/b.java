package com.avito.android.advert_details_items.flats.properties_for_dialog;

import com.avito.android.advert_core.advert.k;
import com.avito.android.advert_details_items.flats.c;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: PropertiesBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f84746a;

    /* renamed from: b, reason: collision with root package name */
    public final f f84747b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43617a> f84748c;

    public b(f fVar, u uVar, Provider provider) {
        this.f84746a = uVar;
        this.f84747b = fVar;
        this.f84748c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f84746a.get(), (k) this.f84747b.get(), this.f84748c.get());
    }
}
