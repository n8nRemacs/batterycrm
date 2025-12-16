package defpackage;

import android.content.Context;
import java.io.IOException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class i0g implements j0g, g5a, xh, c85 {
    @Override // defpackage.c85
    public u70 a(Context context, String str, b85 b85Var) {
        u70 u70Var = new u70();
        int iC = b85Var.c(context, str);
        u70Var.b = iC;
        if (iC != 0) {
            u70Var.d = -1;
            return u70Var;
        }
        int iA = b85Var.a(context, str, true);
        u70Var.c = iA;
        if (iA != 0) {
            u70Var.d = 1;
        }
        return u70Var;
    }

    @Override // defpackage.j0g
    public long c(int i, long j, float f) {
        if (i > 6) {
            i = 6;
        }
        long jPow = ((long) Math.pow(2.0d, i)) * 1000;
        return jPow + ((long) (jPow * f)) + j;
    }

    @Override // defpackage.g5a
    public Object p(tm9 tm9Var) throws IOException {
        int iM = efi.m(tm9Var);
        fh9 fh9VarA = null;
        if (iM == 0) {
            return null;
        }
        long jT0 = 0;
        for (int i = 0; i < iM; i++) {
            String strW0 = tm9Var.w0();
            strW0.getClass();
            if (strW0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                jT0 = tm9Var.t0();
            } else if (strW0.equals("message")) {
                fh9VarA = ovi.a(tm9Var);
            } else {
                tm9Var.v();
            }
        }
        return new t91(jT0, fh9VarA);
    }
}
