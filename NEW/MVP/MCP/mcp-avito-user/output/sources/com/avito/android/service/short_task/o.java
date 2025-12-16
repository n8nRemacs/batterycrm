package com.avito.android.service.short_task;

import com.avito.android.remote.model.TimeResponse;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import com.google.gson.internal.A;
import java.io.Reader;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: CheckTimeDiffInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/o;", "Lokhttp3/Interceptor;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.a f274107b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Gson f274108c;

    public o(@Y61.k com.avito.android.server_time.a aVar, @Y61.k Gson gson) {
        this.f274107b = aVar;
        this.f274108c = gson;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        Response responseProceed = chain.proceed(chain.request());
        ResponseBody responseBodyBody = responseProceed.body();
        if (responseBodyBody == null) {
            return responseProceed;
        }
        Reader readerCharStream = responseBodyBody.charStream();
        Gson gson = this.f274108c;
        gson.getClass();
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(readerCharStream);
        aVar.f362208c = false;
        Object objC = gson.c(aVar, TimeResponse.class);
        Gson.a(aVar, objC);
        TimeResponse timeResponse = (TimeResponse) A.b(TimeResponse.class).cast(objC);
        this.f274107b.getClass();
        V2.f318762a.c("TimeDiffAnalyticsInterceptor", androidx.compose.ui.graphics.colorspace.e.i(Math.abs(System.currentTimeMillis() - timeResponse.getTimestamp()), "Local and server time diff is ", " ms"), null);
        return responseProceed;
    }
}
