package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.e;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class oe0<T extends com.monetization.ads.mediation.base.e> {

    /* renamed from: a, reason: collision with root package name */
    private final re0 f388503a;

    public oe0(@j.N re0 re0Var) {
        this.f388503a = re0Var;
    }

    @j.P
    public final T a(@j.N Context context, @j.N zf0 zf0Var, @j.N Class<T> cls) {
        String str;
        T t12 = null;
        try {
            String strC = zf0Var.c();
            Object objA = nx0.a(Class.forName(strC), new Object[0]);
            T tCast = cls.cast(objA);
            if (tCast != null) {
                return tCast;
            }
            try {
                if (objA == null) {
                    str = "Instantiation failed for " + strC;
                } else {
                    str = "Cast from " + objA.getClass().getName() + " to " + cls.getName() + " is failed";
                }
                a(context, zf0Var, str);
                return tCast;
            } catch (ClassCastException e12) {
                e = e12;
                t12 = tCast;
                HashMap mapG = org.webrtc.h.g("reason", "does_not_conform_to_protocol");
                mapG.put("description", e.getClass().getName() + " " + e.getMessage());
                this.f388503a.a(context, zf0Var, mapG);
                return t12;
            } catch (Throwable th2) {
                th = th2;
                t12 = tCast;
                HashMap mapG2 = org.webrtc.h.g("reason", "could_not_create_adapter");
                mapG2.put("description", th.getClass().getName() + " " + th.getMessage());
                this.f388503a.a(context, zf0Var, mapG2);
                return t12;
            }
        } catch (ClassCastException e13) {
            e = e13;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void a(@j.N Context context, @j.N zf0 zf0Var, @j.N String str) {
        HashMap map = new HashMap();
        map.put("reason", "could_not_create_adapter");
        map.put("description", str);
        this.f388503a.a(context, zf0Var, map);
    }
}
