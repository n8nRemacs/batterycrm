package com.avito.android.advert_amenities.dialog;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CloseAmenitiesDialogItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f81168a;

    public e(u uVar) {
        this.f81168a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f81168a.get());
    }
}
