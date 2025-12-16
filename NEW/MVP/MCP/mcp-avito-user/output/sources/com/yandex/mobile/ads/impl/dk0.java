package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes8.dex */
final class dk0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final tj0 f384627a;

    public dk0(@j.N Context context) {
        this.f384627a = new tj0(context);
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/monetization/ads/mediation/nativeads/a;Ljava/util/Map<Ljava/lang/String;Landroid/graphics/Bitmap;>;Ljava/lang/Object;)Lcom/yandex/mobile/ads/base/AdResponse<Lcom/yandex/mobile/ads/impl/bl0;>; */
    @j.N
    public final AdResponse a(@j.N com.monetization.ads.mediation.nativeads.a aVar, @j.N Map map, @j.N int i12) {
        ArrayList arrayListA = this.f384627a.a(aVar.b(), map);
        nj0 nj0Var = new nj0();
        nj0Var.c(tz0.a(i12));
        nj0Var.c(arrayListA);
        bl0 bl0Var = new bl0();
        bl0Var.a(Collections.singletonList(nj0Var));
        return new AdResponse.b().a((AdResponse.b) bl0Var).a();
    }
}
