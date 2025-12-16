package com.yandex.mobile.ads.impl;

import android.util.Log;
import androidx.compose.ui.platform.C22491k0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class q9 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final CopyOnWriteArraySet<Logger> f389113a = new CopyOnWriteArraySet<>();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private static final Map<String, String> f389114b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f389115c = 0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = bq0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(bq0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(t00.class.getName(), "okhttp.Http2");
        linkedHashMap.put(o81.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttplib.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f389114b = kotlin.collections.P0.q(linkedHashMap);
    }

    public static void a(@Y61.k String str, int i12, @Y61.k String str2, @Y61.l Throwable th2) {
        int iMin;
        String strT0 = f389114b.get(str);
        if (strT0 == null) {
            strT0 = C43066x.t0(23, str);
        }
        if (Log.isLoggable(strT0, i12)) {
            if (th2 != null) {
                StringBuilder sbB = C22491k0.b(str2, '\n');
                sbB.append(Log.getStackTraceString(th2));
                str2 = sbB.toString();
            }
            int length = str2.length();
            int i13 = 0;
            while (i13 < length) {
                int iH2 = C43066x.H('\n', i13, 4, str2);
                if (iH2 == -1) {
                    iH2 = length;
                }
                while (true) {
                    iMin = Math.min(iH2, i13 + 4000);
                    Log.println(i12, strT0, str2.substring(i13, iMin));
                    if (iMin >= iH2) {
                        break;
                    } else {
                        i13 = iMin;
                    }
                }
                i13 = iMin + 1;
            }
        }
    }

    public static void a() {
        Level level;
        for (Map.Entry<String, String> entry : f389114b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Logger logger = Logger.getLogger(key);
            if (f389113a.add(logger)) {
                logger.setUseParentHandlers(false);
                if (Log.isLoggable(value, 3)) {
                    level = Level.FINE;
                } else {
                    level = Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING;
                }
                logger.setLevel(level);
                logger.addHandler(r9.f389446a);
            }
        }
    }
}
