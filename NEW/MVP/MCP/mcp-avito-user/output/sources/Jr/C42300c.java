package jR;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.leasing_calculator.m;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LeasingCalculatorAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: jR.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42300c implements h<C42299b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f405615a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f405616b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<m> f405617c;

    public C42300c(Provider<InterfaceC28373a> provider, Provider<E> provider2, Provider<m> provider3) {
        this.f405615a = provider;
        this.f405616b = provider2;
        this.f405617c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42299b(this.f405615a.get(), this.f405616b.get(), this.f405617c.get());
    }
}
