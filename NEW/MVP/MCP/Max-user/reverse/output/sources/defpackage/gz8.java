package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class gz8 implements se4 {
    public final dl4 a;
    public final long b;
    public nm4 c;

    public gz8(Context context, Uri uri) {
        this.a = new dl4(context, new jn4(null, 8000, 8000, new h79(21)));
        this.b = H(new ze4(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0));
    }

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) {
        long jH = this.a.H(ze4Var);
        this.c = new nm4(this, ze4Var.f, jH != -1 ? ze4Var.f + jH : jH);
        return jH;
    }

    @Override // defpackage.se4
    public final void I(wgg wggVar) {
        this.a.I(wggVar);
    }

    @Override // defpackage.se4
    public final void close() {
        this.c = null;
        try {
            this.a.close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.se4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.ke4
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
