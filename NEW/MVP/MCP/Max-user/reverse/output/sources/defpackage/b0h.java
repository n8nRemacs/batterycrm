package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import tech.kwik.core.impl.ImplementationError;
import tech.kwik.core.impl.InvalidPacketException;
import tech.kwik.core.impl.NotYetImplementedException;
import tech.kwik.core.impl.VersionNegotiationFailure;

/* loaded from: classes3.dex */
public final class b0h extends btc {
    public static final Random j = new Random();
    public byte[] g;
    public int h;
    public ArrayList i;

    @Override // defpackage.btc
    public final int a(ysc yscVar, bj bjVar) {
        if (yscVar.Z0 || this.i.contains((zzg) yscVar.a.b)) {
            yscVar.c.debug("Ignoring Version Negotiation packet");
            return 1;
        }
        yscVar.c.info("Server doesn't support " + yscVar.a + ", but only: " + ((String) this.i.stream().map(new xga(2)).collect(Collectors.joining(", "))));
        throw new VersionNegotiationFailure();
    }

    @Override // defpackage.btc
    public final boolean c() {
        return false;
    }

    @Override // defpackage.btc
    public final int h(int i) {
        throw new NotYetImplementedException();
    }

    @Override // defpackage.btc
    public final byte[] i(hc hcVar) {
        int length = this.e.length + 7 + this.g.length;
        ArrayList arrayList = this.i;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((arrayList.size() * 4) + length);
        byteBufferAllocate.put((byte) (((byte) j.nextInt(256)) | 192));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put((byte) this.e.length);
        byteBufferAllocate.put(this.e);
        byteBufferAllocate.put((byte) this.g.length);
        byteBufferAllocate.put(this.g);
        arrayList.forEach(new as(8, byteBufferAllocate));
        return byteBufferAllocate.array();
    }

    @Override // defpackage.btc
    public final hf5 l() {
        return null;
    }

    @Override // defpackage.btc
    public final Long m() {
        return null;
    }

    @Override // defpackage.btc
    public final m5c n() {
        return null;
    }

    @Override // defpackage.btc
    public final void s(ByteBuffer byteBuffer, hc hcVar, long j2, bh8 bh8Var, int i) throws InvalidPacketException {
        bh8Var.debug("Parsing VersionNegotationPacket");
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (iLimit < 11) {
            throw new InvalidPacketException();
        }
        byteBuffer.get();
        if (byteBuffer.getInt() != 0) {
            throw new ImplementationError();
        }
        int i2 = byteBuffer.get() & 255;
        int i3 = 11 + i2;
        if (iLimit < i3) {
            throw new InvalidPacketException();
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i4 = byteBuffer.get() & 255;
        if (iLimit < i3 + i4) {
            throw new InvalidPacketException();
        }
        byte[] bArr2 = new byte[i4];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        bh8Var.debug("Destination connection id", this.e);
        bh8Var.debug("Source connection id", this.g);
        while (byteBuffer.remaining() >= 4) {
            zzg zzgVar = new zzg(byteBuffer.getInt());
            this.i.add(zzgVar);
            bh8Var.debug("Server supports version " + zzgVar);
        }
        this.h = byteBuffer.limit();
    }

    public final String toString() {
        int i = this.h;
        return "Packet V|-|V|" + (i >= 0 ? Integer.valueOf(i) : ".") + "|0  " + ((String) this.i.stream().map(new xga(20)).collect(Collectors.joining(", ")));
    }
}
