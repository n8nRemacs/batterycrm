package com.avito.android.advertising.loaders.avito_targeting;

import com.avito.android.advertising.loaders.NoAdException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoExceptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/AvitoTargetingNoBannerErrorException;", "Lcom/avito/android/advertising/loaders/NoAdException;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoTargetingNoBannerErrorException extends NoAdException {
    public AvitoTargetingNoBannerErrorException(long j12, Integer num, String str, int i12, C42822w c42822w) {
        String string;
        num = (i12 & 2) != 0 ? null : num;
        String str2 = "";
        str = (i12 & 4) != 0 ? "" : str;
        StringBuilder sb2 = new StringBuilder("Response: ");
        if (num != null && (string = num.toString()) != null) {
            str2 = string;
        }
        sb2.append(str2);
        sb2.append(' ');
        sb2.append(str);
        sb2.append(", Loading Time: ");
        super(AK.c.j(j12, " ms", sb2));
    }
}
