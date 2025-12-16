package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class opc extends fl9 {
    public static volatile opc[] e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public hd6 d = null;

    public opc() {
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int i = this.a;
        int iF = i != 0 ? hd3.f(1, i) : 0;
        int i2 = this.b;
        if (i2 != 0) {
            iF += hd3.f(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            iF += hd3.f(3, i3);
        }
        hd6 hd6Var = this.d;
        return hd6Var != null ? hd3.i(4, hd6Var) + iF : iF;
    }

    @Override // defpackage.fl9
    public final fl9 mergeFrom(gd3 gd3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = gd3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 8) {
                this.a = gd3Var.p();
            } else if (iS == 16) {
                this.b = gd3Var.p();
            } else if (iS == 24) {
                this.c = gd3Var.p();
            } else if (iS == 34) {
                if (this.d == null) {
                    this.d = new hd6(3);
                }
                gd3Var.j(this.d);
            } else if (!gd3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.fl9
    public final void writeTo(hd3 hd3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        int i = this.a;
        if (i != 0) {
            hd3Var.w(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            hd3Var.w(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            hd3Var.w(3, i3);
        }
        hd6 hd6Var = this.d;
        if (hd6Var != null) {
            hd3Var.y(4, hd6Var);
        }
    }
}
