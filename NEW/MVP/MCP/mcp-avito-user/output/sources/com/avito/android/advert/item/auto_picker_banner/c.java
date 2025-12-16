package com.avito.android.advert.item.auto_picker_banner;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoPickerBannerAnalyticsImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f72978a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f72979b;

    public c(dagger.internal.l lVar, Provider provider) {
        this.f72978a = provider;
        this.f72979b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f72978a.get(), (String) this.f72979b.f393949a);
    }
}
