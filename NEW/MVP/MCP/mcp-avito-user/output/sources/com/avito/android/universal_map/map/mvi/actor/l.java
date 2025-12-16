package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: PointsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f305370a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f305371b;

    /* renamed from: c, reason: collision with root package name */
    public final u f305372c;

    public l(u uVar, u uVar2, Provider provider) {
        this.f305370a = uVar;
        this.f305371b = provider;
        this.f305372c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.universal_map.map_mvi.domain.p) this.f305370a.get(), this.f305371b.get(), (R0) this.f305372c.get());
    }
}
