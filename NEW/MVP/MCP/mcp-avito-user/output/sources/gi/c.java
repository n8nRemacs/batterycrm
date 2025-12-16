package GI;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HotelAvailableRoomsAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f6411a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f6412b;

    /* renamed from: c, reason: collision with root package name */
    public final u f6413c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f6411a = provider;
        this.f6412b = provider2;
        this.f6413c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f6412b.get(), this.f6411a.get(), (String) this.f6413c.get());
    }
}
