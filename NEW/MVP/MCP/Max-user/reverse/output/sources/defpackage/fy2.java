package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class fy2 {
    public final ArrayList a;
    public final long b;
    public final Long c;

    public fy2(ey2 ey2Var) {
        this.a = (ArrayList) ey2Var.c;
        this.b = ey2Var.b;
        this.c = (Long) ey2Var.d;
    }

    public static fy2 a(tm9 tm9Var) throws IOException {
        int iM = efi.m(tm9Var);
        if (iM == 0) {
            return null;
        }
        ey2 ey2Var = new ey2(0, false);
        ArrayList arrayList = new ArrayList(jt2.o);
        for (int i = 0; i < iM; i++) {
            String strW0 = tm9Var.w0();
            strW0.getClass();
            switch (strW0) {
                case "dontDisturbUntil":
                    ey2Var.b = tm9Var.t0();
                    break;
                case "led":
                    if (tm9Var.p0()) {
                        arrayList.add(jt2.LED);
                        break;
                    } else {
                        break;
                    }
                case "vibr":
                    if (tm9Var.p0()) {
                        arrayList.add(jt2.VIBRATION);
                        break;
                    } else {
                        break;
                    }
                case "sound":
                    if (tm9Var.p0()) {
                        arrayList.add(jt2.SOUND);
                        break;
                    } else {
                        break;
                    }
                case "favIndex":
                    ey2Var.d = Long.valueOf(efi.l(tm9Var, 0L));
                    break;
                default:
                    tm9Var.v();
                    break;
            }
        }
        ey2Var.c = arrayList;
        return new fy2(ey2Var);
    }

    public final String toString() {
        Long l = this.c;
        String string = l != null ? l.toString() : "null";
        StringBuilder sb = new StringBuilder("ChatSettings{options=");
        sb.append(this.a);
        sb.append(", dontDisturbUntil=");
        sb.append(this.b);
        return ctd.j(sb, ", favoriteIndex = ", string, "}");
    }
}
