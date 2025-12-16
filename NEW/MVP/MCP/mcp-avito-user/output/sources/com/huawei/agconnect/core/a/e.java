package com.huawei.agconnect.core.a;

import android.content.Context;
import com.huawei.agconnect.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class e extends com.huawei.agconnect.c {

    /* renamed from: b, reason: collision with root package name */
    public static ArrayList f363159b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f363160c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f363161d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.huawei.agconnect.d f363162a;

    public e(com.huawei.agconnect.d dVar) {
        ArrayList arrayList;
        this.f363162a = dVar;
        new g(f363159b);
        g gVar = new g(null);
        if (!(dVar instanceof com.huawei.agconnect.config.a.b) || (arrayList = ((com.huawei.agconnect.config.a.b) dVar).f363143g) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.huawei.agconnect.core.c cVar = (com.huawei.agconnect.core.c) it.next();
            gVar.f363164a.put(cVar.f363165a, cVar);
        }
    }

    public static com.huawei.agconnect.c d(com.huawei.agconnect.d dVar, boolean z12) {
        com.huawei.agconnect.c eVar;
        synchronized (f363160c) {
            HashMap map = f363161d;
            eVar = (com.huawei.agconnect.c) map.get(dVar.a());
            if (eVar == null || z12) {
                eVar = new e(dVar);
                map.put(dVar.a(), eVar);
            }
        }
        return eVar;
    }

    public static synchronized void e(Context context, XZ0.a aVar) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            com.huawei.agconnect.config.a.a.a(context);
            if (f363159b == null) {
                f363159b = new f(context).a();
            }
            a aVar2 = new a();
            HashMap map = j.f363171a;
            map.put("/agcgw/url", aVar2);
            map.put("/agcgw/backurl", new b());
            d(aVar, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.huawei.agconnect.c
    public final Context a() {
        return this.f363162a.getContext();
    }

    @Override // com.huawei.agconnect.c
    public final com.huawei.agconnect.d c() {
        return this.f363162a;
    }
}
