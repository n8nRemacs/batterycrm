package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zdf implements se4 {
    public final se4 a;
    public long b;
    public Uri c;

    public zdf(se4 se4Var) {
        se4Var.getClass();
        this.a = se4Var;
        this.c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) {
        se4 se4Var = this.a;
        this.c = ze4Var.a;
        Map map = Collections.EMPTY_MAP;
        try {
            return se4Var.H(ze4Var);
        } finally {
            Uri uri = se4Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            se4Var.x();
        }
    }

    @Override // defpackage.se4
    public final void I(wgg wggVar) {
        wggVar.getClass();
        this.a.I(wggVar);
    }

    @Override // defpackage.se4
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.se4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.ke4
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += i3;
        }
        return i3;
    }

    @Override // defpackage.se4
    public final Map x() {
        return this.a.x();
    }
}
