package com.avito.android.di;

import com.avito.android.H0;
import com.avito.android.remote.interceptor.InterfaceC34284h;
import com.avito.android.remote.interceptor.J0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import okhttp3.HttpUrl;

/* compiled from: SessionRefresherModule_ProvideSessionInterceptorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class T implements dagger.internal.h<J0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f139260a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.session_refresh.l> f139261b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<H0> f139262c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.A f139263d;

    public T(dagger.internal.A a12, Provider provider, Provider provider2, Provider provider3) {
        this.f139260a = provider;
        this.f139261b = provider2;
        this.f139262c = provider3;
        this.f139263d = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.account.G g12 = this.f139260a.get();
        com.avito.android.session_refresh.l lVar = this.f139261b.get();
        H0 h02 = this.f139262c.get();
        Set set = (Set) this.f139263d.get();
        Q.f139256a.getClass();
        Set<InterfaceC34284h> set2 = set;
        ArrayList arrayList = new ArrayList(C42745f0.q(set2, 10));
        for (InterfaceC34284h interfaceC34284h : set2) {
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            interfaceC34284h.getClass();
            arrayList.add(companion.get("https://staging-www.k.avito.ru/").host());
        }
        return new com.avito.android.session_refresh.h(g12, lVar, C42745f0.h0(Collections.singletonList(HttpUrl.INSTANCE.get(h02.a()).host()), arrayList));
    }
}
