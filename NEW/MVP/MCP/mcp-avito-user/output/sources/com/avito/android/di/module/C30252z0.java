package com.avito.android.di.module;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ApiInterceptorsModule_ProvideSupportedFeaturesInterceptorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/z0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/O0;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.z0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30252z0 implements dagger.internal.h<com.avito.android.remote.interceptor.O0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f144734b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.n1 f144735a;

    /* compiled from: ApiInterceptorsModule_ProvideSupportedFeaturesInterceptorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/z0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.z0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30252z0(@Y61.k C30143p0 c30143p0, @Y61.k com.avito.android.remote.n1 n1Var) {
        this.f144735a = n1Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.remote.l1 l1Var = (com.avito.android.remote.l1) this.f144735a.get();
        f144734b.getClass();
        return new com.avito.android.remote.interceptor.O0(l1Var);
    }
}
