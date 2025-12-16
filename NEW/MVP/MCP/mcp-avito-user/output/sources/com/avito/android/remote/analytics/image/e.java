package com.avito.android.remote.analytics.image;

import kotlin.Metadata;
import kotlin.w0;
import okhttp3.Headers;
import okhttp3.Request;

/* compiled from: ImageCdnHeadersStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/image/e;", "", "_avito_performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface e {
    void a(@Y61.k Request request, @Y61.k Headers headers);

    @Y61.l
    String b(@Y61.k String str);

    @Y61.l
    w0 c(@Y61.k String str);
}
