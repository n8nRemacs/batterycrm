package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.PowerManager;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class xd8 {
    public final w39 a;
    public final fl5 b;
    public final v39 c;
    public final Context d;
    public i3 e;
    public f2h f;
    public s39 g;
    public float h;
    public boolean i;
    public boolean j;
    public PowerManager k;
    public PowerManager.WakeLock l;

    public xd8(w39 w39Var, fl5 fl5Var, v39 v39Var, Context context, float f, boolean z, boolean z2) {
        this.a = w39Var;
        this.b = fl5Var;
        this.c = v39Var;
        this.d = context;
        this.h = f;
        this.i = z;
        this.j = z2;
    }

    public final void a() {
        w39 w39Var = w39.a;
        w39 w39Var2 = this.a;
        if (w39Var2 == w39Var || w39Var2 == w39.b || !e()) {
            return;
        }
        if (this.l == null) {
            if (this.k == null) {
                this.k = (PowerManager) this.d.getSystemService("power");
            }
            PowerManager powerManager = this.k;
            Locale locale = Locale.ENGLISH;
            this.l = powerManager.newWakeLock(536870922, "tamtam:media_player_controller_" + w39Var2);
        }
        if (this.l.isHeld()) {
            return;
        }
        try {
            this.l.acquire();
            wqi.c("xd8", "New wake lock acquire %s", w39Var2);
        } catch (Exception unused) {
        }
    }

    public final String b(String str) {
        Locale locale = Locale.ENGLISH;
        return str + "-" + this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i3, t39] */
    public final void c() {
        ?? r0 = this.e;
        if (r0 != 0) {
            r0.G();
        }
    }

    public final boolean d() {
        if (this.f == null) {
            return false;
        }
        return this.b.d();
    }

    public final boolean e() {
        return this.h == 1.0f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [i3, t39] */
    public final void f() {
        this.c.m(this);
        ?? r0 = this.e;
        if (r0 != 0) {
            r0.r();
        }
        a();
    }

    public final void g() {
        if (this.f == null) {
            return;
        }
        wqi.c("xd8", "Pause %s", this.a);
        this.j = false;
        this.b.pause();
    }

    public final void h() {
        PowerManager.WakeLock wakeLock = this.l;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.l.release();
            wqi.c("xd8", "Release wake lock %s", this.a);
        }
    }

    public final void i(long j) {
        if (this.f == null) {
            return;
        }
        fl5 fl5Var = this.b;
        j1f j1fVar = fl5Var.a;
        fl5.c();
        if (fl5Var.Y == null) {
            return;
        }
        j1fVar.L0();
        dm5 dm5Var = j1fVar.c;
        if (dm5Var.getDuration() != 0) {
            j1fVar.L0();
            if (j > dm5Var.getDuration() - fl5Var.Y.b()) {
                return;
            }
        }
        j1fVar.M0(j1fVar.t(), fl5Var.Y.b() + j);
    }

    public final void j(Surface surface) {
        wqi.c("xd8", "Set surface %s", this.a);
        j1f j1fVar = this.b.a;
        fl5.c();
        wqi.c("fl5", "Set surface %s", surface);
        if (surface == null) {
            j1fVar.L0();
            dm5 dm5Var = j1fVar.c;
            dm5Var.d1();
            dm5Var.X0(null);
            dm5Var.U0(0, 0);
            return;
        }
        j1fVar.L0();
        dm5 dm5Var2 = j1fVar.c;
        dm5Var2.d1();
        dm5Var2.X0(surface);
        dm5Var2.U0(-1, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [bk0[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v46, types: [i3, t39] */
    /* JADX WARN: Type inference failed for: r5v18, types: [mc5] */
    /* JADX WARN: Type inference failed for: r5v22, types: [iv6] */
    /* JADX WARN: Type inference failed for: r5v23, types: [i3, t39] */
    /* JADX WARN: Type inference failed for: r7v7, types: [fc3] */
    public final void k(f2h f2hVar, s39 s39Var) {
        bk0 kocVar;
        ?? r5;
        xd8 xd8Var;
        ?? r2;
        fl5 fl5Var = this.b;
        wqi.c("xd8", "Set video content %s", this.a);
        this.f = f2hVar;
        this.g = s39Var;
        fl5.c();
        fl5Var.X = this;
        fl5Var.b(((ml0) this.f).f ? 0.0f : this.h);
        boolean z = this.i;
        fl5.c();
        j1f j1fVar = fl5Var.a;
        j1fVar.L0();
        dm5 dm5Var = j1fVar.c;
        cb6 cb6Var = dm5Var.w0;
        dm5Var.d1();
        int i = 1;
        if (dm5Var.M0 != z) {
            dm5Var.M0 = z ? 1 : 0;
            vwf vwfVar = dm5Var.v0.Z;
            vwfVar.getClass();
            twf twfVarB = vwf.b();
            twfVarB.a = vwfVar.a.obtainMessage(11, z ? 1 : 0, 0);
            twfVarB.b();
            cb6Var.i(8, new cj4(z ? 1 : 0, i));
            dm5Var.Z0();
            cb6Var.e();
        }
        f2h f2hVar2 = this.f;
        boolean z2 = this.j;
        j1f j1fVar2 = fl5Var.a;
        fl5.c();
        f2h f2hVar3 = fl5Var.Y;
        if (f2hVar3 != null && f2hVar3.equals(f2hVar2)) {
            j1fVar2.L0();
            dm5 dm5Var2 = j1fVar2.c;
            dm5Var2.d1();
            if (dm5Var2.j1.e != 1) {
                j1f j1fVar3 = fl5Var.a;
                j1fVar3.L0();
                dm5 dm5Var3 = j1fVar3.c;
                dm5Var3.d1();
                if (dm5Var3.j1.e == 4) {
                    wqi.c("fl5", "Video ended. Seek to start", new Object[0]);
                    fl5Var.g();
                }
                j1fVar2.L0();
                dm5 dm5Var4 = j1fVar2.c;
                dm5Var4.d1();
                if (dm5Var4.j1.e == 3 && (xd8Var = fl5Var.X) != null && (r2 = xd8Var.e) != 0) {
                    r2.N();
                }
                j1fVar2.N0(z2);
                if (z2) {
                    xd8 xd8Var2 = fl5Var.X;
                    if (xd8Var2 != null) {
                        xd8Var2.f();
                    }
                    fl5Var.e();
                    return;
                }
                return;
            }
        }
        wqi.c("fl5", "Prepare new video content", new Object[0]);
        fl5Var.t0 = 0;
        fl5Var.u0 = 0;
        fl5Var.v0 = 0;
        fl5Var.w0 = false;
        xd8 xd8Var3 = fl5Var.X;
        if (xd8Var3 != null && (r5 = xd8Var3.e) != 0) {
            r5.w();
        }
        fl5Var.Y = f2hVar2;
        fl5Var.Z = f2hVar2.getWidth() / f2hVar2.getHeight();
        vl3 vl3Var = fl5Var.b;
        vl3Var.c = fl5Var.Y;
        List list = Collections.EMPTY_LIST;
        vl3Var.d = list;
        zq4 zq4Var = (zq4) vl3Var.a;
        oq4 oq4VarA = zq4Var.a();
        SparseArray sparseArray = oq4VarA.M;
        if (sparseArray.size() != 0) {
            sparseArray.clear();
        }
        zq4Var.g(oq4VarA);
        vl3Var.p();
        f2h f2hVar4 = fl5Var.Y;
        Uri uriA = f2hVar4.a();
        zk5 zk5Var = fl5Var.d;
        boolean z3 = ((ml0) f2hVar4).c;
        zzf zzfVar = (zzf) zk5Var.a.getValue();
        ?? r12 = zzfVar.c && zzfVar.d(uriA.getHost());
        ne4 ne4Var = !z3 ? r12 != false ? (ne4) zk5Var.f.getValue() : (ne4) zk5Var.d.getValue() : r12 != false ? (ne4) zk5Var.e.getValue() : (ne4) zk5Var.c.getValue();
        if (f2hVar4 instanceof vd4) {
            DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(ne4Var);
            i09 i09VarA = i09.a(uriA);
            i09VarA.b.getClass();
            ed4 ed4Var = new ed4();
            kocVar = new rd4(i09VarA, dashMediaSource$Factory.b, !list.isEmpty() ? new iv6(ed4Var) : ed4Var, dashMediaSource$Factory.a, dashMediaSource$Factory.d, dashMediaSource$Factory.c.b(i09VarA), dashMediaSource$Factory.e, dashMediaSource$Factory.f);
        } else if (f2hVar4 instanceof n67) {
            HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(ne4Var);
            i09 i09VarA2 = i09.a(uriA);
            i09VarA2.b.getClass();
            v1a mc5Var = hlsMediaSource$Factory.c;
            if (!list.isEmpty()) {
                mc5Var = new mc5(mc5Var);
            }
            x6i x6iVar = hlsMediaSource$Factory.a;
            q85 q85Var = hlsMediaSource$Factory.b;
            lcj lcjVar = hlsMediaSource$Factory.e;
            j55 j55VarB = hlsMediaSource$Factory.f.b(i09VarA2);
            rha rhaVar = hlsMediaSource$Factory.g;
            dm4 dm4Var = hlsMediaSource$Factory.d;
            x6i x6iVar2 = hlsMediaSource$Factory.a;
            dm4Var.getClass();
            kocVar = new j57(i09VarA2, x6iVar, q85Var, lcjVar, j55VarB, rhaVar, new bn4(x6iVar2, rhaVar, mc5Var), hlsMediaSource$Factory.j, hlsMediaSource$Factory.h, hlsMediaSource$Factory.i);
        } else {
            int i2 = 18;
            int i3 = 20;
            if (f2hVar4 instanceof b4a) {
                b4a b4aVar = (b4a) f2hVar4;
                List list2 = b4aVar.i;
                ?? r10 = new bk0[list2.size()];
                int i4 = 0;
                while (i4 < list2.size()) {
                    z3a z3aVar = (z3a) list2.get(i4);
                    xu9 xu9Var = new xu9(i3, new om4());
                    rha rhaVar2 = new rha(i2);
                    i09 i09VarA3 = i09.a(xpi.q(z3aVar.a));
                    i09VarA3.b.getClass();
                    int i5 = i4;
                    i09VarA3.b.getClass();
                    i09VarA3.b.getClass();
                    koc kocVar2 = new koc(i09VarA3, ne4Var, xu9Var, j55.a, rhaVar2);
                    if (f2hVar4 instanceof yig) {
                        kocVar2 = new fc3(kocVar2, TimeUnit.MILLISECONDS.toMicros(b4aVar.c()));
                    }
                    r10[i5] = kocVar2;
                    i4 = i5 + 1;
                    i2 = 18;
                }
                kocVar = new bh9(r10);
            } else {
                xu9 xu9Var2 = new xu9(i3, new om4());
                rha rhaVar3 = new rha(18);
                i09 i09VarA4 = i09.a(uriA);
                i09VarA4.b.getClass();
                i09VarA4.b.getClass();
                i09VarA4.b.getClass();
                kocVar = new koc(i09VarA4, ne4Var, xu9Var2, j55.a, rhaVar3);
            }
        }
        fl5Var.s0 = kocVar;
        j1fVar2.N0(z2);
        dm5 dm5Var5 = j1fVar2.c;
        f2h f2hVar5 = fl5Var.Y;
        long jMax = Math.max(((ml0) f2hVar5).b, f2hVar5.b());
        if (((ml0) fl5Var.Y).c || jMax == 0) {
            bk0 bk0Var = fl5Var.s0;
            j1fVar2.L0();
            dm5Var5.d1();
            List listSingletonList = Collections.singletonList(bk0Var);
            dm5Var5.d1();
            dm5Var5.d1();
            dm5Var5.W0(listSingletonList, -1, -9223372036854775807L, true);
        } else {
            bk0 bk0Var2 = fl5Var.s0;
            j1fVar2.L0();
            dm5Var5.d1();
            List listSingletonList2 = Collections.singletonList(bk0Var2);
            dm5Var5.d1();
            dm5Var5.W0(listSingletonList2, 0, jMax, false);
        }
        j1fVar2.L0();
        dm5Var5.d1();
        boolean zI = dm5Var5.i();
        int iC = dm5Var5.H0.c(2, zI);
        dm5Var5.a1(iC, (!zI || iC == 1) ? 1 : 2, zI);
        z2c z2cVar = dm5Var5.j1;
        if (z2cVar.e == 1) {
            z2c z2cVarE = z2cVar.e(null);
            z2c z2cVarF = z2cVarE.f(z2cVarE.a.p() ? 4 : 2);
            dm5Var5.N0++;
            vwf vwfVar2 = dm5Var5.v0.Z;
            vwfVar2.getClass();
            twf twfVarB2 = vwf.b();
            twfVarB2.a = vwfVar2.a.obtainMessage(0);
            twfVarB2.b();
            dm5Var5.b1(z2cVarF, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
        if (z2) {
            xd8 xd8Var4 = fl5Var.X;
            if (xd8Var4 != null) {
                xd8Var4.f();
            }
            fl5Var.e();
        }
    }

    public final void l(float f) {
        f2h f2hVar = this.f;
        if (f2hVar == null || !((ml0) f2hVar).f) {
            this.h = f;
            this.b.b(f);
            if (e() && this.f != null && e()) {
                this.c.m(this);
            }
        }
    }

    public final void m() {
        l(0.0f);
    }
}
