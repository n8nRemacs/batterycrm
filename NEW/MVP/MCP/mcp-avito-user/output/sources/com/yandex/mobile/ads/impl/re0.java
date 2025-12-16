package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.impl.ky0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class re0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n2 f389520a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final o5 f389521b = new o5();

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final AdResponse f389522c;

    public re0(@j.N n2 n2Var, @j.P AdResponse adResponse) {
        this.f389520a = n2Var;
        this.f389522c = adResponse;
    }

    public final void a(@j.N Context context, @j.N zf0 zf0Var, @j.N HashMap map) {
        a(context, ky0.b.f387304e, zf0Var, map);
    }

    public final void b(@j.N Context context, @j.N zf0 zf0Var, @j.N HashMap map) {
        a(context, ky0.b.f387280A, zf0Var, map);
    }

    public final void c(@j.N Context context, @j.N zf0 zf0Var, @j.N HashMap map) {
        a(context, ky0.b.f387321v, zf0Var, map);
        a(context, ky0.b.f387322w, zf0Var, map);
    }

    public final void d(@j.N Context context, @j.N zf0 zf0Var, @j.N HashMap map) {
        a(context, ky0.b.f387303d, zf0Var, map);
    }

    public final void e(@j.N Context context, @j.N zf0 zf0Var, @j.N HashMap map) {
        a(context, ky0.b.f387306g, zf0Var, map);
    }

    public final void f(@j.N Context context, @j.N zf0 zf0Var, @j.N HashMap map) {
        a(context, ky0.b.f387307h, zf0Var, map);
    }

    public final void a(@j.N Context context, @j.N zf0 zf0Var, @j.P AdResponse adResponse) {
        RewardData rewardDataC;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (adResponse != null && (rewardDataC = adResponse.C()) != null) {
            map2.put("rewarding_side", rewardDataC.e() ? "server_side" : "client_side");
        }
        map.put("reward_info", map2);
        a(context, ky0.b.f387291L, zf0Var, map);
    }

    public final void b(@j.N Context context, @j.N zf0 zf0Var) {
        a(context, ky0.b.f387305f, zf0Var, Collections.emptyMap());
    }

    public final void b(@j.N Context context, @j.N zf0 zf0Var, @j.N Map<String, Object> map) {
        a(context, ky0.b.f387325z, zf0Var, map);
    }

    public final void a(@j.N Context context, @j.N zf0 zf0Var) {
        a(context, ky0.b.f387320u, zf0Var, Collections.emptyMap());
    }

    public final void a(@j.N Context context, @j.N zf0 zf0Var, @j.N Map<String, Object> map) {
        a(context, ky0.b.f387320u, zf0Var, map);
    }

    private void a(@j.N Context context, @j.N ky0.b bVar, @j.N zf0 zf0Var, @j.N Map<String, Object> map) {
        HashMap map2 = new HashMap();
        map2.put("ad_unit_id", this.f389520a.c());
        map2.put("block_id", this.f389520a.c());
        map2.put("ad_type", this.f389520a.b().a());
        map2.put("adapter", zf0Var.c());
        map2.put("adapter_parameters", zf0Var.g());
        map2.putAll(this.f389521b.a(this.f389520a.a()));
        ly0 ly0Var = new ly0(map2);
        AdResponse adResponse = this.f389522c;
        ly0Var.b(adResponse != null ? adResponse.l() : null, "ad_source");
        Map<String, Object> mapA = ly0Var.a();
        mapA.putAll(map);
        m9.a(context).a(new ky0(bVar.a(), mapA));
    }
}
