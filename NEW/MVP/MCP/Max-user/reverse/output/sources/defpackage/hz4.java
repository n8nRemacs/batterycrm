package defpackage;

/* loaded from: classes.dex */
public final class hz4 {
    public final int a;
    public final String b;

    public /* synthetic */ hz4(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static hz4 a(umb umbVar) {
        String str;
        umbVar.K(2);
        int iX = umbVar.x();
        int i = iX >> 1;
        int iX2 = ((umbVar.x() >> 3) & 31) | ((iX & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbM = az1.m(str);
        sbM.append(i < 10 ? ".0" : ".");
        sbM.append(i);
        sbM.append(iX2 < 10 ? ".0" : ".");
        sbM.append(iX2);
        return new hz4(i, sbM.toString());
    }
}
