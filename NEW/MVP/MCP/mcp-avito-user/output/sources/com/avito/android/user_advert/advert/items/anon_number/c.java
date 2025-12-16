package com.avito.android.user_advert.advert.items.anon_number;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AnonNumberItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309204a;

    public c(u uVar) {
        this.f309204a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f309204a.get());
    }
}
