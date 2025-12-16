package FH;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigStartShiftAnalyticsSender_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f4654a;

    public b(Provider<InterfaceC28373a> provider) {
        this.f4654a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f4654a.get());
    }
}
