package uw;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.developments_agency_search.screen.big_filters.BigFiltersArguments;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BigFiltersAnalyticsHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<C49121c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f440333a;

    /* renamed from: b, reason: collision with root package name */
    public final l f440334b;

    /* renamed from: c, reason: collision with root package name */
    public final u f440335c;

    public d(l lVar, u uVar, Provider provider) {
        this.f440333a = provider;
        this.f440334b = lVar;
        this.f440335c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C49121c(this.f440333a.get(), (BigFiltersArguments) this.f440334b.f393949a, (com.avito.android.developments_agency_search.analytics.a) this.f440335c.get());
    }
}
