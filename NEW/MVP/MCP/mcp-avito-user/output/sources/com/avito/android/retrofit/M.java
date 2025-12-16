package com.avito.android.retrofit;

import com.avito.android.I1;
import com.avito.android.di.module.T9;
import com.google.gson.Gson;
import e30.InterfaceC39938c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import okhttp3.ResponseBody;
import retrofit2.f;
import wl0.C49648a;

/* compiled from: ResponseBodyConverterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/retrofit/M;", "Lretrofit2/f$a;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class M extends f.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f255101a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gson f255102b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f255103c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final I1 f255104d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final EE0.g f255105e;

    @Inject
    public M(@Y61.k Gson gson, @Y61.k @T9 Gson gson2, @Y61.k com.avito.android.P p12, @Y61.k I1 i12, @Y61.k EE0.g gVar) {
        this.f255101a = gson;
        this.f255102b = gson2;
        this.f255103c = p12;
        this.f255104d = i12;
        this.f255105e = gVar;
    }

    @Override // retrofit2.f.a
    @Y61.k
    public final retrofit2.f a(@Y61.k Type type, @Y61.k Annotation[] annotationArr, @Y61.k Annotation[] annotationArr2) {
        Annotation annotation;
        int length = annotationArr2.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr2[i12];
            if (annotation instanceof InterfaceC39938c) {
                break;
            }
            i12++;
        }
        return new C49648a(type, d(annotationArr2), annotationArr, (annotation instanceof InterfaceC39938c ? (InterfaceC39938c) annotation : null) != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.avito.android.retrofit.J] */
    @Override // retrofit2.f.a
    @Y61.k
    public final retrofit2.f<ResponseBody, ?> b(@Y61.k Type type, @Y61.k Annotation[] annotationArr, @Y61.k retrofit2.z zVar) {
        L l12 = new L(d(annotationArr), type, this.f255105e);
        com.avito.android.P p12 = this.f255103c;
        p12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[79];
        if (((Boolean) p12.f67421m0.a().invoke()).booleanValue()) {
            I1 i12 = this.f255104d;
            i12.getClass();
            kotlin.reflect.n<Object> nVar2 = I1.f67278k0[14];
            if (((Boolean) i12.f67328o.a().invoke()).booleanValue()) {
                l12 = new J(l12);
            }
        }
        return new T(l12);
    }

    public final Gson d(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (X41.b.a(annotation).equals(m0.f406844a.b(com.avito.android.remote.parse.adapter.stream_gson.b.class))) {
                return this.f255102b;
            }
        }
        return this.f255101a;
    }
}
