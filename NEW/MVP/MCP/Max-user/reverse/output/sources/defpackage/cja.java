package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class cja extends l0g {
    public String c;
    public long d;

    public cja(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
            this.d = efi.l(tm9Var, 0L);
        } else if (str.equals("text")) {
            this.c = efi.o(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        StringBuilder sbN = ho7.n("{chatId='", this.d, ", text='", this.c);
        sbN.append("'}");
        return sbN.toString();
    }
}
