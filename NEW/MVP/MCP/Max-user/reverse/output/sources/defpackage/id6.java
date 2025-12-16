package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class id6 extends fl9 {
    public static volatile id6[] i;
    public long a = 0;
    public String b = "";
    public String c = "";
    public String d = "";
    public long e = 0;
    public String f = "";
    public String g = "";
    public String h = "";

    public id6() {
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        long j = this.a;
        int iH = j != 0 ? hd3.h(1, j) : 0;
        if (!this.b.equals("")) {
            iH += hd3.l(2, this.b);
        }
        if (!this.c.equals("")) {
            iH += hd3.l(3, this.c);
        }
        if (!this.d.equals("")) {
            iH += hd3.l(4, this.d);
        }
        long j2 = this.e;
        if (j2 != 0) {
            iH += hd3.h(5, j2);
        }
        if (!this.f.equals("")) {
            iH += hd3.l(6, this.f);
        }
        if (!this.g.equals("")) {
            iH += hd3.l(7, this.g);
        }
        return !this.h.equals("") ? hd3.l(8, this.h) + iH : iH;
    }

    @Override // defpackage.fl9
    public final fl9 mergeFrom(gd3 gd3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = gd3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 8) {
                this.a = gd3Var.q();
            } else if (iS == 18) {
                this.b = gd3Var.r();
            } else if (iS == 26) {
                this.c = gd3Var.r();
            } else if (iS == 34) {
                this.d = gd3Var.r();
            } else if (iS == 40) {
                this.e = gd3Var.q();
            } else if (iS == 50) {
                this.f = gd3Var.r();
            } else if (iS == 58) {
                this.g = gd3Var.r();
            } else if (iS == 66) {
                this.h = gd3Var.r();
            } else if (!gd3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.fl9
    public final void writeTo(hd3 hd3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        long j = this.a;
        if (j != 0) {
            hd3Var.x(1, j);
        }
        if (!this.b.equals("")) {
            hd3Var.E(2, this.b);
        }
        if (!this.c.equals("")) {
            hd3Var.E(3, this.c);
        }
        if (!this.d.equals("")) {
            hd3Var.E(4, this.d);
        }
        long j2 = this.e;
        if (j2 != 0) {
            hd3Var.x(5, j2);
        }
        if (!this.f.equals("")) {
            hd3Var.E(6, this.f);
        }
        if (!this.g.equals("")) {
            hd3Var.E(7, this.g);
        }
        if (this.h.equals("")) {
            return;
        }
        hd3Var.E(8, this.h);
    }
}
