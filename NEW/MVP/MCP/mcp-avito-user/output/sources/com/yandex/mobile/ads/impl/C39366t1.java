package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39366t1 implements oi1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final q6 f390051a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final String f390052b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final b91 f390053c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final List<String> f390054d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Map<String, List<String>> f390055e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private AdBreakParameters f390056f;

    public C39366t1(@j.N q6 q6Var, @j.P String str, @j.N b91 b91Var, @j.N List list, @j.N HashMap map) {
        this.f390051a = q6Var;
        this.f390052b = str;
        this.f390054d = list;
        this.f390053c = b91Var;
        this.f390055e = map;
    }

    @Override // com.yandex.mobile.ads.impl.oi1
    @j.N
    public final Map<String, List<String>> a() {
        return this.f390055e;
    }

    @j.N
    public final q6 b() {
        return this.f390051a;
    }

    @j.P
    public final String c() {
        return this.f390052b;
    }

    @j.N
    public final List<String> d() {
        return this.f390054d;
    }

    @j.P
    public final AdBreakParameters e() {
        return this.f390056f;
    }

    @j.N
    public final b91 f() {
        return this.f390053c;
    }

    public final void a(@j.N AdBreakParameters adBreakParameters) {
        this.f390056f = adBreakParameters;
    }
}
