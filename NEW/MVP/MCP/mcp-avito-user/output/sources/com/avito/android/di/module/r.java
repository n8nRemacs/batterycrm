package com.avito.android.di.module;

import com.avito.android.di.module.C30142p;
import com.avito.android.util.InterfaceC35950u;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdjustTokenModule_ProvideAdjustDefaultTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class r implements dagger.internal.h<com.avito.android.analytics_adjust.r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35950u> f144551a;

    public r(Provider<InterfaceC35950u> provider) {
        this.f144551a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35950u interfaceC35950u = this.f144551a.get();
        int i12 = C30142p.f144506a;
        switch (C30142p.a.f144507a[interfaceC35950u.p().ordinal()]) {
            case 1:
                return new com.avito.android.analytics_adjust.r(null, false);
            case 2:
                return new com.avito.android.analytics_adjust.r("PREINSTALLS_TRACKER_PLACEHOLDER", true);
            case 3:
                return new com.avito.android.analytics_adjust.r(null, false);
            case 4:
                return new com.avito.android.analytics_adjust.r("iq7kewh", false);
            case 5:
                return new com.avito.android.analytics_adjust.r("gog0yh7", false);
            case 6:
                return new com.avito.android.analytics_adjust.r("tt17rak", false);
            case 7:
                return new com.avito.android.analytics_adjust.r("1bke86ij", false);
            case 8:
                return new com.avito.android.analytics_adjust.r("1bllbcvf", false);
            case 9:
                return new com.avito.android.analytics_adjust.r("1h9k2l70", false);
            case 10:
                return new com.avito.android.analytics_adjust.r("1qy8hqai", false);
            case 11:
                return new com.avito.android.analytics_adjust.r("1qv0wms8", false);
            case 12:
                return new com.avito.android.analytics_adjust.r("1scm44vb", false);
            case 13:
                return new com.avito.android.analytics_adjust.r("1sn4mzow", false);
            case 14:
                return new com.avito.android.analytics_adjust.r("1sqv4dnv", false);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
