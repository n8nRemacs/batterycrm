package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class fpc extends fl9 {
    public static volatile fpc[] c;
    public int a = 0;
    public int b = 0;

    public fpc() {
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int i = this.a;
        int iF = i != 0 ? hd3.f(1, i) : 0;
        int i2 = this.b;
        return i2 != 0 ? hd3.f(2, i2) + iF : iF;
    }

    @Override // defpackage.fl9
    public final fl9 mergeFrom(gd3 gd3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = gd3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 8) {
                int iP = gd3Var.p();
                if (iP == 0) {
                    this.a = iP;
                }
            } else if (iS == 16) {
                this.b = gd3Var.p();
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
    }
}
