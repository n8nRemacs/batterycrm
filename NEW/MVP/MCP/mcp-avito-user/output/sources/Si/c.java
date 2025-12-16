package SI;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectRadioAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f14890a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f14890a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f14890a.get());
    }
}
