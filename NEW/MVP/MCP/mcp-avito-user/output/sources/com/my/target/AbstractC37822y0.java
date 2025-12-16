package com.my.target;

import android.content.Context;
import e11.C39901r0;
import e11.C39921y;
import java.util.HashMap;

/* renamed from: com.my.target.y0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37822y0 {

    /* renamed from: com.my.target.y0$a */
    public static class a extends AbstractC37822y0 {
        public int a(@j.N Context context) {
            return C39921y.f394904a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x0148, code lost:
        
            r16 = r0;
            r0 = r10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(@j.N java.lang.String r26, @j.N e11.C39901r0 r27, @j.N java.util.Map r28, @j.N android.content.Context r29, @j.N e11.A0 r30) {
            /*
                Method dump skipped, instructions count: 503
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.target.AbstractC37822y0.a.b(java.lang.String, e11.r0, java.util.Map, android.content.Context, e11.A0):void");
        }

        @j.N
        public HashMap c(@j.N C39901r0 c39901r0, @j.N Context context) {
            HashMap map = new HashMap();
            map.put("formats", c39901r0.f394773j);
            map.put("adman_ver", "5.16.4");
            map.put("sdk_ver_int", f11.h.f395645a);
            f11.f fVar = new f11.f();
            int i12 = c39901r0.f394771h;
            if (i12 == 0 || i12 == 2) {
                map.put("preloadvideo", "1");
            }
            String str = c39901r0.f394770g;
            if (str != null) {
                map.put("bid_id", str);
            }
            f11.c cVar = c39901r0.f394764a;
            if (fVar.a()) {
                cVar.d(map);
            } else {
                map.putAll(cVar.f395642b);
            }
            T t12 = T.f364598o;
            t12.f364611n = fVar.a();
            f11.d dVar = f11.e.f395644b;
            try {
                e11.N n12 = t12.f364601d;
                dVar.getClass();
                n12.f394419c = true;
                n12.f394418b = false;
                t12.h(context);
            } catch (Throwable th2) {
                th2.toString();
            }
            t12.d(map);
            String strC = cVar.c("lang");
            if (strC != null) {
                map.put("lang", strC);
            }
            int iA2 = a(context);
            if (iA2 >= 0) {
                map.put("sdk_flags", String.valueOf(iA2));
            }
            dVar.getClass();
            return map;
        }
    }

    /* renamed from: com.my.target.y0$b */
    public interface b {
    }
}
