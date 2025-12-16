package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class tcd {
    public final int a;
    public final long b;
    public final long c;
    public final uub d;

    public tcd(ye2 ye2Var) {
        this.a = ye2Var.a;
        this.b = ye2Var.b;
        this.c = ye2Var.c;
        this.d = (uub) ye2Var.d;
    }

    public static tcd a(tm9 tm9Var) throws IOException {
        int i;
        String str;
        int iM = efi.m(tm9Var);
        if (iM == 0) {
            return null;
        }
        ye2 ye2Var = new ye2();
        for (int i2 = 0; i2 < iM; i2++) {
            String strW0 = tm9Var.w0();
            strW0.getClass();
            i = 1;
            switch (strW0) {
                case "id":
                    ye2Var.b = tm9Var.t0();
                    break;
                case "gif":
                    ye2Var.d = (uub) xy.b(tm9Var);
                    break;
                case "type":
                    String strO = efi.o(tm9Var);
                    int[] iArrY = az1.y(3);
                    int length = iArrY.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            int i4 = iArrY[i3];
                            if (i4 == 1) {
                                str = "UNKNOWN";
                            } else if (i4 == 2) {
                                str = "STICKER";
                            } else {
                                if (i4 != 3) {
                                    throw null;
                                }
                                str = "GIF";
                            }
                            if (str.equals(strO)) {
                                i = i4;
                            } else {
                                i3++;
                            }
                        }
                    }
                    ye2Var.a = i;
                    break;
                case "stickerId":
                    ye2Var.c = efi.l(tm9Var, 0L);
                    break;
                default:
                    tm9Var.v();
                    break;
            }
        }
        return new tcd(ye2Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentItem{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "GIF" : "STICKER" : "UNKNOWN");
        sb.append(", id=");
        sb.append(this.b);
        az1.r(this.c, ", stickerId=", ", gif=", sb);
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
