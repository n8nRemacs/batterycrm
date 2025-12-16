package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ir3 extends atc {
    public long b;
    public byte[] c = new byte[0];
    public int d = -1;
    public int o = 28;
    public long a = 0;

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        long j;
        String str;
        hf5 hf5VarL = btcVar.l();
        if (utb.a(yscVar.A0)) {
            return;
        }
        String str2 = null;
        yscVar.d(new rs0(2, true, i() ? Long.valueOf(this.a) : null, h() ? Long.valueOf(this.a) : null));
        if ((i() || h()) && yscVar.A0 == 2) {
            String strH = "";
            if (i()) {
                int i = this.d;
                if (i == -1) {
                    j = this.a;
                    byte[] bArr = this.c;
                    if (bArr != null) {
                        try {
                            str2 = new String(bArr, "UTF-8");
                        } catch (UnsupportedEncodingException unused) {
                        }
                        strH = wy1.h(": ", str2);
                    }
                    str = "transport error ";
                } else {
                    if (i == -1) {
                        throw new IllegalStateException("Close does not have a TLS error");
                    }
                    j = i;
                    byte[] bArr2 = this.c;
                    if (bArr2 != null) {
                        try {
                            str2 = new String(bArr2, "UTF-8");
                        } catch (UnsupportedEncodingException unused2) {
                        }
                        strH = wy1.h(": ", str2);
                    }
                    str = "TLS error ";
                }
            } else {
                if (h()) {
                    j = this.a;
                    byte[] bArr3 = this.c;
                    if (bArr3 != null) {
                        try {
                            str2 = new String(bArr3, "UTF-8");
                        } catch (UnsupportedEncodingException unused3) {
                        }
                        strH = wy1.h(": ", str2);
                    }
                    str = "application protocol error ";
                }
                yscVar.d1 = wy1.h("Server closed connection: ", strH);
            }
            strH = a9h.d(j, str, strH);
            yscVar.d1 = wy1.h("Server closed connection: ", strH);
        }
        yscVar.L0.j();
        yscVar.O0.a();
        Object obj = yscVar.a.b;
        yscVar.L0.f(new ir3(), hf5VarL, rde.A);
        yscVar.A0 = 5;
        try {
            yscVar.D0.schedule(new tsc(yscVar, 4), yscVar.L0.d() * 3, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException unused4) {
        }
    }

    @Override // defpackage.atc
    public final int c() {
        return epi.a(this.c.length) + epi.a(this.a) + 1 + (this.o == 28 ? epi.a(0L) : 0) + this.c.length;
    }

    @Override // defpackage.atc
    public final boolean d() {
        return false;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        if (this.o != 28) {
            byteBuffer.put((byte) 29);
            epi.c(this.a, byteBuffer);
            epi.b(this.c.length, byteBuffer);
            byteBuffer.put(this.c);
            return;
        }
        byteBuffer.put((byte) 28);
        epi.c(this.a, byteBuffer);
        epi.b(0, byteBuffer);
        epi.b(this.c.length, byteBuffer);
        byteBuffer.put(this.c);
    }

    public final boolean h() {
        return this.o == 29 && this.a != 0;
    }

    public final boolean i() {
        return this.o == 28 && this.a != 0;
    }

    public final void j(ByteBuffer byteBuffer) {
        int i = byteBuffer.get() & 255;
        this.o = i;
        if (i != 28 && i != 29) {
            throw new RuntimeException();
        }
        this.a = epi.i(byteBuffer);
        if (this.o == 28) {
            this.b = epi.i(byteBuffer);
        }
        int iG = epi.g(byteBuffer);
        if (iG > 0) {
            byte[] bArr = new byte[iG];
            this.c = bArr;
            byteBuffer.get(bArr);
        }
        if (this.o == 28) {
            long j = this.a;
            if (j < 256 || j >= 512) {
                return;
            }
            this.d = (int) (j - 256);
        }
    }

    public final String toString() {
        int i = this.d;
        Object objF = i != -1 ? ho7.f(i, "TLS ") : Long.valueOf(this.a);
        long j = this.b;
        byte[] bArr = this.c;
        String str = bArr != null ? new String(bArr) : "-";
        StringBuilder sb = new StringBuilder("ConnectionCloseFrame[");
        sb.append(objF);
        sb.append("|");
        sb.append(j);
        return ctd.j(sb, "|", str, "]");
    }
}
