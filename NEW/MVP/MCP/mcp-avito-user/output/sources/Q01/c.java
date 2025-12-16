package q01;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.appcompat.app.r;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.http2.Http2;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f428950b = new ConcurrentHashMap(16);

    /* renamed from: a, reason: collision with root package name */
    public final PLSharedPreferences f428951a;

    public c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.d("c", "get pkgname from context is{%s}", packageName);
        ConcurrentHashMap concurrentHashMap = f428950b;
        if (concurrentHashMap.containsKey(str + packageName)) {
            this.f428951a = (PLSharedPreferences) concurrentHashMap.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, r.q(str, packageName));
            this.f428951a = pLSharedPreferences;
            concurrentHashMap.put(str + packageName, pLSharedPreferences);
        }
        Logger.i("c", "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        context = ContextHolder.getAppContext() != null ? ContextHolder.getAppContext() : context;
        try {
            String string = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), Http2.INITIAL_MAX_FRAME_SIZE).versionCode);
            String strA = a("version", "");
            if (string.equals(strA)) {
                return;
            }
            Logger.i("c", "app version changed! old version{%s} and new version{%s}", strA, string);
            PLSharedPreferences pLSharedPreferences2 = this.f428951a;
            if (pLSharedPreferences2 != null) {
                synchronized (pLSharedPreferences2) {
                    this.f428951a.clear();
                }
            }
            c("version", string);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.w("c", "get app version failed and catch NameNotFoundException");
        }
    }

    public final String a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f428951a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f428951a.getString(str, str2);
        }
        return string;
    }

    public final void b(String str) {
        PLSharedPreferences pLSharedPreferences = this.f428951a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f428951a.remove(str);
        }
    }

    public final void c(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f428951a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f428951a.putString(str, str2);
        }
    }
}
