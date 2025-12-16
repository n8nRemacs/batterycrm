package com.avito.android.di.module;

import android.app.Application;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PersistenceAbTestsModule_ProvideAbTestsPreferencesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/r6;", "Ldagger/internal/h;", "LAK0/l;", "a", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.r6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30170r6 implements dagger.internal.h<AK0.l> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f144560c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<AK0.i> f144561a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f144562b;

    /* compiled from: PersistenceAbTestsModule_ProvideAbTestsPreferencesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/r6$a;", "", "<init>", "()V", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.r6$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30170r6(@Y61.k C30138o6 c30138o6, @Y61.k Provider provider, @Y61.k dagger.internal.l lVar) {
        this.f144561a = provider;
        this.f144562b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        AK0.i iVar = this.f144561a.get();
        Application application = (Application) this.f144562b.f393949a;
        f144560c.getClass();
        return iVar.a(application, "abtest");
    }
}
