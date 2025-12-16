package MI;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HotelBookingAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f10547a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f10548b;

    public c(Provider<InterfaceC28373a> provider, Provider<E> provider2) {
        this.f10547a = provider;
        this.f10548b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f10548b.get(), this.f10547a.get());
    }
}
