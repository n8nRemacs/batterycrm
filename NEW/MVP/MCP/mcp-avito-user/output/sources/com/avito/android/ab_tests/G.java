package com.avito.android.ab_tests;

import com.avito.android.C28727b1;
import com.avito.android.Z0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MarketplaceAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/G;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/F;", "a", "_avito-discouraged_avito-feature_marketplace"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f67709d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C28727b1 f67710a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f67711b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27642e> f67712c;

    /* compiled from: MarketplaceAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/G$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_marketplace"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public G(@Y61.k C28727b1 c28727b1, @Y61.k e0 e0Var, @Y61.k Provider provider) {
        this.f67710a = c28727b1;
        this.f67711b = e0Var;
        this.f67712c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Z0 z02 = (Z0) this.f67710a.get();
        c0 c0Var = (c0) this.f67711b.get();
        InterfaceC27642e interfaceC27642e = this.f67712c.get();
        f67709d.getClass();
        return new F(z02, c0Var, interfaceC27642e);
    }
}
