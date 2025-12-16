package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class ipc extends fl9 {
    public jpc[] a;
    public fpc[] b;
    public lpc c;
    public boolean d;

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int i;
        jpc[] jpcVarArr = this.a;
        int i2 = 0;
        if (jpcVarArr != null && jpcVarArr.length > 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                jpc[] jpcVarArr2 = this.a;
                if (i3 >= jpcVarArr2.length) {
                    break;
                }
                jpc jpcVar = jpcVarArr2[i3];
                if (jpcVar != null) {
                    i += hd3.i(1, jpcVar);
                }
                i3++;
            }
        } else {
            i = 0;
        }
        fpc[] fpcVarArr = this.b;
        if (fpcVarArr != null && fpcVarArr.length > 0) {
            while (true) {
                fpc[] fpcVarArr2 = this.b;
                if (i2 >= fpcVarArr2.length) {
                    break;
                }
                fpc fpcVar = fpcVarArr2[i2];
                if (fpcVar != null) {
                    i = hd3.i(2, fpcVar) + i;
                }
                i2++;
            }
        }
        lpc lpcVar = this.c;
        if (lpcVar != null) {
            i += hd3.i(3, lpcVar);
        }
        return this.d ? hd3.a(4) + i : i;
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
                jpc[] jpcVarArr = this.a;
                int length = jpcVarArr == null ? 0 : jpcVarArr.length;
                int i = iB + length;
                jpc[] jpcVarArr2 = new jpc[i];
                if (length != 0) {
                    System.arraycopy(jpcVarArr, 0, jpcVarArr2, 0, length);
                }
                while (length < i - 1) {
                    jpc jpcVar = new jpc();
                    jpcVarArr2[length] = jpcVar;
                    gd3Var.j(jpcVar);
                    gd3Var.s();
                    length++;
                }
                jpc jpcVar2 = new jpc();
                jpcVarArr2[length] = jpcVar2;
                gd3Var.j(jpcVar2);
                this.a = jpcVarArr2;
            } else if (iS == 18) {
                int iB2 = coi.b(gd3Var, 18);
                fpc[] fpcVarArr = this.b;
                int length2 = fpcVarArr == null ? 0 : fpcVarArr.length;
                int i2 = iB2 + length2;
                fpc[] fpcVarArr2 = new fpc[i2];
                if (length2 != 0) {
                    System.arraycopy(fpcVarArr, 0, fpcVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    fpc fpcVar = new fpc();
                    fpcVarArr2[length2] = fpcVar;
                    gd3Var.j(fpcVar);
                    gd3Var.s();
                    length2++;
                }
                fpc fpcVar2 = new fpc();
                fpcVarArr2[length2] = fpcVar2;
                gd3Var.j(fpcVar2);
                this.b = fpcVarArr2;
            } else if (iS == 26) {
                if (this.c == null) {
                    this.c = new lpc();
                }
                gd3Var.j(this.c);
            } else if (iS == 32) {
                this.d = gd3Var.f();
            } else if (!gd3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.fl9
    public final void writeTo(hd3 hd3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        jpc[] jpcVarArr = this.a;
        int i = 0;
        if (jpcVarArr != null && jpcVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                jpc[] jpcVarArr2 = this.a;
                if (i2 >= jpcVarArr2.length) {
                    break;
                }
                jpc jpcVar = jpcVarArr2[i2];
                if (jpcVar != null) {
                    hd3Var.y(1, jpcVar);
                }
                i2++;
            }
        }
        fpc[] fpcVarArr = this.b;
        if (fpcVarArr != null && fpcVarArr.length > 0) {
            while (true) {
                fpc[] fpcVarArr2 = this.b;
                if (i >= fpcVarArr2.length) {
                    break;
                }
                fpc fpcVar = fpcVarArr2[i];
                if (fpcVar != null) {
                    hd3Var.y(2, fpcVar);
                }
                i++;
            }
        }
        lpc lpcVar = this.c;
        if (lpcVar != null) {
            hd3Var.y(3, lpcVar);
        }
        boolean z = this.d;
        if (z) {
            hd3Var.r(4, z);
        }
    }
}
