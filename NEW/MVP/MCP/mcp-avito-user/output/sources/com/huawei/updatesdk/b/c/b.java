package com.huawei.updatesdk.b.c;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Class<? extends c>> f363825a;

    /* renamed from: b, reason: collision with root package name */
    private static c f363826b;

    static {
        HashMap map = new HashMap();
        f363825a = map;
        map.put(3, a.class);
        map.put(1, e.class);
        map.put(2, f.class);
        map.put(0, d.class);
        map.put(4, d.class);
        map.put(7, d.class);
    }

    public static synchronized c a() {
        c cVar = f363826b;
        if (cVar != null) {
            return cVar;
        }
        com.huawei.updatesdk.a.a.a.b("DeviceImplFactory", "deviceType: " + com.huawei.updatesdk.a.a.d.i.c.d());
        Class<? extends c> cls = f363825a.get(Integer.valueOf(com.huawei.updatesdk.a.a.d.i.c.d()));
        if (cls == null) {
            d dVar = new d();
            f363826b = dVar;
            return dVar;
        }
        try {
            f363826b = cls.newInstance();
        } catch (Throwable unused) {
            f363826b = new d();
            com.huawei.updatesdk.a.a.a.a("DeviceImplFactory", "createDeviceInfo error and create default phone deviceinfo");
        }
        return f363826b;
    }
}
