package com.avito.android.retrofit;

import java.lang.reflect.Type;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import retrofit2.InterfaceC47646b;
import retrofit2.InterfaceC47647c;

/* compiled from: NetworkContractsCallAdapter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/retrofit/C;", "", "T", "K", "Lretrofit2/c;", "_common_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class C<T, K> implements InterfaceC47647c<T, Object> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47647c<T, K> f255085a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final retrofit2.f<ResponseBody, T> f255086b;

    public C(@Y61.k InterfaceC47647c<T, K> interfaceC47647c, @Y61.k retrofit2.f<ResponseBody, T> fVar) {
        this.f255085a = interfaceC47647c;
        this.f255086b = fVar;
    }

    @Override // retrofit2.InterfaceC47647c
    @Y61.k
    public final Object adapt(@Y61.k InterfaceC47646b<T> interfaceC47646b) {
        return this.f255085a.adapt(new G(interfaceC47646b, this.f255086b));
    }

    @Override // retrofit2.InterfaceC47647c
    @Y61.k
    /* renamed from: responseType */
    public final Type getF255131a() {
        return this.f255085a.getF255131a();
    }
}
