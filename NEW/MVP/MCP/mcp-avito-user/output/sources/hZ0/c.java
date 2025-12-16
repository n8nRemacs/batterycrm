package Hz0;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarAnalyticsTracker_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<com.avito.android.str_seller_orders_calendar.analytics.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f7870a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f7871b;

    public c(Provider<InterfaceC28373a> provider, Provider<E> provider2) {
        this.f7870a = provider;
        this.f7871b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.str_seller_orders_calendar.analytics.a(this.f7871b.get(), this.f7870a.get());
    }
}
