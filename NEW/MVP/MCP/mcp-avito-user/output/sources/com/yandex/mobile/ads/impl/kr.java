package com.yandex.mobile.ads.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.C42756l;

/* loaded from: classes8.dex */
final class kr implements lr {
    @Override // com.yandex.mobile.ads.impl.lr
    @Y61.k
    public final List<InetAddress> a(@Y61.k String str) throws UnknownHostException {
        try {
            return C42756l.g0(InetAddress.getAllByName(str));
        } catch (NullPointerException e12) {
            UnknownHostException unknownHostException = new UnknownHostException(up1.a("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e12);
            throw unknownHostException;
        }
    }
}
