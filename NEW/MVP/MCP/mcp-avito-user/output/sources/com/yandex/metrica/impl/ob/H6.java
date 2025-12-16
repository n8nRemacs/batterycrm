package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class H6 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final F6 f378242a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final C39212w6 f378243b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final List<D6> f378244c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final String f378245d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final String f378246e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final Map<String, String> f378247f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public final String f378248g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public final Boolean f378249h;

    @j.k0
    public H6(@j.P F6 f62, @j.P C39212w6 c39212w6, @j.P List<D6> list, @j.P String str, @j.P String str2, @j.P Map<String, String> map, @j.P String str3, @j.P Boolean bool) {
        this.f378242a = f62;
        this.f378243b = c39212w6;
        this.f378244c = list;
        this.f378245d = str;
        this.f378246e = str2;
        this.f378247f = map;
        this.f378248g = str3;
        this.f378249h = bool;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        F6 f62 = this.f378242a;
        if (f62 != null) {
            for (D6 d62 : f62.d()) {
                sb2.append("at " + d62.a() + "." + d62.e() + "(" + d62.c() + ":" + d62.d() + ":" + d62.b() + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f378242a + "\n" + sb2.toString() + '}';
    }
}
