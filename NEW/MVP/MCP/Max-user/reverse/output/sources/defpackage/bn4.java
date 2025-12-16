package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class bn4 implements ac8, bc8 {
    public boolean X;
    public final Object Z;
    public Handler d;
    public Uri o;
    public final Object s0;
    public final Object t0;
    public Object u0;
    public Object v0;
    public Object w0;
    public Object x0;
    public Object y0;
    public static final dm4 z0 = new dm4(4);
    public static final dm4 A0 = new dm4(5);
    public final /* synthetic */ int a = 0;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final HashMap b = new HashMap();
    public long Y = -9223372036854775807L;

    public bn4(x6i x6iVar, rha rhaVar, v57 v57Var) {
        this.Z = x6iVar;
        this.s0 = v57Var;
        this.t0 = rhaVar;
    }

    @Override // defpackage.ac8
    public void A(dc8 dc8Var, long j, long j2) {
        p57 p57Var;
        ymb ymbVar = (ymb) dc8Var;
        r57 r57Var = (r57) ymbVar.X;
        boolean z = r57Var instanceof h57;
        if (z) {
            String str = r57Var.a;
            p57 p57Var2 = p57.n;
            Uri uri = Uri.parse(str);
            ef6 ef6Var = new ef6();
            ef6Var.a = "0";
            ef6Var.j = "application/x-mpegURL";
            List listSingletonList = Collections.singletonList(new n57(uri, new gf6(ef6Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            p57Var = new p57("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            p57Var = (p57) r57Var;
        }
        this.x0 = p57Var;
        this.o = ((n57) p57Var.e.get(0)).a;
        this.c.add(new xm4(this));
        List list2 = p57Var.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list2.get(i);
            this.b.put(uri2, new zm4(this, uri2));
        }
        long j3 = ymbVar.a;
        ye4 ye4Var = ymbVar.b;
        ydf ydfVar = ymbVar.d;
        tb8 tb8Var = new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        zm4 zm4Var = (zm4) this.b.get(this.o);
        if (z) {
            zm4Var.d((h57) r57Var);
        } else {
            zm4Var.c(zm4Var.a);
        }
        ((rha) this.t0).getClass();
        ((qr4) this.u0).f(tb8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.ac8
    public y21 D(dc8 dc8Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        ymb ymbVar = (ymb) dc8Var;
        long j3 = ymbVar.a;
        ye4 ye4Var = ymbVar.b;
        ydf ydfVar = ymbVar.d;
        tb8 tb8Var = new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        int i2 = ymbVar.c;
        ((rha) this.t0).getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i3 = DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        boolean z = jMin == -9223372036854775807L;
        ((qr4) this.u0).i(tb8Var, i2, iOException, z);
        return z ? hc8.Y : new y21(jMin, 0, 4, false);
    }

    @Override // defpackage.bc8
    public void G(ec8 ec8Var, long j, long j2, int i) {
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
        ((lk6) this.u0).R(ub8Var, zmbVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.bc8
    public y21 K(ec8 ec8Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        zmb zmbVar = (zmb) ec8Var;
        long j3 = zmbVar.a;
        ze4 ze4Var = zmbVar.b;
        zdf zdfVar = zmbVar.d;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        int i2 = zmbVar.c;
        ((tha) this.t0).getClass();
        if ((iOException instanceof androidx.media3.common.ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException) || (iOException instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i3 = androidx.media3.datasource.DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof androidx.media3.datasource.DataSourceException) && ((androidx.media3.datasource.DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        boolean z = jMin == -9223372036854775807L;
        ((lk6) this.u0).P(ub8Var, i2, iOException, z);
        return z ? te8.X : new y21(jMin, 0, 5, false);
    }

    public h57 a(Uri uri, boolean z) {
        HashMap map = this.b;
        h57 h57Var = ((zm4) map.get(uri)).d;
        if (h57Var != null && z && !uri.equals(this.o)) {
            List list = ((p57) this.x0).e;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (uri.equals(((n57) list.get(i)).a)) {
                    h57 h57Var2 = (h57) this.y0;
                    if (h57Var2 == null || !h57Var2.o) {
                        this.o = uri;
                        zm4 zm4Var = (zm4) map.get(uri);
                        h57 h57Var3 = zm4Var.d;
                        if (h57Var3 == null || !h57Var3.o) {
                            zm4Var.c(c(uri));
                            return h57Var;
                        }
                        this.y0 = h57Var3;
                        ((j57) this.w0).q(h57Var3);
                        return h57Var;
                    }
                } else {
                    i++;
                }
            }
        }
        return h57Var;
    }

    public i57 b(Uri uri, boolean z) {
        HashMap map = this.b;
        i57 i57Var = ((an4) map.get(uri)).d;
        if (i57Var != null && z) {
            if (!uri.equals(this.o)) {
                List list = ((q57) this.x0).e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((o57) list.get(i)).a)) {
                        i57 i57Var2 = (i57) this.y0;
                        if (i57Var2 == null || !i57Var2.o) {
                            this.o = uri;
                            an4 an4Var = (an4) map.get(uri);
                            i57 i57Var3 = an4Var.d;
                            if (i57Var3 == null || !i57Var3.o) {
                                an4Var.e(c(uri));
                            } else {
                                this.y0 = i57Var3;
                                ((k57) this.w0).v(i57Var3);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            an4 an4Var2 = (an4) map.get(uri);
            i57 i57Var4 = an4Var2.d;
            if (!an4Var2.u0) {
                an4Var2.u0 = true;
                if (i57Var4 != null && !i57Var4.o) {
                    an4Var2.c(true);
                }
            }
        }
        return i57Var;
    }

    public final Uri c(Uri uri) {
        a57 a57Var;
        b57 b57Var;
        switch (this.a) {
            case 0:
                h57 h57Var = (h57) this.y0;
                if (h57Var == null || !h57Var.v.e || (a57Var = (a57) h57Var.t.get(uri)) == null) {
                    return uri;
                }
                Uri.Builder builderBuildUpon = uri.buildUpon();
                builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(a57Var.b));
                int i = a57Var.c;
                if (i != -1) {
                    builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
                }
                return builderBuildUpon.build();
            default:
                i57 i57Var = (i57) this.y0;
                if (i57Var == null || !i57Var.v.e || (b57Var = (b57) i57Var.t.get(uri)) == null) {
                    return uri;
                }
                Uri.Builder builderBuildUpon2 = uri.buildUpon();
                builderBuildUpon2.appendQueryParameter("_HLS_msn", String.valueOf(b57Var.b));
                int i2 = b57Var.c;
                if (i2 != -1) {
                    builderBuildUpon2.appendQueryParameter("_HLS_part", String.valueOf(i2));
                }
                return builderBuildUpon2.build();
        }
    }

    public final boolean d(Uri uri) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                zm4 zm4Var = (zm4) this.b.get(uri);
                if (zm4Var.d != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long jMax = Math.max(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, xxg.K(zm4Var.d.u));
                    h57 h57Var = zm4Var.d;
                    if (h57Var.o || (i = h57Var.d) == 2 || i == 1 || zm4Var.o + jMax > jElapsedRealtime) {
                    }
                }
                break;
            default:
                an4 an4Var = (an4) this.b.get(uri);
                if (an4Var.d != null) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long jMax2 = Math.max(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, zxg.m0(an4Var.d.u));
                    i57 i57Var = an4Var.d;
                    if (i57Var.o || (i2 = i57Var.d) == 2 || i2 == 1 || an4Var.o + jMax2 > jElapsedRealtime2) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // defpackage.bc8
    public void q(ec8 ec8Var, long j, long j2, boolean z) {
        zmb zmbVar = (zmb) ec8Var;
        long j3 = zmbVar.a;
        ze4 ze4Var = zmbVar.b;
        zdf zdfVar = zmbVar.d;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        ((tha) this.t0).getClass();
        ((lk6) this.u0).M(ub8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.ac8
    public void r(dc8 dc8Var, long j, long j2, boolean z) {
        ymb ymbVar = (ymb) dc8Var;
        long j3 = ymbVar.a;
        ye4 ye4Var = ymbVar.b;
        ydf ydfVar = ymbVar.d;
        tb8 tb8Var = new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        ((rha) this.t0).getClass();
        ((qr4) this.u0).d(tb8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.bc8
    public void x(ec8 ec8Var, long j, long j2) {
        q57 q57Var;
        zmb zmbVar = (zmb) ec8Var;
        s57 s57Var = (s57) zmbVar.X;
        boolean z = s57Var instanceof i57;
        if (z) {
            String str = s57Var.a;
            q57 q57Var2 = q57.l;
            Uri uri = Uri.parse(str);
            ff6 ff6Var = new ff6();
            ff6Var.a = "0";
            ff6Var.l = xz9.n("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new o57(uri, new hf6(ff6Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            q57Var = new q57("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            q57Var = (q57) s57Var;
        }
        this.x0 = q57Var;
        this.o = ((o57) q57Var.e.get(0)).a;
        this.c.add(new ym4(this));
        List list2 = q57Var.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list2.get(i);
            this.b.put(uri2, new an4(this, uri2));
        }
        ze4 ze4Var = zmbVar.b;
        zdf zdfVar = zmbVar.d;
        Uri uri3 = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        an4 an4Var = (an4) this.b.get(this.o);
        if (z) {
            an4Var.f((i57) s57Var, ub8Var);
        } else {
            an4Var.c(false);
        }
        ((tha) this.t0).getClass();
        ((lk6) this.u0).N(ub8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public bn4(y6i y6iVar, tha thaVar, w57 w57Var) {
        this.Z = y6iVar;
        this.s0 = w57Var;
        this.t0 = thaVar;
    }
}
