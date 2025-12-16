package com.avito.android.profile_settings_basic.adapter.basic_info;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BasicInfoItemSquareAvatarBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f228635a;

    public l(Provider<c> provider) {
        this.f228635a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f228635a.get());
    }
}
