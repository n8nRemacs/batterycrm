package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ts0;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class i80 extends ts0 {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f386364d;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numY0 = property != null ? C43066x.y0(property) : null;
        boolean z12 = false;
        if (numY0 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                z12 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numY0.intValue() >= 9) {
            z12 = true;
        }
        f386364d = z12;
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    public final void a(@Y61.k SSLSocket sSLSocket, @Y61.l String str, @Y61.k List<sv0> list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) ts0.a.a(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    @Y61.l
    public final String b(@Y61.k SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
