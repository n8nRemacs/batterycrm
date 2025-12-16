package eA;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileCarouselAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f395004a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f395005b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f395006c;

    public c(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f395004a = provider;
        this.f395005b = provider2;
        this.f395006c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f395004a.get(), this.f395005b.get(), (String) this.f395006c.f393949a);
    }
}
