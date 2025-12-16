package RC;

import ac.C19864a;
import com.avito.android.C29640d;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoritesAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f14196a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f14197b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C29640d> f14198c;

    /* renamed from: d, reason: collision with root package name */
    public final f f14199d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C19864a> f14200e;

    public c(Provider provider, Provider provider2, Provider provider3, f fVar, Provider provider4) {
        this.f14196a = provider;
        this.f14197b = provider2;
        this.f14198c = provider3;
        this.f14199d = fVar;
        this.f14200e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = this.f14196a.get();
        E e12 = this.f14197b.get();
        C29640d c29640d = this.f14198c.get();
        this.f14199d.getClass();
        return new b(interfaceC28373a, e12, c29640d, new com.avito.android.analytics.provider.e(), this.f14200e.get());
    }
}
