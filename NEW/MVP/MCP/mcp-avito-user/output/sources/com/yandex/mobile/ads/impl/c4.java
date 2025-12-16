package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ny0 f384170a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final b4 f384171b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private ky0.a f384172c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private ky0.a f384173d;

    public c4(@j.N Context context, @j.N a4 a4Var) {
        this.f384170a = m9.a(context);
        this.f384171b = new b4(a4Var);
    }

    public final void a(@j.N ky0.a aVar) {
        this.f384173d = aVar;
    }

    public final void b(@j.N ky0.a aVar) {
        this.f384172c = aVar;
    }

    public final void a() {
        HashMap mapG = org.webrtc.h.g("status", "success");
        mapG.putAll(this.f384171b.a());
        ky0.a aVar = this.f384172c;
        if (aVar != null) {
            mapG.putAll(aVar.a());
        }
        ky0.a aVar2 = this.f384173d;
        if (aVar2 != null) {
            mapG.putAll(aVar2.a());
        }
        this.f384170a.a(new ky0(ky0.b.f387301b.a(), mapG));
    }

    public final void a(@j.N String str) {
        HashMap map = new HashMap();
        map.put("status", "error");
        map.put("failure_reason", str);
        map.putAll(this.f384171b.a());
        ky0.a aVar = this.f384172c;
        if (aVar != null) {
            map.putAll(aVar.a());
        }
        ky0.a aVar2 = this.f384173d;
        if (aVar2 != null) {
            map.putAll(aVar2.a());
        }
        this.f384170a.a(new ky0(ky0.b.f387301b.a(), map));
    }
}
