package com.avito.android.beduin.v2.onboarding.impl.deeplinks;

import com.avito.android.remote.InterfaceC34389t0;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2OnboardingDeepLinkHandlerInteractor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/deeplinks/i;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/onboarding/impl/deeplinks/h;", "a", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f104718c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC34389t0> f104719a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f104720b;

    /* compiled from: BeduinV2OnboardingDeepLinkHandlerInteractor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/deeplinks/i$a;", "", "<init>", "()V", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k Provider<InterfaceC34389t0> provider, @Y61.k Provider<R0> provider2) {
        this.f104719a = provider;
        this.f104720b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34389t0 interfaceC34389t0 = this.f104719a.get();
        R0 r02 = this.f104720b.get();
        f104718c.getClass();
        return new h(interfaceC34389t0, r02);
    }
}
