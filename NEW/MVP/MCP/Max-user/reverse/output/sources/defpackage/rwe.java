package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import tech.kwik.core.impl.DecryptionException;
import tech.kwik.core.impl.InvalidPacketException;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes3.dex */
public final class rwe extends btc {
    public short g;

    @Override // defpackage.btc
    public final int a(ysc yscVar, bj bjVar) {
        boolean zAnyMatch;
        rr3 rr3Var = yscVar.Q0;
        byte[] bArr = this.e;
        final z6f z6fVar = rr3Var.e;
        if (Arrays.equals(z6fVar.b, bArr)) {
            zAnyMatch = false;
        } else {
            final int i = 0;
            z6fVar.a.values().stream().filter(new Predicate() { // from class: y6f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    switch (i) {
                        case 0:
                            z6f z6fVar2 = z6fVar;
                            z6fVar2.getClass();
                            return Arrays.equals(((or3) obj).b, z6fVar2.b);
                        case 1:
                            z6f z6fVar3 = z6fVar;
                            z6fVar3.getClass();
                            return Arrays.equals(((or3) obj).b, z6fVar3.b);
                        default:
                            z6f z6fVar4 = z6fVar;
                            z6fVar4.getClass();
                            return Arrays.equals(((or3) obj).b, z6fVar4.b);
                    }
                }
            }).forEach(new sb3(12));
            z6fVar.b = bArr;
            final int i2 = 1;
            zAnyMatch = z6fVar.a.values().stream().filter(new Predicate() { // from class: y6f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    switch (i2) {
                        case 0:
                            z6f z6fVar2 = z6fVar;
                            z6fVar2.getClass();
                            return Arrays.equals(((or3) obj).b, z6fVar2.b);
                        case 1:
                            z6f z6fVar3 = z6fVar;
                            z6fVar3.getClass();
                            return Arrays.equals(((or3) obj).b, z6fVar3.b);
                        default:
                            z6f z6fVar4 = z6fVar;
                            z6fVar4.getClass();
                            return Arrays.equals(((or3) obj).b, z6fVar4.b);
                    }
                }
            }).anyMatch(new nie(4));
            final int i3 = 2;
            z6fVar.a.values().stream().filter(new Predicate() { // from class: y6f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    switch (i3) {
                        case 0:
                            z6f z6fVar2 = z6fVar;
                            z6fVar2.getClass();
                            return Arrays.equals(((or3) obj).b, z6fVar2.b);
                        case 1:
                            z6f z6fVar3 = z6fVar;
                            z6fVar3.getClass();
                            return Arrays.equals(((or3) obj).b, z6fVar3.b);
                        default:
                            z6f z6fVar4 = z6fVar;
                            z6fVar4.getClass();
                            return Arrays.equals(((or3) obj).b, z6fVar4.b);
                    }
                }
            }).forEach(new sb3(13));
            z6fVar.c.info("Peer has switched to connection id " + uwi.a(z6fVar.b));
        }
        if (zAnyMatch && rr3Var.e.b().size() < rr3Var.i) {
            rr3Var.a();
        }
        yscVar.i(this, bjVar);
        return 1;
    }

    @Override // defpackage.btc
    public final void d(byte b) throws TransportError {
        if ((b & 24) != 0) {
            throw new TransportError(11, "Reserved bits in short header packet are not zero");
        }
    }

    @Override // defpackage.btc
    public final int h(int i) {
        int iE = btc.e(this.b);
        int iSum = this.c.stream().mapToInt(new n0(17)).sum() + i;
        int iMax = Integer.max(0, (4 - iE) - iSum);
        int length = this.e.length + 1;
        if (this.b < 0) {
            iE = 4;
        }
        return length + iE + iSum + iMax + 16;
    }

    @Override // defpackage.btc
    public final byte[] i(hc hcVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1500);
        short s = (short) (((kc) hcVar).o % 2);
        this.g = s;
        byteBufferAllocate.put(btc.g(this.b, (byte) ((s << 2) | 64)));
        byteBufferAllocate.put(this.e);
        byte[] bArrF = btc.f(this.b);
        byteBufferAllocate.put(bArrF);
        u(byteBufferAllocate, bArrF.length, j(bArrF.length), hcVar);
        int iLimit = byteBufferAllocate.limit();
        this.d = iLimit;
        byte[] bArr = new byte[iLimit];
        byteBufferAllocate.get(bArr);
        this.d = iLimit;
        return bArr;
    }

    @Override // defpackage.btc
    public final byte[] k() {
        return this.e;
    }

    @Override // defpackage.btc
    public final hf5 l() {
        return hf5.d;
    }

    @Override // defpackage.btc
    public final m5c n() {
        return m5c.c;
    }

    @Override // defpackage.btc
    public final void s(ByteBuffer byteBuffer, hc hcVar, long j, bh8 bh8Var, int i) throws Throwable {
        rwe rweVar;
        ByteBuffer byteBuffer2;
        hc hcVar2;
        bh8Var.debug("Parsing ".concat(rwe.class.getSimpleName()));
        if (byteBuffer.remaining() < i + 1) {
            throw new InvalidPacketException();
        }
        if (byteBuffer.position() != 0) {
            throw new IllegalStateException();
        }
        byte b = byteBuffer.get();
        if ((b & 192) != 64) {
            throw new RuntimeException();
        }
        byte[] bArr = new byte[i];
        this.e = bArr;
        byteBuffer.get(bArr);
        bh8Var.debug("Destination connection id", bArr);
        try {
            rweVar = this;
            byteBuffer2 = byteBuffer;
            hcVar2 = hcVar;
            try {
                try {
                    rweVar.t(byteBuffer2, b, byteBuffer.limit() - byteBuffer.position(), hcVar2, j, bh8Var);
                    ((kc) hcVar2).g();
                    rweVar.d = byteBuffer2.position();
                } catch (DecryptionException e) {
                    e = e;
                    DecryptionException decryptionException = e;
                    kc kcVar = (kc) hcVar2;
                    synchronized (kcVar) {
                        if (kcVar.p) {
                            kcVar.b.info("Discarding updated keys (initiated by peer)");
                            kcVar.e = null;
                            kcVar.p = false;
                            kcVar.g = null;
                            kcVar.i = null;
                        }
                    }
                    throw decryptionException;
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                rweVar.d = byteBuffer2.position();
                throw th2;
            }
        } catch (DecryptionException e2) {
            e = e2;
            rweVar = this;
            byteBuffer2 = byteBuffer;
            hcVar2 = hcVar;
        } catch (Throwable th3) {
            th = th3;
            rweVar = this;
            byteBuffer2 = byteBuffer;
            Throwable th22 = th;
            rweVar.d = byteBuffer2.position();
            throw th22;
        }
    }

    public final String toString() {
        String str = this.f ? "P" : "";
        char cCharAt = "App".charAt(0);
        long j = this.b;
        String strValueOf = j >= 0 ? Long.valueOf(j) : ".";
        short s = this.g;
        String strA = uwi.a(this.e);
        int i = this.d;
        int size = this.c.size();
        String str2 = (String) this.c.stream().map(new xga(12)).collect(Collectors.joining(" "));
        StringBuilder sb = new StringBuilder("Packet ");
        sb.append(str);
        sb.append(cCharAt);
        sb.append("|");
        sb.append(strValueOf);
        sb.append("|S");
        sb.append((int) s);
        sb.append("|");
        sb.append(strA);
        sb.append("|");
        sb.append(i);
        sb.append("|");
        sb.append(size);
        return ho7.l(sb, "  ", str2);
    }

    @Override // defpackage.btc
    public final void v(byte b) {
        this.g = (short) ((b & 4) >> 2);
    }
}
