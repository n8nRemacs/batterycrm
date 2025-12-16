package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class il7 extends fl9 {
    public hl7[] a;

    public il7() {
        if (hl7.u == null) {
            synchronized (kp7.b) {
                try {
                    if (hl7.u == null) {
                        hl7.u = new hl7[0];
                    }
                } finally {
                }
            }
        }
        this.a = hl7.u;
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        hl7[] hl7VarArr = this.a;
        int i = 0;
        if (hl7VarArr == null || hl7VarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            hl7[] hl7VarArr2 = this.a;
            if (i >= hl7VarArr2.length) {
                return i2;
            }
            hl7 hl7Var = hl7VarArr2[i];
            if (hl7Var != null) {
                i2 = hd3.i(1, hl7Var) + i2;
            }
            i++;
        }
    }

    @Override // defpackage.fl9
    public final fl9 mergeFrom(gd3 gd3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = gd3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                int iB = coi.b(gd3Var, 10);
                hl7[] hl7VarArr = this.a;
                int length = hl7VarArr == null ? 0 : hl7VarArr.length;
                int i = iB + length;
                hl7[] hl7VarArr2 = new hl7[i];
                if (length != 0) {
                    System.arraycopy(hl7VarArr, 0, hl7VarArr2, 0, length);
                }
                while (length < i - 1) {
                    hl7 hl7Var = new hl7();
                    hl7VarArr2[length] = hl7Var;
                    gd3Var.j(hl7Var);
                    gd3Var.s();
                    length++;
                }
                hl7 hl7Var2 = new hl7();
                hl7VarArr2[length] = hl7Var2;
                gd3Var.j(hl7Var2);
                this.a = hl7VarArr2;
            } else if (!gd3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.fl9
    public final void writeTo(hd3 hd3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        hl7[] hl7VarArr = this.a;
        if (hl7VarArr == null || hl7VarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            hl7[] hl7VarArr2 = this.a;
            if (i >= hl7VarArr2.length) {
                return;
            }
            hl7 hl7Var = hl7VarArr2[i];
            if (hl7Var != null) {
                hd3Var.y(1, hl7Var);
            }
            i++;
        }
    }
}
