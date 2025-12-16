package com.avito.android.remote.analytics;

import com.avito.android.quic.cronet.CronetTcpRstReporter;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkErrorsAnalytics_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/c;", "Ldagger/internal/h;", "Lcom/avito/android/remote/analytics/b;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.analytics.c, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34246c implements dagger.internal.h<C34245b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f253111e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<B> f253112a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f253113b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<n> f253114c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<CronetTcpRstReporter> f253115d;

    /* compiled from: NetworkErrorsAnalytics_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/c$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.analytics.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34246c(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3) {
        this.f253112a = provider;
        this.f253113b = uVar;
        this.f253114c = provider2;
        this.f253115d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B b12 = this.f253112a.get();
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f253113b));
        h31.e eVarB = dagger.internal.g.b(this.f253114c);
        CronetTcpRstReporter cronetTcpRstReporter = this.f253115d.get();
        f253111e.getClass();
        return new C34245b(b12, eVarA, eVarB, cronetTcpRstReporter);
    }
}
