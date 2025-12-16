package defpackage;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tech.kwik.core.impl.InvalidPacketException;
import tech.kwik.core.impl.NotYetImplementedException;
import tech.kwik.core.impl.QuicRuntimeException;

/* loaded from: classes3.dex */
public final class upd extends btc {
    public static final byte[] k = {-52, -50, 24, 126, -48, -102, 9, -48, 87, 40, 21, 90, 108, -71, 107, -31};
    public static final byte[] l = {-66, 12, 105, 11, -97, 102, 87, 90, 29, 118, 107, 84, -29, 104, -56, 78};
    public static final byte[] m = {-113, -76, -80, 27, 86, -84, 72, -30, 96, -5, -53, -50, -83, 124, -52, -110};
    public static final byte[] n = {-27, 73, 48, -7, 127, 33, 54, -16, 83, 10, -116, 28};
    public static final byte[] o = {70, 21, -103, -45, 93, 99, 43, -14, 35, -104, 37, -69};
    public static final byte[] p = {-40, 105, 105, -68, 45, 124, 109, -103, -112, -17, -80, 74};
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    @Override // defpackage.btc
    public final int a(ysc yscVar, bj bjVar) {
        if (!Arrays.equals(w(yscVar.Q0.h), this.j)) {
            yscVar.c.error("Discarding Retry packet, because integrity tag is invalid.");
        } else if (yscVar.f1) {
            yscVar.c.error("Ignoring RetryPacket, because already processed one.");
        } else {
            yscVar.f1 = true;
            yscVar.U0 = this.h;
            rde rdeVar = yscVar.L0;
            byte[] bArr = yscVar.U0;
            if (bArr != null) {
                ((pl7) ((olb[]) rdeVar.k.b)[0]).i = bArr;
            } else {
                rdeVar.getClass();
            }
            hf5 hf5Var = hf5.a;
            db4 db4VarE = yscVar.e(hf5Var);
            db4VarE.m = 0;
            db4VarE.n = 0;
            db4VarE.k.clear();
            byte[] bArr2 = this.g;
            lu4 lu4Var = yscVar.Q0.f;
            lu4Var.a.put(0, new or3(0, bArr2, 2));
            lu4Var.b = bArr2;
            yscVar.Q0.j = bArr2;
            yscVar.c.debug("Changing destination connection id into: " + uwi.a(bArr2));
            fs3 fs3Var = yscVar.o;
            lu4 lu4Var2 = yscVar.Q0.f;
            fs3Var.b(lu4Var2 != null ? lu4Var2.b : new byte[0]);
            yscVar.N0.h = bArr2;
            lhd lhdVar = yscVar.L0.m;
            if (!lhdVar.p) {
                lk8 lk8Var = lhdVar.e[0];
                synchronized (lk8Var) {
                    lk8Var.d.b((List) lk8Var.g.values().stream().filter(new gb3(23)).filter(new kk8(0)).collect(Collectors.toList()));
                    lk8Var.g.clear();
                    lk8Var.h.set(0);
                    lk8Var.j = null;
                    lk8Var.k = null;
                    lk8Var.i = -1L;
                }
                synchronized (lhdVar.l) {
                    lhdVar.k.cancel(false);
                    lhdVar.n = null;
                    lhdVar.k = new khd();
                }
            }
            yscVar.e(hf5Var).c(yscVar.e1);
        }
        return 1;
    }

    @Override // defpackage.btc
    public final int h(int i) {
        throw new NotYetImplementedException();
    }

    @Override // defpackage.btc
    public final byte[] i(hc hcVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        int length = this.e.length + 7 + this.g.length + this.h.length + 16;
        this.d = length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.put((byte) ((((byte) (this.a.b() ? 0 : 3)) << 4) | 192));
        byteBufferAllocate.put(this.a.a());
        byteBufferAllocate.put((byte) this.e.length);
        byteBufferAllocate.put(this.e);
        byteBufferAllocate.put((byte) this.g.length);
        byteBufferAllocate.put(this.g);
        byteBufferAllocate.put(this.h);
        this.i = byteBufferAllocate.array();
        w(null);
        throw null;
    }

    @Override // defpackage.btc
    public final hf5 l() {
        return hf5.a;
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
    public final boolean p() {
        return false;
    }

    @Override // defpackage.btc
    public final boolean q() {
        return false;
    }

    @Override // defpackage.btc
    public final boolean r() {
        return false;
    }

    @Override // defpackage.btc
    public final void s(ByteBuffer byteBuffer, hc hcVar, long j, bh8 bh8Var, int i) throws InvalidPacketException {
        bh8Var.debug("Parsing ".concat(upd.class.getSimpleName()));
        if (byteBuffer.remaining() < 23) {
            throw new InvalidPacketException();
        }
        int iRemaining = byteBuffer.remaining();
        this.d = iRemaining;
        this.i = new byte[iRemaining];
        byteBuffer.get(this.i);
        byteBuffer.get();
        if (!new zzg(byteBuffer.getInt()).equals(this.a)) {
            throw new InvalidPacketException();
        }
        int i2 = byteBuffer.get();
        if (byteBuffer.remaining() < i2 + 17) {
            throw new InvalidPacketException();
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i3 = byteBuffer.get();
        if (byteBuffer.remaining() < i3) {
            throw new InvalidPacketException();
        }
        byte[] bArr2 = new byte[i3];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        bh8Var.debug("Destination connection id", this.e);
        bh8Var.debug("Source connection id", this.g);
        if (byteBuffer.remaining() < 16) {
            throw new InvalidPacketException();
        }
        byte[] bArr3 = new byte[byteBuffer.remaining() - 16];
        this.h = bArr3;
        byteBuffer.get(bArr3);
        byte[] bArr4 = new byte[16];
        this.j = bArr4;
        byteBuffer.get(bArr4);
    }

    public final String toString() {
        char cCharAt = "Initial".charAt(0);
        int i = this.d;
        byte[] bArr = this.h;
        return "Packet " + cCharAt + "|-|R|" + i + "| Retry Token (" + bArr.length + "): " + uwi.a(bArr);
    }

    public final byte[] w(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 7 + this.e.length + 1 + this.g.length + this.h.length);
        byteBufferAllocate.put((byte) bArr.length);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.put(this.i, 0, r8.length - 16);
        try {
            zzg zzgVar = this.a;
            SecretKeySpec secretKeySpec = new SecretKeySpec(zzgVar.a == 1 ? l : zzgVar.b() ? m : k, "AES");
            zzg zzgVar2 = this.a;
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, zzgVar2.a == 1 ? o : zzgVar2.b() ? p : n);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, gCMParameterSpec);
            cipher.updateAAD(byteBufferAllocate.array());
            return cipher.doFinal(new byte[0]);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
            throw new RuntimeException();
        } catch (NoSuchAlgorithmException e) {
            e = e;
            throw new QuicRuntimeException(e);
        } catch (NoSuchPaddingException e2) {
            e = e2;
            throw new QuicRuntimeException(e);
        }
    }
}
