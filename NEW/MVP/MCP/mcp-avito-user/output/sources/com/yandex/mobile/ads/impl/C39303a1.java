package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.webkit.URLUtil;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.mobile.ads.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39303a1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ng f383369a;

    /* renamed from: com.yandex.mobile.ads.impl.a1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final AtomicLong f383370a = new AtomicLong(SystemClock.elapsedRealtime() - 2000);
    }

    public C39303a1(@j.N ko1 ko1Var) {
        ko1Var.getClass();
        this.f383369a = new ng(ko1.a(), 0);
    }

    public final void a(@j.P Context context, @j.N oy0 oy0Var, @j.N String str, @j.N ResultReceiver resultReceiver, boolean z12) {
        String strG;
        ((dj) oy0Var).a(org.webrtc.h.g("click_type", "default"));
        if (resultReceiver != null) {
            resultReceiver.send(9, null);
        }
        if (context != null) {
            AtomicLong atomicLong = a.f383370a;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long andSet = jElapsedRealtime - a.f383370a.getAndSet(jElapsedRealtime);
            if (andSet < 0 || andSet > 1000) {
                v11 v11VarA = q21.b().a(context);
                int iA2 = (v11VarA == null || (strG = v11VarA.g()) == null) ? 0 : yi.a(strG);
                if (((z12 && iA2 == 0) || n6.a(2, iA2)) && fc1.a(str)) {
                    this.f383369a.a(context, resultReceiver, str);
                } else if (new hc1().a(context, str)) {
                    resultReceiver.send(7, null);
                } else if (URLUtil.isNetworkUrl(str)) {
                    this.f383369a.a(context, resultReceiver, str);
                }
            }
        }
    }
}
