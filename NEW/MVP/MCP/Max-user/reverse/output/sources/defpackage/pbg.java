package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

/* loaded from: classes.dex */
public final class pbg implements tn0 {
    public static final Charset u = Charset.forName("ISO-8859-1");
    public static final String v = "tls13 ";
    public final MessageDigest a;
    public final r5j b;
    public final byte[] c;
    public final short d;
    public final short e;
    public boolean f;
    public PublicKey g;
    public PrivateKey h;
    public final byte[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public byte[] p;
    public byte[] q;
    public final jdc r;
    public byte[] s;
    public byte[] t;

    /* JADX WARN: Multi-variable type inference failed */
    public pbg(jdc jdcVar, byte[] bArr, int i, int i2) throws NoSuchAlgorithmException, InvalidKeyException {
        this.i = bArr;
        this.r = jdcVar;
        this.d = (short) i;
        int i3 = (short) i2;
        this.e = i3;
        int i4 = i3 * 8;
        String strF = ho7.f(i4, "SHA-");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(strF);
            this.a = messageDigest;
            this.b = new r5j(21, new d47(ho7.f(i4, "HmacSHA"), 0));
            byte[] bArrDigest = messageDigest.digest(new byte[0]);
            this.c = bArrDigest;
            xrf.u("Empty hash: ", yx0.a(bArrDigest));
            a(bArr == null ? new byte[i3] : bArr);
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException(ho7.i("Missing ", strF, " support"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(byte[] bArr) throws InvalidKeyException {
        int i = this.e;
        byte[] bArrW = this.b.w(new byte[i], bArr);
        this.j = bArrW;
        xrf.u("Early secret: ", yx0.a(bArrW));
        byte[] bArrB = b(this.j, "res binder", this.c, i);
        this.k = bArrB;
        xrf.u("Binder key: ", yx0.a(bArrB));
    }

    public final byte[] b(byte[] bArr, String str, byte[] bArr2, short s) {
        String str2 = v;
        int length = str2.length() + 3;
        Charset charset = u;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + str.getBytes(charset).length + 1 + bArr2.length);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) (str2.length() + str.getBytes().length));
        byteBufferAllocate.put(str2.getBytes(charset));
        byteBufferAllocate.put(str.getBytes(charset));
        byteBufferAllocate.put((byte) bArr2.length);
        byteBufferAllocate.put(bArr2);
        return this.b.v(bArr, byteBufferAllocate.array(), s);
    }
}
