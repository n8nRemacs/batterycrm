package com.avito.android.retrofit;

import com.avito.android.retrofit.error.WrappedDiagnosticsException;
import kotlin.Metadata;
import okhttp3.ResponseBody;

/* compiled from: WrapperDiagnosticResponseConverter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/T;", "Lretrofit2/f;", "Lokhttp3/ResponseBody;", "", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class T implements retrofit2.f<ResponseBody, Object> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final retrofit2.f<ResponseBody, Object> f255119a;

    public T(@Y61.k retrofit2.f<ResponseBody, Object> fVar) {
        this.f255119a = fVar;
    }

    @Override // retrofit2.f
    public final Object convert(ResponseBody responseBody) throws WrappedDiagnosticsException {
        ResponseBody responseBody2 = responseBody;
        try {
            return this.f255119a.convert(responseBody2);
        } catch (Exception e12) {
            com.avito.android.remote.interceptor.L lA2 = com.avito.android.remote.interceptor.H.a(responseBody2);
            String str = lA2 != null ? lA2.f253493b.get("x-diagnostic-context") : null;
            com.avito.android.remote.interceptor.L lA3 = com.avito.android.remote.interceptor.H.a(responseBody2);
            throw new WrappedDiagnosticsException(str, lA3 != null ? lA3.f253493b.get("x-diagnostic-context-id") : null, e12);
        }
    }
}
