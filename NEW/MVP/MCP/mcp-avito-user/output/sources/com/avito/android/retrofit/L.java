package com.avito.android.retrofit;

import com.avito.android.util.InvalidSchemaException;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.ResponseBody;

/* compiled from: ResponseBodyConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/L;", "Lretrofit2/f;", "Lokhttp3/ResponseBody;", "", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class L implements retrofit2.f<ResponseBody, Object> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f255098a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Type f255099b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final EE0.g f255100c;

    public L(@Y61.k Gson gson, @Y61.k Type type, @Y61.k EE0.g gVar) {
        this.f255098a = gson;
        this.f255099b = type;
        this.f255100c = gVar;
    }

    public final Object a(Reader reader) throws Exception {
        StringBuilder sb2 = new StringBuilder("parsing ");
        Type type = this.f255099b;
        sb2.append(type);
        String string = sb2.toString();
        EE0.g gVar = this.f255100c;
        long jStart = gVar.start();
        try {
            Gson gson = this.f255098a;
            gson.getClass();
            com.google.gson.stream.a aVar = new com.google.gson.stream.a(reader);
            aVar.f362208c = false;
            Object objC = gson.c(aVar, type);
            Gson.a(aVar, objC);
            gVar.a(jStart, string);
            return objC;
        } catch (Exception e12) {
            V2.f318762a.c("AvitoResponseParserConverter", "error during parse " + type, e12);
            throw e12;
        }
    }

    @Override // retrofit2.f
    public final Object convert(ResponseBody responseBody) throws IOException {
        ResponseBody responseBody2 = responseBody;
        try {
            try {
                return a(responseBody2.charStream());
            } catch (InvalidSchemaException e12) {
                throw new IOException(e12);
            }
        } finally {
            responseBody2.close();
        }
    }
}
