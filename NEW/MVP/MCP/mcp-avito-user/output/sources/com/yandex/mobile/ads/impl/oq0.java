package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.kz0;

/* loaded from: classes8.dex */
public final class oq0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f388615a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final rq0 f388616b;

    /* renamed from: c, reason: collision with root package name */
    private final zy0 f388617c = zy0.a();

    /* renamed from: d, reason: collision with root package name */
    private final q21 f388618d = q21.b();

    public oq0(@Y61.k Context context) {
        this.f388615a = context.getApplicationContext();
        this.f388616b = sq0.a(context);
    }

    public final void a(@Y61.k kq0 kq0Var) {
        v11 v11VarA = this.f388618d.a(this.f388615a);
        String strR = v11VarA != null ? v11VarA.r() : null;
        String strB = this.f388616b.b();
        if (strR == null || strR.length() <= 0 || kotlin.jvm.internal.L.f(strR, strB)) {
            ((qq0) kq0Var).a();
            return;
        }
        a aVar = new a(strR, kq0Var);
        k71 k71Var = new k71(strR, aVar, aVar);
        k71Var.b((Object) "om_sdk_js_request_tag");
        this.f388617c.a(this.f388615a, k71Var);
    }

    public final class a implements kz0.b<String>, kz0.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final String f388619a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final kq0 f388620b;

        public a(String str, @Y61.k kq0 kq0Var) {
            this.f388619a = str;
            this.f388620b = kq0Var;
        }

        @Override // com.yandex.mobile.ads.impl.kz0.b
        public final void a(Object obj) {
            oq0.this.f388616b.a((String) obj);
            oq0.this.f388616b.b(this.f388619a);
            this.f388620b.a();
        }

        @Override // com.yandex.mobile.ads.impl.kz0.a
        public final void a(@Y61.k ok1 ok1Var) {
            this.f388620b.a();
        }
    }

    public final void a() {
        zy0 zy0Var = this.f388617c;
        Context context = this.f388615a;
        zy0Var.getClass();
        zy0.a(context, "om_sdk_js_request_tag");
    }
}
