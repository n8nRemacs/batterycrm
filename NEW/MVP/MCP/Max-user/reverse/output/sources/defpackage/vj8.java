package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.stream.Collectors;
import tech.kwik.core.generic.IntegerTooLargeException;
import tech.kwik.core.generic.InvalidIntegerEncodingException;
import tech.kwik.core.impl.InvalidPacketException;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes3.dex */
public abstract class vj8 extends btc {
    public byte[] g;

    public vj8(zzg zzgVar) {
        this.a = zzgVar;
    }

    @Override // defpackage.btc
    public final void d(byte b) throws TransportError {
        if ((b & 12) != 0) {
            throw new TransportError(11, "Reserved bits in long header packet are not zero");
        }
    }

    @Override // defpackage.btc
    public final int h(int i) {
        int iE = btc.e(this.b);
        int iSum = this.c.stream().mapToInt(new n0(13)).sum() + i;
        return btc.e(this.b) + w() + this.e.length + 7 + this.g.length + (iSum + 1 > 63 ? 2 : 1) + iSum + Integer.max(0, (4 - iE) - iSum) + 16;
    }

    @Override // defpackage.btc
    public final byte[] i(hc hcVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1500);
        byte bG = btc.g(this.b, (byte) ((y() << 4) | 192));
        btc.g(this.b, bG);
        byteBufferAllocate.put(bG);
        byteBufferAllocate.put(this.a.a());
        byteBufferAllocate.put((byte) this.e.length);
        byteBufferAllocate.put(this.e);
        byteBufferAllocate.put((byte) this.g.length);
        byteBufferAllocate.put(this.g);
        x(byteBufferAllocate);
        byte[] bArrF = btc.f(this.b);
        ByteBuffer byteBufferJ = j(bArrF.length);
        epi.b(byteBufferJ.limit() + 16 + bArrF.length, byteBufferAllocate);
        byteBufferAllocate.put(bArrF);
        u(byteBufferAllocate, bArrF.length, byteBufferJ, hcVar);
        this.d = byteBufferAllocate.limit();
        int iPosition = byteBufferAllocate.position();
        byte[] bArr = new byte[iPosition];
        byteBufferAllocate.get(bArr);
        this.d = iPosition;
        return bArr;
    }

    @Override // defpackage.btc
    public final void s(ByteBuffer byteBuffer, hc hcVar, long j, bh8 bh8Var, int i) throws InvalidPacketException, TransportError {
        bh8Var.debug("Parsing ".concat(getClass().getSimpleName()));
        if (byteBuffer.position() != 0) {
            throw new IllegalStateException();
        }
        if (byteBuffer.remaining() < 10) {
            throw new InvalidPacketException();
        }
        byte b = byteBuffer.get();
        if (((b & 48) >> 4) != y()) {
            throw new RuntimeException();
        }
        if (!new zzg(byteBuffer.getInt()).equals(this.a)) {
            throw new InvalidPacketException("Version does not match version of the connection");
        }
        int i2 = byteBuffer.get();
        if (i2 < 0 || i2 > 20) {
            throw new InvalidPacketException();
        }
        if (byteBuffer.remaining() < i2) {
            throw new InvalidPacketException();
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i3 = byteBuffer.get();
        if (i3 < 0 || i3 > 20) {
            throw new InvalidPacketException();
        }
        if (byteBuffer.remaining() < i3) {
            throw new InvalidPacketException();
        }
        byte[] bArr2 = new byte[i3];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        bh8Var.debug("Destination connection id", this.e);
        bh8Var.debug("Source connection id", this.g);
        z(byteBuffer);
        try {
            int iG = epi.g(byteBuffer);
            bh8Var.debug("Length (PN + payload): " + iG);
            try {
                t(byteBuffer, b, iG, hcVar, j, bh8Var);
            } finally {
                this.d = byteBuffer.position();
            }
        } catch (IllegalArgumentException | IntegerTooLargeException | InvalidIntegerEncodingException unused) {
            throw new TransportError(8);
        }
    }

    public String toString() {
        String str = this.f ? "P" : "";
        char cCharAt = l().name().charAt(0);
        long j = this.b;
        String strValueOf = j >= 0 ? Long.valueOf(j) : ".";
        int i = this.d;
        Object objValueOf = i >= 0 ? Integer.valueOf(i) : ".";
        int size = this.c.size();
        String str2 = (String) this.c.stream().map(new m0(27)).collect(Collectors.joining(" "));
        StringBuilder sb = new StringBuilder("Packet ");
        sb.append(str);
        sb.append(cCharAt);
        sb.append("|");
        sb.append(strValueOf);
        sb.append("|L|");
        sb.append(objValueOf);
        sb.append("|");
        sb.append(size);
        return ho7.l(sb, "  ", str2);
    }

    public abstract int w();

    public abstract void x(ByteBuffer byteBuffer);

    public abstract byte y();

    public abstract void z(ByteBuffer byteBuffer);

    public vj8(zzg zzgVar, byte[] bArr, byte[] bArr2) {
        this.a = zzgVar;
        this.g = bArr;
        this.e = bArr2;
        this.c = new ArrayList();
    }
}
