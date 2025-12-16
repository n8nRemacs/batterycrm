package com.my.target;

import android.content.Context;
import com.my.target.C37800n;
import e11.m2;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final HashMap f365069a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final HashMap f365070b;

    /* renamed from: c, reason: collision with root package name */
    public final long f365071c;

    /* renamed from: d, reason: collision with root package name */
    public final int f365072d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f365073e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f365074a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f365075b = false;

        public a(int i12) {
            this.f365074a = i12;
        }

        @j.N
        public final p1 a() {
            p1 p1Var = new p1(this.f365074a, "myTarget", 0);
            p1Var.f365073e = this.f365075b;
            return p1Var;
        }
    }

    public p1(int i12, @j.N String str, int i13) {
        HashMap map = new HashMap();
        this.f365069a = map;
        this.f365070b = new HashMap();
        this.f365072d = i13;
        this.f365071c = System.currentTimeMillis();
        map.put("slot", Integer.valueOf(i12));
        map.put("network", str);
    }

    public final void a(int i12, long j12) {
        this.f365070b.put(Integer.valueOf(i12), Long.valueOf(j12));
    }

    public final void b(@j.N Context context) {
        C37800n.a aVar;
        if (!this.f365073e || this.f365070b.isEmpty() || (aVar = T.f364598o.f364600c.f364990c) == null) {
            return;
        }
        HashMap map = this.f365069a;
        map.put("instanceId", aVar.f364992a);
        map.put("os", "Android");
        map.put("osver", aVar.f364993b);
        map.put("app", aVar.f364994c);
        map.put("appver", aVar.f364995d);
        map.put("sdkver", "5.16.4");
        m2.c(new com.vk.id.captcha.web.h(18, this, context));
    }
}
