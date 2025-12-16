package com.avito.android.beduin.v2.benchmark.impl;

import Y61.k;
import com.avito.android.C29270c0;
import com.avito.android.C30276e0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.h;
import dagger.internal.l;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2BenchmarkPageViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/benchmark/impl/e;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/benchmark/impl/c;", "a", "_design-modules_beduin-v2_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements h<c> {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f104627i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<n.a> f104628a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<B> f104629b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<Set<FV0.h>> f104630c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C31144q0 f104631d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C31151u0 f104632e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Provider<R0> f104633f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final l f104634g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C30276e0 f104635h;

    /* compiled from: BeduinV2BenchmarkPageViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/benchmark/impl/e$a;", "", "<init>", "()V", "_design-modules_beduin-v2_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k C30276e0 c30276e0, @k C31144q0 c31144q0, @k C31151u0 c31151u0, @k l lVar, @k Provider provider, @k Provider provider2, @k Provider provider3, @k Provider provider4) {
        this.f104628a = provider;
        this.f104629b = provider2;
        this.f104630c = provider3;
        this.f104631d = c31144q0;
        this.f104632e = c31151u0;
        this.f104633f = provider4;
        this.f104634g = lVar;
        this.f104635h = c30276e0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVar = this.f104628a.get();
        B b12 = this.f104629b.get();
        Set<FV0.h> set = this.f104630c.get();
        aU0.b bVar = (aU0.b) this.f104631d.get();
        ZS.b bVar2 = (ZS.b) this.f104632e.get();
        R0 r02 = this.f104633f.get();
        String str = (String) this.f104634g.f393949a;
        C29270c0 c29270c0 = (C29270c0) this.f104635h.get();
        f104627i.getClass();
        return new c(bVar2, bVar, c29270c0, aVar, r02, b12, str, set);
    }
}
