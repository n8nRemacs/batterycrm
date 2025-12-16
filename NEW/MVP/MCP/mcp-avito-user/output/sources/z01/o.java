package z01;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;

/* compiled from: CommFun.java */
/* loaded from: classes7.dex */
public class o {
    public static Boolean a(Context context, String str, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
                int size = listQueryIntentActivities.size();
                for (int i12 = 0; i12 < size; i12++) {
                    if (listQueryIntentActivities.get(i12).activityInfo != null && str.equals(listQueryIntentActivities.get(i12).activityInfo.applicationInfo.packageName)) {
                        return Boolean.TRUE;
                    }
                }
            }
        } catch (Exception e12) {
            HMSLog.e("PushSelfShowLog", e12.toString(), e12);
        }
        return Boolean.FALSE;
    }

    public static Intent b(Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception unused) {
            HMSLog.w("PushSelfShowLog", str + " not have launch activity");
            return null;
        }
    }

    public static boolean c(Context context, String str) {
        if (context != null && str != null && !"".equals(str)) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 8192) == null) {
                    return false;
                }
                HMSLog.d("PushSelfShowLog", str.concat(" is installed"));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
