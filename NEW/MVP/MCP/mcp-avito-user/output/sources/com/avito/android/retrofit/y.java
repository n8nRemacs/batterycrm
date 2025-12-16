package com.avito.android.retrofit;

import com.avito.android.I1;
import javax.inject.Inject;
import kotlin.Metadata;
import retrofit2.InterfaceC47647c;

/* compiled from: CompositeRetrofitConverterFactoryWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/retrofit/y;", "Lcom/avito/android/retrofit/S;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y implements S {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Q f255204a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f255205b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I1 f255206c;

    @Inject
    public y(@Y61.k Q q12, @Y61.k F f12, @Y61.k I1 i12) {
        this.f255204a = q12;
        this.f255205b = f12;
        this.f255206c = i12;
    }

    @Override // com.avito.android.retrofit.S
    @Y61.k
    public final InterfaceC47647c.a a(@Y61.k InterfaceC47647c.a aVar) {
        I1 i12 = this.f255206c;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[52];
        if (((Boolean) i12.f67304Z.a().invoke()).booleanValue()) {
            aVar = ((P) this.f255204a.get()).a(aVar);
        }
        this.f255205b.getClass();
        new E();
        return new D(aVar);
    }
}
