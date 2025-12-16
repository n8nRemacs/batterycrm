package com.avito.android.ab_tests;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TestExposureListenerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/e0;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/d0;", "a", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e0 implements dagger.internal.h<d0> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f67942c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f67943a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f67944b;

    /* compiled from: TestExposureListenerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/e0$a;", "", "<init>", "()V", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e0(@Y61.k dagger.internal.f fVar, @Y61.k dagger.internal.u uVar) {
        this.f67943a = uVar;
        this.f67944b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B b12 = (B) this.f67943a.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f67944b.get();
        f67942c.getClass();
        return new d0(b12, interfaceC28373a);
    }
}
