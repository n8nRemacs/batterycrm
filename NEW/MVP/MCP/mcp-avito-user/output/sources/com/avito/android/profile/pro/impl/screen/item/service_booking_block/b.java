package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import com.avito.android.profile.pro.impl.screen.item.service_booking_block.f;
import javax.inject.Provider;

/* compiled from: ProfileProSbBlockActionItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f223484a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f223485b;

    public b(dagger.internal.l lVar, Provider provider) {
        this.f223484a = provider;
        this.f223485b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f223484a.get(), (f.a) this.f223485b.f393949a);
    }
}
