package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.u20;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class t20 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u20 f390061b;

    public t20(u20 u20Var) {
        this.f390061b = u20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (u20.a aVar : this.f390061b.f390425d.values()) {
            Iterator it = aVar.f390431d.iterator();
            while (it.hasNext()) {
                u20.c cVar = (u20.c) it.next();
                if (cVar.f390433b != null) {
                    if (aVar.a() == null) {
                        cVar.f390432a = aVar.f390429b;
                        cVar.f390433b.a(cVar, false);
                    } else {
                        cVar.f390433b.a(aVar.a());
                    }
                }
            }
        }
        this.f390061b.f390425d.clear();
        this.f390061b.f390427f = null;
    }
}
