package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class ly0 implements se4 {
    public boolean A0;
    public boolean B0;
    public long C0;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final ey0 a;
    public final se4 b;
    public final i3g c;
    public final se4 d;
    public final uy0 o;
    public Uri s0;
    public ze4 t0;
    public ze4 u0;
    public se4 v0;
    public long w0;
    public long x0;
    public long y0;
    public e1f z0;

    public ly0(ey0 ey0Var, se4 se4Var, se4 se4Var2, hy0 hy0Var, uy0 uy0Var, int i, int i2) {
        this.a = ey0Var;
        this.b = se4Var2;
        this.o = uy0Var;
        this.X = (i & 1) != 0;
        this.Y = (i & 2) != 0;
        this.Z = (i & 4) != 0;
        if (se4Var != null) {
            this.d = se4Var;
            this.c = hy0Var != null ? new i3g(se4Var, hy0Var) : null;
        } else {
            this.d = j2c.a;
            this.c = null;
        }
    }

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) {
        ey0 ey0Var = this.a;
        try {
            String strH = this.o.h(ze4Var);
            xe4 xe4VarA = ze4Var.a();
            long j = ze4Var.f;
            long j2 = ze4Var.g;
            xe4VarA.h = strH;
            ze4 ze4VarB = xe4VarA.b();
            this.t0 = ze4VarB;
            Uri uri = ze4VarB.a;
            byte[] bArr = (byte[]) ((b1f) ey0Var).i(strH).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.s0 = uri;
            this.x0 = j;
            boolean z = (this.Y && this.A0) || (this.Z && j2 == -1);
            this.B0 = z;
            if (z) {
                this.y0 = -1L;
            } else {
                long jA = i34.a(((b1f) ey0Var).i(strH));
                this.y0 = jA;
                if (jA != -1) {
                    long j3 = jA - j;
                    this.y0 = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.y0;
                this.y0 = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.y0;
            if (j5 > 0 || j5 == -1) {
                c(ze4VarB, false);
            }
            return j2 != -1 ? j2 : this.y0;
        } catch (Throwable th) {
            if (this.v0 == this.b || (th instanceof Cache$CacheException)) {
                this.A0 = true;
            }
            throw th;
        }
    }

    @Override // defpackage.se4
    public final void I(wgg wggVar) {
        wggVar.getClass();
        this.b.I(wggVar);
        this.d.I(wggVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        ey0 ey0Var = this.a;
        se4 se4Var = this.v0;
        if (se4Var == null) {
            return;
        }
        try {
            se4Var.close();
        } finally {
            this.u0 = null;
            this.v0 = null;
            e1f e1fVar = this.z0;
            if (e1fVar != null) {
                ((b1f) ey0Var).k(e1fVar);
                this.z0 = null;
            }
        }
    }

    public final void c(ze4 ze4Var, boolean z) throws InterruptedIOException {
        e1f e1fVarO;
        ze4 ze4VarB;
        se4 se4Var;
        String str = ze4Var.h;
        String str2 = zxg.a;
        if (this.B0) {
            e1fVarO = null;
        } else if (this.X) {
            try {
                ey0 ey0Var = this.a;
                long j = this.x0;
                long j2 = this.y0;
                b1f b1fVar = (b1f) ey0Var;
                synchronized (b1fVar) {
                    b1fVar.d();
                    while (true) {
                        e1fVarO = b1fVar.o(j, j2, str);
                        if (e1fVarO != null) {
                            break;
                        } else {
                            b1fVar.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            e1fVarO = ((b1f) this.a).o(this.x0, this.y0, str);
        }
        if (e1fVarO == null) {
            se4Var = this.d;
            xe4 xe4VarA = ze4Var.a();
            xe4VarA.f = this.x0;
            xe4VarA.g = this.y0;
            ze4VarB = xe4VarA.b();
        } else if (e1fVarO.d) {
            Uri uriFromFile = Uri.fromFile(e1fVarO.o);
            long j3 = e1fVarO.b;
            long j4 = this.x0 - j3;
            long jMin = e1fVarO.c - j4;
            long j5 = this.y0;
            if (j5 != -1) {
                jMin = Math.min(jMin, j5);
            }
            xe4 xe4VarA2 = ze4Var.a();
            xe4VarA2.a = uriFromFile;
            xe4VarA2.b = j3;
            xe4VarA2.f = j4;
            xe4VarA2.g = jMin;
            ze4VarB = xe4VarA2.b();
            se4Var = this.b;
        } else {
            long jMin2 = e1fVarO.c;
            if (jMin2 == -1) {
                jMin2 = this.y0;
            } else {
                long j6 = this.y0;
                if (j6 != -1) {
                    jMin2 = Math.min(jMin2, j6);
                }
            }
            xe4 xe4VarA3 = ze4Var.a();
            xe4VarA3.f = this.x0;
            xe4VarA3.g = jMin2;
            ze4VarB = xe4VarA3.b();
            se4Var = this.c;
            if (se4Var == null) {
                se4Var = this.d;
                ((b1f) this.a).k(e1fVarO);
                e1fVarO = null;
            }
        }
        this.C0 = (this.B0 || se4Var != this.d) ? BuildConfig.MAX_TIME_TO_UPLOAD : this.x0 + 102400;
        if (z) {
            hsi.g(this.v0 == this.d);
            if (se4Var == this.d) {
                return;
            }
            try {
                b();
            } catch (Throwable th) {
                if (!e1fVarO.d) {
                    ((b1f) this.a).k(e1fVarO);
                }
                throw th;
            }
        }
        if (e1fVarO != null && !e1fVarO.d) {
            this.z0 = e1fVarO;
        }
        this.v0 = se4Var;
        this.u0 = ze4VarB;
        this.w0 = 0L;
        long jH = se4Var.H(ze4VarB);
        k34 k34Var = new k34();
        if (ze4VarB.g == -1 && jH != -1) {
            this.y0 = jH;
            k34Var.a(Long.valueOf(this.x0 + jH), "exo_len");
        }
        if (!(this.v0 == this.b)) {
            Uri uri = se4Var.getUri();
            this.s0 = uri;
            Uri uri2 = ze4Var.a.equals(uri) ? null : this.s0;
            if (uri2 == null) {
                k34Var.b.add("exo_redir");
                k34Var.a.remove("exo_redir");
            } else {
                k34Var.a(uri2.toString(), "exo_redir");
            }
        }
        if (this.v0 == this.c) {
            ((b1f) this.a).c(str, k34Var);
        }
    }

    @Override // defpackage.se4
    public final void close() {
        this.t0 = null;
        this.s0 = null;
        this.x0 = 0L;
        try {
            b();
        } catch (Throwable th) {
            if (this.v0 == this.b || (th instanceof Cache$CacheException)) {
                this.A0 = true;
            }
            throw th;
        }
    }

    @Override // defpackage.se4
    public final Uri getUri() {
        return this.s0;
    }

    @Override // defpackage.ke4
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        se4 se4Var = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.y0 == 0) {
            return -1;
        }
        ze4 ze4Var = this.t0;
        ze4Var.getClass();
        ze4 ze4Var2 = this.u0;
        ze4Var2.getClass();
        try {
            if (this.x0 >= this.C0) {
                c(ze4Var, true);
            }
            se4 se4Var2 = this.v0;
            se4Var2.getClass();
            int i4 = se4Var2.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = i4;
                this.x0 += j2;
                this.w0 += j2;
                long j3 = this.y0;
                if (j3 == -1) {
                    return i4;
                }
                this.y0 = j3 - j2;
                return i4;
            }
            se4 se4Var3 = this.v0;
            if (!(se4Var3 == se4Var)) {
                j = -1;
                long j4 = ze4Var2.g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.w0 < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = ze4Var.h;
                String str2 = zxg.a;
                this.y0 = 0L;
                if (!(se4Var3 == this.c)) {
                    return i3;
                }
                k34 k34Var = new k34();
                k34Var.a(Long.valueOf(this.x0), "exo_len");
                ((b1f) this.a).c(str, k34Var);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.y0;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            b();
            c(ze4Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.v0 == se4Var || (th instanceof Cache$CacheException)) {
                this.A0 = true;
            }
            throw th;
        }
    }

    @Override // defpackage.se4
    public final Map x() {
        return !(this.v0 == this.b) ? this.d.x() : Collections.EMPTY_MAP;
    }
}
