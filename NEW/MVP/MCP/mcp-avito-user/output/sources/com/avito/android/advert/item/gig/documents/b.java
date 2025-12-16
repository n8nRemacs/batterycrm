package com.avito.android.advert.item.gig.documents;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigPersonalInfoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75726a;

    public b(u uVar) {
        this.f75726a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f75726a.get());
    }
}
