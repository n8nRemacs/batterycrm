package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class ConnectionErrorMessages {
    private static final Map<String, String> MAP = new HashMap();

    public static String getErrorDialogButtonMessage(Activity activity, int i12) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        return i12 != 1 ? i12 != 2 ? ResourceLoaderUtil.getString("hms_confirm") : ResourceLoaderUtil.getString("hms_update") : ResourceLoaderUtil.getString("hms_install");
    }

    public static String getErrorMessage(Activity activity, int i12) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        String string = ResourceLoaderUtil.getString("hms_update_title");
        if (i12 == 1 || i12 == 2) {
            return string;
        }
        return null;
    }

    public static String getErrorTitle(Activity activity, int i12) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i12 == 1) {
            return ResourceLoaderUtil.getString("hms_install_message");
        }
        if (i12 == 2) {
            return ResourceLoaderUtil.getString("hms_update_message");
        }
        if (i12 == 3) {
            return ResourceLoaderUtil.getString("hms_bindfaildlg_message");
        }
        if (i12 == 9) {
            HMSLog.e("HuaweiApiAvailability", "Huawei Mobile Services is invalid. Cannot recover.");
            return null;
        }
        HMSLog.e("HuaweiApiAvailability", "Unexpected error code " + i12);
        return null;
    }
}
