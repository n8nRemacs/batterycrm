package com.yandex.mobile.ads.impl;

import java.net.InetSocketAddress;
import java.net.Socket;

/* loaded from: classes8.dex */
public final class vo implements sz {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // com.yandex.mobile.ads.impl.sz
    public final boolean a(@Y61.k String str) {
        Socket socket;
        try {
            try {
                socket = new Socket();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            socket = null;
        }
        try {
            socket.connect(new InetSocketAddress(str, 80), 5000);
            boolean zIsConnected = socket.isConnected();
            socket.close();
            str = zIsConnected;
        } catch (Throwable unused3) {
            str = 0;
            str = 0;
            if (socket != null) {
                socket.close();
            }
            return str;
        }
        return str;
    }
}
