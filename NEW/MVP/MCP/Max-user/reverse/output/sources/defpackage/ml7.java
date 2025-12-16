package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class ml7 extends fl9 {
    public int a = 0;

    public ml7() {
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int i = this.a;
        if (i != 0) {
            return hd3.n(1, i);
        }
        return 0;
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
            hd3Var.G(1, i);
        }
    }
}
