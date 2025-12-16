package x01;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* renamed from: x01.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49736v {

    /* renamed from: b, reason: collision with root package name */
    public static C49736v f442066b;

    /* renamed from: a, reason: collision with root package name */
    public Context f442067a;

    static {
        new HashMap();
    }

    public static C49736v a() {
        C49736v c49736v;
        synchronized (C49736v.class) {
            try {
                if (f442066b == null) {
                    f442066b = new C49736v();
                }
                c49736v = f442066b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c49736v;
    }

    public static void c(String str, int i12, String str2, JSONObject jSONObject) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (2 == i12) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, Locale.getDefault());
                jCurrentTimeMillis = simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis))).getTime();
            } catch (ParseException unused) {
                m0.e("hmsSdk/stringUtil", "getMillisOfDate(): Time conversion Exception !");
                jCurrentTimeMillis = 0;
            }
        }
        String str3 = i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? "alltype" : "diffprivacy" : "preins" : "maint" : "oper";
        C49715B c49715b = new C49715B();
        c49715b.f441940b = AbstractC49722g.b();
        c49715b.f441941c = str2;
        c49715b.f441942d = jSONObject;
        c49715b.f441943e = str;
        c49715b.f441944f = str3;
        c49715b.f441945g = String.valueOf(jCurrentTimeMillis);
        C49714A.a().getClass();
        M m12 = (M) C49714A.f441937b.get(str);
        if (m12 != null) {
            m12.a("oper");
        }
        Q.f441989b.a(c49715b);
    }

    public final void b(Context context) {
        String str;
        String str2;
        this.f442067a = context;
        if (context == null) {
            str = "";
        } else {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), Http2.INITIAL_MAX_FRAME_SIZE).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                m0.e("hmsSdk", "getVersion(): The package name is not correct!");
            }
        }
        C49714A.a().f441939a.f441971d = str;
        if (i0.f442032c.a()) {
            String strB = C49733s.b(context, "global_v2", "app_ver");
            C49733s.e(context, "global_v2", "app_ver", str);
            C49714A.a().f441939a.getClass();
            if (!TextUtils.isEmpty(strB)) {
                if (!strB.equals(str)) {
                    m0.b("the appVers are different!");
                    a().e("", "alltype", strB);
                }
                C49714A.a().f441939a.f441968a = com.huawei.hms.hatool.f.b();
            }
            str2 = "app ver is first save!";
        } else {
            str2 = "userManager.isUserUnlocked() == false";
        }
        m0.b(str2);
        C49714A.a().f441939a.f441968a = com.huawei.hms.hatool.f.b();
    }

    public final void d(String str, String str2) {
        G gA2 = AbstractC49725j.a(str, str2);
        if (!(gA2 != null ? gA2.f441961j : true)) {
            m0.b("auto report is closed tag:" + str);
            return;
        }
        G gA3 = AbstractC49725j.a(str, str2);
        long j12 = gA3 != null ? gA3.f441962k : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - j12 <= 30000) {
            m0.e("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        m0.f442048a.a(3);
        G gA4 = AbstractC49725j.a(str, str2);
        if (gA4 != null) {
            gA4.f441962k = jCurrentTimeMillis;
        }
        e(str, str2, C49714A.a().f441939a.f441971d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void e(String str, String str2, String str3) {
        NetworkInfo activeNetworkInfo;
        String str4;
        Context context = this.f442067a;
        if (context == null) {
            m0.d("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String str5 = "";
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            m0.e("hmsSdk", "not have network state phone permission!");
        } else {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    str5 = "WIFI";
                } else if (activeNetworkInfo.getType() == 0) {
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    m0.b("Network getSubtypeName : " + subtypeName);
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            str5 = "2G";
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            str4 = "3G";
                            str5 = str4;
                            break;
                        case 13:
                            str4 = "4G";
                            str5 = str4;
                            break;
                        default:
                            if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                                str5 = subtypeName;
                                break;
                            }
                            str4 = "3G";
                            str5 = str4;
                            break;
                    }
                } else if (activeNetworkInfo.getType() == 16) {
                    m0.e("hmsSdk", "type name = COMPANION_PROXY");
                    str5 = "COMPANION_PROXY";
                } else if (activeNetworkInfo.getType() == 9) {
                    m0.b("type name = ETHERNET");
                    str5 = "ETHERNET";
                } else {
                    m0.b("type name = " + activeNetworkInfo.getType());
                    str5 = "OTHER_NETWORK_TYPE";
                }
            }
        }
        AbstractC49725j.a(str, str2);
        if (TextUtils.isEmpty(str5) || "2G".equals(str5)) {
            m0.d("hmsSdk", "The network is bad.");
            return;
        }
        E e12 = new E();
        e12.f441948b = AbstractC49722g.b();
        e12.f441949c = str;
        e12.f441950d = str2;
        e12.f441951e = str3;
        Q.f441989b.a(e12);
    }
}
