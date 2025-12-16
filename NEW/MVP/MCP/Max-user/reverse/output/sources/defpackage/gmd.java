package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class gmd implements Serializable {
    public final int a;
    public final int b;
    public final String c;
    public final uub d;
    public final wjb o;

    public gmd(int i, int i2, String str, uub uubVar, wjb wjbVar) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = uubVar;
        this.o = wjbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmd)) {
            return false;
        }
        gmd gmdVar = (gmd) obj;
        return this.a == gmdVar.a && this.b == gmdVar.b && fni.a(this.c, gmdVar.c) && fni.a(this.d, gmdVar.d) && fni.a(this.o, gmdVar.o);
    }

    public final int hashCode() {
        int iE = u45.e(utb.k(this.b, az1.v(this.a) * 31, 31), 31, this.c);
        uub uubVar = this.d;
        int iHashCode = (iE + (uubVar == null ? 0 : uubVar.hashCode())) * 31;
        wjb wjbVar = this.o;
        return iHashCode + (wjbVar != null ? wjbVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyButton(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN" : "LOCATION" : "CONTACT" : "IMAGE" : "MESSAGE");
        sb.append(", intent=");
        int i2 = this.b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "UNKNOWN" : "NEGATIVE" : "POSITIVE" : "DEFAULT");
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", outgoingMessage=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
