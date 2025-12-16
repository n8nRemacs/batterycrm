package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes8.dex */
public final class ll1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final nr0 f387569a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final j41 f387570b = new j41();

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f387571b;

        public a(Map map) {
            this.f387571b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ll1.this.f387569a.setVisibility(0);
            ll1.a(ll1.this, this.f387571b);
        }
    }

    public ll1(@j.N nr0 nr0Var) {
        this.f387569a = nr0Var;
    }

    public final void a(@j.P Map<String, String> map) {
        this.f387570b.a(new a(map));
    }

    public static void a(ll1 ll1Var, Map map) {
        nr0 nr0Var = ll1Var.f387569a;
        q00 q00Var = nr0Var.f388355f;
        if (q00Var != null) {
            q00Var.a(nr0Var, map);
        }
    }
}
