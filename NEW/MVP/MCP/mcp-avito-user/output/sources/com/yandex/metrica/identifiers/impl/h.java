package com.yandex.metrica.identifiers.impl;

import com.adjust.sdk.Constants;
import java.util.Map;
import kotlin.Q;
import kotlin.collections.P0;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f377728a;

    public h(Map map, int i12) {
        this.f377728a = (i12 & 1) != 0 ? P0.g(new Q(Constants.REFERRER_API_GOOGLE, new k()), new Q("huawei", new r()), new Q("yandex", new o())) : null;
    }
}
