package com.avito.android.vas_planning;

import androidx.view.InterfaceC23487e;
import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: VasPlanningViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f322513a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f322514b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f322515c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f322516d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<J0> f322517e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f322518f;

    public s(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f322513a = provider;
        this.f322514b = lVar;
        this.f322515c = uVar;
        this.f322516d = provider2;
        this.f322517e = provider3;
        this.f322518f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f322513a.get(), (VasPlanningFragmentArgument) this.f322514b.f393949a, (com.avito.android.vas_planning.domain.k) this.f322515c.get(), this.f322516d.get(), this.f322517e.get(), this.f322518f.get());
    }
}
