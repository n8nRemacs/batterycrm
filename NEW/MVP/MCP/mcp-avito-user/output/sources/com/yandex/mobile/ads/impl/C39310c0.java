package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.ky0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39310c0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final o5 f384134a = new o5();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final WeakReference<InterfaceC39306b0> f384135b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ny0 f384136c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final n2 f384137d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final bv f384138e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private a f384139f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private ky0.a f384140g;

    /* renamed from: h, reason: collision with root package name */
    private long f384141h;

    /* renamed from: com.yandex.mobile.ads.impl.c0$a */
    public enum a {
        f384142b("browser"),
        f384143c("webview"),
        f384144d("custom");


        /* renamed from: a, reason: collision with root package name */
        final String f384146a;

        a(String str) {
            this.f384146a = str;
        }
    }

    public C39310c0(@j.N Context context, @j.N n2 n2Var, @j.N InterfaceC39306b0 interfaceC39306b0, @j.P FalseClick falseClick) {
        this.f384137d = n2Var;
        this.f384135b = new WeakReference<>(interfaceC39306b0);
        this.f384136c = m9.a(context);
        this.f384138e = falseClick != null ? new bv(context, n2Var, falseClick) : null;
    }

    public final void a(@j.P ky0.a aVar) {
        this.f384140g = aVar;
    }

    public final void b(@j.N a aVar) {
        Objects.toString(aVar);
        this.f384141h = System.currentTimeMillis();
        this.f384139f = aVar;
    }

    public final void a(@j.P a aVar) {
        Objects.toString(aVar);
        if (this.f384141h == 0 || this.f384139f != aVar) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f384141h;
        String str = jCurrentTimeMillis < 1000 ? "<1" : (jCurrentTimeMillis <= 1000 || jCurrentTimeMillis > 2000) ? (jCurrentTimeMillis <= 2000 || jCurrentTimeMillis > 3000) ? (jCurrentTimeMillis <= 3000 || jCurrentTimeMillis > 5000) ? (jCurrentTimeMillis <= 5000 || jCurrentTimeMillis > 10000) ? (jCurrentTimeMillis <= 10000 || jCurrentTimeMillis > 15000) ? (jCurrentTimeMillis <= 15000 || jCurrentTimeMillis > 20000) ? ">20" : "15-20" : "10-15" : "5-10" : "3-5" : "2-3" : "1-2";
        HashMap map = new HashMap();
        map.put("type", aVar.f384146a);
        map.put("ad_type", this.f384137d.b().a());
        map.put("block_id", this.f384137d.c());
        map.put("ad_unit_id", this.f384137d.c());
        map.put("interval", str);
        map.putAll(this.f384134a.a(this.f384137d.a()));
        ky0.a aVar2 = this.f384140g;
        if (aVar2 != null) {
            map.putAll(aVar2.a());
        }
        this.f384136c.a(new ky0(ky0.b.f387290K.a(), map));
        InterfaceC39306b0 interfaceC39306b0 = this.f384135b.get();
        if (interfaceC39306b0 != null) {
            interfaceC39306b0.onReturnedToApplication();
        }
        bv bvVar = this.f384138e;
        if (bvVar != null) {
            bvVar.a(jCurrentTimeMillis);
        }
        this.f384141h = 0L;
        this.f384139f = null;
    }
}
