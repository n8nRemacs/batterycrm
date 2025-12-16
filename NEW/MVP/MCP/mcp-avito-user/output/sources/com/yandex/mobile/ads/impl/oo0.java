package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class oo0 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final String f388601a;

    /* renamed from: b, reason: collision with root package name */
    private final List<eb<?>> f388602b;

    /* renamed from: c, reason: collision with root package name */
    private final List<q31> f388603c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final List<String> f388604d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final AdImpressionData f388605e;

    public oo0(@j.P List list, @j.N ArrayList arrayList, @j.N ArrayList arrayList2, @j.P String str, @j.P AdImpressionData adImpressionData) {
        this.f388602b = list;
        this.f388603c = arrayList;
        this.f388604d = arrayList2;
        this.f388601a = str;
        this.f388605e = adImpressionData;
    }

    @j.P
    public final String a() {
        return this.f388601a;
    }

    @j.N
    public final List<eb<?>> b() {
        List<eb<?>> list = this.f388602b;
        return list != null ? list : Collections.emptyList();
    }

    @j.P
    public final AdImpressionData c() {
        return this.f388605e;
    }

    @j.N
    public final List<String> d() {
        return this.f388604d;
    }

    @j.N
    public final List<q31> e() {
        return this.f388603c;
    }
}
