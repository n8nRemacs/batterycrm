package wP0;

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

/* compiled from: WalletWebViewModule_Companion_ProvideCookieProviderFactory.java */
@e
@y
@x
/* renamed from: wP0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49550b implements h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B0> f441429a;

    /* renamed from: b, reason: collision with root package name */
    public final d f441430b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f441431c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<H0> f441432d;

    public C49550b(Provider provider, d dVar, Provider provider2, Provider provider3) {
        this.f441429a = provider;
        this.f441430b = dVar;
        this.f441431c = provider2;
        this.f441432d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B0 b02 = this.f441429a.get();
        com.avito.android.cookie_provider.b bVar = (com.avito.android.cookie_provider.b) this.f441430b.get();
        C c12 = this.f441431c.get();
        H0 h02 = this.f441432d.get();
        InterfaceC49549a.f441427a.getClass();
        return new f(Collections.singletonList(b02), bVar, c12, h02);
    }
}
