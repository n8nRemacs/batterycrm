package defpackage;

import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;

/* loaded from: classes2.dex */
public final class b9h {
    public final k18 a;
    public final k18 b;
    public final k18 c;

    public b9h(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
    }

    public static void a(b9h b9hVar, int i, Long l, f7f f7fVar, Long l2, z8h z8hVar, int i2, int i3) {
        String str;
        if ((i3 & 8) != 0) {
            l2 = null;
        }
        if ((i3 & 16) != 0) {
            z8hVar = null;
        }
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        k18 k18Var = b9hVar.a;
        k18 k18Var2 = b9hVar.b;
        dd ddVar = (dd) k18Var.getValue();
        nn8 nn8Var = new nn8();
        if (l != null) {
            nn8Var.put("local_message_id", Long.valueOf(l.longValue()));
        }
        if (l2 != null) {
            nn8Var.put("message_id", Long.valueOf(l2.longValue()));
        }
        nn8Var.put("source_type", Integer.valueOf(f7fVar.b));
        nn8Var.put("source_id", Long.valueOf(f7fVar.a));
        if (z8hVar != null) {
            nn8Var.put(IceCandidatePairChangedStat.KEY_REASON, z8hVar.getTitle());
        }
        if (i2 != 0) {
            int i4 = 1;
            if (i2 != 1) {
                i4 = 2;
                if (i2 != 2) {
                    throw null;
                }
            }
            nn8Var.put("startType", Integer.valueOf(i4));
        }
        nn8 nn8VarB = nn8Var.b();
        xp7 xp7Var = new xp7();
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c = "VIDEO_MESSAGE";
        if (i == 1) {
            str = "video_message_start_recording";
        } else if (i == 2) {
            str = "video_message_delete";
        } else if (i == 3) {
            str = "video_message_hands_free_mode_on";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "video_message_error";
        }
        xp7Var.d = str;
        xp7Var.b = ((w4e) ((pb3) k18Var2.getValue())).s();
        xp7Var.c(nn8VarB);
        xp7Var.o = ((pe8) ((pb3) k18Var2.getValue())).K();
        ddVar.h(xp7Var.d());
    }
}
