package defpackage;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class am5 implements x3h, u4c {
    public x3h a;
    public am5 b;

    @Override // defpackage.u4c
    public final void a(int i, Object obj) {
        if (i == 7) {
            this.a = (x3h) obj;
        } else if (i == 8) {
            this.b = (am5) obj;
        } else if (i == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    @Override // defpackage.x3h
    public final void b(long j, long j2, hf6 hf6Var, MediaFormat mediaFormat) {
        x3h x3hVar = this.a;
        if (x3hVar != null) {
            x3hVar.b(j, j2, hf6Var, mediaFormat);
        }
    }

    public final void c() {
        am5 am5Var = this.b;
        if (am5Var != null) {
            am5Var.c();
        }
    }

    public final void d() {
        am5 am5Var = this.b;
        if (am5Var != null) {
            am5Var.d();
        }
    }
}
