package defpackage;

import java.io.Serializable;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes2.dex */
public final class a14 extends l0g implements Serializable {
    public int c;
    public String d;

    public a14(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        int i;
        str.getClass();
        if (!str.equals("verifyResult")) {
            if (str.equals(SdkMetricStatEvent.NAME_KEY)) {
                this.d = efi.o(tm9Var);
                return;
            } else {
                tm9Var.v();
                return;
            }
        }
        String strO = efi.o(tm9Var);
        if (strO == null) {
            throw new NullPointerException("Name is null");
        }
        if (strO.equals("GOOD")) {
            i = 1;
        } else if (strO.equals("BAD")) {
            i = 2;
        } else {
            if (!strO.equals("UNDEFINED")) {
                throw new IllegalArgumentException("No enum constant ru.ok.tamtam.api.commands.ContactVerifyCmd.VerifyResult.".concat(strO));
            }
            i = 3;
        }
        this.c = i;
    }

    @Override // defpackage.pj0
    public final String toString() {
        int i = this.c;
        String str = this.d;
        StringBuilder sb = new StringBuilder("{verifyResult=");
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "UNDEFINED" : "BAD" : "GOOD");
        sb.append(", name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
