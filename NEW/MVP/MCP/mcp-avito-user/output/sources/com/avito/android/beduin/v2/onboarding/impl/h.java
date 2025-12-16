package com.avito.android.beduin.v2.onboarding.impl;

import Y61.k;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.l;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2OnboardingViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/h;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/onboarding/impl/f;", "a", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f104743h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<n.a> f104744a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<B> f104745b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<Set<FV0.h>> f104746c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C31144q0 f104747d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<R0> f104748e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l f104749f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C31151u0 f104750g;

    /* compiled from: BeduinV2OnboardingViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/h$a;", "", "<init>", "()V", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@k Provider provider, @k Provider provider2, @k Provider provider3, @k C31144q0 c31144q0, @k Provider provider4, @k l lVar, @k C31151u0 c31151u0) {
        this.f104744a = provider;
        this.f104745b = provider2;
        this.f104746c = provider3;
        this.f104747d = c31144q0;
        this.f104748e = provider4;
        this.f104749f = lVar;
        this.f104750g = c31151u0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVar = this.f104744a.get();
        B b12 = this.f104745b.get();
        Set<FV0.h> set = this.f104746c.get();
        aU0.b bVar = (aU0.b) this.f104747d.get();
        R0 r02 = this.f104748e.get();
        String str = (String) this.f104749f.f393949a;
        ZS.b bVar2 = (ZS.b) this.f104750g.get();
        f104743h.getClass();
        return new f(aVar, b12, set, bVar, r02, str, bVar2);
    }
}
