package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class ehd extends InputStream {
    public final ve4 a;
    public final ByteArrayOutputStream b = new ByteArrayOutputStream();

    public ehd(ve4 ve4Var) {
        this.a = ve4Var;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.a.read();
        if (i != -1) {
            this.b.write(i);
        }
        return i;
    }
}
