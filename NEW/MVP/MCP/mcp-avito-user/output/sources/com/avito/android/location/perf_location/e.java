package com.avito.android.location.perf_location;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidGeocoderRegionProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location/perf_location/e;", "Ldagger/internal/h;", "Lcom/avito/android/location/perf_location/b;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f181820b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f181821a;

    /* compiled from: AndroidGeocoderRegionProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location/perf_location/e$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k dagger.internal.f fVar) {
        this.f181821a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f181821a.get();
        f181820b.getClass();
        return new b(interfaceC28373a);
    }
}
