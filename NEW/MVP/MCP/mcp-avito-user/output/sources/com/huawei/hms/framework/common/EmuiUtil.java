package com.huawei.hms.framework.common;

import com.huawei.android.os.BuildEx;

/* loaded from: classes7.dex */
public class EmuiUtil {
    public static final String BUILDEX_VERSION = "com.huawei.android.os.BuildEx$VERSION";
    public static final String EMUI_SDK_INT = "EMUI_SDK_INT";
    public static final String GET_PRIMARY_COLOR = "getPrimaryColor";
    public static final String GET_SUGGESTION_FOR_GROUND_COLOR_STYLE = "getSuggestionForgroundColorStyle";
    public static final String IMMERSION_STYLE = "com.huawei.android.immersion.ImmersionStyle";

    /* renamed from: a, reason: collision with root package name */
    public static final int f363457a;

    static {
        int iIntValue;
        Object staticFieldObj = ReflectionUtils.getStaticFieldObj(BUILDEX_VERSION, EMUI_SDK_INT);
        if (staticFieldObj != null) {
            try {
                iIntValue = ((Integer) staticFieldObj).intValue();
            } catch (ClassCastException e12) {
                Logger.e("KPMS_Util_Emui", "getEMUIVersionCode ClassCastException:", e12);
            }
        } else {
            iIntValue = 0;
        }
        Logger.d("KPMS_Util_Emui", "the emui version code is::" + iIntValue);
        Logger.d("KPMS_Util_Emui", "getEmuiType emuiVersionCode=" + iIntValue);
        if (iIntValue >= 17) {
            f363457a = 90;
        } else if (iIntValue >= 15) {
            f363457a = 81;
        } else if (iIntValue >= 14) {
            f363457a = 60;
        } else if (iIntValue >= 11) {
            f363457a = 50;
        } else if (iIntValue >= 10) {
            f363457a = 41;
        } else if (iIntValue >= 9) {
            f363457a = 40;
        } else if (iIntValue >= 8) {
            f363457a = 31;
        } else if (iIntValue >= 7) {
            f363457a = 30;
        }
        if (f363457a == -1) {
            Logger.i("KPMS_Util_Emui", "emuiType is unkown");
        }
    }

    public static boolean isEMUI() {
        return -1 != f363457a;
    }

    public static boolean isUpPVersion() {
        if (!ReflectionUtils.checkCompatible("com.huawei.android.os.BuildEx")) {
            Logger.w("KPMS_Util_Emui", "com.huawei.android.os.BuildEx : false");
            return false;
        }
        Logger.d("KPMS_Util_Emui", "com.huawei.android.os.BuildEx.VERSION.EMUI_SDK_INT: " + BuildEx.VERSION.EMUI_SDK_INT);
        return BuildEx.VERSION.EMUI_SDK_INT >= 17;
    }
}
