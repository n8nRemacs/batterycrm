package t01;

import com.huawei.hms.framework.common.Logger;

/* loaded from: classes7.dex */
public class e {
    public static boolean a(Long l12) {
        if (l12 == null) {
            Logger.v("e", "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
        } catch (NumberFormatException unused) {
            Logger.v("e", "isSpExpire spValue NumberFormatException.");
        }
        if (l12.longValue() - System.currentTimeMillis() >= 0) {
            Logger.i("e", "isSpExpire false.");
            return false;
        }
        Logger.i("e", "isSpExpire true.");
        return true;
    }

    public static boolean b(Long l12) {
        if (l12 == null) {
            Logger.v("e", "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l12.longValue() - (System.currentTimeMillis() + 300000) >= 0) {
                Logger.v("e", "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.v("e", "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
