package com.avito.android.location.perf_location;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PerformanceRegionLocationProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location/perf_location/l;", "Ldagger/internal/h;", "Lcom/avito/android/location/perf_location/k;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f181844e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.geo.j> f181845a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.geo_common.interactor.g> f181846b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f181847c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f181848d;

    /* compiled from: PerformanceRegionLocationProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location/perf_location/l$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k C30102l3 c30102l3, @Y61.k u uVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f181845a = provider;
        this.f181846b = provider2;
        this.f181847c = uVar;
        this.f181848d = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.geo.j jVar = this.f181845a.get();
        com.avito.android.geo_common.interactor.g gVar = this.f181846b.get();
        com.avito.android.location.perf_location.a aVar = (com.avito.android.location.perf_location.a) this.f181847c.get();
        Context context = (Context) this.f181848d.get();
        f181844e.getClass();
        return new k(jVar, gVar, aVar, context);
    }
}
