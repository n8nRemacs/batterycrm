package com.avito.android.remote.interceptor;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BricksLayoutHeaderProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/v;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/t;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.v, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34311v implements dagger.internal.h<C34307t> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f253546c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f253547a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f253548b;

    /* compiled from: BricksLayoutHeaderProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/v$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.interceptor.v$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34311v(@Y61.k com.avito.android.S s5, @Y61.k Provider provider) {
        this.f253547a = s5;
        this.f253548b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.P p12 = (com.avito.android.P) this.f253547a.get();
        com.avito.android.util.C c12 = this.f253548b.get();
        f253546c.getClass();
        return new C34307t(p12, c12);
    }
}
