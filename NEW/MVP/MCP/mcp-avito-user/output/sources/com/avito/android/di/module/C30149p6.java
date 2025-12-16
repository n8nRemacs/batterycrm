package com.avito.android.di.module;

import com.avito.android.ab_tests.C27649l;
import com.avito.android.ab_tests.InterfaceC27643f;
import com.avito.android.error_reporting.app_state.C30374m;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PersistenceAbTestsModule_ProvideAbTestConfigStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/p6;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/l;", "a", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.p6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30149p6 implements dagger.internal.h<C27649l> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f144522e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27643f> f144523a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.error_reporting.app_state.n f144524b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f144525c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f144526d;

    /* compiled from: PersistenceAbTestsModule_ProvideAbTestConfigStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/p6$a;", "", "<init>", "()V", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.p6$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30149p6(@Y61.k C30138o6 c30138o6, @Y61.k Provider provider, @Y61.k com.avito.android.error_reporting.app_state.n nVar, @Y61.k com.avito.android.S s5, @Y61.k Provider provider2) {
        this.f144523a = provider;
        this.f144524b = nVar;
        this.f144525c = s5;
        this.f144526d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC27643f interfaceC27643f = this.f144523a.get();
        C30374m c30374m = (C30374m) this.f144524b.get();
        com.avito.android.P p12 = (com.avito.android.P) this.f144525c.get();
        com.avito.android.util.C c12 = this.f144526d.get();
        f144522e.getClass();
        return new C27649l(interfaceC27643f, c30374m, p12, c12);
    }
}
