package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class pi1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final jh1 f388865a;

    public pi1(@Y61.k Context context) {
        this.f388865a = new jh1(context);
    }

    public final void a(@Y61.k oi1 oi1Var, @Y61.k String str) {
        List<String> list = oi1Var.a().get(str);
        Objects.toString(list);
        System.out.getClass();
        if (list != null) {
            this.f388865a.a((List<String>) list, (Map<String, String>) null);
        }
    }

    public final void a(@Y61.k oi1 oi1Var, @Y61.k String str, @Y61.k Map<String, String> map) {
        List<String> list = oi1Var.a().get(str);
        Objects.toString(list);
        System.out.getClass();
        if (list != null) {
            this.f388865a.a(list, map);
        }
    }
}
