package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
final class wm0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f391439a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Executor f391440b = v90.a().b();

    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final AdResponse<String> f391441b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final qz0 f391442c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final ym0 f391443d;

        public a(@j.N Context context, @j.N AdResponse<String> adResponse, @j.N qz0 qz0Var) {
            this.f391441b = adResponse;
            this.f391442c = qz0Var;
            this.f391443d = new ym0(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            bl0 bl0VarA = this.f391443d.a(this.f391441b);
            if (bl0VarA != null) {
                this.f391442c.a(bl0VarA);
            } else {
                this.f391442c.a();
            }
        }
    }

    public wm0(@j.N Context context) {
        this.f391439a = context.getApplicationContext();
    }

    public final void a(@j.N AdResponse<String> adResponse, @j.N qz0 qz0Var) {
        this.f391440b.execute(new a(this.f391439a, adResponse, qz0Var));
    }
}
