package com.avito.android.profile_vk_linking.request_token.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkRequestTokenBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f231376a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f231377b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f231378c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f231376a = lVar;
        this.f231377b = provider;
        this.f231378c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f231376a.f393949a;
        return new c(this.f231378c.get(), this.f231377b.get(), str);
    }
}
