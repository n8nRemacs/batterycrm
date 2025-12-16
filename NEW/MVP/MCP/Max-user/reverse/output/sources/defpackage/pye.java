package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class pye implements pr9 {
    public final long a;
    public final String b;
    public final dx0 c;
    public final yw0 d;
    public final n5g e;
    public final n5g f;
    public final List g;

    public pye(long j, String str, dx0 dx0Var, yw0 yw0Var, n5g n5gVar, n5g n5gVar2, List list) {
        this.a = j;
        this.b = str;
        this.c = dx0Var;
        this.d = yw0Var;
        this.e = n5gVar;
        this.f = n5gVar2;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pye)) {
            return false;
        }
        pye pyeVar = (pye) obj;
        return this.a == pyeVar.a && fni.a(this.b, pyeVar.b) && fni.a(this.c, pyeVar.c) && fni.a(this.d, pyeVar.d) && this.e.equals(pyeVar.e) && this.f.equals(pyeVar.f) && this.g.equals(pyeVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + xrf.k(this.f.c, xrf.k(this.e.c, (this.d.hashCode() + ((this.c.hashCode() + u45.e(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("ShowShareContactForBotConfirmation(messageId=", this.a, ", keyboardId=", this.b);
        sbN.append(", buttonPosition=");
        sbN.append(this.c);
        sbN.append(", button=");
        sbN.append(this.d);
        sbN.append(", title=");
        sbN.append(this.e);
        sbN.append(", description=");
        sbN.append(this.f);
        sbN.append(", buttons=");
        sbN.append(this.g);
        sbN.append(")");
        return sbN.toString();
    }
}
