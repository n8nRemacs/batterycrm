package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ts {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private String f390295a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private List<kw0> f390296b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private Map<String, String> f390297c = Collections.emptyMap();

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private String f390298d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private String f390299e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private String f390300f;

    @j.P
    public final String a() {
        return this.f390300f;
    }

    public final void b(@j.P String str) {
        this.f390295a = str;
    }

    @j.N
    public final Map<String, String> c() {
        return this.f390297c;
    }

    public final synchronized void d(@j.P String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f390298d = str;
        }
    }

    @j.N
    public final List<kw0> e() {
        return this.f390296b;
    }

    @j.P
    public final synchronized String f() {
        return this.f390298d;
    }

    public final void a(@j.P String str) {
        this.f390300f = str;
    }

    @j.P
    public final String b() {
        return this.f390295a;
    }

    public final void c(@j.N String str) {
        this.f390299e = str;
    }

    @j.P
    public final String d() {
        return this.f390299e;
    }
}
