package defpackage;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class zl5 implements w3h, y22, t4c {
    public w3h a;
    public y22 b;
    public w3h c;
    public y22 d;

    @Override // defpackage.t4c
    public final void a(int i, Object obj) {
        if (i == 7) {
            this.a = (w3h) obj;
            return;
        }
        if (i == 8) {
            this.b = (y22) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        y7f y7fVar = (y7f) obj;
        if (y7fVar == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = y7fVar.getVideoFrameMetadataListener();
            this.d = y7fVar.getCameraMotionListener();
        }
    }

    @Override // defpackage.y22
    public final void b(long j, float[] fArr) {
        y22 y22Var = this.d;
        if (y22Var != null) {
            y22Var.b(j, fArr);
        }
        y22 y22Var2 = this.b;
        if (y22Var2 != null) {
            y22Var2.b(j, fArr);
        }
    }

    @Override // defpackage.y22
    public final void c() {
        y22 y22Var = this.d;
        if (y22Var != null) {
            y22Var.c();
        }
        y22 y22Var2 = this.b;
        if (y22Var2 != null) {
            y22Var2.c();
        }
    }

    @Override // defpackage.w3h
    public final void d(long j, long j2, gf6 gf6Var, MediaFormat mediaFormat) {
        long j3;
        long j4;
        gf6 gf6Var2;
        MediaFormat mediaFormat2;
        w3h w3hVar = this.c;
        if (w3hVar != null) {
            w3hVar.d(j, j2, gf6Var, mediaFormat);
            mediaFormat2 = mediaFormat;
            gf6Var2 = gf6Var;
            j4 = j2;
            j3 = j;
        } else {
            j3 = j;
            j4 = j2;
            gf6Var2 = gf6Var;
            mediaFormat2 = mediaFormat;
        }
        w3h w3hVar2 = this.a;
        if (w3hVar2 != null) {
            w3hVar2.d(j3, j4, gf6Var2, mediaFormat2);
        }
    }
}
