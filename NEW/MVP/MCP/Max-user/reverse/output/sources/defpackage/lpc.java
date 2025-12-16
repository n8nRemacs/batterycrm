package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class lpc extends fl9 {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;

    public lpc() {
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int iE = Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f) ? hd3.e(1) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            iE += hd3.e(2);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            iE += hd3.e(3);
        }
        return Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f) ? hd3.e(4) + iE : iE;
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
            } else if (iS == 29) {
                this.c = gd3Var.i();
            } else if (iS == 37) {
                this.d = gd3Var.i();
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
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            hd3Var.v(3, this.c);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            hd3Var.v(4, this.d);
        }
    }
}
