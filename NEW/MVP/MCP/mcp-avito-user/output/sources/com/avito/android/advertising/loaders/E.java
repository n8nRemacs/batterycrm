package com.avito.android.advertising.loaders;

import android.net.UrlQuerySanitizer;
import android.webkit.URLUtil;
import java.net.URL;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ProfilePromoBanner.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advertising_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class E {
    @Y61.l
    public static final String a(@Y61.k String str) {
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        URL url = new URL(lowerCase);
        if (C43066x.q(url.getHost(), "avito.ru", false) && C43066x.q(url.getPath(), "profile", false)) {
            return new UrlQuerySanitizer(lowerCase).getValue("id");
        }
        return null;
    }
}
