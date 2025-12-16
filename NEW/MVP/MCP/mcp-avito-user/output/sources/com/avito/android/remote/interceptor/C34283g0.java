package com.avito.android.remote.interceptor;

import e30.InterfaceC39938c;
import hd.InterfaceC40915a;
import hd.InterfaceC40916b;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.sequences.InterfaceC43030m;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: HeadersInterceptor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/g0;", "Lokhttp3/Interceptor;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.g0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C34283g0 implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f253530b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f253531c;

    public C34283g0(@Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2) {
        this.f253530b = arrayList;
        this.f253531c = arrayList2;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        Annotation annotation;
        kotlin.Q q12;
        Annotation[] annotations;
        InterfaceC43030m interfaceC43030mF;
        Object next;
        Request request = chain.request();
        if (!this.f253530b.contains(request.url().host())) {
            return chain.proceed(request);
        }
        Headers headers = request.headers();
        retrofit2.j jVar = (retrofit2.j) request.tag(retrofit2.j.class);
        if (jVar == null || (annotations = jVar.f430007a.getAnnotations()) == null || (interfaceC43030mF = C42756l.f(annotations)) == null) {
            annotation = null;
        } else {
            Iterator it = interfaceC43030mF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Annotation) next) instanceof InterfaceC39938c) {
                    break;
                }
            }
            annotation = (Annotation) next;
        }
        boolean z12 = annotation != null;
        ArrayList<InterfaceC40915a> arrayList = this.f253531c;
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC40915a interfaceC40915a : arrayList) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(interfaceC40915a.getKey());
            sb2.append("-required");
            boolean z13 = "true".equalsIgnoreCase(headers.get(sb2.toString())) || interfaceC40915a.getF253556b();
            if ((z12 || !(interfaceC40915a instanceof InterfaceC40916b) || ((InterfaceC40916b) interfaceC40915a).a()) && z13 && interfaceC40915a.getF253555a() != null) {
                String key = interfaceC40915a.getKey();
                String f253555a = interfaceC40915a.getF253555a();
                if (f253555a == null) {
                    f253555a = "";
                }
                q12 = new kotlin.Q(key, f253555a);
            } else {
                q12 = null;
            }
            if (q12 != null) {
                arrayList2.add(q12);
            }
        }
        Map mapP = kotlin.collections.P0.p(arrayList2);
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((InterfaceC40915a) it2.next()).getKey() + "-required");
        }
        if (mapP.isEmpty() && arrayList3.isEmpty()) {
            return chain.proceed(request);
        }
        Headers.Builder builderNewBuilder = headers.newBuilder();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            builderNewBuilder.removeAll((String) it3.next());
        }
        for (Map.Entry entry : mapP.entrySet()) {
            builderNewBuilder.set((String) entry.getKey(), (String) entry.getValue());
        }
        return chain.proceed(request.newBuilder().headers(builderNewBuilder.build()).build());
    }
}
