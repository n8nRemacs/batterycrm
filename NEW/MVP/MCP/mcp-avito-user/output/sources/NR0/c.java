package Nr0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalMainAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f11763a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f11763a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f11763a.get());
    }
}
