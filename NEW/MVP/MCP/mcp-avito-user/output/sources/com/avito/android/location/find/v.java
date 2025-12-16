package com.avito.android.location.find;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FusedLocationInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location/find/v;", "Ldagger/internal/h;", "Lcom/avito/android/location/find/u;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f181776b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.geo.j> f181777a;

    /* compiled from: FusedLocationInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location/find/v$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public v(@Y61.k Provider<com.avito.android.geo.j> provider) {
        this.f181777a = provider;
    }

    @X41.n
    @Y61.k
    public static final v a(@Y61.k Provider<com.avito.android.geo.j> provider) {
        f181776b.getClass();
        return new v(provider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.geo.j jVar = this.f181777a.get();
        f181776b.getClass();
        return new u(jVar);
    }
}
