package com.avito.android.advert_core.safedeal.di;

import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.advert_core.safedeal.q;
import com.avito.android.advert_core.safedeal.r;
import com.avito.android.advert_core.safedeal.s;
import com.avito.android.advert_core.safedeal.t;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MyAdvertSafeDealServicesModule_ProvideMyAdvertSafeDealServicesViewModel$_avito_advert_core_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final l f84189a;

    /* renamed from: b, reason: collision with root package name */
    public final t f84190b;

    public c(l lVar, t tVar) {
        this.f84189a = lVar;
        this.f84190b = tVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC22983P interfaceC22983P = (InterfaceC22983P) this.f84189a.f393949a;
        s sVar = (s) this.f84190b.get();
        a.f84187a.getClass();
        if (interfaceC22983P instanceof ActivityC22955m) {
            return (q) new P0((T0) interfaceC22983P, sVar).a(r.class);
        }
        if (interfaceC22983P instanceof Fragment) {
            return (q) new P0((T0) interfaceC22983P, sVar).a(r.class);
        }
        throw new IllegalArgumentException("MyAdvertSafeDealServicesModule: the lifecycleOwner's type must be FragmentActivity or Fragment");
    }
}
