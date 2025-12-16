package com.avito.android.user_address.map.di;

import com.avito.android.U0;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.google.GoogleAvitoMapAttachHelper;
import com.avito.android.avito_map.yandex.YandexAvitoMapAttachHelper;
import com.avito.android.user_address.map.di.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAddressMapModule_ProvideMapAttachHelperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<AvitoMapAttachHelper> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<U0> f307553a;

    public e(Provider<U0> provider) {
        this.f307553a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        U0 u0X0 = ((a.c.f) this.f307553a).f307548a.X0();
        d.f307552a.getClass();
        return u0X0.v().invoke().booleanValue() ? new YandexAvitoMapAttachHelper(true) : new GoogleAvitoMapAttachHelper();
    }
}
