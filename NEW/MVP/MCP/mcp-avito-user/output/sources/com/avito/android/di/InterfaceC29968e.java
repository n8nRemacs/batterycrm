package com.avito.android.di;

import com.google.gson.Gson;
import kotlin.Metadata;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;

/* compiled from: CheckRequestDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/e;", "Lcom/avito/android/di/h;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC29968e extends InterfaceC29971h {
    @Y61.k
    CertificatePinner Dd();

    @Y61.k
    com.avito.android.P E();

    @Y61.k
    OkHttpClient Il();

    @Y61.k
    com.avito.android.server_time.a T();

    @Y61.k
    Gson s();
}
