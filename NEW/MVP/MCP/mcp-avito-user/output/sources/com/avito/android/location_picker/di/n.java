package com.avito.android.location_picker.di;

import com.avito.android.U0;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.google.GoogleAvitoMapAttachHelper;
import com.avito.android.avito_map.yandex.YandexAvitoMapAttachHelper;
import com.avito.android.location_picker.di.c;
import javax.inject.Provider;

/* compiled from: LocationPickerModule_ProvideMapAttachHelperFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<AvitoMapAttachHelper> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<U0> f182333a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f182334b;

    public n(dagger.internal.l lVar, Provider provider) {
        this.f182333a = provider;
        this.f182334b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        U0 u0X0 = ((c.C5349c.f) this.f182333a).f182312a.X0();
        boolean zBooleanValue = ((Boolean) this.f182334b.f393949a).booleanValue();
        g.f182320a.getClass();
        return u0X0.v().invoke().booleanValue() ? new YandexAvitoMapAttachHelper(zBooleanValue) : new GoogleAvitoMapAttachHelper();
    }
}
