package com.avito.android.advertising.loaders.buzzoola;

import com.avito.android.remote.model.advertising.BuzzoolaRawResponse;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BuzzoolaBannerConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/a;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {
    @Y61.l
    String a();

    @Y61.k
    com.google.gson.k b(@Y61.l Map<String, ? extends Object> map);

    void c(@Y61.l String str);

    @Y61.k
    BuzzoolaBanner d(@Y61.k BuzzoolaRawResponse buzzoolaRawResponse);
}
