package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class ydf implements qe4 {
    public final qe4 a;
    public long b;
    public Uri c;
    public Map d;

    public ydf(qe4 qe4Var) {
        qe4Var.getClass();
        this.a = qe4Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) {
        this.c = ye4Var.a;
        this.d = Collections.EMPTY_MAP;
        qe4 qe4Var = this.a;
        long jR = qe4Var.R(ye4Var);
        Uri uri = qe4Var.getUri();
        uri.getClass();
        this.c = uri;
        this.d = qe4Var.x();
        return jR;
    }

    @Override // defpackage.qe4
    public final void S(vgg vggVar) {
        vggVar.getClass();
        this.a.S(vggVar);
    }

    @Override // defpackage.qe4
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += i3;
        }
        return i3;
    }

    @Override // defpackage.qe4
    public final Map x() {
        return this.a.x();
    }
}
