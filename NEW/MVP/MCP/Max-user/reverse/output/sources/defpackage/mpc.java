package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class mpc extends fl9 {
    public float a;
    public float b;
    public int c;
    public boolean d;

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int iE = Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f) ? hd3.e(1) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            iE += hd3.e(2);
        }
        int i = this.c;
        if (i != 0) {
            iE += hd3.f(3, i);
        }
        return this.d ? hd3.a(4) + iE : iE;
    }

    @Override // defpackage.fl9
    public final fl9 mergeFrom(gd3 gd3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = gd3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 13) {
                this.a = gd3Var.i();
            } else if (iS == 21) {
                this.b = gd3Var.i();
            } else if (iS == 24) {
                this.c = gd3Var.p();
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
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f)) {
            hd3Var.v(1, this.a);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            hd3Var.v(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            hd3Var.w(3, i);
        }
        boolean z = this.d;
        if (z) {
            hd3Var.r(4, z);
        }
    }
}
