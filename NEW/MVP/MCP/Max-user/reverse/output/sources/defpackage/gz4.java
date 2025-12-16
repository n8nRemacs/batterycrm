package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class gz4 implements ub5 {
    public final String a;

    public /* synthetic */ gz4(String str) {
        this.a = str;
    }

    public static gz4 a(qyg qygVar) {
        String str;
        qygVar.F(2);
        int iS = qygVar.s();
        int i = iS >> 1;
        int iS2 = ((qygVar.s() >> 3) & 31) | ((iS & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = iS2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(iS2);
        return new gz4(sb.toString());
    }

    @Override // defpackage.ub5
    public Object d() {
        return this;
    }

    @Override // defpackage.ub5
    public boolean r(CharSequence charSequence, int i, int i2, zog zogVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
            return true;
        }
        zogVar.c = (zogVar.c & 3) | 4;
        return false;
    }
}
