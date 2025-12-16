package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zd4 extends atc {
    public final /* synthetic */ int a;
    public long b;

    public /* synthetic */ zd4(int i) {
        this.a = i;
    }

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        switch (this.a) {
            case 0:
                yscVar.c.warn("Received " + this);
                return;
            default:
                b36 b36Var = yscVar.z0;
                synchronized (b36Var) {
                    try {
                        long j = this.b;
                        long j2 = b36Var.e;
                        if (j > j2) {
                            boolean z = j2 == b36Var.f;
                            b36Var.e = j;
                            if (z) {
                                b36Var.j.forEach(new ov3(1, b36Var));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // defpackage.atc
    public final int c() {
        int iA;
        switch (this.a) {
            case 0:
                iA = epi.a(this.b);
                break;
            default:
                iA = epi.a(this.b);
                break;
        }
        return iA + 1;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                byteBuffer.put((byte) 20);
                epi.c(this.b, byteBuffer);
                break;
            default:
                byteBuffer.put((byte) 16);
                epi.c(this.b, byteBuffer);
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return a9h.d(this.b, "DataBlockedFrame[", "]");
            default:
                return a9h.d(this.b, "MaxDataFrame[", "]");
        }
    }
}
