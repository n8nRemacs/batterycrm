package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class ky0 implements qe4 {
    public boolean A0;
    public long B0;
    public final boolean X;
    public final boolean Y;
    public Uri Z;
    public final fy0 a;
    public final qe4 b;
    public final h3g c;
    public final qe4 d;
    public final boolean o;
    public ye4 s0;
    public ye4 t0;
    public qe4 u0;
    public long v0;
    public long w0;
    public long x0;
    public d1f y0;
    public boolean z0;

    public ky0(fy0 fy0Var, qe4 qe4Var, qe4 qe4Var2, hy0 hy0Var, int i) {
        this.a = fy0Var;
        this.b = qe4Var2;
        this.o = (i & 1) != 0;
        this.X = (i & 2) != 0;
        this.Y = (i & 4) != 0;
        if (qe4Var != null) {
            this.d = qe4Var;
            this.c = hy0Var != null ? new h3g(qe4Var, hy0Var) : null;
        } else {
            this.d = n65.a;
            this.c = null;
        }
    }

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) {
        long j;
        fy0 fy0Var = this.a;
        try {
            String string = ye4Var.h;
            if (string == null) {
                string = ye4Var.a.toString();
            }
            long j2 = ye4Var.f;
            long j3 = ye4Var.g;
            xe4 xe4VarA = ye4Var.a();
            xe4VarA.h = string;
            ye4 ye4VarA = xe4VarA.a();
            this.s0 = ye4VarA;
            Uri uri = ye4VarA.a;
            byte[] bArr = (byte[]) ((a1f) fy0Var).g(string).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, mb2.c) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.Z = uri;
            this.w0 = j2;
            boolean z = (this.X && this.z0) || (this.Y && j3 == -1);
            this.A0 = z;
            if (z) {
                this.x0 = -1L;
                j = -1;
            } else {
                j = -1;
                long jA = h34.a(((a1f) fy0Var).g(string));
                this.x0 = jA;
                if (jA != -1) {
                    long j4 = jA - j2;
                    this.x0 = j4;
                    if (j4 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j3 != j) {
                long j5 = this.x0;
                this.x0 = j5 == j ? j3 : Math.min(j5, j3);
            }
            long j6 = this.x0;
            if (j6 > 0 || j6 == j) {
                c(ye4VarA, false);
            }
            return j3 != j ? j3 : this.x0;
        } catch (Throwable th) {
            if (this.u0 == this.b || (th instanceof Cache$CacheException)) {
                this.z0 = true;
            }
            throw th;
        }
    }

    @Override // defpackage.qe4
    public final void S(vgg vggVar) {
        vggVar.getClass();
        this.b.S(vggVar);
        this.d.S(vggVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        fy0 fy0Var = this.a;
        qe4 qe4Var = this.u0;
        if (qe4Var == null) {
            return;
        }
        try {
            qe4Var.close();
        } finally {
            this.t0 = null;
            this.u0 = null;
            d1f d1fVar = this.y0;
            if (d1fVar != null) {
                ((a1f) fy0Var).i(d1fVar);
                this.y0 = null;
            }
        }
    }

    public final void c(ye4 ye4Var, boolean z) throws InterruptedIOException {
        d1f d1fVarL;
        ye4 ye4VarA;
        qe4 qe4Var;
        String str = ye4Var.h;
        int i = xxg.a;
        if (this.A0) {
            d1fVarL = null;
        } else if (this.o) {
            try {
                fy0 fy0Var = this.a;
                long j = this.w0;
                long j2 = this.x0;
                a1f a1fVar = (a1f) fy0Var;
                synchronized (a1fVar) {
                    a1fVar.d();
                    while (true) {
                        d1fVarL = a1fVar.l(j, j2, str);
                        if (d1fVarL != null) {
                            break;
                        } else {
                            a1fVar.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            d1fVarL = ((a1f) this.a).l(this.w0, this.x0, str);
        }
        if (d1fVarL == null) {
            qe4Var = this.d;
            xe4 xe4VarA = ye4Var.a();
            xe4VarA.f = this.w0;
            xe4VarA.g = this.x0;
            ye4VarA = xe4VarA.a();
        } else if (d1fVarL.d) {
            Uri uriFromFile = Uri.fromFile(d1fVarL.o);
            long j3 = d1fVarL.b;
            long j4 = this.w0 - j3;
            long jMin = d1fVarL.c - j4;
            long j5 = this.x0;
            if (j5 != -1) {
                jMin = Math.min(jMin, j5);
            }
            xe4 xe4VarA2 = ye4Var.a();
            xe4VarA2.a = uriFromFile;
            xe4VarA2.b = j3;
            xe4VarA2.f = j4;
            xe4VarA2.g = jMin;
            ye4VarA = xe4VarA2.a();
            qe4Var = this.b;
        } else {
            long jMin2 = d1fVarL.c;
            if (jMin2 == -1) {
                jMin2 = this.x0;
            } else {
                long j6 = this.x0;
                if (j6 != -1) {
                    jMin2 = Math.min(jMin2, j6);
                }
            }
            xe4 xe4VarA3 = ye4Var.a();
            xe4VarA3.f = this.w0;
            xe4VarA3.g = jMin2;
            ye4VarA = xe4VarA3.a();
            qe4Var = this.c;
            if (qe4Var == null) {
                qe4Var = this.d;
                ((a1f) this.a).i(d1fVarL);
                d1fVarL = null;
            }
        }
        this.B0 = (this.A0 || qe4Var != this.d) ? BuildConfig.MAX_TIME_TO_UPLOAD : this.w0 + 102400;
        if (z) {
            fsi.d(this.u0 == this.d);
            if (qe4Var == this.d) {
                return;
            }
            try {
                b();
            } catch (Throwable th) {
                if (!d1fVarL.d) {
                    ((a1f) this.a).i(d1fVarL);
                }
                throw th;
            }
        }
        if (d1fVarL != null && !d1fVarL.d) {
            this.y0 = d1fVarL;
        }
        this.u0 = qe4Var;
        this.t0 = ye4VarA;
        this.v0 = 0L;
        long jR = qe4Var.R(ye4VarA);
        j34 j34Var = new j34();
        if (ye4VarA.g == -1 && jR != -1) {
            this.x0 = jR;
            j34Var.b(Long.valueOf(this.w0 + jR), "exo_len");
        }
        if (!(this.u0 == this.b)) {
            Uri uri = qe4Var.getUri();
            this.Z = uri;
            Uri uri2 = ye4Var.a.equals(uri) ? null : this.Z;
            if (uri2 == null) {
                j34Var.b.add("exo_redir");
                j34Var.a.remove("exo_redir");
            } else {
                j34Var.b(uri2.toString(), "exo_redir");
            }
        }
        if (this.u0 == this.c) {
            ((a1f) this.a).c(str, j34Var);
        }
    }

    @Override // defpackage.qe4
    public final void close() {
        this.s0 = null;
        this.Z = null;
        this.w0 = 0L;
        try {
            b();
        } catch (Throwable th) {
            if (this.u0 == this.b || (th instanceof Cache$CacheException)) {
                this.z0 = true;
            }
            throw th;
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.Z;
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        qe4 qe4Var = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.x0 == 0) {
            return -1;
        }
        ye4 ye4Var = this.s0;
        ye4Var.getClass();
        ye4 ye4Var2 = this.t0;
        ye4Var2.getClass();
        try {
            if (this.w0 >= this.B0) {
                c(ye4Var, true);
            }
            qe4 qe4Var2 = this.u0;
            qe4Var2.getClass();
            int i4 = qe4Var2.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = i4;
                this.w0 += j2;
                this.v0 += j2;
                long j3 = this.x0;
                if (j3 == -1) {
                    return i4;
                }
                this.x0 = j3 - j2;
                return i4;
            }
            qe4 qe4Var3 = this.u0;
            if (!(qe4Var3 == qe4Var)) {
                j = -1;
                long j4 = ye4Var2.g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.v0 < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = ye4Var.h;
                int i5 = xxg.a;
                this.x0 = 0L;
                if (!(qe4Var3 == this.c)) {
                    return i3;
                }
                j34 j34Var = new j34();
                j34Var.b(Long.valueOf(this.w0), "exo_len");
                ((a1f) this.a).c(str, j34Var);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.x0;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            b();
            c(ye4Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.u0 == qe4Var || (th instanceof Cache$CacheException)) {
                this.z0 = true;
            }
            throw th;
        }
    }

    @Override // defpackage.qe4
    public final Map x() {
        return !(this.u0 == this.b) ? this.d.x() : Collections.EMPTY_MAP;
    }
}
