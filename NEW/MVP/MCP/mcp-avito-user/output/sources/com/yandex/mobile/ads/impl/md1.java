package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes8.dex */
public final class md1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39366t1 f387977a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final Map<String, String> f387978b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final C39366t1 f387979a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private Map<String, String> f387980b;

        public a(@j.N C39366t1 c39366t1) {
            this.f387979a = c39366t1;
            xg1.a(c39366t1);
        }

        @j.N
        public final md1 a() {
            return new md1(this, 0);
        }

        @j.N
        public final a b() {
            this.f387980b = null;
            return this;
        }
    }

    public /* synthetic */ md1(a aVar, int i12) {
        this(aVar);
    }

    @j.N
    public final C39366t1 a() {
        return this.f387977a;
    }

    @j.P
    public final Map<String, String> b() {
        return this.f387978b;
    }

    private md1(@j.N a aVar) {
        this.f387977a = aVar.f387979a;
        this.f387978b = aVar.f387980b;
    }
}
