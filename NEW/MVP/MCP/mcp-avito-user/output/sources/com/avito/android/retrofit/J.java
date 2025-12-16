package com.avito.android.retrofit;

import com.avito.android.json.JsonParseDetailedException;
import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.ResponseBody;
import okio.C44802l;
import okio.Y;
import wl0.C49649b;

/* compiled from: ParsingExceptionHandlingConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/J;", "Lretrofit2/f;", "Lokhttp3/ResponseBody;", "", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class J implements retrofit2.f<ResponseBody, Object> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L f255097a;

    public J(@Y61.k L l12) {
        this.f255097a = l12;
    }

    @Override // retrofit2.f
    public final Object convert(ResponseBody responseBody) throws EOFException {
        ResponseBody responseBody2 = responseBody;
        Charset charsetA = C49649b.a(responseBody2);
        Y yPeek = responseBody2.getSource().peek();
        C44802l c44802l = new C44802l();
        yPeek.request(5000L);
        long jMin = Math.min(5000L, yPeek.f420047c.f420125c);
        while (jMin > 0) {
            long j12 = yPeek.read(c44802l, jMin);
            if (j12 == -1) {
                throw new EOFException();
            }
            jMin -= j12;
        }
        try {
            return this.f255097a.convert(responseBody2);
        } catch (JsonParseException e12) {
            try {
                String strZ1 = c44802l.z1(c44802l.f420125c, charsetA);
                kotlin.io.c.a(c44802l, null);
                throw new JsonParseDetailedException(strZ1, e12);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (MalformedJsonException e13) {
            try {
                String strZ12 = c44802l.z1(c44802l.f420125c, charsetA);
                kotlin.io.c.a(c44802l, null);
                throw new JsonParseDetailedException(strZ12, e13);
            } finally {
            }
        }
    }
}
