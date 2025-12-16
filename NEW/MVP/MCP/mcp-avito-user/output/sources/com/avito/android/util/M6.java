package com.avito.android.util;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: WebViewUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class M6 {
    public static final boolean a(@Y61.k Uri uri, @Y61.k String str) {
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        return host.equals(str) || C43066x.z(host, ".".concat(str), false);
    }
}
