package defpackage;

import java.nio.ByteBuffer;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes.dex */
public final class mr8 extends atc {
    public final /* synthetic */ int a;
    public int b;
    public long c;

    public /* synthetic */ mr8(int i) {
        this.a = i;
    }

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        switch (this.a) {
            case 0:
                try {
                    yscVar.z0.b(this);
                    break;
                } catch (TransportError e) {
                    yscVar.f(utb.e(e.a), null, 1);
                    return;
                }
            case 1:
                ctc ctcVar = (ctc) yscVar.O0.a.get(Integer.valueOf(this.b));
                if (ctcVar != null) {
                    ctcVar.f.w(this.c);
                    break;
                }
                break;
            default:
                yscVar.c.warn("Received " + this);
                break;
        }
    }

    @Override // defpackage.atc
    public final int c() {
        int iA;
        int iA2;
        switch (this.a) {
            case 0:
                iA = epi.a(this.b) + 1;
                iA2 = epi.a(this.c);
                break;
            case 1:
                iA = epi.a(this.b) + 1;
                iA2 = epi.a(this.c);
                break;
            default:
                iA = epi.a(this.b) + 1;
                iA2 = epi.a(this.c);
                break;
        }
        return iA2 + iA;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                byteBuffer.put((byte) 17);
                epi.b(this.b, byteBuffer);
                epi.c(this.c, byteBuffer);
                break;
            case 1:
                byteBuffer.put((byte) 5);
                epi.b(this.b, byteBuffer);
                epi.c(this.c, byteBuffer);
                break;
            default:
                byteBuffer.put((byte) 21);
                epi.b(this.b, byteBuffer);
                epi.c(this.c, byteBuffer);
                break;
        }
    }

    public void h(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.b = atc.e(byteBuffer);
        this.c = epi.i(byteBuffer);
    }

    public void i(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.b = atc.e(byteBuffer);
        this.c = epi.i(byteBuffer);
    }

    public void j(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.b = atc.e(byteBuffer);
        this.c = epi.i(byteBuffer);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sbM = u45.m(this.b, this.c, "MaxStreamDataFrame[", ":");
                sbM.append("]");
                return sbM.toString();
            case 1:
                StringBuilder sbM2 = u45.m(this.b, this.c, "StopSendingFrame[", ":");
                sbM2.append("]");
                return sbM2.toString();
            default:
                StringBuilder sbM3 = u45.m(this.b, this.c, "StreamDataBlockedFrame[", "|");
                sbM3.append("]");
                return sbM3.toString();
        }
    }

    public mr8(int i, long j) {
        this.a = 0;
        this.b = i;
        this.c = j;
    }
}
