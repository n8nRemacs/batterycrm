package c8;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsCachedAnalytics_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f57684a;

    public f(Provider<InterfaceC28373a> provider) {
        this.f57684a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f57684a.get());
    }
}
