package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zm4 implements ac8 {
    public long X;
    public long Y;
    public long Z;
    public final Uri a;
    public final hc8 b = new hc8("DefaultHlsPlaylistTracker:MediaPlaylist", 0);
    public final qe4 c;
    public h57 d;
    public long o;
    public boolean s0;
    public IOException t0;
    public final /* synthetic */ bn4 u0;

    public zm4(bn4 bn4Var, Uri uri) {
        this.u0 = bn4Var;
        this.a = uri;
        this.c = ((ne4) ((x6i) bn4Var.Z).b).a();
    }

    public static boolean a(zm4 zm4Var, long j) {
        zm4Var.Z = SystemClock.elapsedRealtime() + j;
        Uri uri = zm4Var.a;
        bn4 bn4Var = zm4Var.u0;
        if (!uri.equals(bn4Var.o)) {
            return false;
        }
        List list = ((p57) bn4Var.x0).e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            zm4 zm4Var2 = (zm4) bn4Var.b.get(((n57) list.get(i)).a);
            zm4Var2.getClass();
            if (jElapsedRealtime > zm4Var2.Z) {
                Uri uri2 = zm4Var2.a;
                bn4Var.o = uri2;
                zm4Var2.c(bn4Var.c(uri2));
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ac8
    public final void A(dc8 dc8Var, long j, long j2) {
        ymb ymbVar = (ymb) dc8Var;
        r57 r57Var = (r57) ymbVar.X;
        long j3 = ymbVar.a;
        ye4 ye4Var = ymbVar.b;
        ydf ydfVar = ymbVar.d;
        tb8 tb8Var = new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        if (r57Var instanceof h57) {
            d((h57) r57Var);
            ((qr4) this.u0.u0).f(tb8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException parserExceptionB = ParserException.b(null, "Loaded playlist has unexpected type.");
            this.t0 = parserExceptionB;
            ((qr4) this.u0.u0).i(tb8Var, 4, parserExceptionB, true);
        }
        ((rha) this.u0.t0).getClass();
    }

    @Override // defpackage.ac8
    public final y21 D(dc8 dc8Var, long j, long j2, IOException iOException, int i) {
        y21 y21Var = hc8.X;
        ymb ymbVar = (ymb) dc8Var;
        long j3 = ymbVar.a;
        int i2 = ymbVar.c;
        ye4 ye4Var = ymbVar.b;
        ydf ydfVar = ymbVar.d;
        Uri uri = ydfVar.c;
        tb8 tb8Var = new tb8(j3, ye4Var, uri, ydfVar.d, j, j2, ydfVar.b);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof HlsPlaylistParser$DeltaUpdateException;
        Uri uri2 = this.a;
        bn4 bn4Var = this.u0;
        if (z || z2) {
            int i3 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).c : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.Y = SystemClock.elapsedRealtime();
                c(uri2);
                qr4 qr4Var = (qr4) bn4Var.u0;
                int i4 = xxg.a;
                qr4Var.i(tb8Var, i2, iOException, true);
                return y21Var;
            }
        }
        sb8 sb8Var = new sb8(i, iOException);
        Iterator it = bn4Var.c.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((x57) it.next()).e(uri2, sb8Var, false);
        }
        rha rhaVar = (rha) bn4Var.t0;
        if (z3) {
            rhaVar.getClass();
            long jS = rha.s(sb8Var);
            y21Var = jS != -9223372036854775807L ? new y21(jS, 0, 4, false) : hc8.Y;
        }
        boolean zA = y21Var.a();
        ((qr4) bn4Var.u0).i(tb8Var, i2, iOException, !zA);
        if (!zA) {
            rhaVar.getClass();
        }
        return y21Var;
    }

    public final void b(Uri uri) {
        bn4 bn4Var = this.u0;
        ymb ymbVar = new ymb(this.c, uri, 4, ((v57) bn4Var.s0).j((p57) bn4Var.x0, this.d));
        rha rhaVar = (rha) bn4Var.t0;
        int i = ymbVar.c;
        ((qr4) bn4Var.u0).k(new tb8(ymbVar.a, ymbVar.b, this.b.O(ymbVar, this, rhaVar.q(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.Z = 0L;
        if (this.s0) {
            return;
        }
        hc8 hc8Var = this.b;
        if (hc8Var.I() || hc8Var.G()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.Y;
        if (jElapsedRealtime >= j) {
            b(uri);
        } else {
            this.s0 = true;
            this.u0.d.postDelayed(new my1(this, 25, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.h57 r71) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm4.d(h57):void");
    }

    @Override // defpackage.ac8
    public final void r(dc8 dc8Var, long j, long j2, boolean z) {
        ymb ymbVar = (ymb) dc8Var;
        long j3 = ymbVar.a;
        ye4 ye4Var = ymbVar.b;
        ydf ydfVar = ymbVar.d;
        tb8 tb8Var = new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        bn4 bn4Var = this.u0;
        ((rha) bn4Var.t0).getClass();
        ((qr4) bn4Var.u0).d(tb8Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
