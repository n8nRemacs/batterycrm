package com.avito.android.di.module;

import com.avito.android.ab_tests.C27644g;
import com.avito.android.ab_tests.InterfaceC27638a;
import com.avito.android.ab_tests.InterfaceC27643f;
import com.google.gson.Gson;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PersistenceAbTestsModule_ProvideAbTestPrefsFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/q6;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/f;", "a", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.q6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30160q6 implements dagger.internal.h<InterfaceC27643f> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f144544d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<Gson> f144545a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30170r6 f144546b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f144547c;

    /* compiled from: PersistenceAbTestsModule_ProvideAbTestPrefsFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/q6$a;", "", "<init>", "()V", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.q6$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30160q6(@Y61.k C30138o6 c30138o6, @Y61.k Provider provider, @Y61.k C30170r6 c30170r6, @Y61.k dagger.internal.u uVar) {
        this.f144545a = provider;
        this.f144546b = c30170r6;
        this.f144547c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f144545a);
        AK0.l lVar = (AK0.l) this.f144546b.get();
        InterfaceC27638a interfaceC27638a = (InterfaceC27638a) this.f144547c.get();
        f144544d.getClass();
        return new C27644g(lVar, eVarB, interfaceC27638a);
    }
}
