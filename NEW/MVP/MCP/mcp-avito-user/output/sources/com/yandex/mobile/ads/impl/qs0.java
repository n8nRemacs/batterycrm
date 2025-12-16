package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.df;

/* loaded from: classes8.dex */
public final class qs0 implements dc1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f389290a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final zy0 f389291b = zy0.a();

    public qs0(@j.N Context context) {
        this.f389290a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void a(@j.N String str) {
        ps0 ps0Var = new ps0(this.f389290a, str, new a(str));
        zy0 zy0Var = this.f389291b;
        Context context = this.f389290a;
        synchronized (zy0Var) {
            jp0.a(context).a(ps0Var);
        }
    }

    public static class a implements df.a<zo0> {
        public a(String str) {
        }

        @Override // com.yandex.mobile.ads.impl.kz0.b
        public final void a(Object obj) {
            int i12 = ((zo0) obj).f392315a;
        }

        @Override // com.yandex.mobile.ads.impl.kz0.a
        public final void a(@j.N ok1 ok1Var) {
            ok1Var.toString();
        }
    }
}
