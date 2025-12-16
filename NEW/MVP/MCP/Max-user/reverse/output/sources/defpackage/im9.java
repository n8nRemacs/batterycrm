package defpackage;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class im9 implements Serializable {
    public final int a;
    public final int b;

    public im9(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static im9 a(tm9 tm9Var) throws IOException {
        int iM = efi.m(tm9Var);
        if (iM == 0) {
            return null;
        }
        int iS0 = 0;
        int iS02 = 0;
        for (int i = 0; i < iM; i++) {
            String strW0 = tm9Var.w0();
            strW0.getClass();
            if (strW0.equals("views")) {
                iS0 = tm9Var.s0();
            } else if (strW0.equals("forwards")) {
                iS02 = tm9Var.s0();
            } else {
                tm9Var.v();
            }
        }
        return new im9(iS0, iS02);
    }

    public final String toString() {
        return wy1.g("{views=", this.a, ", forwards=", this.b, "}");
    }
}
