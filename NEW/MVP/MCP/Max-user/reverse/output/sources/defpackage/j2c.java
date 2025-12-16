package defpackage;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j2c implements se4 {
    public static final j2c a = new j2c();

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // defpackage.se4
    public final void I(wgg wggVar) {
    }

    @Override // defpackage.se4
    public final void close() {
    }

    @Override // defpackage.se4
    public final Uri getUri() {
        return null;
    }

    @Override // defpackage.ke4
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
