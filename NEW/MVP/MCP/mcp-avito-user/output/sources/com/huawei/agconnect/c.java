package com.huawei.agconnect;

import android.content.Context;

/* loaded from: classes7.dex */
public abstract class c {
    public static c b() {
        c cVar;
        synchronized (com.huawei.agconnect.core.a.e.f363160c) {
            cVar = (c) com.huawei.agconnect.core.a.e.f363161d.get("DEFAULT_INSTANCE");
        }
        return cVar;
    }

    public abstract Context a();

    public abstract d c();
}
