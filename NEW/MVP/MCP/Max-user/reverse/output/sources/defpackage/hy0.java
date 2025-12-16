package defpackage;

import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class hy0 {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final int c;
    public long d;
    public File e;
    public OutputStream f;
    public long g;
    public long h;
    public final Object i;
    public Object j;
    public BufferedOutputStream k;

    public hy0(fy0 fy0Var) {
        fy0Var.getClass();
        this.i = fy0Var;
        this.b = 5242880L;
        this.c = 20480;
    }

    public final void a() throws IOException {
        switch (this.a) {
            case 0:
                OutputStream outputStream = this.f;
                if (outputStream == null) {
                    return;
                }
                try {
                    outputStream.flush();
                    xxg.g(this.f);
                    this.f = null;
                    File file = this.e;
                    this.e = null;
                    fy0 fy0Var = (fy0) this.i;
                    long j = this.g;
                    a1f a1fVar = (a1f) fy0Var;
                    synchronized (a1fVar) {
                        if (file.exists()) {
                            if (j == 0) {
                                file.delete();
                                return;
                            }
                            d1f d1fVarC = d1f.c(file, j, a1fVar.c);
                            d1fVarC.getClass();
                            fz0 fz0VarK = a1fVar.c.k(d1fVarC.a);
                            fz0VarK.getClass();
                            fsi.d(fz0VarK.b(d1fVarC.b, d1fVarC.c));
                            long jA = h34.a(fz0VarK.e);
                            if (jA != -1) {
                                fsi.d(d1fVarC.b + d1fVarC.c <= jA);
                            }
                            a1fVar.b(d1fVarC);
                            try {
                                a1fVar.c.t();
                                a1fVar.notifyAll();
                                return;
                            } catch (IOException e) {
                                throw new Cache$CacheException(e);
                            }
                        }
                        return;
                    }
                } catch (Throwable th) {
                    xxg.g(this.f);
                    this.f = null;
                    File file2 = this.e;
                    this.e = null;
                    file2.delete();
                    throw th;
                }
            default:
                OutputStream outputStream2 = this.f;
                if (outputStream2 == null) {
                    return;
                }
                try {
                    outputStream2.flush();
                    zxg.g(this.f);
                    this.f = null;
                    File file3 = this.e;
                    this.e = null;
                    ey0 ey0Var = (ey0) this.i;
                    long j2 = this.g;
                    b1f b1fVar = (b1f) ey0Var;
                    synchronized (b1fVar) {
                        if (file3.exists()) {
                            if (j2 == 0) {
                                file3.delete();
                                return;
                            }
                            e1f e1fVarC = e1f.c(file3, j2, -9223372036854775807L, b1fVar.c);
                            e1fVarC.getClass();
                            gz0 gz0VarF = b1fVar.c.f(e1fVarC.a);
                            gz0VarF.getClass();
                            hsi.g(gz0VarF.c(e1fVarC.b, e1fVarC.c));
                            long jA2 = i34.a(gz0VarF.e);
                            if (jA2 != -1) {
                                hsi.g(e1fVarC.b + e1fVarC.c <= jA2);
                            }
                            if (b1fVar.d == null) {
                                b1fVar.b(e1fVarC);
                                b1fVar.c.l();
                                b1fVar.notifyAll();
                                return;
                            }
                            try {
                                b1fVar.d.L(e1fVarC.c, e1fVarC.X, file3.getName());
                                b1fVar.b(e1fVarC);
                                try {
                                    b1fVar.c.l();
                                    b1fVar.notifyAll();
                                    return;
                                } catch (IOException e2) {
                                    throw new androidx.media3.datasource.cache.Cache$CacheException(e2);
                                }
                            } catch (IOException e3) {
                                throw new androidx.media3.datasource.cache.Cache$CacheException(e3);
                            }
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    zxg.g(this.f);
                    this.f = null;
                    File file4 = this.e;
                    this.e = null;
                    file4.delete();
                    throw th2;
                }
        }
    }

    public void b(ye4 ye4Var) {
        File fileD;
        long j = ye4Var.g;
        long jMin = j == -1 ? -1L : Math.min(j - this.h, this.d);
        fy0 fy0Var = (fy0) this.i;
        String str = ye4Var.h;
        int i = xxg.a;
        long j2 = ye4Var.f + this.h;
        a1f a1fVar = (a1f) fy0Var;
        synchronized (a1fVar) {
            try {
                a1fVar.d();
                fz0 fz0VarK = a1fVar.c.k(str);
                fz0VarK.getClass();
                fsi.d(fz0VarK.b(j2, jMin));
                if (!a1fVar.a.exists()) {
                    a1f.e(a1fVar.a);
                    a1fVar.k();
                }
                v18 v18Var = a1fVar.b;
                if (jMin != -1) {
                    v18Var.a(a1fVar, jMin);
                } else {
                    v18Var.getClass();
                }
                File file = new File(a1fVar.a, Integer.toString(a1fVar.e.nextInt(10)));
                if (!file.exists()) {
                    a1f.e(file);
                }
                fileD = d1f.d(file, fz0VarK.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = fileD;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        if (this.c > 0) {
            xpd xpdVar = (xpd) this.k;
            if (xpdVar == null) {
                this.k = new xpd(fileOutputStream, this.c, 0);
            } else {
                xpdVar.c(fileOutputStream);
            }
            this.f = (xpd) this.k;
        } else {
            this.f = fileOutputStream;
        }
        this.g = 0L;
    }

    public void c(ze4 ze4Var) {
        File fileD;
        long j = ze4Var.g;
        long jMin = j != -1 ? Math.min(j - this.h, this.d) : -1L;
        ey0 ey0Var = (ey0) this.i;
        String str = ze4Var.h;
        String str2 = zxg.a;
        long j2 = ze4Var.f + this.h;
        b1f b1fVar = (b1f) ey0Var;
        synchronized (b1fVar) {
            try {
                b1fVar.d();
                gz0 gz0VarF = b1fVar.c.f(str);
                gz0VarF.getClass();
                hsi.g(gz0VarF.c(j2, jMin));
                if (!b1fVar.a.exists()) {
                    b1f.e(b1fVar.a);
                    b1fVar.n();
                }
                b1fVar.b.b(b1fVar, str, j2, jMin);
                File file = new File(b1fVar.a, Integer.toString(b1fVar.f.nextInt(10)));
                if (!file.exists()) {
                    b1f.e(file);
                }
                fileD = e1f.d(file, gz0VarF.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = fileD;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        if (this.c > 0) {
            xpd xpdVar = (xpd) this.k;
            if (xpdVar == null) {
                this.k = new xpd(fileOutputStream, this.c, 1);
            } else {
                xpdVar.c(fileOutputStream);
            }
            this.f = (xpd) this.k;
        } else {
            this.f = fileOutputStream;
        }
        this.g = 0L;
    }

    public hy0(ey0 ey0Var) {
        ey0Var.getClass();
        this.i = ey0Var;
        this.b = 5242880L;
        this.c = 20480;
    }
}
