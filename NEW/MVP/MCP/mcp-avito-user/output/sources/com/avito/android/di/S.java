package com.avito.android.di;

import com.avito.android.H0;
import com.avito.android.remote.interceptor.InterfaceC34284h;
import com.avito.android.remote.interceptor.InterfaceC34303q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import okhttp3.HttpUrl;

/* compiled from: SessionRefresherModule_ProvideRequestParamsInterceptorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class S implements dagger.internal.h<InterfaceC34303q0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f139257a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H0> f139258b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.A f139259c;

    public S(Provider provider, Provider provider2, dagger.internal.A a12) {
        this.f139257a = provider;
        this.f139258b = provider2;
        this.f139259c = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f139257a.get();
        H0 h02 = this.f139258b.get();
        Set set = (Set) this.f139259c.get();
        Q.f139256a.getClass();
        Set<InterfaceC34284h> set2 = set;
        ArrayList arrayList = new ArrayList(C42745f0.q(set2, 10));
        for (InterfaceC34284h interfaceC34284h : set2) {
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            interfaceC34284h.getClass();
            arrayList.add(companion.get("https://staging-www.k.avito.ru/").host());
        }
        return new com.avito.android.session_refresh.d(c12, C42745f0.h0(Collections.singletonList(HttpUrl.INSTANCE.get(h02.a()).host()), arrayList), h02.m());
    }
}
