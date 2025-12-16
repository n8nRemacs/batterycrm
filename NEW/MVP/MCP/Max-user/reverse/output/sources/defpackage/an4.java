package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class an4 implements bc8 {
    public long X;
    public long Y;
    public long Z;
    public final Uri a;
    public final te8 b = new te8("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final se4 c;
    public i57 d;
    public long o;
    public boolean s0;
    public IOException t0;
    public boolean u0;
    public final /* synthetic */ bn4 v0;

    public an4(bn4 bn4Var, Uri uri) {
        this.v0 = bn4Var;
        this.a = uri;
        this.c = ((oe4) ((y6i) bn4Var.Z).b).a();
    }

    public static boolean a(an4 an4Var, long j) {
        an4Var.Z = SystemClock.elapsedRealtime() + j;
        Uri uri = an4Var.a;
        bn4 bn4Var = an4Var.v0;
        if (!uri.equals(bn4Var.o)) {
            return false;
        }
        List list = ((q57) bn4Var.x0).e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            an4 an4Var2 = (an4) bn4Var.b.get(((o57) list.get(i)).a);
            an4Var2.getClass();
            if (jElapsedRealtime > an4Var2.Z) {
                Uri uri2 = an4Var2.a;
                bn4Var.o = uri2;
                an4Var2.e(bn4Var.c(uri2));
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bc8
    public final void G(ec8 ec8Var, long j, long j2, int i) {
        ub8 ub8Var;
        zmb zmbVar = (zmb) ec8Var;
        if (i == 0) {
            long j3 = zmbVar.a;
            ub8Var = new ub8(zmbVar.b);
        } else {
            long j4 = zmbVar.a;
            ze4 ze4Var = zmbVar.b;
            zdf zdfVar = zmbVar.d;
            Uri uri = zdfVar.c;
            ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        }
        ((lk6) this.v0.u0).R(ub8Var, zmbVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.bc8
    public final y21 K(ec8 ec8Var, long j, long j2, IOException iOException, int i) {
        zmb zmbVar = (zmb) ec8Var;
        long j3 = zmbVar.a;
        int i2 = zmbVar.c;
        ze4 ze4Var = zmbVar.b;
        zdf zdfVar = zmbVar.d;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof HlsPlaylistParser$DeltaUpdateException;
        y21 y21Var = te8.o;
        bn4 bn4Var = this.v0;
        if (z || z2) {
            int i3 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).d : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.Y = SystemClock.elapsedRealtime();
                c(false);
                lk6 lk6Var = (lk6) bn4Var.u0;
                String str = zxg.a;
                lk6Var.P(ub8Var, i2, iOException, true);
                return y21Var;
            }
        }
        sb8 sb8Var = new sb8(i, iOException);
        Iterator it = bn4Var.c.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((y57) it.next()).b(this.a, sb8Var, false);
        }
        tha thaVar = (tha) bn4Var.t0;
        if (z3) {
            thaVar.getClass();
            long jS = tha.s(sb8Var);
            y21Var = jS != -9223372036854775807L ? new y21(jS, 0, 5, false) : te8.X;
        }
        boolean zA = y21Var.a();
        ((lk6) bn4Var.u0).P(ub8Var, i2, iOException, !zA);
        if (!zA) {
            thaVar.getClass();
        }
        return y21Var;
    }

    public final Uri b() {
        i57 i57Var = this.d;
        Uri uri = this.a;
        if (i57Var != null) {
            g57 g57Var = i57Var.v;
            if (g57Var.a != -9223372036854775807L || g57Var.e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                i57 i57Var2 = this.d;
                if (i57Var2.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(i57Var2.k + i57Var2.r.size()));
                    i57 i57Var3 = this.d;
                    if (i57Var3.n != -9223372036854775807L) {
                        wg7 wg7Var = i57Var3.s;
                        int size = wg7Var.size();
                        if (!wg7Var.isEmpty() && ((z47) uni.c(wg7Var)).w0) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                g57 g57Var2 = this.d.v;
                if (g57Var2.a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", g57Var2.b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z) {
        e(z ? b() : this.a);
    }

    public final void d(Uri uri) {
        bn4 bn4Var = this.v0;
        xmb xmbVarL = ((w57) bn4Var.s0).l((q57) bn4Var.x0, this.d);
        Map map = Collections.EMPTY_MAP;
        hsi.i(uri, "The uri must be set.");
        zmb zmbVar = new zmb(this.c, new ze4(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, xmbVarL);
        this.b.F(zmbVar, this, ((tha) bn4Var.t0).q(zmbVar.c));
    }

    public final void e(Uri uri) {
        this.Z = 0L;
        if (this.s0) {
            return;
        }
        te8 te8Var = this.b;
        if (te8Var.A() || te8Var.x()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.Y;
        if (jElapsedRealtime >= j) {
            d(uri);
        } else {
            this.s0 = true;
            this.v0.d.postDelayed(new my1(this, 26, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.i57 r73, defpackage.ub8 r74) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an4.f(i57, ub8):void");
    }

    @Override // defpackage.bc8
    public final void q(ec8 ec8Var, long j, long j2, boolean z) {
        zmb zmbVar = (zmb) ec8Var;
        long j3 = zmbVar.a;
        ze4 ze4Var = zmbVar.b;
        zdf zdfVar = zmbVar.d;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        bn4 bn4Var = this.v0;
        ((tha) bn4Var.t0).getClass();
        ((lk6) bn4Var.u0).M(ub8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.bc8
    public final void x(ec8 ec8Var, long j, long j2) {
        zmb zmbVar = (zmb) ec8Var;
        s57 s57Var = (s57) zmbVar.X;
        ze4 ze4Var = zmbVar.b;
        zdf zdfVar = zmbVar.d;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        if (s57Var instanceof i57) {
            f((i57) s57Var, ub8Var);
            ((lk6) this.v0.u0).N(ub8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException parserExceptionB = ParserException.b(null, "Loaded playlist has unexpected type.");
            this.t0 = parserExceptionB;
            ((lk6) this.v0.u0).P(ub8Var, 4, parserExceptionB, true);
        }
        ((tha) this.v0.t0).getClass();
    }
}
