package defpackage;

import java.util.BitSet;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class yx1 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public volatile rx1 d;
    public final BitSet e = new BitSet(2);
    public volatile int f;

    public yx1(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    public static void d(yx1 yx1Var, String str, String str2, String str3, Long l, String str4, String str5, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        ?? r10 = z;
        if ((i & 128) != 0) {
            r10 = 0;
        }
        dd ddVar = (dd) yx1Var.b.getValue();
        nn8 nn8Var = new nn8();
        Integer numD = ((gda) yx1Var.c.getValue()).d();
        if (numD != null) {
            nn8Var.put("screen", Integer.valueOf(numD.intValue()));
        }
        if (str2 != null) {
            nn8Var.put("call_id", str2);
        }
        rx1 rx1Var = yx1Var.d;
        if (rx1Var != null) {
            nn8Var.put("source", rx1Var.name());
        }
        if (str3 != null) {
            nn8Var.put("event_label_str", str3);
        }
        if (l != null) {
            nn8Var.put("event_label_int", Long.valueOf(l.longValue()));
        }
        if (str4 != null) {
            nn8Var.put("error_type", str4);
        }
        if (str5 != null) {
            nn8Var.put("error_desc", str5);
        }
        nn8Var.put("is_group", Integer.valueOf((int) r10));
        int i2 = yx1Var.f;
        if (i2 != 0) {
            nn8Var.put("con_state", xc0.b(i2));
        }
        nn8 nn8VarB = nn8Var.b();
        xp7 xp7Var = new xp7();
        xp7Var.c = "CALL";
        xp7Var.b = ((w4e) ((pb3) yx1Var.a.getValue())).s();
        xp7Var.o = ((pe8) ((pb3) yx1Var.a.getValue())).K();
        xp7Var.d = str;
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c(nn8VarB);
        ddVar.h(xp7Var.d());
    }

    public static void e(yx1 yx1Var, String str, String str2, long j, String str3, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        yx1Var.getClass();
        d(yx1Var, "INCOMING_CALL_RECEIVED", str, str2, Long.valueOf(j), str3, null, false, 144);
    }

    public static void k(yx1 yx1Var, String str) {
        yx1Var.c("showed", "UNKNOWN_CALLER_ALERT", "contact_info_bubble", null, str);
    }

    public final void a(long j, String str, LinkedHashMap linkedHashMap) {
        nn8 nn8Var = new nn8();
        if (str != null) {
            nn8Var.put("call_id", str);
        }
        Integer numD = ((gda) this.c.getValue()).d();
        if (numD != null) {
            nn8Var.put("screen", Integer.valueOf(numD.intValue()));
        }
        nn8Var.put("user_id2", Long.valueOf(j));
        nn8Var.putAll(linkedHashMap);
        b("ADMIN_CALL_SETTINGS_TO_USER", nn8Var.b());
    }

    public final void b(String str, nn8 nn8Var) {
        dd ddVar = (dd) this.b.getValue();
        xp7 xp7Var = new xp7();
        xp7Var.c = "CALL";
        k18 k18Var = this.a;
        xp7Var.b = ((w4e) ((pb3) k18Var.getValue())).s();
        xp7Var.o = ((pe8) ((pb3) k18Var.getValue())).K();
        xp7Var.d = str;
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c(nn8Var);
        ddVar.h(xp7Var.d());
    }

    public final void c(String str, String str2, String str3, String str4, String str5) {
        dd ddVar = (dd) this.b.getValue();
        nn8 nn8Var = new nn8();
        if (str3 != null) {
            nn8Var.put("UIElementType", str3);
        }
        if (str4 != null) {
            nn8Var.put("clickType", str4);
        }
        Integer numD = ((gda) this.c.getValue()).d();
        if (numD != null) {
            nn8Var.put("screen", Integer.valueOf(numD.intValue()));
        }
        if (str5 != null) {
            nn8Var.put("call_id", str5);
        }
        int i = this.f;
        if (i != 0) {
            nn8Var.put("con_state", xc0.b(i));
        }
        rx1 rx1Var = this.d;
        if (rx1Var != null) {
            nn8Var.put("source", rx1Var.name());
        }
        ddVar.h(new hg8(str2, str, 0L, 0L, nn8Var.b(), System.currentTimeMillis(), 12));
    }

    public final void f(boolean z) {
        d(this, "CALL_RECORDING", null, null, Long.valueOf(z ? 1L : 0L), null, null, true, 118);
    }

    public final void g(String str, String str2, boolean z) {
        d(this, "REQUEST_PERMISSION_CAM", str, str2, null, null, null, z, 120);
    }

    public final void h(int i, int i2, String str) {
        String str2;
        long j;
        if (i == 1) {
            str2 = "COPY_LINK";
        } else if (i == 2) {
            str2 = "INSIDE_SHARE";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "OUTSIDE_SHARE";
        }
        String str3 = str2;
        if (i2 == 1) {
            j = 1;
        } else {
            if (i2 != 2) {
                throw null;
            }
            j = 2;
        }
        d(this, "SHARE_CALL_LINK", str, str3, Long.valueOf(j), null, null, true, 112);
    }

    public final void i(ux1 ux1Var, boolean z) {
        d(this, "START_CALL", null, ux1Var.a(), Long.valueOf(z ? 2L : 1L), null, null, ux1Var instanceof sx1, 114);
    }

    public final void j(xx1 xx1Var, String str) {
        c("clicked", "UNKNOWN_CALLER_ALERT", "contact_info_bubble", xx1Var.e(), str);
    }
}
