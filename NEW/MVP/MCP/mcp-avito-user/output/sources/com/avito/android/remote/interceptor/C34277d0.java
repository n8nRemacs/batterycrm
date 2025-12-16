package com.avito.android.remote.interceptor;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GeoHeaderProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/d0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/c0;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.d0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34277d0 implements dagger.internal.h<C34275c0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253526b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f253527a;

    /* compiled from: GeoHeaderProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/d0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.interceptor.d0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34277d0(@Y61.k dagger.internal.u uVar) {
        this.f253527a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.geo.j jVar = (com.avito.android.geo.j) this.f253527a.get();
        f253526b.getClass();
        return new C34275c0(jVar);
    }
}
