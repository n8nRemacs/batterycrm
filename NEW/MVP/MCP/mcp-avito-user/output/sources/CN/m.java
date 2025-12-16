package CN;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.inline_filters.InlineFiltersSource;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InlineFiltersAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f2122a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InlineFiltersSource> f2123b;

    public m(Provider<InterfaceC28373a> provider, Provider<InlineFiltersSource> provider2) {
        this.f2122a = provider;
        this.f2123b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f2122a.get(), this.f2123b.get());
    }
}
