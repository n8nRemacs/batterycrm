package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class kxi {
    public static void a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    public static final boolean b(eh9 eh9Var) {
        si9 si9Var = eh9Var.a;
        z00 z00VarI = si9Var.i();
        boolean z = z00VarI == null || z00VarI.b();
        if (z00VarI != null) {
            List list = z00VarI.f;
            if (z && list.size() == 1) {
                long j = si9Var.o;
                Long l = (Long) list.get(0);
                if (l != null && j == l.longValue()) {
                }
            }
            return false;
        }
        return true;
    }
}
