package com.yandex.mobile.ads.exo.drm;

import android.net.Uri;
import com.yandex.mobile.ads.embedded.guava.collect.p0;
import com.yandex.mobile.ads.exo.drm.c;
import com.yandex.mobile.ads.impl.c80;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.ur;
import com.yandex.mobile.ads.impl.wo;
import com.yandex.mobile.ads.impl.xc0;
import j.B;
import j.X;
import java.util.Map;

/* loaded from: classes8.dex */
public final class d implements ur {

    /* renamed from: a, reason: collision with root package name */
    private final Object f382907a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @B
    private xc0.d f382908b;

    /* renamed from: c, reason: collision with root package name */
    @B
    private c f382909c;

    @Override // com.yandex.mobile.ads.impl.ur
    public final g a(xc0 xc0Var) {
        c cVar;
        xc0Var.f391606b.getClass();
        xc0.d dVar = xc0Var.f391606b.f391656c;
        if (dVar == null || pc1.f388768a < 18) {
            return g.f382916a;
        }
        synchronized (this.f382907a) {
            try {
                if (!pc1.a(dVar, this.f382908b)) {
                    this.f382908b = dVar;
                    this.f382909c = a(dVar);
                }
                cVar = this.f382909c;
                cVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @X
    private static c a(xc0.d dVar) {
        wo.a aVarB = new wo.a().b();
        Uri uri = dVar.f391633b;
        o oVar = new o(uri == null ? null : uri.toString(), dVar.f391637f, aVarB);
        p0<Map.Entry<String, String>> it = dVar.f391634c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            oVar.a(next.getKey(), next.getValue());
        }
        c cVarA = new c.a().a(dVar.f391632a, n.f382924e).a(dVar.f391635d).b(dVar.f391636e).a(c80.a(dVar.f391638g)).a(oVar);
        cVarA.a(dVar.a());
        return cVarA;
    }
}
