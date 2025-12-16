package com.yandex.metrica.impl.ob;

import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import com.my.tracker.MyTracker;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.g2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38817g2 {

    /* renamed from: a, reason: collision with root package name */
    @j.k0
    static final Map<String, Integer> f380615a;

    static {
        HashMap map = new HashMap();
        f380615a = map;
        androidx.media3.common.S.e(1, map, "1.00", 2, "1.10");
        androidx.media3.common.S.e(3, map, "1.11", 4, "1.20");
        androidx.media3.common.S.e(5, map, "1.21", 6, "1.22");
        androidx.media3.common.S.e(7, map, "1.23", 8, "1.24");
        androidx.media3.common.S.e(9, map, "1.26", 10, "1.27");
        androidx.media3.common.S.e(11, map, "1.40", 12, "1.41");
        androidx.media3.common.S.e(13, map, "1.42", 14, "1.50");
        androidx.media3.common.S.e(15, map, "1.51", 16, "1.60");
        androidx.media3.common.S.e(17, map, "1.61", 18, "1.62");
        androidx.media3.common.S.e(19, map, "1.63", 20, "1.64");
        androidx.media3.common.S.e(21, map, "1.65", 22, "1.66");
        androidx.media3.common.S.e(23, map, "1.67", 24, "1.68");
        androidx.media3.common.S.e(25, map, "1.69", 26, "1.70");
        androidx.media3.common.S.e(27, map, "1.71", 28, "1.72");
        androidx.media3.common.S.e(29, map, "1.80", 30, "1.81");
        androidx.media3.common.S.e(31, map, "1.82", 32, "2.00");
        androidx.media3.common.S.e(33, map, "2.10", 34, "2.11");
        androidx.media3.common.S.e(35, map, "2.20", 36, "2.21");
        androidx.media3.common.S.e(37, map, "2.22", 38, "2.23");
        androidx.media3.common.S.e(39, map, "2.30", 40, "2.31");
        androidx.media3.common.S.e(41, map, "2.32", 42, "2.33");
        androidx.media3.common.S.e(43, map, "2.40", 44, "2.41");
        androidx.media3.common.S.e(45, map, "2.42", 46, "2.43");
        androidx.media3.common.S.e(47, map, "2.50", 48, "2.51");
        androidx.media3.common.S.e(49, map, "2.52", 50, "2.60");
        androidx.media3.common.S.e(51, map, "2.61", 52, "2.62");
        androidx.media3.common.S.e(53, map, "2.63", 54, "2.64");
        androidx.media3.common.S.e(55, map, "2.70", 56, "2.71");
        androidx.media3.common.S.e(57, map, "2.72", 58, "2.73");
        androidx.media3.common.S.e(59, map, "2.74", 60, "2.75");
        androidx.media3.common.S.e(61, map, "2.76", 62, "2.77");
        androidx.media3.common.S.e(63, map, "2.78", 64, "2.80");
        androidx.media3.common.S.e(65, map, "2.81-RC1", 66, "3.0.0");
        androidx.media3.common.S.e(67, map, "3.1.0", 68, MyTracker.VERSION);
        androidx.media3.common.S.e(69, map, "3.2.1", 70, "3.2.2");
        androidx.media3.common.S.e(71, map, "3.3.0", 72, "3.4.0");
        androidx.media3.common.S.e(73, map, "3.5.0", 74, "3.5.1");
        androidx.media3.common.S.e(75, map, "3.5.2", 76, "3.5.3");
        androidx.media3.common.S.e(77, map, "3.6.0", 78, "3.6.1");
        androidx.media3.common.S.e(79, map, "3.6.2", 80, "3.6.3");
        androidx.media3.common.S.e(81, map, "3.6.4", 82, "3.7.0");
        androidx.media3.common.S.e(83, map, "3.7.1", 84, "3.7.2");
        map.put("3.8.0", 85);
        map.put("3.8.1", 85);
        map.put("3.9.0", 86);
        map.put("3.9.1", 86);
        map.put("3.9.2", 86);
        map.put("3.10.0", 87);
        map.put("3.11.0-RC1", 87);
        map.put("3.11.0", 87);
        map.put("3.12.0-RC1", 87);
        map.put("3.12.0", 87);
        map.put("3.13.0", 87);
        map.put("3.13.1", 87);
        map.put("3.13.2", 87);
        map.put("3.13.3", 87);
        map.put("3.14.0", 91);
        map.put("3.14.1", 91);
        map.put("3.14.2", 91);
        map.put("3.14.3", 91);
        map.put("3.15.0", 91);
        map.put("3.15.1", 91);
        map.put("3.16.0", 92);
        map.put("3.16.1", 92);
        map.put("3.16.2", 92);
        map.put("3.16.3", 92);
        map.put("3.17.0", 94);
        map.put("3.18.0", 94);
        map.put("3.18.1", 94);
        map.put("3.18.2", 94);
        map.put("3.18.3", 94);
        map.put("3.18.4", 94);
        map.put("3.19.0", 94);
        map.put("3.19.1", 94);
        map.put("3.19.2", 94);
        map.put("3.19.3", 94);
        map.put("3.20.1", 94);
        map.put("3.20.2", 94);
        map.put("3.20.3", 94);
        map.put("3.21.0", 95);
        androidx.media3.common.S.d(97, 95, "3.21.1", "4.0.0", map);
        map.put("4.1.0", 100);
        map.put("4.1.1", 100);
        map.put("4.2.0", Integer.valueOf(UpdateStatusCode.DialogButton.CONFIRM));
        map.put("5.0.0", 105);
        map.put("5.1.0", 105);
        map.put("5.2.0", 105);
        androidx.media3.common.S.d(106, 105, "5.2.1", "5.3.0", map);
    }
}
