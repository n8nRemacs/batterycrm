package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class h1h {
    public final /* synthetic */ int a = 0;
    public Object b;
    public long c;
    public long d;
    public Object e;
    public Object f;
    public int g;

    public /* synthetic */ h1h() {
    }

    public static h1h a(tm9 tm9Var) throws IOException {
        int i;
        int iM = efi.m(tm9Var);
        if (iM == 0) {
            return null;
        }
        h1h h1hVar = new h1h();
        for (int i2 = 0; i2 < iM; i2++) {
            String strW0 = tm9Var.w0();
            strW0.getClass();
            i = 3;
            switch (strW0) {
                case "conversationId":
                    h1hVar.b = tm9Var.w0();
                    break;
                case "chatId":
                    h1hVar.d = tm9Var.t0();
                    break;
                case "callerId":
                    h1hVar.c = tm9Var.t0();
                    break;
                case "type":
                    String strW02 = tm9Var.w0();
                    strW02.getClass();
                    if (strW02.equals("AUDIO")) {
                        i = 2;
                    } else if (!strW02.equals("VIDEO")) {
                        i = 1;
                    }
                    h1hVar.g = i;
                    break;
                case "turnServer":
                    h1hVar.e = uaj.d(tm9Var);
                    break;
                case "sdpOffer":
                    h1hVar.f = efi.o(tm9Var);
                    break;
                default:
                    tm9Var.v();
                    break;
            }
        }
        return new h1h(h1hVar);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String str = (String) this.b;
                long j = this.c;
                long j2 = this.d;
                uaj uajVar = (uaj) this.e;
                String str2 = (String) this.f;
                int i = this.g;
                StringBuilder sbQ = xrf.q("{conversationId='", j, str, "', callerId=");
                az1.r(j2, ", chatId=", ", turnServer=", sbQ);
                sbQ.append(uajVar);
                sbQ.append(", sdpOffer='");
                sbQ.append(str2);
                sbQ.append("', type=");
                sbQ.append(xc0.p(i));
                sbQ.append("}");
                return sbQ.toString();
            default:
                return super.toString();
        }
    }

    public h1h(zva zvaVar) {
        rl rlVar = new rl(2, zvaVar);
        this.b = zvaVar;
        this.f = rlVar;
        this.e = new Object();
    }

    public h1h(h1h h1hVar) {
        this.b = (String) h1hVar.b;
        this.c = h1hVar.c;
        this.d = h1hVar.d;
        this.e = (uaj) h1hVar.e;
        this.f = (String) h1hVar.f;
        this.g = h1hVar.g;
    }
}
