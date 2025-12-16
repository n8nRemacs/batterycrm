package com.avito.android.ab_tests;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoreAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/x;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/w;", "a", "_avito-discouraged_avito-feature_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27660x implements dagger.internal.h<C27659w> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f68023d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f68024a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f68025b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27642e> f68026c;

    /* compiled from: CoreAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/x$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ab_tests.x$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C27660x(@Y61.k com.avito.android.S s5, @Y61.k e0 e0Var, @Y61.k Provider provider) {
        this.f68024a = s5;
        this.f68025b = e0Var;
        this.f68026c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.P p12 = (com.avito.android.P) this.f68024a.get();
        c0 c0Var = (c0) this.f68025b.get();
        InterfaceC27642e interfaceC27642e = this.f68026c.get();
        f68023d.getClass();
        return new C27659w(p12, interfaceC27642e, c0Var);
    }
}
