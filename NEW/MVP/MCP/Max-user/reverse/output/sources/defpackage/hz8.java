package defpackage;

import android.net.Uri;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class hz8 implements gp5, Closeable {
    public final gp5 a;
    public final gz8 b;
    public final Uri c;
    public final long d;

    public hz8(gp5 gp5Var, gz8 gz8Var) {
        this.a = gp5Var;
        this.b = gz8Var;
        Uri uri = gz8Var.a.getUri();
        if (uri == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.c = uri;
        this.d = gz8Var.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        release();
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        this.a.d(j, j2);
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        return this.a.i(ip5Var);
    }

    @Override // defpackage.gp5
    public final void release() {
        this.a.release();
        this.b.close();
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.a.w(kp5Var);
    }

    @Override // defpackage.gp5
    public final int y(ip5 ip5Var, n7 n7Var) {
        return this.a.y(ip5Var, n7Var);
    }
}
