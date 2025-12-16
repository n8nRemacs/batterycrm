package com.avito.android.ab_tests;

import Uj0.InterfaceC15529a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AbTestsReloadTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/r;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/p;", "a", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r implements dagger.internal.h<C27653p> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f68009d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC15529a> f68010a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27648k> f68011b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27638a> f68012c;

    /* compiled from: AbTestsReloadTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/r$a;", "", "<init>", "()V", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public r(@Y61.k Provider<InterfaceC15529a> provider, @Y61.k Provider<InterfaceC27648k> provider2, @Y61.k Provider<InterfaceC27638a> provider3) {
        this.f68010a = provider;
        this.f68011b = provider2;
        this.f68012c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC15529a interfaceC15529a = this.f68010a.get();
        InterfaceC27648k interfaceC27648k = this.f68011b.get();
        InterfaceC27638a interfaceC27638a = this.f68012c.get();
        f68009d.getClass();
        return new C27653p(interfaceC15529a, interfaceC27648k, interfaceC27638a);
    }
}
