package com.avito.android.map.di;

import com.avito.android.U0;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.google.GoogleAvitoMapAttachHelper;
import com.avito.android.avito_map.yandex.YandexAvitoMapAttachHelper;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MapModule_ProvideAvitoMapAttachHelperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class t implements dagger.internal.h<AvitoMapAttachHelper> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<U0> f184874a;

    public t(Provider<U0> provider) {
        this.f184874a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        U0 u02 = this.f184874a.get();
        r rVar = r.f184873a;
        return u02.v().invoke().booleanValue() ? new YandexAvitoMapAttachHelper(false, 1, null) : new GoogleAvitoMapAttachHelper();
    }
}
