package com.avito.android.di.module;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ApiInterceptorsModule_ProvideUserAgentInterceptorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/A0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/Y0;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A0 implements dagger.internal.h<com.avito.android.remote.interceptor.Y0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f143813b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.W0 f143814a;

    /* compiled from: ApiInterceptorsModule_ProvideUserAgentInterceptorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/A0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public A0(@Y61.k C30143p0 c30143p0, @Y61.k com.avito.android.remote.interceptor.W0 w02) {
        this.f143814a = w02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.remote.interceptor.U0 u02 = (com.avito.android.remote.interceptor.U0) this.f143814a.get();
        f143813b.getClass();
        return new com.avito.android.remote.interceptor.Z0(u02);
    }
}
