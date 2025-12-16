package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
final class a9 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ExecutorService f383440a = Executors.newSingleThreadExecutor(new mj0("YandexMobileAds.AdvertisingId"));

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final uy f383441b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.core.identifiers.ad.huawei.a f383442c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final sy f383443d;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y8 f383444b;

        public a(y8 y8Var) {
            this.f383444b = y8Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            u8 u8VarA = a9.a(a9.this);
            if (u8VarA.a() == null && u8VarA.b() == null) {
                ((w8) this.f383444b).a();
            } else {
                ((w8) this.f383444b).a(u8VarA);
            }
        }
    }

    public a9(@j.N Context context) {
        this.f383441b = new uy(context);
        this.f383443d = ty.a(context);
        this.f383442c = new com.yandex.mobile.ads.core.identifiers.ad.huawei.a(context);
    }

    public final void a(@j.N y8 y8Var) {
        this.f383440a.execute(new a(y8Var));
    }

    public static u8 a(a9 a9Var) {
        s8 s8VarA = a9Var.f383441b.a();
        s8 s8VarA2 = a9Var.f383442c.a();
        a9Var.f383443d.b(s8VarA);
        return new u8(s8VarA, s8VarA2, a9Var.f383443d.a(s8VarA));
    }
}
