package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.po;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public final class gh1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private static volatile com.yandex.mobile.ads.exo.offline.c f385746a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private static final Object f385747b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f385748c = 0;

    @j.k0
    public static final class a {
        @Y61.k
        public static com.yandex.mobile.ads.exo.offline.c a(@Y61.k Context context, @Y61.k t61 t61Var, @Y61.k yg ygVar, @Y61.k po.a aVar, @Y61.k ExecutorService executorService) {
            return new com.yandex.mobile.ads.exo.offline.c(context, t61Var, ygVar, aVar, executorService);
        }
    }

    private static com.yandex.mobile.ads.exo.offline.c a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return a.a(applicationContext, new t61(applicationContext), yt.a().a(applicationContext), new po.a(applicationContext, new mn1().a(applicationContext)), Executors.newFixedThreadPool(4));
    }

    @Y61.l
    public static com.yandex.mobile.ads.exo.offline.c b(@Y61.k Context context) {
        com.yandex.mobile.ads.exo.offline.c cVarA;
        com.yandex.mobile.ads.exo.offline.c cVar = f385746a;
        if (cVar != null) {
            return cVar;
        }
        synchronized (f385747b) {
            com.yandex.mobile.ads.exo.offline.c cVar2 = f385746a;
            if (cVar2 != null) {
                return cVar2;
            }
            try {
                cVarA = a(context);
                f385746a = cVarA;
            } catch (Throwable th2) {
                th2.toString();
                cVarA = null;
            }
            return cVarA;
        }
    }
}
