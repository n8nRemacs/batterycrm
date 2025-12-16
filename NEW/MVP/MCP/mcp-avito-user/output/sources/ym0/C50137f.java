package yM0;

import com.avito.android.H0;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.D0;
import com.avito.android.remote.interceptor.R0;
import java.util.ArrayList;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import om0.C44822b;
import rm0.InterfaceC47681a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideCookieProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50137f implements dagger.internal.h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final D0 f443053a;

    /* renamed from: b, reason: collision with root package name */
    public final R0 f443054b;

    /* renamed from: c, reason: collision with root package name */
    public final C44822b f443055c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.cookie_provider.d f443056d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f443057e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<H0> f443058f;

    public C50137f(D0 d02, R0 r02, C44822b c44822b, com.avito.android.cookie_provider.d dVar, Provider provider, Provider provider2) {
        this.f443053a = d02;
        this.f443054b = r02;
        this.f443055c = c44822b;
        this.f443056d = dVar;
        this.f443057e = provider;
        this.f443058f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B0 b02 = (B0) this.f443053a.get();
        this.f443054b.get();
        InterfaceC47681a interfaceC47681a = (InterfaceC47681a) this.f443055c.get();
        com.avito.android.cookie_provider.c cVar = (com.avito.android.cookie_provider.c) this.f443056d.get();
        com.avito.android.util.C c12 = this.f443057e.get();
        H0 h02 = this.f443058f.get();
        C50134c.f443050a.getClass();
        ArrayList arrayListE0 = C42745f0.e0(interfaceC47681a);
        c12.getF125491k().getClass();
        arrayListE0.add(b02);
        return new com.avito.android.cookie_provider.f(arrayListE0, cVar, c12, h02);
    }
}
