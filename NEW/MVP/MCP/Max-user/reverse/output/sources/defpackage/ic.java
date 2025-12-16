package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class ic implements qe4 {
    public final qe4 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public ic(qe4 qe4Var, byte[] bArr, byte[] bArr2) {
        this.a = qe4Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                ve4 ve4Var = new ve4(this.a, ye4Var);
                this.d = new CipherInputStream(ve4Var, cipher);
                ve4Var.l();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.qe4
    public final void S(vgg vggVar) {
        vggVar.getClass();
        this.a.S(vggVar);
    }

    @Override // defpackage.qe4
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // defpackage.qe4
    public final Map x() {
        return this.a.x();
    }
}
