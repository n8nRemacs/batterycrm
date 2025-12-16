package rz0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C47946b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f437275a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f437276b;

    public c(Provider<InterfaceC28373a> provider, Provider<com.avito.android.analytics.provider.a> provider2) {
        this.f437275a = provider;
        this.f437276b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47946b(this.f437275a.get(), this.f437276b.get());
    }
}
