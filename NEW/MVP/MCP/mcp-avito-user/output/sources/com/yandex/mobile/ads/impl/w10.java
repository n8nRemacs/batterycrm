package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.v10;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class w10 {
    @Y61.k
    public static af a(@Y61.k Context context, @Y61.l v10.b bVar, @Y61.l SSLSocketFactory sSLSocketFactory) {
        v11 v11VarA = q21.b().a(context);
        return (v11VarA == null || !v11VarA.e0()) ? new v10(bVar, sSLSocketFactory) : new x10(bVar, sSLSocketFactory);
    }
}
