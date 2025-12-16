package com.yandex.metrica.identifiers.impl;

import android.content.Context;

/* loaded from: classes7.dex */
public final class r implements i {

    /* renamed from: a, reason: collision with root package name */
    public final e f377737a = new e(s.f377738a, q.f377736l, "huawei");

    @Override // com.yandex.metrica.identifiers.impl.i
    @Y61.k
    public final g a(@Y61.k Context context) {
        g gVar;
        g gVar2;
        l lVar = l.f377730d;
        e eVar = this.f377737a;
        try {
            try {
                try {
                    v vVar = (v) eVar.a(context);
                    gVar2 = new g(l.f377729c, new f("huawei", vVar.a(), Boolean.valueOf(vVar.c())), null, 4);
                } catch (j e12) {
                    String message = e12.getMessage();
                    if (message == null) {
                        message = "unknown exception during binding huawei services";
                    }
                    gVar = new g(lVar, null, message);
                    gVar2 = gVar;
                    eVar.b(context);
                    return gVar2;
                }
            } catch (Throwable th2) {
                gVar = new g(lVar, null, "exception while fetching hoaid: " + th2.getMessage());
                gVar2 = gVar;
                eVar.b(context);
                return gVar2;
            }
            try {
                eVar.b(context);
            } catch (Throwable unused) {
            }
            return gVar2;
        } catch (Throwable th3) {
            try {
                eVar.b(context);
            } catch (Throwable unused2) {
            }
            throw th3;
        }
    }
}
