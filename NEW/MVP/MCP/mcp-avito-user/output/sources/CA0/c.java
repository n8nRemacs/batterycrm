package CA0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SxAddressEntryAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f2045a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f2045a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f2045a.get());
    }
}
