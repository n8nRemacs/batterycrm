package z01;

import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: BundleUtil.java */
/* loaded from: classes7.dex */
public class d {
    public static byte[] a(Bundle bundle, String str) {
        try {
            byte[] byteArray = bundle.getByteArray(str);
            return byteArray == null ? new byte[0] : byteArray;
        } catch (Exception e12) {
            HMSLog.i("BundleUtil", "getByteArray exception" + e12.getMessage());
            return new byte[0];
        }
    }

    public static String b(Bundle bundle, String str) {
        try {
            String string = bundle.getString(str);
            return string == null ? "" : string;
        } catch (Exception e12) {
            HMSLog.i("BundleUtil", "getString exception" + e12.getMessage());
            return "";
        }
    }
}
