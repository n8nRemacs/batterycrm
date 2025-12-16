package defpackage;

import java.nio.ByteBuffer;
import tech.kwik.agent15.TlsProtocolException;
import tech.kwik.agent15.alert.ErrorAlert;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes.dex */
public final class ya4 extends atc implements blf {
    public long a;
    public int b;
    public byte[] c;

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) throws Exception {
        try {
            yscVar.e(btcVar.l()).a(this);
            bh8 bh8Var = yscVar.c;
            db4 db4VarE = yscVar.e(btcVar.l());
            bh8Var.receivedPacketInfo(db4VarE.b(db4VarE.h));
        } catch (TlsProtocolException e) {
            if (yscVar.A0 == 2) {
                yscVar.d1 = e.toString();
                yscVar.c.error("Handshake failed with crypto error", e);
            } else {
                yscVar.c.error("Processing crypto frame failed with ", e);
            }
            yscVar.f(e instanceof ErrorAlert ? ((ErrorAlert) e).a.a + 256 : e.getCause() instanceof TransportError ? utb.e(((TransportError) e.getCause()).a) : 1, e.getMessage(), 1);
        } catch (TransportError e2) {
            if (yscVar.A0 == 2) {
                yscVar.d1 = e2.toString();
                yscVar.c.error("Handshake failed with crypto error", e2);
            } else {
                yscVar.c.error("Processing crypto frame failed with ", e2);
            }
            yscVar.f(utb.e(e2.a), "", 1);
        }
    }

    @Override // defpackage.blf
    public final long b() {
        return this.a + this.b;
    }

    @Override // defpackage.atc
    public final int c() {
        return epi.a(this.c.length) + epi.a(this.a) + 1 + this.c.length;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        blf blfVar = (blf) obj;
        return this.a != blfVar.getOffset() ? Long.compare(this.a, blfVar.getOffset()) : Long.compare(this.b, blfVar.getLength());
    }

    @Override // defpackage.blf
    public final byte[] f() {
        return this.c;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 6);
        epi.c(this.a, byteBuffer);
        epi.b(this.c.length, byteBuffer);
        byteBuffer.put(this.c);
    }

    @Override // defpackage.blf
    public final int getLength() {
        return this.b;
    }

    @Override // defpackage.blf
    public final long getOffset() {
        return this.a;
    }

    public final void h(ByteBuffer byteBuffer, bh8 bh8Var) {
        bh8Var.debug("Parsing Crypto frame");
        byteBuffer.get();
        this.a = epi.i(byteBuffer);
        int iG = epi.g(byteBuffer);
        this.b = iG;
        byte[] bArr = new byte[iG];
        this.c = bArr;
        byteBuffer.get(bArr);
        bh8Var.decrypted("Crypto data [" + this.a + "," + this.b + "]", this.c);
    }

    @Override // defpackage.blf
    public final boolean isFinal() {
        return false;
    }

    public final String toString() {
        return "CryptoFrame[" + this.a + "," + this.b + "]";
    }
}
