package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class kl7 extends fl9 {
    public jl7[] a;

    public kl7() {
        if (jl7.f == null) {
            synchronized (kp7.b) {
                try {
                    if (jl7.f == null) {
                        jl7.f = new jl7[0];
                    }
                } finally {
                }
            }
        }
        this.a = jl7.f;
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        jl7[] jl7VarArr = this.a;
        int i = 0;
        if (jl7VarArr == null || jl7VarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            jl7[] jl7VarArr2 = this.a;
            if (i >= jl7VarArr2.length) {
                return i2;
            }
            jl7 jl7Var = jl7VarArr2[i];
            if (jl7Var != null) {
                i2 = hd3.i(1, jl7Var) + i2;
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
                jl7[] jl7VarArr = this.a;
                int length = jl7VarArr == null ? 0 : jl7VarArr.length;
                int i = iB + length;
                jl7[] jl7VarArr2 = new jl7[i];
                if (length != 0) {
                    System.arraycopy(jl7VarArr, 0, jl7VarArr2, 0, length);
                }
                while (length < i - 1) {
                    jl7 jl7Var = new jl7();
                    jl7VarArr2[length] = jl7Var;
                    gd3Var.j(jl7Var);
                    gd3Var.s();
                    length++;
                }
                jl7 jl7Var2 = new jl7();
                jl7VarArr2[length] = jl7Var2;
                gd3Var.j(jl7Var2);
                this.a = jl7VarArr2;
            } else if (!gd3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.fl9
    public final void writeTo(hd3 hd3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        jl7[] jl7VarArr = this.a;
        if (jl7VarArr == null || jl7VarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            jl7[] jl7VarArr2 = this.a;
            if (i >= jl7VarArr2.length) {
                return;
            }
            jl7 jl7Var = jl7VarArr2[i];
            if (jl7Var != null) {
                hd3Var.y(1, jl7Var);
            }
            i++;
        }
    }
}
