package com.avito.android.passport.profile_list_item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileListItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f213638a;

    public c(u uVar) {
        this.f213638a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f213638a.get());
    }
}
