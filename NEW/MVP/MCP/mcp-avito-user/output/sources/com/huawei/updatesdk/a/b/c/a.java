package com.huawei.updatesdk.a.b.c;

import androidx.camera.camera2.internal.G;
import com.huawei.updatesdk.service.appmgr.bean.d;
import com.huawei.updatesdk.service.appmgr.bean.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Class> f363788a;

    static {
        HashMap map = new HashMap();
        f363788a = map;
        map.put(d.APIMETHOD, e.class);
        map.put(com.huawei.updatesdk.service.appmgr.bean.a.APIMETHOD, com.huawei.updatesdk.service.appmgr.bean.b.class);
    }

    public static com.huawei.updatesdk.a.b.c.c.d a(String str) throws InstantiationException {
        Class cls = f363788a.get(str);
        if (cls != null) {
            return (com.huawei.updatesdk.a.b.c.c.d) cls.newInstance();
        }
        throw new InstantiationException(G.f("ResponseBean class not found, method:", str));
    }
}
