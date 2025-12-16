package com.avito.android.remote.interceptor;

import hd.InterfaceC40915a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.C43066x;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: FrescoHeadersInterceptor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/a0;", "Lokhttp3/Interceptor;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.a0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34271a0 implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f253520b;

    public C34271a0(@Y61.k ArrayList arrayList) {
        this.f253520b = arrayList;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        Request request = chain.request();
        HashMap map = new HashMap();
        ArrayList arrayList = this.f253520b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String f253555a = ((InterfaceC40915a) obj).getF253555a();
            if (f253555a != null && !C43066x.K(f253555a)) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            InterfaceC40915a interfaceC40915a = (InterfaceC40915a) it.next();
            map.put(interfaceC40915a.getKey(), interfaceC40915a.getF253555a());
        }
        if (map.isEmpty()) {
            chain.proceed(request);
        }
        Headers.Builder builderNewBuilder = request.headers().newBuilder();
        for (Map.Entry entry : map.entrySet()) {
            builderNewBuilder.set((String) entry.getKey(), (String) entry.getValue());
        }
        return chain.proceed(request.newBuilder().headers(builderNewBuilder.build()).build());
    }
}
