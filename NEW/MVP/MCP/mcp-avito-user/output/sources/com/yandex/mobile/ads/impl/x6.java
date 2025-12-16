package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public final class x6 {

    /* renamed from: c, reason: collision with root package name */
    private static final ExecutorService f391558c = Executors.newCachedThreadPool(new mj0("YandexMobileAds.UrlTracker"));

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f391559a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private n2 f391560b;

    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final String f391561b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final dc1 f391562c;

        public a(@j.N String str, @j.N dc1 dc1Var) {
            this.f391561b = str;
            this.f391562c = dc1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TextUtils.isEmpty(this.f391561b)) {
                return;
            }
            this.f391562c.a(this.f391561b);
        }
    }

    public x6(@j.N Context context, @j.N n2 n2Var) {
        this.f391559a = context.getApplicationContext();
        this.f391560b = n2Var;
    }

    public final void a(@j.P String str) {
        qs0 qs0Var = new qs0(this.f391559a);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f391558c.execute(new a(str, qs0Var));
    }

    public final void a(@j.P String str, @j.N AdResponse adResponse, @j.N C39307b1 c39307b1) {
        ru0 ru0Var = new ru0(new dj(this.f391559a, adResponse, this.f391560b, null), c39307b1);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f391558c.execute(new a(str, ru0Var));
    }

    public static void a(@j.P String str, @j.N j81 j81Var, @j.N oy0 oy0Var) {
        ru0 ru0Var = new ru0(oy0Var, j81Var);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f391558c.execute(new a(str, ru0Var));
    }
}
