package com.avito.android.advert.item.gig.duties;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsDutiesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75744a;

    public c(u uVar) {
        this.f75744a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f75744a.get());
    }
}
