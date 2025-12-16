package com.avito.android.analytics.statsd;

import com.avito.android.G2;
import com.avito.android.util.C35743a3;
import com.avito.android.util.C5;
import com.google.gson.internal.Excluder;
import java.util.ArrayList;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.OkHttpClient;
import retrofit2.z;

/* compiled from: StatsdCommonModule_ProvideStatsdApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/t;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/statsd/l;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class t implements dagger.internal.h<InterfaceC28520l> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f91072d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<G2> f91073a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f91074b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f91075c;

    /* compiled from: StatsdCommonModule_ProvideStatsdApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/t$a;", "", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public t(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f91073a = provider;
        this.f91074b = provider2;
        this.f91075c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        G2 g22 = this.f91073a.get();
        com.avito.android.util.C c12 = this.f91074b.get();
        OkHttpClient okHttpClient = (OkHttpClient) this.f91075c.get();
        f91072d.getClass();
        int i12 = C28521m.f91059a;
        if (!c12.l() && C35743a3.a()) {
            throw new IllegalStateException("Initializing Retrofit on the main thread.");
        }
        String strC = g22.c();
        z.b bVar = new z.b();
        bVar.c(C5.c(strC));
        bVar.a(hu.akarnokd.rxjava3.retrofit.g.a());
        com.google.gson.d dVar = new com.google.gson.d();
        com.google.gson.a aVar = new com.google.gson.a[]{new C28509a()}[0];
        Excluder excluder = dVar.f361986a;
        Excluder excluderClone = excluder.clone();
        ArrayList arrayList = new ArrayList(excluder.f362009b);
        excluderClone.f362009b = arrayList;
        arrayList.add(aVar);
        ArrayList arrayList2 = new ArrayList(excluder.f362010c);
        excluderClone.f362010c = arrayList2;
        arrayList2.add(aVar);
        dVar.f361986a = excluderClone;
        bVar.b(retrofit2.converter.gson.a.d(dVar.a()));
        bVar.f430133b = okHttpClient;
        c12.getF125491k().getClass();
        return (InterfaceC28520l) bVar.e().b(InterfaceC28520l.class);
    }
}
