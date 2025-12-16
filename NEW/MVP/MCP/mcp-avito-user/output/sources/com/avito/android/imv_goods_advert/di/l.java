package com.avito.android.imv_goods_advert.di;

import androidx.fragment.app.Fragment;
import com.avito.android.imv_goods_advert.di.a;
import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvGoodsAdvertModule_ProvideFragmentDelegateFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<com.avito.android.advert_core.advert.l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f170509a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f170510b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f170509a = lVar;
        this.f170510b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f170509a.f393949a;
        InterfaceC35741a1 interfaceC35741a1 = (InterfaceC35741a1) ((a.c.q) this.f170510b).get();
        f.f170496a.getClass();
        return new com.avito.android.imv_goods_advert.h(fragment, interfaceC35741a1);
    }
}
