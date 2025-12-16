package com.yandex.metrica.impl.ob;

import com.adjust.sdk.Constants;
import com.yandex.metrica.impl.ob.C39145tb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class Ib {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, C39145tb.a> f378285a;

    static {
        HashMap map = new HashMap();
        map.put(Constants.REFERRER_API_GOOGLE, C39145tb.a.GOOGLE);
        map.put("huawei", C39145tb.a.HMS);
        map.put("yandex", C39145tb.a.YANDEX);
        f378285a = Collections.unmodifiableMap(map);
    }
}
