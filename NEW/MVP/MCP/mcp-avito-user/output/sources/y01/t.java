package y01;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: CommFun.java */
/* loaded from: classes7.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static String f442835a;

    public static String a(Context context) {
        String str = context.createDeviceProtectedStorageContext().getDataDir() + "";
        if (TextUtils.isEmpty(str)) {
            HMSLog.e("CommFun", "get storage root path of the current user failed.");
        }
        return str;
    }
}
