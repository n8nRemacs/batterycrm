package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class hpc extends fl9 {
    public static volatile hpc[] c;
    public int a = 0;
    public float[] b = coi.c;

    public hpc() {
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int i = this.a;
        int iF = i != 0 ? hd3.f(1, i) : 0;
        float[] fArr = this.b;
        return fArr.length > 0 ? (fArr.length * 4) + iF + fArr.length : iF;
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
                if (iP == 0 || iP == 1) {
                    this.a = iP;
                }
            } else if (iS == 18) {
                int iP2 = gd3Var.p();
                int iE = gd3Var.e(iP2);
                float[] fArr = this.b;
                int length = fArr.length;
                int i = (iP2 / 4) + length;
                float[] fArr2 = new float[i];
                if (length != 0) {
                    System.arraycopy(fArr, 0, fArr2, 0, length);
                }
                while (length < i) {
                    fArr2[length] = gd3Var.i();
                    length++;
                }
                this.b = fArr2;
                gd3Var.d(iE);
            } else if (iS == 21) {
                int iB = coi.b(gd3Var, 21);
                float[] fArr3 = this.b;
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
                this.b = fArr4;
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
        if (this.b.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            float[] fArr = this.b;
            if (i2 >= fArr.length) {
                return;
            }
            hd3Var.v(2, fArr[i2]);
            i2++;
        }
    }
}
