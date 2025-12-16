package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class d2h implements Serializable {
    public final long X;
    public final long Y;
    public final int Z;
    public final gx3 a;
    public final String b;
    public final String c;
    public final String d;
    public final int o;
    public final List s0;

    public d2h(c2h c2hVar) {
        this.a = c2hVar.a;
        this.b = c2hVar.b;
        this.d = c2hVar.c;
        this.c = c2hVar.d;
        this.o = c2hVar.e;
        this.X = c2hVar.f;
        this.Z = c2hVar.h;
        this.Y = c2hVar.i;
        this.s0 = c2hVar.g;
    }

    public static d2h a(tm9 tm9Var) {
        byte bQ0;
        int iM = efi.m(tm9Var);
        if (iM == 0) {
            return null;
        }
        c2h c2hVar = new c2h();
        c2hVar.h = (byte) 0;
        c2hVar.i = 0L;
        for (int i = 0; i < iM; i++) {
            String strW0 = tm9Var.w0();
            strW0.getClass();
            switch (strW0) {
                case "startAt":
                    c2hVar.f = efi.l(tm9Var, 0L);
                    break;
                case "joinLink":
                    c2hVar.b = efi.o(tm9Var);
                    break;
                case "chatId":
                    c2hVar.i = efi.l(tm9Var, 0L);
                    break;
                case "conferenceId":
                    c2hVar.d = efi.o(tm9Var);
                    break;
                case "callName":
                    c2hVar.c = efi.o(tm9Var);
                    break;
                case "type":
                    if (tm9Var.w().a() == 3) {
                        bQ0 = tm9Var.q0();
                    } else {
                        tm9Var.v();
                        bQ0 = 0;
                    }
                    c2hVar.h = bQ0;
                    break;
                case "owner":
                    c2hVar.a = gx3.g(tm9Var);
                    break;
                case "previewParticipantIds":
                    c2hVar.g = sz.d(tm9Var);
                    break;
                case "participantsCount":
                    c2hVar.e = efi.k(tm9Var, 0);
                    break;
                default:
                    tm9Var.v();
                    break;
            }
        }
        if (c2hVar.g == null) {
            c2hVar.g = Collections.EMPTY_LIST;
        }
        return new d2h(c2hVar);
    }

    public final String toString() {
        int iA = zdi.a(this.s0);
        StringBuilder sb = new StringBuilder("VideoConference{owner=");
        sb.append(this.a);
        sb.append(", joinLink='");
        sb.append(this.b);
        sb.append("', conversationId='");
        ho7.r(sb, this.c, "', callName='", this.d, "', participantsCount=");
        sb.append(this.o);
        sb.append(", startedAt=");
        sb.append(this.X);
        sb.append(", type=");
        sb.append(this.Z);
        sb.append(", chatId=");
        utb.n(sb, this.Y, ", previewParticipantIds=", iA);
        sb.append("}");
        return sb.toString();
    }
}
