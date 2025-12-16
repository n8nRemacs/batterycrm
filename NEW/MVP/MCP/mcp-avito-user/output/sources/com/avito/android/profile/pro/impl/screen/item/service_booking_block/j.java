package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import com.avito.android.profile.pro.impl.screen.item.service_booking_block.q;
import javax.inject.Provider;

/* compiled from: ProfileProSbBlockItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<m> f223506a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f223507b;

    public j(dagger.internal.l lVar, Provider provider) {
        this.f223506a = provider;
        this.f223507b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f223506a.get(), (q.a) this.f223507b.f393949a);
    }
}
