package eA;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSelectionsAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f395025a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f395026b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f395027c;

    public o(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f395025a = provider;
        this.f395026b = provider2;
        this.f395027c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f395025a.get(), this.f395026b.get(), (String) this.f395027c.f393949a);
    }
}
