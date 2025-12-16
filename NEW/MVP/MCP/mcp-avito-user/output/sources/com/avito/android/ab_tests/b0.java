package com.avito.android.ab_tests;

import com.avito.android.B2;
import com.avito.android.D2;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/b0;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/a0;", "a", "_avito-discouraged_avito-feature_services"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b0 implements dagger.internal.h<a0> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f67756c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27642e> f67757a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D2 f67758b;

    /* compiled from: ServicesAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/b0$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_services"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b0(@Y61.k Provider provider, @Y61.k D2 d22) {
        this.f67757a = provider;
        this.f67758b = d22;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC27642e interfaceC27642e = this.f67757a.get();
        B2 b22 = (B2) this.f67758b.get();
        f67756c.getClass();
        return new a0(interfaceC27642e, b22);
    }
}
