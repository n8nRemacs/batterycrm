package com.avito.android.advert.item.abuse.restyle;

import com.avito.android.advert.item.abuse.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsAbuseBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f72530a;

    public b(u uVar) {
        this.f72530a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f72530a.get());
    }
}
