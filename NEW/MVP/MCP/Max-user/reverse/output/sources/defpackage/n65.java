package defpackage;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class n65 implements qe4 {
    public static final n65 a = new n65();

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) throws IOException {
        throw new IOException("DummyDataSource cannot be opened");
    }

    @Override // defpackage.qe4
    public final void S(vgg vggVar) {
    }

    @Override // defpackage.qe4
    public final void close() {
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return null;
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
