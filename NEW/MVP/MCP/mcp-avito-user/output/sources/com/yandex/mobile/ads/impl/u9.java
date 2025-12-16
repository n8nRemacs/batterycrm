package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qp;
import com.yandex.mobile.ads.impl.v9;
import javax.net.ssl.SSLSocket;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class u9 implements qp.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f390475a = "com.google.android.gms.org.conscrypt";

    @Override // com.yandex.mobile.ads.impl.qp.a
    public final boolean a(@Y61.k SSLSocket sSLSocket) {
        return C43066x.h0(sSLSocket.getClass().getName(), this.f390475a + '.', false);
    }

    @Override // com.yandex.mobile.ads.impl.qp.a
    @Y61.k
    public final v9 b(@Y61.k SSLSocket sSLSocket) {
        int i12 = v9.f390819g;
        return v9.a.a(sSLSocket.getClass());
    }
}
