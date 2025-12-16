package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class jka extends l0g {
    public long c;
    public long d;
    public ul9 o;

    public jka(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1716357513) {
            if (iHashCode != -1440013438) {
                if (iHashCode == -1361631597 && str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    this.c = efi.l(tm9Var, 0L);
                    return;
                }
            } else if (str.equals("messageId")) {
                this.d = efi.l(tm9Var, 0L);
                return;
            }
        } else if (str.equals("reactionInfo")) {
            this.o = iwi.b(tm9Var);
            return;
        }
        tm9Var.v();
    }

    @Override // defpackage.pj0
    public final String toString() {
        long j = this.c;
        long j2 = this.d;
        ul9 ul9Var = this.o;
        Integer numValueOf = ul9Var != null ? Integer.valueOf(ul9Var.a.size()) : null;
        StringBuilder sbL = az1.l(j, "{chatId=", ", messageId=");
        sbL.append(j2);
        sbL.append(", reactionInfo = ");
        sbL.append(numValueOf);
        sbL.append(" }");
        return sbL.toString();
    }
}
