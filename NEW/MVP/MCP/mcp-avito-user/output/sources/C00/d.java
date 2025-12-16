package c00;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DocumentUploadAnalyticsHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<C26917c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f57605a;

    public d(Provider<InterfaceC28373a> provider) {
        this.f57605a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C26917c(this.f57605a.get());
    }
}
