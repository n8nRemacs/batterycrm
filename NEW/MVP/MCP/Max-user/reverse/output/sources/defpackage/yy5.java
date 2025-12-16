package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class yy5 extends vfi {
    public final File a;
    public final ua9 b;
    public final long c;
    public final ea7 d;
    public final int e;

    public yy5(File file, ua9 ua9Var, long j, ea7 ea7Var, int i) {
        this.e = i;
        this.a = file;
        this.b = ua9Var;
        this.c = j;
        this.d = ea7Var;
    }

    @Override // defpackage.vfi
    public final long b() {
        return this.a.length() - this.c;
    }

    @Override // defpackage.vfi
    public final ua9 c() {
        return this.b;
    }

    @Override // defpackage.vfi
    public final void i(vv0 vv0Var) {
        long j;
        int i = this.e;
        ea7 ea7Var = this.d;
        Logger logger = yua.a;
        File file = this.a;
        int i2 = 1;
        jbd jbdVar = new jbd(new vx(new FileInputStream(file), i2, new u9g()));
        try {
            long j2 = this.c;
            if (j2 > 0) {
                jbdVar.skip(j2);
            }
            byte[] bArr = new byte[i];
            while (true) {
                int i3 = new ju0(jbdVar, i2).read(bArr, 0, i);
                if (i3 == -1) {
                    jbdVar.close();
                    return;
                }
                vv0Var.E(i3, bArr);
                long j3 = j2 + i3;
                if (!file.exists()) {
                    throw new FileNotFoundException(file.getAbsolutePath());
                }
                long length = file.length();
                if (length == 0) {
                    throw new IOException("FILE_ZERO_LENGTH");
                }
                float f = 100.0f;
                float f2 = (j3 * 100.0f) / length;
                if (f2 <= 100.0f) {
                    f = 0.0f;
                    if (f2 >= 0.0f) {
                        f = f2;
                    }
                }
                if (ea7Var.Z.get()) {
                    j = j3;
                } else {
                    j = j3;
                    ea7Var.X.b(new l97(ea7Var, f, length, 1));
                }
                j2 = j;
                i2 = 1;
            }
        } catch (Throwable th) {
            try {
                jbdVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
