package com.yandex.metrica.identifiers.impl;

import android.content.Context;

/* loaded from: classes7.dex */
public final class o implements i {

    /* renamed from: a, reason: collision with root package name */
    public final e f377734a = new e(p.f377735a, n.f377733l, "yandex");

    @Override // com.yandex.metrica.identifiers.impl.i
    @Y61.k
    public final g a(@Y61.k Context context) {
        g gVar;
        g gVarB;
        l lVar = l.f377730d;
        e eVar = this.f377734a;
        try {
            try {
                try {
                    gVarB = b(context);
                } catch (m e12) {
                    String message = e12.getMessage();
                    if (message == null) {
                        message = "No yandex adv_id service";
                    }
                    gVar = new g(lVar, null, message, 2);
                    gVarB = gVar;
                    eVar.b(context);
                    return gVarB;
                }
            } catch (j e13) {
                String message2 = e13.getMessage();
                if (message2 == null) {
                    message2 = "unknown exception while binding yandex adv_id service";
                }
                gVar = new g(lVar, null, message2, 2);
                gVarB = gVar;
                eVar.b(context);
                return gVarB;
            } catch (Throwable th2) {
                gVar = new g(l.f377731e, null, "exception while fetching yandex adv_id: " + th2.getMessage(), 2);
                gVarB = gVar;
                eVar.b(context);
                return gVarB;
            }
            try {
                eVar.b(context);
            } catch (Throwable unused) {
            }
            return gVarB;
        } catch (Throwable th3) {
            try {
                eVar.b(context);
            } catch (Throwable unused2) {
            }
            throw th3;
        }
    }

    public final g b(Context context) {
        c cVar = (c) this.f377734a.a(context);
        return new g(l.f377729c, new f("yandex", cVar.b(), Boolean.valueOf(cVar.d())), null, 4);
    }
}
