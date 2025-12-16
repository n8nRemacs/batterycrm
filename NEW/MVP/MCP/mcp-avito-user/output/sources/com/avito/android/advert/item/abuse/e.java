package com.avito.android.advert.item.abuse;

import com.avito.android.advert.item.abuse.c;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsAbusePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f72525a;

    public e(dagger.internal.f fVar) {
        this.f72525a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((c.a) this.f72525a.get());
    }
}
