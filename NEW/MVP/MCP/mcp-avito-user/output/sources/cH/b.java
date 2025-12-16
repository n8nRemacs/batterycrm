package CH;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigShiftCancelAnalyticsSender_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f2072a;

    public b(Provider<InterfaceC28373a> provider) {
        this.f2072a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f2072a.get());
    }
}
