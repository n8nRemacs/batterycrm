package com.avito.android.edit_address.mvi;

import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditAddressBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f145954a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f145955b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f145956c;

    public d(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f145954a = lVar;
        this.f145955b = lVar2;
        this.f145956c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f145954a.f393949a, (ExtendedProfilesSettingsAddress) this.f145955b.f393949a, ((Boolean) this.f145956c.f393949a).booleanValue());
    }
}
