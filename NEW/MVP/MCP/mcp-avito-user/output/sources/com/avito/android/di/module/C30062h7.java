package com.avito.android.di.module;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RetrofitFactoryModule_ProvideRetrofitFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/h7;", "Ldagger/internal/h;", "Lcom/avito/android/remote/R0;", "a", "_avito-discouraged_api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.h7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30062h7 implements dagger.internal.h<com.avito.android.remote.R0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f144327b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f144328a;

    /* compiled from: RetrofitFactoryModule_ProvideRetrofitFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/h7$a;", "", "<init>", "()V", "_avito-discouraged_api"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.h7$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30062h7(@Y61.k C30051g7 c30051g7, @Y61.k dagger.internal.u uVar) {
        this.f144328a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        retrofit2.z zVar = (retrofit2.z) this.f144328a.get();
        f144327b.getClass();
        return new com.avito.android.remote.S0(zVar);
    }
}
