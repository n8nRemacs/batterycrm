package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.reward.RewardData;

/* loaded from: classes8.dex */
public final class c01 {
    public static boolean a(@j.P RewardData rewardData) {
        if (rewardData == null) {
            return false;
        }
        if (rewardData.e()) {
            if (rewardData.d() == null) {
                return false;
            }
        } else if (rewardData.c() == null) {
            return false;
        }
        return true;
    }
}
