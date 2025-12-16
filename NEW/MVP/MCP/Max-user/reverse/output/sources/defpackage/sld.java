package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class sld {
    public final iv6 a;
    public final fde b;
    public final l3b c;
    public final a7c d;
    public boolean e;
    public int f;
    public final lk6 g;
    public final m2c h;
    public final rld i;
    public Size j;
    public kw6 k;
    public boolean l;

    public sld(iv6 iv6Var, fde fdeVar, Looper looper, yw ywVar, l3b l3bVar, a7c a7cVar) {
        this.a = iv6Var;
        this.b = fdeVar;
        this.c = l3bVar;
        this.d = a7cVar;
        qld qldVar = new qld(this, 1);
        lk6 lk6Var = new lk6((char) 0, 11);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        jca.a("glGenTextures", new int[0]);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        jca.a("glBindTexture", new int[0]);
        GLES20.glTexParameteri(36197, 10240, 9729);
        jca.a("glTexParameteri", new int[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        jca.a("glTexParameteri", new int[0]);
        GLES20.glTexParameteri(36197, 10242, 33071);
        jca.a("glTexParameteri", new int[0]);
        GLES20.glTexParameteri(36197, 10243, 33071);
        jca.a("glTexParameteri", new int[0]);
        GLES20.glBindTexture(36197, 0);
        jca.a("glBindTexture", new int[0]);
        lk6Var.b = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(lk6Var.b);
        surfaceTexture.setOnFrameAvailableListener(new bo6(0, qldVar));
        lk6Var.c = surfaceTexture;
        Surface surface = new Surface((SurfaceTexture) lk6Var.c);
        ywVar.invoke(surface);
        lk6Var.d = surface;
        this.g = lk6Var;
        this.h = new m2c();
        this.i = new rld(this, looper);
    }

    public final void a() {
        this.h.getClass();
        lk6 lk6Var = this.g;
        Surface surface = (Surface) lk6Var.d;
        if (surface != null) {
            surface.release();
        }
        lk6Var.d = null;
        SurfaceTexture surfaceTexture = (SurfaceTexture) lk6Var.c;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = (SurfaceTexture) lk6Var.c;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        lk6Var.c = null;
        GLES20.glDeleteTextures(1, new int[]{lk6Var.b}, 0);
        jca.a("glDeleteTextures", new int[0]);
        lk6Var.b = -1;
        kw6 kw6Var = this.k;
        if (kw6Var != null) {
            kw6Var.h();
        }
    }

    public final void b() {
        kw6 kw6Var;
        Surface surface;
        kw6 kw6Var2;
        Surface surface2;
        rld rldVar = this.i;
        rldVar.removeMessages(rldVar.a);
        Size size = this.j;
        if (size != null) {
            if (!this.e || size.getWidth() <= 0 || size.getHeight() <= 0) {
                size = null;
            }
            if (size != null) {
                kw6 kw6Var3 = this.k;
                if ((kw6Var3 == null || (surface2 = (Surface) kw6Var3.a) == null || surface2.isValid()) && (kw6Var2 = this.k) != null) {
                    kw6Var2.d(new uv1(this, size, kw6Var2, 9));
                    return;
                }
                return;
            }
        }
        kw6 kw6Var4 = this.k;
        if ((kw6Var4 == null || (surface = (Surface) kw6Var4.a) == null || surface.isValid()) && (kw6Var = this.k) != null) {
            kw6Var.d(new iqb(19, kw6Var));
        }
    }

    public final void c(Surface surface) {
        kw6 kw6Var = this.k;
        if (!fni.a(kw6Var != null ? (Surface) kw6Var.a : null, surface)) {
            this.l = false;
        }
        this.b.C(new l3b(this, 18, surface));
        if (this.k != null) {
            b();
        }
    }
}
