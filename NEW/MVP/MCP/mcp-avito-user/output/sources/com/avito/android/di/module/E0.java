package com.avito.android.di.module;

import com.avito.android.ab_tests.configs.HttpProtocolTestGroup;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* compiled from: ApiModule_ProvideOkHttpClientFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/E0;", "Ldagger/internal/h;", "Lokhttp3/OkHttpClient;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class E0 implements dagger.internal.h<OkHttpClient> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f143897e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<OkHttpClient> f143898a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.quic.u> f143899b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.quic.b> f143900c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final t3.V f143901d;

    /* compiled from: ApiModule_ProvideOkHttpClientFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/E0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public E0(@Y61.k B0 b02, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k t3.V v12) {
        this.f143898a = provider;
        this.f143899b = provider2;
        this.f143900c = provider3;
        this.f143901d = v12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        OkHttpClient okHttpClient = this.f143898a.get();
        com.avito.android.quic.u uVar = this.f143899b.get();
        com.avito.android.quic.b bVar = this.f143900c.get();
        HttpProtocolTestGroup httpProtocolTestGroup = (HttpProtocolTestGroup) this.f143901d.get();
        f143897e.getClass();
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        List<Interceptor> listInterceptors = builderNewBuilder.interceptors();
        Iterator<Interceptor> it = listInterceptors.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (it.next() instanceof zl0.d) {
                break;
            }
            i12++;
        }
        if (i12 > 0) {
            listInterceptors.add(i12, uVar);
        } else {
            builderNewBuilder.addInterceptor(uVar);
        }
        OkHttpClient.Builder builderAddInterceptor = builderNewBuilder.addInterceptor(bVar);
        int iOrdinal = httpProtocolTestGroup.ordinal();
        List<? extends Protocol> listSingletonList = null;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                listSingletonList = Collections.singletonList(Protocol.HTTP_1_1);
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                listSingletonList = C42745f0.U(Protocol.HTTP_2, Protocol.HTTP_1_1);
            }
        }
        if (listSingletonList != null) {
            builderAddInterceptor.protocols(listSingletonList);
        }
        OkHttpClient okHttpClientBuild = builderNewBuilder.build();
        dagger.internal.t.b(okHttpClientBuild, "Cannot return null from a non-@Nullable @Provides method");
        return okHttpClientBuild;
    }
}
