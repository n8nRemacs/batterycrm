package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tech.kwik.core.impl.DecryptionException;
import tech.kwik.core.impl.QuicRuntimeException;

/* loaded from: classes.dex */
public class kc implements hc {
    public static final Charset s = Charset.forName("ISO-8859-1");
    public final int a;
    public final bh8 b;
    public final zzg c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public Cipher k;
    public SecretKeySpec l;
    public SecretKeySpec m;
    public Cipher n;
    public int o;
    public boolean p;
    public volatile kc q;
    public final /* synthetic */ int r;

    public kc(zzg zzgVar, int i, bh8 bh8Var, int i2) {
        this.r = i2;
        this.o = 0;
        this.p = false;
        this.a = i;
        this.b = bh8Var;
        this.c = zzgVar;
    }

    @Override // defpackage.hc
    public final byte[] a(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        switch (this.r) {
            case 0:
                if (this.k == null) {
                    try {
                        this.k = Cipher.getInstance("AES/ECB/NoPadding");
                        this.k.init(1, new SecretKeySpec(this.j, "AES"));
                    } catch (InvalidKeyException unused) {
                        throw new RuntimeException();
                    } catch (NoSuchAlgorithmException e) {
                        e = e;
                        throw new QuicRuntimeException(e);
                    } catch (NoSuchPaddingException e2) {
                        e = e2;
                        throw new QuicRuntimeException(e);
                    }
                }
                try {
                    return this.k.doFinal(bArr);
                } catch (BadPaddingException | IllegalBlockSizeException unused2) {
                    throw new RuntimeException();
                }
            default:
                try {
                    Cipher cipher = Cipher.getInstance("ChaCha20");
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 4, 16);
                    int i = ByteBuffer.wrap(new byte[]{bArr[3], bArr[2], bArr[1], bArr[0]}).getInt();
                    xx.j();
                    cipher.init(1, (Key) new SecretKeySpec(this.j, "ChaCha20"), (AlgorithmParameterSpec) xx.i(i, bArrCopyOfRange));
                    return cipher.doFinal(new byte[]{0, 0, 0, 0, 0});
                } catch (InvalidAlgorithmParameterException unused3) {
                    throw new RuntimeException();
                } catch (InvalidKeyException unused4) {
                    throw new RuntimeException();
                } catch (NoSuchAlgorithmException e3) {
                    e = e3;
                    throw new QuicRuntimeException(e);
                } catch (BadPaddingException unused5) {
                    throw new RuntimeException();
                } catch (IllegalBlockSizeException unused6) {
                    throw new RuntimeException();
                } catch (NoSuchPaddingException e4) {
                    e = e4;
                    throw new QuicRuntimeException(e);
                }
        }
    }

    @Override // defpackage.hc
    public final byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws InvalidKeyException, DecryptionException, InvalidAlgorithmParameterException {
        switch (this.r) {
            case 0:
                if (bArr2.length <= 16) {
                    throw new DecryptionException("ciphertext must be longer than 16 bytes");
                }
                SecretKeySpec secretKeySpecL = l();
                Cipher cipherK = k();
                try {
                    cipherK.init(2, secretKeySpecL, new GCMParameterSpec(128, bArr3));
                    cipherK.updateAAD(bArr);
                    return cipherK.doFinal(bArr2);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
                    throw new RuntimeException();
                } catch (AEADBadTagException unused2) {
                    throw new DecryptionException();
                }
            default:
                try {
                    Cipher cipherK2 = k();
                    cipherK2.init(2, l(), new IvParameterSpec(bArr3));
                    cipherK2.updateAAD(bArr);
                    return cipherK2.doFinal(bArr2);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused3) {
                    throw new RuntimeException();
                } catch (AEADBadTagException unused4) {
                    throw new DecryptionException();
                }
        }
    }

    @Override // defpackage.hc
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        switch (this.r) {
            case 0:
                Cipher cipherK = k();
                try {
                    cipherK.init(1, l(), new GCMParameterSpec(128, bArr3));
                    cipherK.updateAAD(bArr);
                    return cipherK.doFinal(bArr2);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
                    throw new RuntimeException();
                }
            default:
                try {
                    Cipher cipherK2 = k();
                    cipherK2.init(1, l(), new IvParameterSpec(bArr3));
                    cipherK2.updateAAD(bArr);
                    return cipherK2.doFinal(bArr2);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused2) {
                    throw new RuntimeException();
                }
        }
    }

    public final synchronized void d(boolean z) {
        try {
            this.e = m(this.d, (this.c.b() ? "quicv2 " : "quic ").concat("ku"), i());
            this.b.secret("Updated ApplicationTrafficSecret (" + (z ? "self" : "peer") + "): ", this.e);
            f(this.e, false, z);
            if (z) {
                this.d = this.e;
                this.o++;
                this.e = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(byte[] bArr) {
        this.d = bArr;
        f(bArr, true, true);
    }

    public final void f(byte[] bArr, boolean z, boolean z2) {
        String str = this.c.b() ? "quicv2 " : "quic ";
        byte[] bArrM = m(bArr, str.concat("key"), j());
        if (z2) {
            this.f = bArrM;
            this.l = null;
        } else {
            this.g = bArrM;
            this.m = null;
        }
        int i = this.a;
        String strConcat = utb.q(i).concat(" key");
        bh8 bh8Var = this.b;
        bh8Var.secret(strConcat, bArrM);
        byte[] bArrM2 = m(bArr, str.concat("iv"), (short) 12);
        if (z2) {
            this.h = bArrM2;
        } else {
            this.i = bArrM2;
        }
        bh8Var.secret(utb.q(i).concat(" iv"), bArrM2);
        if (z) {
            this.j = m(bArr, str.concat("hp"), j());
            bh8Var.secret(utb.q(i).concat(" hp"), this.j);
        }
    }

    public final synchronized void g() {
        if (this.p) {
            this.b.info("Installing updated keys (initiated by peer)");
            this.d = this.e;
            this.f = this.g;
            this.l = null;
            this.h = this.i;
            this.o++;
            this.e = null;
            this.p = false;
            this.g = null;
            this.i = null;
            if (this.q.o < this.o) {
                this.b.debug("Keys out of sync; updating keys for peer");
                this.q.d(true);
            }
        }
    }

    public r5j h() {
        switch (this.r) {
        }
        return r5j.y();
    }

    public short i() {
        switch (this.r) {
        }
        return (short) 32;
    }

    public short j() {
        switch (this.r) {
            case 0:
                return (short) 16;
            default:
                return (short) 32;
        }
    }

    public final Cipher k() {
        switch (this.r) {
            case 0:
                if (this.n == null) {
                    try {
                        this.n = Cipher.getInstance("AES/GCM/NoPadding");
                    } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                        throw new QuicRuntimeException(e);
                    }
                }
                return this.n;
            default:
                if (this.n == null) {
                    try {
                        this.n = Cipher.getInstance("ChaCha20-Poly1305");
                    } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                        throw new QuicRuntimeException(e2);
                    }
                }
                return this.n;
        }
    }

    public final SecretKeySpec l() {
        switch (this.r) {
            case 0:
                if (!this.p) {
                    if (this.l == null) {
                        this.l = new SecretKeySpec(this.f, "AES");
                    }
                    break;
                } else {
                    if (this.m == null) {
                        this.m = new SecretKeySpec(this.g, "AES");
                    }
                    break;
                }
            default:
                if (!this.p) {
                    if (this.l == null) {
                        this.l = new SecretKeySpec(this.f, "ChaCha20-Poly1305");
                    }
                    break;
                } else {
                    if (this.m == null) {
                        this.m = new SecretKeySpec(this.g, "ChaCha20-Poly1305");
                    }
                    break;
                }
        }
        return this.l;
    }

    public final byte[] m(byte[] bArr, String str, short s2) {
        Charset charset = s;
        byte[] bytes = "tls13 ".getBytes(charset);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 3 + str.getBytes(charset).length + 1 + "".getBytes(charset).length);
        byteBufferAllocate.putShort(s2);
        byteBufferAllocate.put((byte) (bytes.length + str.getBytes().length));
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.put(str.getBytes(charset));
        byteBufferAllocate.put((byte) "".getBytes(charset).length);
        byteBufferAllocate.put("".getBytes(charset));
        return h().v(bArr, byteBufferAllocate.array(), s2);
    }

    public kc(zzg zzgVar, byte[] bArr, int i, bh8 bh8Var) {
        this.r = 0;
        this.o = 0;
        this.p = false;
        this.a = i;
        this.b = bh8Var;
        this.c = zzgVar;
        byte[] bArrM = m(bArr, i == 1 ? "client in" : "server in", i());
        bh8Var.secret(utb.q(i).concat(" initial secret"), bArrM);
        f(bArrM, true, true);
    }
}
