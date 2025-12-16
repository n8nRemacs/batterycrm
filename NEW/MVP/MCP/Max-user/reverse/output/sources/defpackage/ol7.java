package defpackage;

import java.nio.ByteBuffer;
import java.util.stream.Collectors;
import tech.kwik.core.generic.InvalidIntegerEncodingException;
import tech.kwik.core.impl.InvalidPacketException;

/* loaded from: classes3.dex */
public final class ol7 extends vj8 {
    public byte[] h;

    @Override // defpackage.btc
    public final int a(ysc yscVar, bj bjVar) {
        byte[] bArr = this.h;
        if (bArr != null && bArr.length > 0) {
            yscVar.c.error("Received Initial packet with non-zero token length; discarding packet");
            return 2;
        }
        if (!this.a.equals((zzg) yscVar.a.b)) {
            zzg zzgVar = this.a;
            if (!zzgVar.equals((zzg) yscVar.a.b) && zzgVar.equals(null) && yscVar.d == 1) {
                yscVar.d = 2;
                qje qjeVar = yscVar.a;
                qjeVar.getClass();
                qjeVar.b = zzgVar;
                fs3 fs3Var = yscVar.o;
                fs3Var.b((byte[]) fs3Var.g);
            }
        }
        rr3 rr3Var = yscVar.Q0;
        byte[] bArr2 = this.g;
        lu4 lu4Var = rr3Var.f;
        lu4Var.a.put(0, new or3(0, bArr2, 2));
        lu4Var.b = bArr2;
        yscVar.i(this, bjVar);
        yscVar.Z0 = true;
        return 1;
    }

    @Override // defpackage.btc
    public final hf5 l() {
        return hf5.a;
    }

    @Override // defpackage.btc
    public final m5c n() {
        return m5c.a;
    }

    @Override // defpackage.vj8
    public final String toString() {
        String str = this.f ? "P" : "";
        char cCharAt = "Initial".charAt(0);
        long j = this.b;
        String strValueOf = j >= 0 ? Long.valueOf(j) : ".";
        int i = this.d;
        Object objValueOf = i >= 0 ? Integer.valueOf(i) : ".";
        int size = this.c.size();
        byte[] bArr = this.h;
        return "Packet " + str + cCharAt + "|" + strValueOf + "|L|" + objValueOf + "|" + size + "  Token=" + (bArr != null ? uwi.a(bArr) : "[]") + " " + ((String) this.c.stream().map(new m0(25)).collect(Collectors.joining(" ")));
    }

    @Override // defpackage.vj8
    public final int w() {
        byte[] bArr = this.h;
        if (bArr == null) {
            return 1;
        }
        return bArr.length + 1;
    }

    @Override // defpackage.vj8
    public final void x(ByteBuffer byteBuffer) {
        byte[] bArr = this.h;
        if (bArr == null) {
            byteBuffer.put((byte) 0);
        } else {
            epi.b(bArr.length, byteBuffer);
            byteBuffer.put(this.h);
        }
    }

    @Override // defpackage.vj8
    public final byte y() {
        return (byte) (this.a.b() ? 1 : 0);
    }

    @Override // defpackage.vj8
    public final void z(ByteBuffer byteBuffer) throws InvalidPacketException {
        try {
            long jI = epi.i(byteBuffer);
            if (jI > 0) {
                if (jI > byteBuffer.remaining()) {
                    throw new InvalidPacketException();
                }
                byte[] bArr = new byte[(int) jI];
                this.h = bArr;
                byteBuffer.get(bArr);
            }
        } catch (InvalidIntegerEncodingException unused) {
            throw new InvalidPacketException();
        }
    }
}
