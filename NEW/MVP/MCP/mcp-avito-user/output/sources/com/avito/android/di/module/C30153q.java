package com.avito.android.di.module;

import com.avito.android.di.module.C30142p;
import com.avito.android.util.InterfaceC35950u;
import javax.inject.Provider;

/* compiled from: AdjustTokenModule_ProvideAdjustAppTokenFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30153q implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35950u> f144530a;

    public C30153q(Provider<InterfaceC35950u> provider) {
        this.f144530a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35950u interfaceC35950u = this.f144530a.get();
        int i12 = C30142p.f144506a;
        int i13 = C30142p.a.f144507a[interfaceC35950u.p().ordinal()];
        return i13 != 1 ? i13 != 2 ? "3ihxlnl1sha8" : "PREINSTALLS_APP_TOKEN_PLACEHOLDER" : "yeufmjpbrytc";
    }
}
