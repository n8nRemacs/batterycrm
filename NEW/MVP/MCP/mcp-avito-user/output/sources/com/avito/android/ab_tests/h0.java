package com.avito.android.ab_tests;

import com.avito.android.N2;
import com.avito.android.P2;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/h0;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/g0;", "a", "_avito-discouraged_avito-feature_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h0 implements dagger.internal.h<g0> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f67987d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final P2 f67988a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f67989b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27642e> f67990c;

    /* compiled from: UserAdvertAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/h0$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h0(@Y61.k P2 p22, @Y61.k e0 e0Var, @Y61.k Provider provider) {
        this.f67988a = p22;
        this.f67989b = e0Var;
        this.f67990c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        N2 n22 = (N2) this.f67988a.get();
        c0 c0Var = (c0) this.f67989b.get();
        InterfaceC27642e interfaceC27642e = this.f67990c.get();
        f67987d.getClass();
        return new g0(n22, c0Var, interfaceC27642e);
    }
}
