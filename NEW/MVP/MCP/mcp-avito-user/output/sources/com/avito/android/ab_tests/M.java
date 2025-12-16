package com.avito.android.ab_tests;

import com.avito.android.I1;
import com.avito.android.K1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PerformanceAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/M;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/L;", "a", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class M implements dagger.internal.h<L> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f67723d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final K1 f67724a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f67725b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f67726c;

    /* compiled from: PerformanceAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/M$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public M(@Y61.k K1 k12, @Y61.k e0 e0Var, @Y61.k dagger.internal.u uVar) {
        this.f67724a = k12;
        this.f67725b = e0Var;
        this.f67726c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i12 = (I1) this.f67724a.get();
        c0 c0Var = (c0) this.f67725b.get();
        InterfaceC27642e interfaceC27642e = (InterfaceC27642e) this.f67726c.get();
        f67723d.getClass();
        return new L(i12, c0Var, interfaceC27642e);
    }
}
