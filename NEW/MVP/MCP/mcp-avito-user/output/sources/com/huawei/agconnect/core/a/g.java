package com.huawei.agconnect.core.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f363164a = new HashMap();

    public g(ArrayList arrayList) {
        new HashMap();
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.huawei.agconnect.core.c cVar = (com.huawei.agconnect.core.c) it.next();
            this.f363164a.put(cVar.f363165a, cVar);
        }
    }
}
