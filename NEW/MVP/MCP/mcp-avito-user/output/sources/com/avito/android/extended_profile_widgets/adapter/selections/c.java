package com.avito.android.extended_profile_widgets.adapter.selections;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectionsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f154903a;

    /* renamed from: b, reason: collision with root package name */
    public final ZB.b f154904b;

    /* renamed from: c, reason: collision with root package name */
    public final u f154905c;

    public c(Provider provider, ZB.b bVar, u uVar) {
        this.f154903a = provider;
        this.f154904b = bVar;
        this.f154905c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f154903a.get(), this.f154904b, (com.avito.konveyor.a) this.f154905c.get());
    }
}
