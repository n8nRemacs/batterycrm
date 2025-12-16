package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.df;
import com.yandex.mobile.ads.impl.z11;

/* loaded from: classes8.dex */
public final class f21 implements df.a<v11> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f385155a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final a21 f385156b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final z11.a f385157c;

    public f21(@j.N Context context, @j.N a21 a21Var, @j.N z11.a aVar) {
        this.f385155a = context.getApplicationContext();
        this.f385156b = a21Var;
        this.f385157c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.kz0.b
    public final void a(@j.N Object obj) {
        this.f385156b.a(this.f385155a, (v11) obj);
        this.f385157c.a();
    }

    @Override // com.yandex.mobile.ads.impl.kz0.a
    public final void a(ok1 ok1Var) {
        this.f385157c.a(ok1Var);
    }
}
