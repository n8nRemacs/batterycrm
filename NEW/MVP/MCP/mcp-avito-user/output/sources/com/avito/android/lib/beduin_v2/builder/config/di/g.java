package com.avito.android.lib.beduin_v2.builder.config.di;

import android.app.Application;
import dagger.internal.l;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.OkHttpClient;

/* compiled from: BeduinConfigModule_ProvideNetworkClientFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/builder/config/di/g;", "Ldagger/internal/h;", "LSU0/g;", "a", "_design-modules_beduin-v2_config_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<SU0.g> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f175489d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<OkHttpClient> f175490a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f175491b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f175492c;

    /* compiled from: BeduinConfigModule_ProvideNetworkClientFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/builder/config/di/g$a;", "", "<init>", "()V", "_design-modules_beduin-v2_config_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k l lVar, @Y61.k u uVar, @Y61.k Provider provider) {
        this.f175490a = provider;
        this.f175491b = uVar;
        this.f175492c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        OkHttpClient okHttpClient = this.f175490a.get();
        String str = (String) this.f175491b.get();
        Application application = (Application) this.f175492c.f393949a;
        f175489d.getClass();
        d.f175485a.getClass();
        return new com.avito.beduin.v2.utils.network.b(new JV0.a(application), okHttpClient, str, false);
    }
}
