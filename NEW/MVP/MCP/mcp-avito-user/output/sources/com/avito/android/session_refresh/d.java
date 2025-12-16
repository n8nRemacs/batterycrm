package com.avito.android.session_refresh;

import androidx.collection.C20199a;
import com.adjust.sdk.Constants;
import com.avito.android.remote.interceptor.InterfaceC34303q0;
import com.avito.android.util.A4;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import e30.InterfaceC39938c;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.InterfaceC43030m;
import kotlin.text.C43066x;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.HttpMethod;
import okio.C44802l;

/* compiled from: RequestParamsInterceptorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/session_refresh/d;", "Lcom/avito/android/remote/interceptor/q0;", "_avito_session-refresher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements InterfaceC34303q0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C f280697b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f280698c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f280699d;

    public d(@Y61.k C c12, @Y61.k ArrayList arrayList, boolean z12) {
        this.f280697b = c12;
        this.f280698c = arrayList;
        this.f280699d = z12;
    }

    public static String a(TreeMap treeMap) {
        StringBuilder sb2 = new StringBuilder(treeMap.size() * 6);
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (sb2.length() > 0) {
                sb2.append('&');
            }
            A4.f318516a.getClass();
            sb2.append(A4.b(str));
            sb2.append('=');
            sb2.append(A4.b(str2));
        }
        return sb2.toString();
    }

    public static Map b(String str) throws UnsupportedEncodingException {
        Collection collectionE0;
        Collection collectionE02;
        String strDecode;
        if (str == null || str.length() == 0) {
            return P0.c();
        }
        List listE0 = C43066x.e0(str, new char[]{'&'});
        if (listE0.isEmpty()) {
            collectionE0 = C42784z0.f406748b;
        } else {
            ListIterator listIterator = listE0.listIterator(listE0.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionE0 = C42745f0.E0(listE0, listIterator.nextIndex() + 1);
                    break;
                }
            }
            collectionE0 = C42784z0.f406748b;
        }
        String[] strArr = (String[]) collectionE0.toArray(new String[0]);
        C20199a c20199a = new C20199a(strArr.length);
        for (String str2 : strArr) {
            List listE02 = C43066x.e0(str2, new char[]{'='});
            if (listE02.isEmpty()) {
                collectionE02 = C42784z0.f406748b;
            } else {
                ListIterator listIterator2 = listE02.listIterator(listE02.size());
                while (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        collectionE02 = C42745f0.E0(listE02, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
                collectionE02 = C42784z0.f406748b;
            }
            String[] strArr2 = (String[]) collectionE02.toArray(new String[0]);
            if (strArr2.length != 0) {
                String strDecode2 = null;
                try {
                    strDecode = URLDecoder.decode(strArr2[0], Constants.ENCODING);
                } catch (UnsupportedEncodingException e12) {
                    V2.f318762a.c("RequestParamsInterceptor", "decodeString", e12);
                    strDecode = null;
                }
                if (strArr2.length > 1) {
                    try {
                        strDecode2 = URLDecoder.decode(strArr2[1], Constants.ENCODING);
                    } catch (UnsupportedEncodingException e13) {
                        V2.f318762a.c("RequestParamsInterceptor", "decodeString", e13);
                    }
                } else {
                    strDecode2 = "";
                }
                c20199a.put(strDecode, strDecode2);
            }
        }
        return c20199a;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        Annotation annotation;
        Map mapC;
        RequestBody requestBodyCreate;
        Annotation[] annotations;
        InterfaceC43030m interfaceC43030mF;
        Object next;
        Request request = chain.request();
        ArrayList arrayList = this.f280698c;
        MediaType mediaType = f.f280700a;
        if (arrayList.contains(request.url().host())) {
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
            if (annotation == null) {
                String strEncodedQuery = request.url().encodedQuery();
                String strMethod = request.method();
                RequestBody requestBodyBody = request.body();
                TreeMap treeMap = new TreeMap();
                treeMap.putAll(b(strEncodedQuery));
                if (requestBodyBody == null || (requestBodyBody instanceof MultipartBody)) {
                    mapC = P0.c();
                } else {
                    try {
                        C44802l c44802l = new C44802l();
                        requestBodyBody.writeTo(c44802l);
                        mapC = b(c44802l.u());
                    } catch (IOException e12) {
                        V2.f318762a.a("RequestParamsInterceptor", "getBodyParams", e12);
                        mapC = P0.c();
                    }
                }
                treeMap.putAll(mapC);
                boolean z12 = request.headers().get("forceAsQuery") != null;
                Headers.Builder builderNewBuilder = request.headers().newBuilder();
                this.f280697b.getClass();
                treeMap.put("key", "Aewei8yaf0deeGho4eetos6cohQuoodooy2Ohmie");
                HttpUrl.Builder builderNewBuilder2 = request.url().newBuilder();
                if (!z12) {
                    builderNewBuilder2.query(null);
                }
                if (HttpMethod.permitsRequestBody(strMethod)) {
                    if (!this.f280699d || !C42745f0.r(request.headers(), new Q("Content-type", "application/json"))) {
                        if (requestBodyBody instanceof MultipartBody) {
                            MultipartBody.Builder type = new MultipartBody.Builder(null, 1, null).setType(MultipartBody.FORM);
                            if (!z12) {
                                for (Map.Entry entry : treeMap.entrySet()) {
                                    type.addFormDataPart((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            Iterator<MultipartBody.Part> it2 = ((MultipartBody) requestBodyBody).parts().iterator();
                            while (it2.hasNext()) {
                                type.addPart(it2.next());
                            }
                            requestBodyCreate = type.build();
                        } else {
                            requestBodyCreate = RequestBody.INSTANCE.create(a(treeMap), f.f280700a);
                        }
                        requestBodyBody = requestBodyCreate;
                    }
                    if (requestBodyBody instanceof MultipartBody) {
                        builderNewBuilder2.addQueryParameter("key", "Aewei8yaf0deeGho4eetos6cohQuoodooy2Ohmie");
                    }
                } else {
                    builderNewBuilder2.encodedQuery(a(treeMap));
                }
                return chain.proceed(request.newBuilder().url(builderNewBuilder2.build()).headers(builderNewBuilder.build()).method(strMethod, requestBodyBody).removeHeader("forceAsQuery").build());
            }
        }
        V2.f318762a.i("RequestParamsInterceptor", "Skipping RequestParamsInterceptor for request: " + request.url(), null);
        return chain.proceed(request);
    }
}
