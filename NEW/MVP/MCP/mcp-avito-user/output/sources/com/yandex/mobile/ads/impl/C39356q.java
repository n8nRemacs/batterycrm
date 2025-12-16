package com.yandex.mobile.ads.impl;

import com.adjust.sdk.Constants;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C39356q extends HashMap<String, InterfaceC39353p> {
    public C39356q(r rVar) {
        put("adtune", new z7(rVar.f389351a));
        put("close", new kj());
        put(Constants.DEEPLINK, new ao(rVar.f389351a));
        put("feedback", new iv(rVar.f389351a));
        put("social_action", new v51(rVar.f389351a));
    }
}
