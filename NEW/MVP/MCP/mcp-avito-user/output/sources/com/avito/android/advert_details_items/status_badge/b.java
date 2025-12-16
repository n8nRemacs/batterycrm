package com.avito.android.advert_details_items.status_badge;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsClosingReasonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f85710a;

    public b(u uVar) {
        this.f85710a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f85710a.get());
    }
}
