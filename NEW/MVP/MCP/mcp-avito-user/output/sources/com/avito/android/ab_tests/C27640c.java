package com.avito.android.ab_tests;

import Ec.InterfaceC13473b;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ABTestConfigTrackerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/c;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/b;", "a", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27640c implements dagger.internal.h<C27639b> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f67759c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f67760a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f67761b;

    /* compiled from: ABTestConfigTrackerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/c$a;", "", "<init>", "()V", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ab_tests.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C27640c(@Y61.k dagger.internal.f fVar, @Y61.k dagger.internal.u uVar) {
        this.f67760a = fVar;
        this.f67761b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f67760a.get();
        InterfaceC13473b interfaceC13473b = (InterfaceC13473b) this.f67761b.get();
        f67759c.getClass();
        return new C27639b(interfaceC28373a, interfaceC13473b);
    }
}
