package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Li {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f378847a = Collections.unmodifiableMap(new a());

    public class a extends HashMap<String, Integer> {
        public a() {
            put("BACKGROUND", 0);
            put("FOREGROUND", 2);
            put("VISIBLE", 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(@j.N com.yandex.metrica.impl.ob.Ui r17, @j.N org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Li.a(com.yandex.metrica.impl.ob.Ui, org.json.JSONObject):void");
    }

    @j.N
    private static If.k.a.C10953a a(@j.P JSONObject jSONObject, boolean z12) {
        If.k.a.C10953a c10953a = new If.k.a.C10953a();
        Boolean boolA = Tl.a(jSONObject, "last_known_enabled", (Boolean) null);
        Boolean boolValueOf = Boolean.valueOf(c10953a.f378407a);
        if (boolA == null) {
            boolA = boolValueOf;
        }
        c10953a.f378407a = boolA.booleanValue();
        Boolean boolA2 = Tl.a(jSONObject, "scanning_enabled", (Boolean) null);
        Boolean boolValueOf2 = Boolean.valueOf(z12);
        if (boolA2 == null) {
            boolA2 = boolValueOf2;
        }
        boolean zBooleanValue = boolA2.booleanValue();
        c10953a.f378408b = zBooleanValue;
        if (jSONObject != null && zBooleanValue) {
            If.k.a.C10953a.C10954a c10954a = new If.k.a.C10953a.C10954a();
            Long lA2 = Tl.a(jSONObject, "duration_seconds", (Long) null);
            Long lValueOf = Long.valueOf(c10954a.f378410a);
            if (lA2 == null) {
                lA2 = lValueOf;
            }
            c10954a.f378410a = lA2.longValue();
            Long lA3 = Tl.a(jSONObject, "interval_seconds", (Long) null);
            Long lValueOf2 = Long.valueOf(c10954a.f378411b);
            if (lA3 == null) {
                lA3 = lValueOf2;
            }
            c10954a.f378411b = lA3.longValue();
            c10953a.f378409c = c10954a;
        }
        return c10953a;
    }
}
