package G5;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertHotelAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f6350a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f6351b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f6352c;

    public c(l lVar, Provider provider, Provider provider2) {
        this.f6350a = lVar;
        this.f6351b = provider;
        this.f6352c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f6351b.get(), this.f6352c.get(), (String) this.f6350a.f393949a);
    }
}
