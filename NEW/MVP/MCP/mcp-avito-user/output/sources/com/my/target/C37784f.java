package com.my.target;

import android.content.Context;
import com.my.target.AbstractC37822y0;
import e11.C39862e;
import e11.C39901r0;
import e11.r2;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37784f extends AbstractC37822y0.a {
    @Override // com.my.target.AbstractC37822y0.a
    public final int a(@j.N Context context) {
        try {
            return r2.a(context).f394776a.getInt("sdk_flags", -1);
        } catch (Throwable th2) {
            th2.toString();
            return 0;
        }
    }

    @Override // com.my.target.AbstractC37822y0.a
    @j.N
    public final HashMap c(@j.N C39901r0 c39901r0, @j.N Context context) {
        HashMap mapC = super.c(c39901r0, context);
        Map<String, String> mapSnapshot = C39862e.f394574c.snapshot();
        if (mapSnapshot != null && mapSnapshot.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            boolean z12 = false;
            for (String str : mapSnapshot.keySet()) {
                if (z12) {
                    sb2.append(",");
                } else {
                    z12 = true;
                }
                sb2.append(str);
            }
            mapC.put("exb", sb2.toString());
        }
        return mapC;
    }
}
