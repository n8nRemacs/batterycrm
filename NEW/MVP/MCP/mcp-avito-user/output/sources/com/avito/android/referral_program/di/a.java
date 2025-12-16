package com.avito.android.referral_program.di;

import Y61.k;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: OkHttpClient.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "intercept", "okhttp3/OkHttpClient$Builder$addInterceptor$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42726C f252659b;

    public a(InterfaceC42726C interfaceC42726C) {
        this.f252659b = interfaceC42726C;
    }

    @Override // okhttp3.Interceptor
    @k
    public final Response intercept(@k Interceptor.Chain chain) {
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        c cVar = c.f252661a;
        builderNewBuilder.addHeader("X-Statusbar-Height", (String) this.f252659b.getValue());
        return chain.proceed(builderNewBuilder.build());
    }
}
