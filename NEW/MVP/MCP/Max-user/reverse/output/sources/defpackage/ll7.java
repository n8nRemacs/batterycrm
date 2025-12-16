package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ll7 extends fl9 {
    public static volatile ll7[] e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public byte[] d = coi.e;

    public ll7() {
        this.cachedSize = -1;
    }

    public static ll7[] a() {
        if (e == null) {
            synchronized (kp7.b) {
                try {
                    if (e == null) {
                        e = new ll7[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int i = this.a;
        int iF = i != 0 ? hd3.f(1, i) : 0;
        int i2 = this.b;
        if (i2 != 0) {
            iF += hd3.n(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            iF += hd3.n(3, i3);
        }
        return !Arrays.equals(this.d, coi.e) ? hd3.b(4, this.d) + iF : iF;
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
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                    this.a = iP;
                }
            } else if (iS == 16) {
                this.b = gd3Var.p();
            } else if (iS == 24) {
                this.c = gd3Var.p();
            } else if (iS == 34) {
                this.d = gd3Var.g();
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
            hd3Var.G(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            hd3Var.G(3, i3);
        }
        if (Arrays.equals(this.d, coi.e)) {
            return;
        }
        hd3Var.s(4, this.d);
    }
}
