package u01;

import U01.b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.camera2.internal.G;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.internal.http2.Http2;
import v01.C49137a;

/* renamed from: u01.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C48757a {
    public static HttpsURLConnection a(Context context, String str, String str2) throws IOException {
        String str3;
        String strH;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
            Logger.w("URLConnectionHelper", "urlConnection is not an instance of HttpsURLConnection");
            return null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        try {
            httpsURLConnection.setSSLSocketFactory(C49137a.a(context));
            httpsURLConnection.setHostnameVerifier(new b());
        } catch (IllegalArgumentException unused) {
            Logger.w("URLConnectionHelper", "init https ssl socket failed.");
        }
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        if (context == null) {
            Locale locale = Locale.ROOT;
            strH = "NetworkKit-grs/5.0.8.301";
        } else {
            String packageName = context.getPackageName();
            if (ContextHolder.getAppContext() != null) {
                context = ContextHolder.getAppContext();
            }
            try {
                str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), Http2.INITIAL_MAX_FRAME_SIZE).versionName;
            } catch (PackageManager.NameNotFoundException e12) {
                Logger.w("AgentUtil", "", e12);
                str3 = "";
            }
            String str4 = Build.VERSION.RELEASE;
            String str5 = Build.MODEL;
            Locale locale2 = Locale.ROOT;
            if (TextUtils.isEmpty(str2)) {
                str2 = "no_service_name";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(packageName);
            sb2.append("/");
            sb2.append(str3);
            sb2.append(" (Linux; Android ");
            sb2.append(str4);
            strH = G.h(sb2, "; ", str5, ") NetworkKit-grs/5.0.8.301 ", str2);
        }
        Logger.d("URLConnectionHelper", "request to grs server with a User-Agent header is:".concat(strH));
        httpsURLConnection.setRequestProperty("User-Agent", strH);
        return httpsURLConnection;
    }
}
