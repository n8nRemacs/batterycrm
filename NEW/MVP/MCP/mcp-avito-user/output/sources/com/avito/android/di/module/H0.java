package com.avito.android.di.module;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ApiModule_ProvideResponseConverterFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/H0;", "Ldagger/internal/h;", "Lcom/avito/android/retrofit/S;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class H0 implements dagger.internal.h<com.avito.android.retrofit.S> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f143979b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.retrofit.z f143980a;

    /* compiled from: ApiModule_ProvideResponseConverterFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/H0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public H0(@Y61.k B0 b02, @Y61.k com.avito.android.retrofit.z zVar) {
        this.f143980a = zVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.retrofit.y yVar = (com.avito.android.retrofit.y) this.f143980a.get();
        f143979b.getClass();
        return yVar;
    }
}
