package com.avito.android.advert.di;

import androidx.fragment.app.Fragment;
import com.avito.android.C29640d;
import com.avito.android.advert.di.t0;
import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Provider;

/* compiled from: AdvertFragmentModule_ProvideAdvertDetailsFragmentDelegateFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class B implements dagger.internal.h<com.avito.android.advert_core.advert.l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f69071a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f69072b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C29640d> f69073c;

    public B(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f69071a = lVar;
        this.f69072b = provider;
        this.f69073c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f69071a.f393949a;
        InterfaceC35741a1 interfaceC35741a1 = (InterfaceC35741a1) ((t0.b.C27747m0) this.f69072b).get();
        C29640d c29640dQ = ((t0.b.C27722e) this.f69073c).f71015a.Q();
        C27710t.f69463a.getClass();
        return new com.avito.android.advert.item.N(fragment, interfaceC35741a1, c29640dQ);
    }
}
