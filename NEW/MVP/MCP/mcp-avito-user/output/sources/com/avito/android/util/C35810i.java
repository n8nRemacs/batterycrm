package com.avito.android.util;

import com.avito.android.remote.model.AdvertPrice;
import kotlin.Metadata;

/* compiled from: AdvertNormalizedPriceFormatter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/i;", "Lcom/avito/android/util/o;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35810i extends C35858o {
    @Override // com.avito.android.util.C35858o
    @Y61.l
    public final String c(@Y61.k AdvertPrice advertPrice) {
        return advertPrice.getNormalizedValue();
    }

    @Override // com.avito.android.util.C35858o
    @Y61.k
    public final String b(@Y61.l String str, @Y61.k String str2) {
        return str2;
    }
}
