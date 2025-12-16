package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.ClientSideReward;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.base.model.reward.ServerSideReward;

/* loaded from: classes8.dex */
public final class s01 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final t01 f389740a;

    public s01(@j.N aw0 aw0Var) {
        this.f389740a = aw0Var;
    }

    @j.P
    public final r01 a(@j.N Context context, @j.P AdResponse adResponse, @j.N n2 n2Var) {
        RewardData rewardDataC = adResponse != null ? adResponse.C() : null;
        if (rewardDataC == null) {
            return null;
        }
        if (rewardDataC.e()) {
            ServerSideReward serverSideRewardD = rewardDataC.d();
            if (serverSideRewardD != null) {
                return new i31(context, n2Var, serverSideRewardD);
            }
            return null;
        }
        ClientSideReward clientSideRewardC = rewardDataC.c();
        if (clientSideRewardC != null) {
            return new fj(clientSideRewardC, this.f389740a);
        }
        return null;
    }
}
