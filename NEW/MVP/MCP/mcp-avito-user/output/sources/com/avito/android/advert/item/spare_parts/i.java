package com.avito.android.advert.item.spare_parts;

import Nl0.InterfaceC14587a;
import com.avito.android.util.R0;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vx0.InterfaceC49391a;

/* compiled from: SparePartsRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49391a> f80477a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14587a> f80478b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f80479c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f80480d;

    public i(Provider<InterfaceC49391a> provider, Provider<InterfaceC14587a> provider2, Provider<com.avito.android.remote.error.f> provider3, Provider<R0> provider4) {
        this.f80477a = provider;
        this.f80478b = provider2;
        this.f80479c = provider3;
        this.f80480d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(dagger.internal.g.a(w.a(this.f80477a)), dagger.internal.g.a(w.a(this.f80478b)), this.f80479c.get(), this.f80480d.get());
    }
}
