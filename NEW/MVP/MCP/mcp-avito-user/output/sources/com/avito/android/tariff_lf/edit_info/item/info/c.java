package com.avito.android.tariff_lf.edit_info.item.info;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InfoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299006a;

    public c(u uVar) {
        this.f299006a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f299006a.get());
    }
}
