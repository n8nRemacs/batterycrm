package e11;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.adjust.sdk.Constants;
import java.net.URL;
import java.net.URLDecoder;

/* loaded from: classes7.dex */
public class F {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f394347c = {"http://play.google.com", "https://play.google.com", "http://market.android.com", "https://market.android.com", "https://appgallery.huawei.com/", "https://appgallery.cloud.huawei.com/", "market://", "samsungapps://", "appmarket://", "hiapplink://", "https://apps.rustore.ru", "https://backapi.rustore.ru"};

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final String f394348a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public FX0.b f394349b;

    public interface a {
    }

    public F(@j.N String str) {
        this.f394348a = str;
    }

    @j.N
    public static String a(@j.N String str) {
        try {
            return URLDecoder.decode(str, Constants.ENCODING);
        } catch (Throwable th2) {
            th2.getMessage();
            return str;
        }
    }

    public static boolean b(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = f394347c;
        for (int i12 = 0; i12 < 12; i12++) {
            if (str.startsWith(strArr[i12])) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (URLUtil.isHttpsUrl(str)) {
                return !TextUtils.isEmpty(new URL(str).getHost());
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
