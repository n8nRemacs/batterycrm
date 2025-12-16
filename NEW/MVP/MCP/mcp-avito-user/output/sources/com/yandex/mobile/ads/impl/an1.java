package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class an1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final o5 f383604a = new o5();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private n2 f383605b;

    public an1(@j.N n2 n2Var) {
        this.f383605b = n2Var;
    }

    public final void a(@j.N Context context, @j.N AdResponse adResponse, @j.P pl0 pl0Var) {
        HashMap map = new HashMap();
        if (pl0Var != null) {
            map.putAll(pl0Var.a());
        }
        a(context, adResponse, ky0.b.f387305f, map);
    }

    public final void a(@j.N Context context, @j.N AdResponse adResponse, @j.P ql0 ql0Var) {
        HashMap map = new HashMap();
        if (ql0Var != null) {
            map.putAll(ql0Var.a());
        }
        map.put("status", ky0.c.f387327b.a());
        a(context, adResponse, ky0.b.f387306g, map);
    }

    public final void a(@j.N Context context, @j.N AdResponse adResponse) {
        RewardData rewardDataC;
        String str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (adResponse != null && (rewardDataC = adResponse.C()) != null) {
            if (rewardDataC.e()) {
                str = "server_side";
            } else {
                str = "client_side";
            }
            map2.put("rewarding_side", str);
        }
        map.put("reward_info", map2);
        a(context, adResponse, ky0.b.f387291L, map);
    }

    private void a(@j.N Context context, @j.N AdResponse adResponse, @j.N ky0.b bVar, @j.N HashMap map) {
        String strA;
        int iG2;
        HashMap map2 = new HashMap();
        map2.put("ad_unit_id", adResponse.o());
        map2.put("block_id", adResponse.o());
        map2.put("adapter", "Yandex");
        y6 y6VarM = adResponse.m();
        map2.put("ad_type", y6VarM != null ? y6VarM.a() : null);
        map2.putAll(this.f383604a.a(this.f383605b.a()));
        if (adResponse.B() instanceof bl0) {
            List<nj0> listE = ((bl0) adResponse.B()).e();
            if (listE != null && !listE.isEmpty() && (iG2 = listE.get(0).g()) != 0) {
                strA = tz0.a(iG2);
            } else {
                strA = "";
            }
            map2.put("native_ad_type", strA);
        }
        ly0 ly0Var = new ly0(map2);
        ly0Var.b(adResponse.l(), "ad_source");
        Map<String, Object> mapA = ly0Var.a();
        mapA.putAll(map);
        m9.a(context).a(new ky0(bVar.a(), mapA));
    }
}
