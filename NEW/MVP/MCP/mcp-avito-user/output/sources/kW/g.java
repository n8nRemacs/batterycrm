package Kw;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RealtyAgencySearchAnalyticsHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f9700a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.analytics.a> f9701b;

    /* renamed from: c, reason: collision with root package name */
    public final l f9702c;

    public g(l lVar, Provider provider, Provider provider2) {
        this.f9700a = provider;
        this.f9701b = provider2;
        this.f9702c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f9700a.get(), this.f9701b.get(), (RealtyAgencySearchArguments) this.f9702c.f393949a);
    }
}
