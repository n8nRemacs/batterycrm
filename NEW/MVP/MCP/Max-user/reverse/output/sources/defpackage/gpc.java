package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class gpc extends fl9 {
    public lpc a;
    public float b;
    public float[] c;

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        lpc lpcVar = this.a;
        int i = lpcVar != null ? hd3.i(1, lpcVar) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            i += hd3.e(2);
        }
        float[] fArr = this.c;
        return fArr.length > 0 ? (fArr.length * 4) + i + fArr.length : i;
    }

    @Override // defpackage.fl9
    public final fl9 mergeFrom(gd3 gd3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = gd3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                if (this.a == null) {
                    this.a = new lpc();
                }
                gd3Var.j(this.a);
            } else if (iS == 21) {
                this.b = gd3Var.i();
            } else if (iS == 26) {
                int iP = gd3Var.p();
                int iE = gd3Var.e(iP);
                float[] fArr = this.c;
                int length = fArr.length;
                int i = (iP / 4) + length;
                float[] fArr2 = new float[i];
                if (length != 0) {
                    System.arraycopy(fArr, 0, fArr2, 0, length);
                }
                while (length < i) {
                    fArr2[length] = gd3Var.i();
                    length++;
                }
                this.c = fArr2;
                gd3Var.d(iE);
            } else if (iS == 29) {
                int iB = coi.b(gd3Var, 29);
                float[] fArr3 = this.c;
                int length2 = fArr3.length;
                int i2 = iB + length2;
                float[] fArr4 = new float[i2];
                if (length2 != 0) {
                    System.arraycopy(fArr3, 0, fArr4, 0, length2);
                }
                while (length2 < i2 - 1) {
                    fArr4[length2] = gd3Var.i();
                    gd3Var.s();
                    length2++;
                }
                fArr4[length2] = gd3Var.i();
                this.c = fArr4;
            } else if (!gd3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.fl9
    public final void writeTo(hd3 hd3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        lpc lpcVar = this.a;
        if (lpcVar != null) {
            hd3Var.y(1, lpcVar);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            hd3Var.v(2, this.b);
        }
        if (this.c.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            float[] fArr = this.c;
            if (i >= fArr.length) {
                return;
            }
            hd3Var.v(3, fArr[i]);
            i++;
        }
    }
}
