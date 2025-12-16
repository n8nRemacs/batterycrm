package m20;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplicationLeadAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<C43867c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f414272a;

    public d(Provider<InterfaceC28373a> provider) {
        this.f414272a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43867c(this.f414272a.get());
    }
}
