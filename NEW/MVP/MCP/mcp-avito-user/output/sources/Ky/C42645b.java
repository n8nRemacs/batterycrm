package kY;

import com.avito.android.H0;
import com.avito.android.cookie_provider.d;
import com.avito.android.cookie_provider.f;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.util.C;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import javax.inject.Provider;

/* compiled from: FinanceMarketplaceModule_Companion_ProvideCookieProviderFactory.java */
@e
@y
@x
/* renamed from: kY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42645b implements h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B0> f406376a;

    /* renamed from: b, reason: collision with root package name */
    public final d f406377b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f406378c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<H0> f406379d;

    public C42645b(Provider provider, d dVar, Provider provider2, Provider provider3) {
        this.f406376a = provider;
        this.f406377b = dVar;
        this.f406378c = provider2;
        this.f406379d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B0 b02 = this.f406376a.get();
        com.avito.android.cookie_provider.b bVar = (com.avito.android.cookie_provider.b) this.f406377b.get();
        C c12 = this.f406378c.get();
        H0 h02 = this.f406379d.get();
        InterfaceC42644a.f406374a.getClass();
        return new f(Collections.singletonList(b02), bVar, c12, h02);
    }
}
