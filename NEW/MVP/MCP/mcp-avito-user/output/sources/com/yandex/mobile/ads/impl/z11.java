package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes8.dex */
public final class z11 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f392149a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final q8 f392150b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final us f392151c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final e21 f392152d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final a21 f392153e = a21.a();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final zy0 f392154f = zy0.a();

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final c21 f392155g = new c21();

    public interface a {
        void a();

        void a(@j.N ok1 ok1Var);
    }

    public z11(@j.N Context context, @j.N q8 q8Var, @j.N us usVar) {
        this.f392149a = context.getApplicationContext();
        this.f392150b = q8Var;
        this.f392151c = usVar;
        this.f392152d = new e21(context);
    }

    public final void a(@j.N e31 e31Var, @j.N a aVar) {
        String strG;
        if (!this.f392152d.a()) {
            aVar.a();
            return;
        }
        f21 f21Var = new f21(this.f392149a, this.f392153e, aVar);
        ts tsVarA = this.f392151c.a();
        Context context = this.f392149a;
        String strA = tsVarA.a();
        if (TextUtils.isEmpty(strA)) {
            strG = null;
        } else {
            strG = androidx.camera.camera2.internal.G.g(new StringBuilder(strA), strA.endsWith("/") ? "" : "/", "v1/startup?", this.f392155g.a(context, e31Var, this.f392150b, tsVarA));
        }
        if (TextUtils.isEmpty(strG)) {
            f21Var.a((ok1) new r2(null, 11));
            return;
        }
        d21 d21Var = new d21(this.f392149a, strG, this.f392152d, tsVarA.c(), f21Var);
        d21Var.b(this);
        zy0 zy0Var = this.f392154f;
        Context context2 = this.f392149a;
        synchronized (zy0Var) {
            jp0.a(context2).a(d21Var);
        }
    }

    public final void a() {
        zy0 zy0Var = this.f392154f;
        Context context = this.f392149a;
        zy0Var.getClass();
        zy0.a(context, this);
    }
}
