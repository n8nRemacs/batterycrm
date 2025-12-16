package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class xq6 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = xxg.a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.a = i2;
            this.b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(sy9 sy9Var) {
        int i = 0;
        while (true) {
            qy9[] qy9VarArr = sy9Var.a;
            if (i >= qy9VarArr.length) {
                return;
            }
            qy9 qy9Var = qy9VarArr[i];
            if (qy9Var instanceof eg3) {
                eg3 eg3Var = (eg3) qy9Var;
                if ("iTunSMPB".equals(eg3Var.c) && a(eg3Var.d)) {
                    return;
                }
            } else if (qy9Var instanceof gp7) {
                gp7 gp7Var = (gp7) qy9Var;
                if ("com.apple.iTunes".equals(gp7Var.b) && "iTunSMPB".equals(gp7Var.c) && a(gp7Var.d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
