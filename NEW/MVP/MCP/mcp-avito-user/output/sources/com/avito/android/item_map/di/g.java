package com.avito.android.item_map.di;

import com.avito.android.U0;
import com.avito.android.W0;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.google.GoogleAvitoMapAttachHelper;
import com.avito.android.avito_map.yandex.YandexAvitoMapAttachHelper;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemMapModule_ProvideAvitoMapAttachHelperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<AvitoMapAttachHelper> {

    /* renamed from: a, reason: collision with root package name */
    public final W0 f173330a;

    public g(W0 w02) {
        this.f173330a = w02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        U0 u02 = (U0) this.f173330a.get();
        d dVar = d.f173318a;
        return u02.v().invoke().booleanValue() ? new YandexAvitoMapAttachHelper(false, 1, null) : new GoogleAvitoMapAttachHelper();
    }
}
