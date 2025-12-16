package eA;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfilePremiumBannerAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f395015a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f395016b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f395017c;

    public i(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f395015a = provider;
        this.f395016b = provider2;
        this.f395017c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f395015a.get(), this.f395016b.get(), (String) this.f395017c.f393949a);
    }
}
