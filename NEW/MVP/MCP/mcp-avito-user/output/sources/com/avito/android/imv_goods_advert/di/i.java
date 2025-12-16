package com.avito.android.imv_goods_advert.di;

import android.app.Application;
import com.avito.android.advert_core.contactbar.C28263b;
import com.avito.android.advert_core.contactbar.InterfaceC28262a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvGoodsAdvertModule_ProvideAdvertActionIconFactory$_avito_imv_goods_advert_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<InterfaceC28262a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f170500a;

    public i(Provider<Application> provider) {
        this.f170500a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f170500a.get();
        f.f170496a.getClass();
        return new C28263b(application, false, 2, null);
    }
}
