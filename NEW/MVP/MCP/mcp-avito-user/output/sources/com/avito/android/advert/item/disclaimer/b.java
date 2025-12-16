package com.avito.android.advert.item.disclaimer;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsDisclaimerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75214a;

    public b(u uVar) {
        this.f75214a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f75214a.get());
    }
}
