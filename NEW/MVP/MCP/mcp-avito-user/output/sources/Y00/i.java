package Y00;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: MortgageRootAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<C18247h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f19232a;

    public i(Provider<InterfaceC28373a> provider) {
        this.f19232a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C18247h(this.f19232a.get());
    }
}
