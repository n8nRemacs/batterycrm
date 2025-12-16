package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class fl7 extends fl9 {
    public int a = 0;
    public byte[] b = coi.e;

    public fl7() {
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int i = this.a;
        int iN = i != 0 ? hd3.n(1, i) : 0;
        return !Arrays.equals(this.b, coi.e) ? hd3.b(2, this.b) + iN : iN;
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
            } else if (iS == 18) {
                this.b = gd3Var.g();
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
        if (Arrays.equals(this.b, coi.e)) {
            return;
        }
        hd3Var.s(2, this.b);
    }
}
