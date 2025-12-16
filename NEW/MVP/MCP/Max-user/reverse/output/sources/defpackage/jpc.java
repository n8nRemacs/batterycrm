package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class jpc extends fl9 {
    public static volatile jpc[] f;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public float d = 0.0f;
    public hpc[] e;

    public jpc() {
        if (hpc.c == null) {
            synchronized (kp7.b) {
                try {
                    if (hpc.c == null) {
                        hpc.c = new hpc[0];
                    }
                } finally {
                }
            }
        }
        this.e = hpc.c;
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int i = this.a;
        int i2 = 0;
        int iF = i != 0 ? hd3.f(1, i) : 0;
        int i3 = this.b;
        if (i3 != 0) {
            iF += hd3.f(2, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            iF += hd3.f(3, i4);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            iF += hd3.e(4);
        }
        hpc[] hpcVarArr = this.e;
        if (hpcVarArr != null && hpcVarArr.length > 0) {
            while (true) {
                hpc[] hpcVarArr2 = this.e;
                if (i2 >= hpcVarArr2.length) {
                    break;
                }
                hpc hpcVar = hpcVarArr2[i2];
                if (hpcVar != null) {
                    iF = hd3.i(5, hpcVar) + iF;
                }
                i2++;
            }
        }
        return iF;
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
                int iP = gd3Var.p();
                if (iP == 0) {
                    this.b = iP;
                }
            } else if (iS == 24) {
                this.c = gd3Var.p();
            } else if (iS == 37) {
                this.d = gd3Var.i();
            } else if (iS == 42) {
                int iB = coi.b(gd3Var, 42);
                hpc[] hpcVarArr = this.e;
                int length = hpcVarArr == null ? 0 : hpcVarArr.length;
                int i = iB + length;
                hpc[] hpcVarArr2 = new hpc[i];
                if (length != 0) {
                    System.arraycopy(hpcVarArr, 0, hpcVarArr2, 0, length);
                }
                while (length < i - 1) {
                    hpc hpcVar = new hpc();
                    hpcVarArr2[length] = hpcVar;
                    gd3Var.j(hpcVar);
                    gd3Var.s();
                    length++;
                }
                hpc hpcVar2 = new hpc();
                hpcVarArr2[length] = hpcVar2;
                gd3Var.j(hpcVar2);
                this.e = hpcVarArr2;
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
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            hd3Var.v(4, this.d);
        }
        hpc[] hpcVarArr = this.e;
        if (hpcVarArr == null || hpcVarArr.length <= 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            hpc[] hpcVarArr2 = this.e;
            if (i4 >= hpcVarArr2.length) {
                return;
            }
            hpc hpcVar = hpcVarArr2[i4];
            if (hpcVar != null) {
                hd3Var.y(5, hpcVar);
            }
            i4++;
        }
    }
}
