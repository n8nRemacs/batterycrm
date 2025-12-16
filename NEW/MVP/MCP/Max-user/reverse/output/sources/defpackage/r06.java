package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class r06 implements se4 {
    public final se4 a;
    public final zkb b;
    public final String c = r06.class.getName();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public r06(dl4 dl4Var, zkb zkbVar) {
        this.a = dl4Var;
        this.b = zkbVar;
    }

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) {
        return this.a.H(ze4Var);
    }

    @Override // defpackage.se4
    public final void I(wgg wggVar) {
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
        if (i3 > 0 && this.d.compareAndSet(false, true)) {
            String str = this.c;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "DataSource. First bytes received, total bytes read: " + i3 + ", from URI: " + this.a.getUri(), null);
                }
            }
            zkb zkbVar = this.b;
            if (zkbVar != null) {
                ((dbh) zkbVar.b).Z.e();
            }
        }
        return i3;
    }
}
