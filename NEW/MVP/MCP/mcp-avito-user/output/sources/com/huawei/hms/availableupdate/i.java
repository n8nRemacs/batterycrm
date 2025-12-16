package com.huawei.hms.availableupdate;

/* compiled from: UpdateStatus.java */
/* loaded from: classes7.dex */
public final class i {
    public static String a(int i12) {
        if (i12 == 1000) {
            return "CHECK_OK";
        }
        if (i12 == 2000) {
            return "DOWNLOAD_SUCCESS";
        }
        if (i12 == 2100) {
            return "DOWNLOADING";
        }
        if (i12 == 2101) {
            return "DOWNLOAD_CANCELED";
        }
        switch (i12) {
            case 1201:
                return "CHECK_FAILURE";
            case 1202:
                return "CHECK_NO_UPDATE";
            case 1203:
                return "CHECK_NO_SUPPORTED";
            default:
                switch (i12) {
                    case 2201:
                        return "DOWNLOAD_FAILURE";
                    case 2202:
                        return "DOWNLOAD_HASH_ERROR";
                    case 2203:
                        return "DOWNLOAD_NO_SPACE";
                    case 2204:
                        return "DOWNLOAD_NO_STORAGE";
                    default:
                        return AK.c.g(i12, "UNKNOWN - ");
                }
        }
    }
}
