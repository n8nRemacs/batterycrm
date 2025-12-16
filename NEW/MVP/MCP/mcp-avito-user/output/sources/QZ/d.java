package QZ;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplicationsListAnalyticsHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f13757a;

    public d(Provider<InterfaceC28373a> provider) {
        this.f13757a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f13757a.get());
    }
}
