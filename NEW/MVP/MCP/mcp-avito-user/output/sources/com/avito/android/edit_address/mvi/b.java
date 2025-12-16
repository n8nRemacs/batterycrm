package com.avito.android.edit_address.mvi;

import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditAddressActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f145945a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f145946b;

    public b(dagger.internal.l lVar, u uVar) {
        this.f145945a = uVar;
        this.f145946b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.edit_address.e) this.f145945a.get(), (ExtendedProfilesSettingsAddress) this.f145946b.f393949a);
    }
}
