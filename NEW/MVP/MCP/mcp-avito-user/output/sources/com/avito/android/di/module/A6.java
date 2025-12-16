package com.avito.android.di.module;

import android.app.Application;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PersistenceGeoModule_ProvideGeoStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/A6;", "Ldagger/internal/h;", "Lcom/avito/android/geo/j;", "a", "_avito-discouraged_persistence_geo"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A6 implements dagger.internal.h<com.avito.android.geo.j> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f143834c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<AK0.i> f143835a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f143836b;

    /* compiled from: PersistenceGeoModule_ProvideGeoStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/A6$a;", "", "<init>", "()V", "_avito-discouraged_persistence_geo"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public A6(@Y61.k C30258z6 c30258z6, @Y61.k Provider provider, @Y61.k dagger.internal.l lVar) {
        this.f143835a = provider;
        this.f143836b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        AK0.i iVar = this.f143835a.get();
        Application application = (Application) this.f143836b.f393949a;
        f143834c.getClass();
        return new com.avito.android.geo.k(iVar.a(application, "geo"));
    }
}
