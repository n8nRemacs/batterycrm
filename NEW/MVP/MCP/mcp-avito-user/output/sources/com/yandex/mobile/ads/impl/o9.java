package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.yandex.mobile.ads.impl.ts0;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

@SuppressLint({"NewApi"})
/* loaded from: classes8.dex */
public final class o9 implements d61 {

    public static final class a {
        @Y61.l
        public static o9 a() {
            if (b()) {
                return new o9();
            }
            return null;
        }

        public static boolean b() {
            int i12 = ts0.f390303c;
            return ts0.a.c() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // com.yandex.mobile.ads.impl.d61
    public final boolean a(@Y61.k SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // com.yandex.mobile.ads.impl.d61
    @Y61.l
    @SuppressLint({"NewApi"})
    public final String b(@Y61.k SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // com.yandex.mobile.ads.impl.d61
    public final boolean a() {
        return a.b();
    }

    @Override // com.yandex.mobile.ads.impl.d61
    @SuppressLint({"NewApi"})
    public final void a(@Y61.k SSLSocket sSLSocket, @Y61.l String str, @Y61.k List<? extends sv0> list) throws IOException {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            int i12 = ts0.f390303c;
            sSLParameters.setApplicationProtocols((String[]) ts0.a.a(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e12) {
            throw new IOException("Android internal error", e12);
        }
    }
}
