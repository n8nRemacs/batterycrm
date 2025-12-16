package Hw;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupArguments;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationGroupAnalyticsHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Hw.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14041c implements h<C14040b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f7814a;

    /* renamed from: b, reason: collision with root package name */
    public final u f7815b;

    /* renamed from: c, reason: collision with root package name */
    public final l f7816c;

    public C14041c(l lVar, u uVar, Provider provider) {
        this.f7814a = provider;
        this.f7815b = uVar;
        this.f7816c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C14040b(this.f7814a.get(), (com.avito.android.developments_agency_search.analytics.a) this.f7815b.get(), (LocationGroupArguments) this.f7816c.f393949a);
    }
}
