package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class el7 extends fl9 {
    public byte[] a = coi.e;

    public el7() {
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        if (Arrays.equals(this.a, coi.e)) {
            return 0;
        }
        return hd3.b(1, this.a);
    }

    @Override // defpackage.fl9
    public final fl9 mergeFrom(gd3 gd3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = gd3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                this.a = gd3Var.g();
            } else if (!gd3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.fl9
    public final void writeTo(hd3 hd3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        if (Arrays.equals(this.a, coi.e)) {
            return;
        }
        hd3Var.s(1, this.a);
    }
}
