package com.avito.android.phone_reverification_info;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneReverificationInfoItemsConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f216141a;

    public j(Provider<InterfaceC35863o4> provider) {
        this.f216141a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f216141a.get());
    }
}
