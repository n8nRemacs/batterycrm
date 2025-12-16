package com.avito.android.retrofit;

import javax.inject.Inject;
import kotlin.Metadata;
import retrofit2.InterfaceC47647c;

/* compiled from: ResponseConverterFactoryWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/retrofit/P;", "Lcom/avito/android/retrofit/S;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class P implements S {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.n f255112a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.B f255113b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.a f255114c;

    @Inject
    public P(@Y61.k com.avito.android.remote.analytics.n nVar, @Y61.k com.avito.android.remote.analytics.B b12, @Y61.k com.avito.android.remote.error.a aVar) {
        this.f255112a = nVar;
        this.f255113b = b12;
        this.f255114c = aVar;
    }

    @Override // com.avito.android.retrofit.S
    @Y61.k
    public final InterfaceC47647c.a a(@Y61.k InterfaceC47647c.a aVar) {
        return new C34420l(aVar, this.f255112a, this.f255113b, this.f255114c);
    }
}
