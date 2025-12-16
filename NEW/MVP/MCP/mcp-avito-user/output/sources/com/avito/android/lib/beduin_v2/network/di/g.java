package com.avito.android.lib.beduin_v2.network.di;

import Y61.k;
import com.avito.android.remote.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.OkHttpClient;

/* compiled from: BeduinRetrofitFactoryModule_ProvideBeduinV2RetrofitFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/network/di/g;", "Ldagger/internal/h;", "Lcom/avito/android/remote/R0;", "a", "_design-modules_beduin-v2_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<R0> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f176402d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f176403a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<String> f176404b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<OkHttpClient> f176405c;

    /* compiled from: BeduinRetrofitFactoryModule_ProvideBeduinV2RetrofitFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/network/di/g$a;", "", "<init>", "()V", "_design-modules_beduin-v2_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k dagger.internal.f fVar, @k Provider provider, @k Provider provider2) {
        this.f176403a = fVar;
        this.f176404b = provider;
        this.f176405c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f176403a.get();
        String str = this.f176404b.get();
        OkHttpClient okHttpClient = this.f176405c.get();
        f176402d.getClass();
        f.f176401a.getClass();
        return r02.a(new e(str, okHttpClient));
    }
}
