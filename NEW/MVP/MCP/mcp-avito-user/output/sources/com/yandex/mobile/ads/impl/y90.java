package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class y90 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final LinkedHashMap f391967a = new LinkedHashMap();

    @X41.n
    @Y61.k
    public static final w90 a(@Y61.k Context context) {
        return a(context, "YadPreferenceFile");
    }

    @X41.n
    @Y61.k
    public static final w90 a(@Y61.k Context context, @Y61.k String str) {
        LinkedHashMap linkedHashMap = f391967a;
        w90 w90Var = (w90) linkedHashMap.get(str);
        if (w90Var != null) {
            return w90Var;
        }
        x90 x90Var = new x90(context, str);
        linkedHashMap.put(str, x90Var);
        return x90Var;
    }
}
