package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class yq6 {
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
            String str2 = zxg.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(ty9 ty9Var) {
        int i = 0;
        while (true) {
            ry9[] ry9VarArr = ty9Var.a;
            if (i >= ry9VarArr.length) {
                return;
            }
            ry9 ry9Var = ry9VarArr[i];
            if (ry9Var instanceof fg3) {
                fg3 fg3Var = (fg3) ry9Var;
                if ("iTunSMPB".equals(fg3Var.c) && a(fg3Var.d)) {
                    return;
                }
            } else if (ry9Var instanceof hp7) {
                hp7 hp7Var = (hp7) ry9Var;
                if ("com.apple.iTunes".equals(hp7Var.b) && "iTunSMPB".equals(hp7Var.c) && a(hp7Var.d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
