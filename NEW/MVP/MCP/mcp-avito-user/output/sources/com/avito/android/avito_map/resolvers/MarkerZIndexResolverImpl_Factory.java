package com.avito.android.avito_map.resolvers;

import X41.n;
import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;

/* compiled from: MarkerZIndexResolverImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/avito_map/resolvers/MarkerZIndexResolverImpl_Factory;", "Ldagger/internal/h;", "Lcom/avito/android/avito_map/resolvers/MarkerZIndexResolverImpl;", "<init>", "()V", "create", "()Lcom/avito/android/avito_map/resolvers/MarkerZIndexResolverImpl_Factory;", "newInstance", "()Lcom/avito/android/avito_map/resolvers/MarkerZIndexResolverImpl;", "get", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MarkerZIndexResolverImpl_Factory implements h<MarkerZIndexResolverImpl> {

    @k
    public static final MarkerZIndexResolverImpl_Factory INSTANCE = new MarkerZIndexResolverImpl_Factory();

    private MarkerZIndexResolverImpl_Factory() {
    }

    @n
    @k
    public static final MarkerZIndexResolverImpl_Factory create() {
        return INSTANCE;
    }

    @n
    @k
    public static final MarkerZIndexResolverImpl newInstance() {
        return new MarkerZIndexResolverImpl();
    }

    @Override // javax.inject.Provider
    @k
    public MarkerZIndexResolverImpl get() {
        return newInstance();
    }
}
