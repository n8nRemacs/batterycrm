package com.avito.android.advertising;

import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.remote.model.AdSize;
import com.avito.android.remote.model.SerpDisplayType;
import kotlin.Metadata;

/* compiled from: AdResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/d;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface d {
    @Y61.k
    AdViewType a(@Y61.k SerpDisplayType serpDisplayType, @Y61.k AdSize adSize);

    int b(int i12, int i13, @Y61.k AdSize adSize);
}
