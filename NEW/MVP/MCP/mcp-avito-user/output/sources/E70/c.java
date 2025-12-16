package e70;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PersonalFiltersAnalyticsImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f394965a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f394965a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f394965a.get());
    }
}
