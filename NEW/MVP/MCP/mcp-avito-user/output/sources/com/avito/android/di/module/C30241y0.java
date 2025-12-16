package com.avito.android.di.module;

import com.avito.android.remote.interceptor.C34312v0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ApiInterceptorsModule_ProvideServerTimeInterceptorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/y0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/v0;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.y0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30241y0 implements dagger.internal.h<C34312v0> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f144713d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f144714a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.server_time.a> f144715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f144716c;

    /* compiled from: ApiInterceptorsModule_ProvideServerTimeInterceptorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/y0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.y0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30241y0(@Y61.k C30143p0 c30143p0, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f144714a = uVar;
        this.f144715b = provider;
        this.f144716c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.c cVar = (com.avito.android.server_time.c) this.f144714a.get();
        com.avito.android.server_time.a aVar = this.f144715b.get();
        com.avito.android.util.C c12 = this.f144716c.get();
        f144713d.getClass();
        return new C34312v0(cVar, aVar, !c12.l());
    }
}
