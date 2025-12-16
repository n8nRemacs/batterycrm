package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.reward.ClientSideReward;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.base.model.reward.ServerSideReward;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes8.dex */
public final class b01 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ke f383722a;

    @X41.j
    public b01() {
        this(0);
    }

    @Y61.k
    public final RewardData a(@Y61.k jz0 jz0Var) throws UnsupportedEncodingException {
        String strA;
        Map<String, String> mapB = jz0Var.b();
        Integer numC = fz.c(mapB, 25);
        String str = mapB.get(i10.a(27));
        ServerSideReward serverSideReward = null;
        if (str != null) {
            this.f383722a.getClass();
            strA = ke.a(str.getBytes());
        } else {
            strA = null;
        }
        ClientSideReward clientSideReward = (numC == null || strA == null || strA.length() <= 0) ? null : new ClientSideReward(numC.intValue(), strA);
        String strD = fz.d(mapB, 28);
        if (strD != null && strD.length() > 0) {
            serverSideReward = new ServerSideReward(strD);
        }
        return new RewardData.b().a(clientSideReward).a(serverSideReward).a(fz.a(mapB, 33)).a();
    }

    public /* synthetic */ b01(int i12) {
        this(new ke());
    }

    @X41.j
    public b01(@Y61.k ke keVar) {
        this.f383722a = keVar;
    }
}
