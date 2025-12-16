package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class H1 {

    /* renamed from: a, reason: collision with root package name */
    private static final C38987mn f378208a = new C38987mn();

    /* renamed from: b, reason: collision with root package name */
    private static final Zl<Integer, d> f378209b;

    /* renamed from: c, reason: collision with root package name */
    @TargetApi(23)
    private static final Zl<Integer, d> f378210c;

    /* renamed from: d, reason: collision with root package name */
    private static final Zl<d, Integer> f378211d;

    public class a extends Zl<Integer, d> {
        public a(d dVar) {
            super(dVar);
            a(1, d.WIFI);
            a(0, d.CELL);
            a(7, d.BLUETOOTH);
            a(9, d.ETHERNET);
            a(4, d.MOBILE_DUN);
            a(5, d.MOBILE_HIPRI);
            a(2, d.MOBILE_MMS);
            a(3, d.MOBILE_SUPL);
            a(6, d.WIMAX);
            if (A2.a(21)) {
                a(17, d.VPN);
            }
        }
    }

    public class b extends Zl<Integer, d> {
        public b(d dVar) {
            super(dVar);
            a(1, d.WIFI);
            a(0, d.CELL);
            a(3, d.ETHERNET);
            a(2, d.BLUETOOTH);
            a(4, d.VPN);
            if (A2.a(27)) {
                a(6, d.LOWPAN);
            }
            if (A2.a(26)) {
                a(5, d.WIFI_AWARE);
            }
        }
    }

    public class c extends Zl<d, Integer> {
        public c(Integer num) {
            super(num);
            a(d.CELL, 0);
            a(d.WIFI, 1);
            a(d.BLUETOOTH, 3);
            a(d.ETHERNET, 4);
            a(d.MOBILE_DUN, 5);
            a(d.MOBILE_HIPRI, 6);
            a(d.MOBILE_MMS, 7);
            a(d.MOBILE_SUPL, 8);
            a(d.VPN, 9);
            a(d.WIMAX, 10);
            a(d.LOWPAN, 11);
            a(d.WIFI_AWARE, 12);
        }
    }

    public enum d {
        WIFI,
        CELL,
        ETHERNET,
        BLUETOOTH,
        VPN,
        LOWPAN,
        WIFI_AWARE,
        MOBILE_DUN,
        MOBILE_HIPRI,
        MOBILE_MMS,
        MOBILE_SUPL,
        WIMAX,
        OFFLINE,
        UNDEFINED
    }

    static {
        d dVar = d.UNDEFINED;
        f378209b = new a(dVar);
        f378210c = new b(dVar);
        f378211d = new c(2);
    }

    @j.N
    public static com.yandex.metrica.b a(@j.N Context context, @j.N Point point) {
        float f12;
        try {
            f12 = context.getResources().getDisplayMetrics().density;
        } catch (Throwable unused) {
            f12 = 0.0f;
        }
        com.yandex.metrica.b bVar = com.yandex.metrica.b.PHONE;
        if (f12 == 0.0f) {
            return bVar;
        }
        float f13 = point.x;
        float f14 = point.y;
        float fMin = Math.min(f13 / f12, f14 / f12);
        float f15 = f12 * 160.0f;
        float f16 = f13 / f15;
        float f17 = f14 / f15;
        double dSqrt = Math.sqrt((f17 * f17) + (f16 * f16));
        return (dSqrt < 15.0d || f378208a.a(context, "android.hardware.touchscreen")) ? (dSqrt >= 7.0d || fMin >= 600.0f) ? com.yandex.metrica.b.TABLET : bVar : com.yandex.metrica.b.TV;
    }

    public static d b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? d.OFFLINE : f378209b.a(Integer.valueOf(activeNetworkInfo.getType()));
    }

    public static int b(@j.N Context context) {
        return f378211d.a(a(context)).intValue();
    }

    @j.N
    public static String a(@j.N Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb2 = new StringBuilder(language);
        if (A2.a(21)) {
            String script = locale.getScript();
            if (!TextUtils.isEmpty(script)) {
                sb2.append('-');
                sb2.append(script);
            }
        }
        if (!TextUtils.isEmpty(country)) {
            sb2.append('_');
            sb2.append(country);
        }
        return sb2.toString();
    }

    @j.N
    public static d a(@j.N Context context) {
        d dVarB;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        d dVar = d.UNDEFINED;
        if (connectivityManager != null) {
            try {
                if (A2.a(23)) {
                    dVarB = a(connectivityManager);
                } else {
                    dVarB = b(connectivityManager);
                }
            } catch (Throwable unused) {
            }
        } else {
            dVarB = null;
        }
        return dVarB == null ? dVar : dVarB;
    }

    public static d a(ConnectivityManager connectivityManager) {
        d dVar = d.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (a(connectivityManager, activeNetwork)) {
            return d.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return dVar;
        }
        for (Integer num : f378210c.a()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return f378210c.a(num);
            }
        }
        return dVar;
    }

    private static boolean a(@j.N ConnectivityManager connectivityManager, @j.P Network network) {
        NetworkInfo networkInfo;
        return A2.a(29) ? network == null : network == null || !((networkInfo = connectivityManager.getNetworkInfo(network)) == null || networkInfo.isConnected());
    }
}
