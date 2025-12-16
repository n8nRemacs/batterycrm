package com.avito.android.publish.slots.anonymous_number;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneProtectionModule_ProvidePhonesCardBlueprint$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<com.avito.android.phone_protection_info.item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.phone_protection_info.item.e> f243071a;

    public r(Provider<com.avito.android.phone_protection_info.item.e> provider) {
        this.f243071a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.phone_protection_info.item.e eVar = this.f243071a.get();
        q.f243070a.getClass();
        return new com.avito.android.phone_protection_info.item.a(eVar);
    }
}
