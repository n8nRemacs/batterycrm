package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public class ly8 implements ox8 {
    public long A;
    public long B;
    public q4c C;
    public Bundle D;
    public final px8 a;
    public final dy b;
    public final vy8 c;
    public final Context d;
    public final tje e;
    public final Bundle f;
    public final iy8 g;
    public final ua8 h;
    public final xt4 i;
    public final xs j;
    public final Handler k;
    public tje l;
    public ky8 m;
    public boolean n;
    public q4c o = q4c.F;
    public PendingIntent p;
    public wg7 q;
    public wg7 r;
    public zjd s;
    public zjd t;
    public bie u;
    public o3c v;
    public o3c w;
    public o3c x;
    public eb7 y;
    public MediaController z;

    /* JADX WARN: Type inference failed for: r4v4, types: [iy8] */
    public ly8(Context context, px8 px8Var, tje tjeVar, Bundle bundle, Looper looper) {
        c4f c4fVar = c4f.c;
        this.u = bie.b;
        zjd zjdVar = zjd.o;
        this.q = zjdVar;
        this.r = zjdVar;
        this.s = zjdVar;
        this.t = zjdVar;
        o3c o3cVar = o3c.b;
        this.v = o3cVar;
        this.w = o3cVar;
        this.x = m(o3cVar, o3cVar);
        this.h = new ua8(looper, mwf.a, new zx8(this, 5));
        this.k = new Handler(looper);
        this.a = px8Var;
        hsi.e(context, "context must not be null");
        hsi.e(tjeVar, "token must not be null");
        this.d = context;
        this.b = new dy();
        this.c = new vy8(this);
        this.j = new xs(0);
        this.e = tjeVar;
        this.f = bundle;
        this.g = new IBinder.DeathRecipient() { // from class: iy8
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                px8 px8Var2 = this.a.a;
                Objects.requireNonNull(px8Var2);
                px8Var2.z(new gq5(15, px8Var2));
            }
        };
        this.D = Bundle.EMPTY;
        this.m = tjeVar.a.getType() == 0 ? null : new ky8(this, bundle);
        this.i = new xt4(this, looper);
        this.A = -9223372036854775807L;
        this.B = -9223372036854775807L;
    }

    public static q4c S(q4c q4cVar, n9g n9gVar, int i, int i2, long j, long j2, int i3) {
        q9g q9gVar = new q9g();
        n9gVar.m(i, q9gVar, 0L);
        k09 k09Var = q9gVar.c;
        t3c t3cVar = q4cVar.c.a;
        t3c t3cVar2 = new t3c(null, i, k09Var, null, i2, j, j2, t3cVar.h, t3cVar.i);
        wie wieVar = q4cVar.c;
        return T(q4cVar, n9gVar, t3cVar2, new wie(t3cVar2, wieVar.b, SystemClock.elapsedRealtime(), wieVar.d, wieVar.e, wieVar.f, wieVar.g, wieVar.h, wieVar.i, wieVar.j), i3);
    }

    public static q4c T(q4c q4cVar, s9g s9gVar, t3c t3cVar, wie wieVar, int i) {
        wie wieVar2;
        egg eggVar;
        kgg kggVar;
        boolean z;
        PlaybackException playbackException = q4cVar.a;
        int i2 = q4cVar.b;
        wie wieVar3 = q4cVar.c;
        c3c c3cVar = q4cVar.g;
        int i3 = q4cVar.h;
        boolean z2 = q4cVar.i;
        int i4 = q4cVar.k;
        sch schVar = q4cVar.l;
        w19 w19Var = q4cVar.m;
        float f = q4cVar.n;
        k20 k20Var = q4cVar.o;
        ib4 ib4Var = q4cVar.p;
        mv4 mv4Var = q4cVar.q;
        int i5 = q4cVar.r;
        boolean z3 = q4cVar.s;
        boolean z4 = q4cVar.t;
        int i6 = q4cVar.u;
        boolean z5 = q4cVar.v;
        boolean z6 = q4cVar.w;
        int i7 = q4cVar.x;
        int i8 = q4cVar.y;
        w19 w19Var2 = q4cVar.z;
        long j = q4cVar.A;
        long j2 = q4cVar.B;
        long j3 = q4cVar.C;
        kgg kggVar2 = q4cVar.D;
        egg eggVar2 = q4cVar.E;
        t3c t3cVar2 = wieVar3.a;
        if (!s9gVar.p()) {
            wieVar2 = wieVar;
            eggVar = eggVar2;
            kggVar = kggVar2;
            if (wieVar2.a.b >= s9gVar.o()) {
                z = false;
            }
            hsi.g(z);
            return new q4c(playbackException, i2, wieVar2, t3cVar2, t3cVar, i, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
        }
        wieVar2 = wieVar;
        eggVar = eggVar2;
        kggVar = kggVar2;
        z = true;
        hsi.g(z);
        return new q4c(playbackException, i2, wieVar2, t3cVar2, t3cVar, i, c3cVar, i3, z2, schVar, s9gVar, i4, w19Var, f, k20Var, ib4Var, mv4Var, i5, z3, z4, i6, i7, i8, z5, z6, w19Var2, j, j2, j3, kggVar, eggVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zjd W(defpackage.zjd r2, java.util.List r3, android.os.Bundle r4, defpackage.bie r5, defpackage.o3c r6) {
        /*
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lb
            zjd r2 = defpackage.bg3.c(r3, r5, r6)
            return r2
        Lb:
            java.lang.String r3 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"
            boolean r3 = r4.getBoolean(r3)
            r5 = 0
            r0 = 1
            if (r3 != 0) goto L25
            r3 = 6
            r1 = 7
            int[] r3 = new int[]{r3, r1}
            a26 r1 = r6.a
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L25
            r3 = r0
            goto L26
        L25:
            r3 = r5
        L26:
            java.lang.String r1 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"
            boolean r4 = r4.getBoolean(r1)
            if (r4 != 0) goto L3f
            r4 = 8
            r1 = 9
            int[] r4 = new int[]{r4, r1}
            a26 r6 = r6.a
            boolean r4 = r6.a(r4)
            if (r4 != 0) goto L3f
            r5 = r0
        L3f:
            zjd r2 = defpackage.bg3.e(r2, r3, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly8.W(zjd, java.util.List, android.os.Bundle, bie, o3c):zjd");
    }

    public static zjd X(List list, List list2, bie bieVar, o3c o3cVar, Bundle bundle) {
        if (list.isEmpty()) {
            list = bg3.f(list2, o3cVar, bundle);
        }
        return bg3.c(list, bieVar, o3cVar);
    }

    public static o3c m(o3c o3cVar, o3c o3cVar2) {
        o3c o3cVarD = rei.d(o3cVar, o3cVar2);
        if (o3cVarD.a(32)) {
            return o3cVarD;
        }
        y16 y16Var = new y16(1);
        y16Var.b(o3cVarD.a);
        y16Var.a(32);
        return new o3c(y16Var.e());
    }

    public static n9g o(ArrayList arrayList, ArrayList arrayList2) {
        tg7 tg7Var = new tg7(4);
        tg7Var.d(arrayList);
        zjd zjdVarI = tg7Var.i();
        tg7 tg7Var2 = new tg7(4);
        tg7Var2.d(arrayList2);
        zjd zjdVarI2 = tg7Var2.i();
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new n9g(zjdVarI, zjdVarI2, iArr);
    }

    public static int z(q4c q4cVar) {
        int i = q4cVar.c.a.b;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.ox8
    public final void A(final int i, final long j, final List list) {
        if (R(20)) {
            w(new jy8() { // from class: by8
                @Override // defpackage.jy8
                public final void d(eb7 eb7Var, int i2) {
                    vy8 vy8Var = this.a.c;
                    tg7 tg7VarI = wg7.i();
                    int i3 = 0;
                    while (true) {
                        List list2 = list;
                        if (i3 >= list2.size()) {
                            eb7Var.p(vy8Var, i2, new iw0(tg7VarI.i()), i, j);
                            return;
                        } else {
                            tg7VarI.a(((k09) list2.get(i3)).d(true));
                            i3++;
                        }
                    }
                }
            });
            Z(list, i, j, false);
        }
    }

    public final y21 B(s9g s9gVar, int i, long j) {
        int i2;
        if (s9gVar.p()) {
            return null;
        }
        q9g q9gVar = new q9g();
        m9g m9gVar = new m9g();
        if (i == -1 || i >= s9gVar.o()) {
            i = s9gVar.a(this.o.i);
            j = zxg.m0(s9gVar.m(i, q9gVar, 0L).l);
        }
        long jU = zxg.U(j);
        hsi.c(i, s9gVar.o());
        s9gVar.n(i, q9gVar);
        if (jU == -9223372036854775807L) {
            jU = q9gVar.l;
            if (jU == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = q9gVar.n;
        s9gVar.f(i3, m9gVar, false);
        do {
            i2 = i3;
            if (i2 >= q9gVar.o || m9gVar.e == jU) {
                break;
            }
            i3 = i2 + 1;
        } while (s9gVar.f(i3, m9gVar, false).e <= jU);
        s9gVar.f(i2, m9gVar, false);
        return new y21(jU - m9gVar.e, i2, 6, false);
    }

    @Override // defpackage.ox8
    public final void C(List list) {
        if (R(20)) {
            w(new dq4(this, 14, list));
            Z(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.ox8
    public final o3c D() {
        return this.x;
    }

    @Override // defpackage.ox8
    public final bie E() {
        return this.u;
    }

    @Override // defpackage.ox8
    public final wg7 F() {
        return this.s;
    }

    @Override // defpackage.ox8
    public final void G(r3c r3cVar) {
        this.h.a(r3cVar);
    }

    @Override // defpackage.ox8
    public final int H() {
        if (this.o.j.p()) {
            return -1;
        }
        q4c q4cVar = this.o;
        s9g s9gVar = q4cVar.j;
        int iZ = z(q4cVar);
        q4c q4cVar2 = this.o;
        int i = q4cVar2.h;
        if (i == 1) {
            i = 0;
        }
        return s9gVar.k(iZ, i, q4cVar2.i);
    }

    @Override // defpackage.ox8
    public final void I(int i) {
        s9g s9gVar;
        int i2;
        int i3;
        int i4;
        q4c q4cVarS;
        int i5;
        boolean z;
        s9g s9gVar2;
        if (R(20)) {
            hsi.b(i >= 0);
            w(new ad0(this, i, 7));
            int iO = this.o.j.o();
            int iMin = Math.min(i + 1, iO);
            if (i >= iO || i == iMin || iO == 0) {
                return;
            }
            boolean z2 = z(this.o) >= i && z(this.o) < iMin;
            q4c q4cVar = this.o;
            long jE = e();
            long jP = p();
            s9g s9gVar3 = q4cVar.j;
            boolean z3 = q4cVar.i;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i6 = 0;
            while (true) {
                s9gVar = s9gVar3;
                if (i6 >= s9gVar3.o()) {
                    break;
                }
                if (i6 < i || i6 >= iMin) {
                    z = z2;
                    s9gVar2 = s9gVar;
                    arrayList.add(s9gVar2.m(i6, new q9g(), 0L));
                } else {
                    z = z2;
                    s9gVar2 = s9gVar;
                }
                i6++;
                s9gVar3 = s9gVar2;
                z2 = z;
            }
            boolean z4 = z2;
            int i7 = 0;
            while (i7 < arrayList.size()) {
                q9g q9gVar = (q9g) arrayList.get(i7);
                int i8 = q9gVar.n;
                int i9 = q9gVar.o;
                long j = jE;
                if (i8 == -1 || i9 == -1) {
                    q9gVar.n = arrayList2.size();
                    q9gVar.o = arrayList2.size();
                    m9g m9gVar = new m9g();
                    i5 = i7;
                    m9gVar.i(null, null, i5, -9223372036854775807L, 0L, v8.f, true);
                    arrayList2.add(m9gVar);
                } else {
                    q9gVar.n = arrayList2.size();
                    q9gVar.o = (i9 - i8) + arrayList2.size();
                    while (i8 <= i9) {
                        m9g m9gVar2 = new m9g();
                        s9gVar.f(i8, m9gVar2, false);
                        m9gVar2.c = i7;
                        arrayList2.add(m9gVar2);
                        i8++;
                    }
                    i5 = i7;
                }
                i7 = i5 + 1;
                jE = j;
            }
            long j2 = jE;
            n9g n9gVarO = o(arrayList, arrayList2);
            int iZ = z(q4cVar);
            int i10 = q4cVar.c.a.e;
            q9g q9gVar2 = new q9g();
            boolean z5 = iZ >= i && iZ < iMin;
            if (n9gVarO.p()) {
                i4 = -1;
                i2 = 1;
                i3 = 0;
            } else if (z5) {
                int i11 = q4cVar.h;
                int iO2 = s9gVar.o();
                int iA = iZ;
                int i12 = 0;
                i2 = 1;
                while (i12 < iO2) {
                    iA = s9gVar.e(iA, i11, z3);
                    int i13 = i11;
                    if (iA == -1) {
                        break;
                    }
                    if (iA < i || iA >= iMin) {
                        break;
                    }
                    i12++;
                    i11 = i13;
                }
                iA = -1;
                if (iA == -1) {
                    iA = n9gVarO.a(z3);
                } else if (iA >= iMin) {
                    iA -= iMin - i;
                }
                n9gVarO.m(iA, q9gVar2, 0L);
                i3 = q9gVar2.n;
                i4 = iA;
            } else {
                i2 = 1;
                if (iZ >= iMin) {
                    int i14 = iZ - (iMin - i);
                    if (i10 != -1) {
                        for (int i15 = i; i15 < iMin; i15++) {
                            q9g q9gVar3 = new q9g();
                            s9gVar.n(i15, q9gVar3);
                            i10 -= (q9gVar3.o - q9gVar3.n) + 1;
                        }
                    }
                    int i16 = i10;
                    i4 = i14;
                    i3 = i16;
                } else {
                    i3 = i10;
                    i4 = iZ;
                }
            }
            if (!z5) {
                q4cVarS = S(q4cVar, n9gVarO, i4, i3, j2, jP, 4);
            } else if (i4 == -1) {
                q4cVarS = T(q4cVar, n9gVarO, wie.k, wie.l, 4);
            } else {
                q9g q9gVar4 = new q9g();
                n9gVarO.m(i4, q9gVar4, 0L);
                long jM0 = zxg.m0(q9gVar4.l);
                long jM02 = zxg.m0(q9gVar4.m);
                t3c t3cVar = new t3c(null, i4, q9gVar4.c, null, i3, jM0, jM0, -1, -1);
                q4cVarS = T(q4cVar, n9gVarO, t3cVar, new wie(t3cVar, false, SystemClock.elapsedRealtime(), jM02, jM0, rei.b(jM0, jM02), 0L, -9223372036854775807L, jM02, jM0), 4);
            }
            int i17 = q4cVarS.y;
            if (i17 != i2 && i17 != 4 && i < iMin && iMin == s9gVar.o() && iZ >= i) {
                q4cVarS = q4cVarS.e(4, null);
            }
            int i18 = this.o.c.a.b;
            boolean z6 = i18 >= i && i18 < iMin;
            b0(q4cVarS, 0, null, z4 ? 4 : null, z6 ? 3 : null);
        }
    }

    @Override // defpackage.ox8
    public final Bundle J() {
        return this.f;
    }

    @Override // defpackage.ox8
    public final long K() {
        return this.o.c.e;
    }

    @Override // defpackage.ox8
    public final int L() {
        if (this.o.j.p()) {
            return -1;
        }
        q4c q4cVar = this.o;
        s9g s9gVar = q4cVar.j;
        int iZ = z(q4cVar);
        q4c q4cVar2 = this.o;
        int i = q4cVar2.h;
        if (i == 1) {
            i = 0;
        }
        return s9gVar.e(iZ, i, q4cVar2.i);
    }

    @Override // defpackage.ox8
    public final void M(k20 k20Var, boolean z) {
        if (R(35)) {
            w(new ys5(this, k20Var, z, 1));
            if (this.o.o.equals(k20Var)) {
                return;
            }
            this.o = this.o.a(k20Var);
            tl5 tl5Var = new tl5(k20Var, 1);
            ua8 ua8Var = this.h;
            ua8Var.c(20, tl5Var);
            ua8Var.b();
        }
    }

    @Override // defpackage.ox8
    public final void N(r3c r3cVar) {
        this.h.e(r3cVar);
    }

    @Override // defpackage.ox8
    public final void O(k09 k09Var) {
        if (R(31)) {
            w(new cy8(this, k09Var, 0));
            Z(Collections.singletonList(k09Var), -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.ox8
    public final ha8 P(aie aieVar) {
        eb7 eb7Var;
        Bundle bundle = Bundle.EMPTY;
        dq4 dq4Var = new dq4(this, aieVar);
        hsi.b(aieVar.a == 0);
        if (this.u.a.contains(aieVar)) {
            eb7Var = this.y;
        } else {
            a8i.l("MCImplBase", "Controller isn't allowed to call custom session command:" + aieVar.b);
            eb7Var = null;
        }
        return r(eb7Var, dq4Var, false);
    }

    @Override // defpackage.ox8
    public final w19 Q() {
        return this.o.z;
    }

    public final boolean R(int i) {
        if (this.x.a(i)) {
            return true;
        }
        wy1.p(i, "Controller isn't allowed to call command= ", "MCImplBase");
        return false;
    }

    public final void U(q4c q4cVar, final q4c q4cVar2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        ua8 ua8Var = this.h;
        if (num != null) {
            final int i = 0;
            ua8Var.c(0, new pa8() { // from class: dy8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i) {
                        case 0:
                            r3cVar.n0(q4cVar2.j, num.intValue());
                            break;
                        case 1:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.t(q4cVar3.d, q4cVar3.e, num.intValue());
                            break;
                        default:
                            r3cVar.i(num.intValue(), q4cVar2.t);
                            break;
                    }
                }
            });
        }
        if (num3 != null) {
            final int i2 = 1;
            ua8Var.c(11, new pa8() { // from class: dy8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i2) {
                        case 0:
                            r3cVar.n0(q4cVar2.j, num3.intValue());
                            break;
                        case 1:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.t(q4cVar3.d, q4cVar3.e, num3.intValue());
                            break;
                        default:
                            r3cVar.i(num3.intValue(), q4cVar2.t);
                            break;
                    }
                }
            });
        }
        k09 k09VarN = q4cVar2.n();
        if (num4 != null) {
            ua8Var.c(1, new dq4(k09VarN, 13, num4));
        }
        PlaybackException playbackException = q4cVar.a;
        PlaybackException playbackException2 = q4cVar2.a;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            ua8Var.c(10, new fy8(0, playbackException2));
            if (playbackException2 != null) {
                ua8Var.c(10, new fy8(1, playbackException2));
            }
        }
        if (!q4cVar.D.equals(q4cVar2.D)) {
            final int i3 = 17;
            ua8Var.c(2, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i3) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (!q4cVar.z.equals(q4cVar2.z)) {
            final int i4 = 18;
            ua8Var.c(14, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i4) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (q4cVar.w != q4cVar2.w) {
            final int i5 = 19;
            ua8Var.c(3, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i5) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (q4cVar.y != q4cVar2.y) {
            final int i6 = 20;
            ua8Var.c(4, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i6) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (num2 != null) {
            final int i7 = 2;
            ua8Var.c(5, new pa8() { // from class: dy8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i7) {
                        case 0:
                            r3cVar.n0(q4cVar2.j, num2.intValue());
                            break;
                        case 1:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.t(q4cVar3.d, q4cVar3.e, num2.intValue());
                            break;
                        default:
                            r3cVar.i(num2.intValue(), q4cVar2.t);
                            break;
                    }
                }
            });
        }
        if (q4cVar.x != q4cVar2.x) {
            final int i8 = 0;
            ua8Var.c(6, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i8) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (q4cVar.v != q4cVar2.v) {
            final int i9 = 1;
            ua8Var.c(7, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i9) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (!q4cVar.g.equals(q4cVar2.g)) {
            final int i10 = 2;
            ua8Var.c(12, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i10) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (q4cVar.h != q4cVar2.h) {
            final int i11 = 3;
            ua8Var.c(8, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i11) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (q4cVar.i != q4cVar2.i) {
            final int i12 = 4;
            ua8Var.c(9, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i12) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (!q4cVar.m.equals(q4cVar2.m)) {
            final int i13 = 5;
            ua8Var.c(15, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i13) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (q4cVar.n != q4cVar2.n) {
            final int i14 = 6;
            ua8Var.c(22, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i14) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (!q4cVar.o.equals(q4cVar2.o)) {
            final int i15 = 7;
            ua8Var.c(20, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i15) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (!q4cVar.p.a.equals(q4cVar2.p.a)) {
            final int i16 = 8;
            ua8Var.c(27, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i16) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
            final int i17 = 9;
            ua8Var.c(27, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i17) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (!q4cVar.q.equals(q4cVar2.q)) {
            final int i18 = 10;
            ua8Var.c(29, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i18) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (q4cVar.r != q4cVar2.r || q4cVar.s != q4cVar2.s) {
            final int i19 = 11;
            ua8Var.c(30, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i19) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (!q4cVar.l.equals(q4cVar2.l)) {
            final int i20 = 12;
            ua8Var.c(25, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i20) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (q4cVar.A != q4cVar2.A) {
            final int i21 = 13;
            ua8Var.c(16, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i21) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (q4cVar.B != q4cVar2.B) {
            final int i22 = 14;
            ua8Var.c(17, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i22) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (q4cVar.C != q4cVar2.C) {
            final int i23 = 15;
            ua8Var.c(18, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i23) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        if (!q4cVar.E.equals(q4cVar2.E)) {
            final int i24 = 16;
            ua8Var.c(19, new pa8() { // from class: ey8
                @Override // defpackage.pa8, defpackage.oa8
                public final void invoke(Object obj) {
                    r3c r3cVar = (r3c) obj;
                    switch (i24) {
                        case 0:
                            r3cVar.f(q4cVar2.x);
                            break;
                        case 1:
                            r3cVar.q(q4cVar2.v);
                            break;
                        case 2:
                            r3cVar.A0(q4cVar2.g);
                            break;
                        case 3:
                            r3cVar.onRepeatModeChanged(q4cVar2.h);
                            break;
                        case 4:
                            r3cVar.T(q4cVar2.i);
                            break;
                        case 5:
                            r3cVar.j0(q4cVar2.m);
                            break;
                        case 6:
                            r3cVar.j(q4cVar2.n);
                            break;
                        case 7:
                            r3cVar.y(q4cVar2.o);
                            break;
                        case 8:
                            r3cVar.n(q4cVar2.p.a);
                            break;
                        case 9:
                            r3cVar.W(q4cVar2.p);
                            break;
                        case 10:
                            r3cVar.E0(q4cVar2.q);
                            break;
                        case 11:
                            q4c q4cVar3 = q4cVar2;
                            r3cVar.l(q4cVar3.r, q4cVar3.s);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            r3cVar.g(q4cVar2.l);
                            break;
                        case 13:
                            r3cVar.h0(q4cVar2.A);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            r3cVar.k0(q4cVar2.B);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            r3cVar.F0(q4cVar2.C);
                            break;
                        case 16:
                            r3cVar.A(q4cVar2.E);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            r3cVar.e0(q4cVar2.D);
                            break;
                        case 18:
                            r3cVar.i0(q4cVar2.z);
                            break;
                        case 19:
                            r3cVar.h(q4cVar2.w);
                            break;
                        default:
                            r3cVar.k(q4cVar2.y);
                            break;
                    }
                }
            });
        }
        ua8Var.b();
    }

    public final void V(q4c q4cVar, o4c o4cVar) {
        if (isConnected()) {
            q4c q4cVar2 = this.C;
            if (q4cVar2 != null) {
                this.C = rei.f(q4cVar2, q4cVar, o4cVar, this.x);
                if (!this.j.isEmpty()) {
                    return;
                }
                q4cVar = this.C;
                o4cVar = o4c.c;
                this.C = null;
            }
            q4c q4cVar3 = this.o;
            q4c q4cVarF = rei.f(q4cVar3, q4cVar, o4cVar, this.x);
            this.o = q4cVarF;
            Integer numValueOf = (q4cVar3.d.equals(q4cVar.d) && q4cVar3.e.equals(q4cVar.e)) ? null : Integer.valueOf(q4cVarF.f);
            Integer numValueOf2 = !Objects.equals(q4cVar3.n(), q4cVarF.n()) ? Integer.valueOf(q4cVarF.b) : null;
            Integer numValueOf3 = !q4cVar3.j.equals(q4cVarF.j) ? Integer.valueOf(q4cVarF.k) : null;
            int i = q4cVar3.u;
            int i2 = q4cVarF.u;
            U(q4cVar3, q4cVarF, numValueOf3, (i == i2 && q4cVar3.t == q4cVarF.t) ? null : Integer.valueOf(i2), numValueOf, numValueOf2);
        }
    }

    public final void Y(int i, long j) {
        int i2;
        int i3;
        q4c q4cVarT;
        s9g s9gVar = this.o.j;
        if ((s9gVar.p() || i < s9gVar.o()) && !f()) {
            q4c q4cVar = this.o;
            q4c q4cVarE = q4cVar.e(q4cVar.y == 1 ? 1 : 2, q4cVar.a);
            y21 y21VarB = B(s9gVar, i, j);
            if (y21VarB == null) {
                long j2 = 0;
                long j3 = j != -9223372036854775807L ? j : 0L;
                if (j != -9223372036854775807L) {
                    j2 = j;
                }
                i2 = 1;
                i3 = 2;
                t3c t3cVar = new t3c(null, i, null, null, i, j3, j2, -1, -1);
                q4c q4cVar2 = this.o;
                s9g s9gVar2 = q4cVar2.j;
                boolean z = this.o.c.b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                wie wieVar = this.o.c;
                q4cVarT = T(q4cVar2, s9gVar2, t3cVar, new wie(t3cVar, z, jElapsedRealtime, wieVar.d, j == -9223372036854775807L ? 0L : j, 0, 0L, wieVar.h, wieVar.i, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                wie wieVar2 = q4cVarE.c;
                t3c t3cVar2 = wieVar2.a;
                t3c t3cVar3 = wieVar2.a;
                int i4 = t3cVar2.e;
                int i5 = y21VarB.b;
                m9g m9gVar = new m9g();
                s9gVar.f(i4, m9gVar, false);
                m9g m9gVar2 = new m9g();
                s9gVar.f(i5, m9gVar2, false);
                boolean z2 = i4 != i5;
                long j4 = y21VarB.c;
                long jU = zxg.U(e()) - m9gVar.e;
                if (z2 || j4 != jU) {
                    hsi.g(t3cVar3.h == -1);
                    t3c t3cVar4 = new t3c(null, m9gVar.c, t3cVar3.c, null, i4, zxg.m0(m9gVar.e + jU), zxg.m0(m9gVar.e + jU), -1, -1);
                    s9gVar.f(i5, m9gVar2, false);
                    q9g q9gVar = new q9g();
                    s9gVar.n(m9gVar2.c, q9gVar);
                    long jM0 = zxg.m0(m9gVar2.e + j4);
                    t3c t3cVar5 = new t3c(null, m9gVar2.c, q9gVar.c, null, i5, jM0, jM0, -1, -1);
                    q4c q4cVarF = q4cVarE.f(t3cVar4, t3cVar5, 1);
                    if (z2 || j4 < jU) {
                        q4cVarE = q4cVarF.g(new wie(t3cVar5, false, SystemClock.elapsedRealtime(), zxg.m0(q9gVar.m), jM0, rei.b(jM0, zxg.m0(q9gVar.m)), 0L, -9223372036854775807L, -9223372036854775807L, jM0));
                    } else {
                        long jMax = Math.max(0L, zxg.U(q4cVarF.c.g) - (j4 - jU));
                        long jM02 = zxg.m0(m9gVar2.e + j4 + jMax);
                        q4cVarE = q4cVarF.g(new wie(t3cVar5, false, SystemClock.elapsedRealtime(), zxg.m0(q9gVar.m), jM02, rei.b(jM02, zxg.m0(q9gVar.m)), zxg.m0(jMax), -9223372036854775807L, -9223372036854775807L, jM02));
                    }
                }
                q4cVarT = q4cVarE;
            }
            wie wieVar3 = q4cVarT.c;
            int i6 = (this.o.j.p() || wieVar3.a.b == this.o.c.a.b) ? 0 : i2;
            if (i6 == 0 && wieVar3.a.f == this.o.c.a.f) {
                return;
            }
            b0(q4cVarT, null, null, Integer.valueOf(i2), i6 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    public final void Z(List list, int i, long j, boolean z) {
        int iA;
        boolean z2;
        long j2;
        t3c t3cVar;
        wie wieVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            k09 k09Var = (k09) list.get(i2);
            hh7 hh7Var = i28.a;
            q9g q9gVar = new q9g();
            int i3 = i2;
            q9gVar.b(0, k09Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i3, i3, 0L);
            arrayList.add(q9gVar);
            m9g m9gVar = new m9g();
            m9gVar.i(null, null, i3, -9223372036854775807L, 0L, v8.f, true);
            arrayList2.add(m9gVar);
            i2 = i3 + 1;
        }
        n9g n9gVarO = o(arrayList, arrayList2);
        wg7 wg7Var = n9gVarO.e;
        if (!n9gVarO.p() && i >= wg7Var.size()) {
            throw new IllegalSeekPositionException();
        }
        if (z) {
            iA = n9gVarO.a(this.o.i);
            z2 = false;
            j2 = -9223372036854775807L;
        } else if (i == -1) {
            t3c t3cVar2 = this.o.c.a;
            int i4 = t3cVar2.b;
            long j3 = t3cVar2.f;
            if (n9gVarO.p() || i4 < wg7Var.size()) {
                z2 = false;
                j2 = j3;
                iA = i4;
            } else {
                iA = n9gVarO.a(this.o.i);
                j2 = -9223372036854775807L;
                z2 = true;
            }
        } else {
            iA = i;
            z2 = false;
            j2 = j;
        }
        y21 y21VarB = B(n9gVarO, iA, j2);
        if (y21VarB == null) {
            t3cVar = new t3c(null, iA, null, null, iA, j2 == -9223372036854775807L ? 0L : j2, j2 == -9223372036854775807L ? 0L : j2, -1, -1);
            wieVar = new wie(t3cVar, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2, 0, 0L, -9223372036854775807L, -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2);
        } else {
            long j4 = y21VarB.c;
            t3cVar = new t3c(null, iA, (k09) list.get(iA), null, y21VarB.b, zxg.m0(j4), zxg.m0(j4), -1, -1);
            wieVar = new wie(t3cVar, false, SystemClock.elapsedRealtime(), -9223372036854775807L, zxg.m0(j4), 0, 0L, -9223372036854775807L, -9223372036854775807L, zxg.m0(j4));
        }
        q4c q4cVarT = T(this.o, n9gVarO, t3cVar, wieVar, 4);
        int i5 = q4cVarT.y;
        if (iA != -1 && i5 != 1) {
            i5 = (n9gVarO.p() || z2) ? 4 : 2;
        }
        q4c q4cVarE = q4cVarT.e(i5, this.o.a);
        b0(q4cVarE, 0, null, !this.o.j.p() ? 4 : null, (this.o.j.p() && q4cVarE.j.p()) ? null : 3);
    }

    @Override // defpackage.ox8
    public final float a() {
        return this.o.n;
    }

    public final void a0(boolean z) {
        q4c q4cVar = this.o;
        int i = q4cVar.x;
        int i2 = i == 1 ? 0 : i;
        if (q4cVar.t == z && i == i2) {
            return;
        }
        this.A = rei.c(q4cVar, this.A, this.B, this.a.X);
        this.B = SystemClock.elapsedRealtime();
        b0(this.o.c(1, i2, z), null, 1, null, null);
    }

    @Override // defpackage.ox8
    public final void b(float f) {
        if (R(24)) {
            w(new ay8(this, f, 0));
            q4c q4cVar = this.o;
            if (q4cVar.n != f) {
                this.o = q4cVar.k(f);
                ll5 ll5Var = new ll5(2, f);
                ua8 ua8Var = this.h;
                ua8Var.c(22, ll5Var);
                ua8Var.b();
            }
        }
    }

    public final void b0(q4c q4cVar, Integer num, Integer num2, Integer num3, Integer num4) {
        q4c q4cVar2 = this.o;
        this.o = q4cVar;
        U(q4cVar2, q4cVar, num, num2, num3, num4);
    }

    @Override // defpackage.ox8
    public final c3c c() {
        return this.o.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [eb7] */
    @Override // defpackage.ox8
    public final void connect() {
        cb7 cb7Var;
        tje tjeVar = this.e;
        sje sjeVar = tjeVar.a;
        sje sjeVar2 = tjeVar.a;
        int type = sjeVar.getType();
        px8 px8Var = this.a;
        Context context = this.d;
        Bundle bundle = this.f;
        if (type == 0) {
            this.m = null;
            Object objB = sjeVar2.b();
            hsi.h(objB);
            IBinder iBinder = (IBinder) objB;
            int i = z89.h;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof eb7)) {
                cb7 cb7Var2 = new cb7();
                cb7Var2.c = iBinder;
                cb7Var = cb7Var2;
            } else {
                cb7Var = (eb7) iInterfaceQueryLocalInterface;
            }
            int iV = this.b.v();
            String packageName = context.getPackageName();
            int iMyPid = Process.myPid();
            px8Var.getClass();
            try {
                cb7Var.K(this.c, iV, new ds3(packageName, iMyPid, bundle).b());
                return;
            } catch (RemoteException e) {
                a8i.m("MCImplBase", "Failed to call connection request.", e);
            }
        } else {
            this.m = new ky8(this, bundle);
            int i2 = Build.VERSION.SDK_INT >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(sjeVar2.getPackageName(), sjeVar2.c());
            try {
                if (context.bindService(intent, this.m, i2)) {
                    return;
                }
                a8i.l("MCImplBase", "bind to " + tjeVar + " failed");
            } catch (SecurityException e2) {
                a8i.m("MCImplBase", "bind to " + tjeVar + " not allowed", e2);
            }
        }
        Objects.requireNonNull(px8Var);
        px8Var.z(new gq5(15, px8Var));
    }

    @Override // defpackage.ox8
    public final boolean d() {
        return this.o.v;
    }

    @Override // defpackage.ox8
    public final long e() {
        long jC = rei.c(this.o, this.A, this.B, this.a.X);
        this.A = jC;
        return jC;
    }

    @Override // defpackage.ox8
    public final boolean f() {
        return this.o.c.b;
    }

    @Override // defpackage.ox8
    public final long g() {
        return this.o.c.g;
    }

    @Override // defpackage.ox8
    public final long getDuration() {
        return this.o.c.d;
    }

    @Override // defpackage.ox8
    public final int getPlaybackState() {
        return this.o.y;
    }

    @Override // defpackage.ox8
    public final int getRepeatMode() {
        return this.o.h;
    }

    @Override // defpackage.ox8
    public final void h(k09 k09Var, long j) {
        if (R(31)) {
            w(new pv3(this, k09Var, j, 5));
            Z(Collections.singletonList(k09Var), -1, j, false);
        }
    }

    @Override // defpackage.ox8
    public final boolean i() {
        return this.o.t;
    }

    @Override // defpackage.ox8
    public final boolean isConnected() {
        return this.y != null;
    }

    @Override // defpackage.ox8
    public final int j() {
        return this.o.c.a.e;
    }

    @Override // defpackage.ox8
    public final void k() {
        if (R(4)) {
            w(new zx8(this, 2));
            Y(z(this.o), -9223372036854775807L);
        }
    }

    @Override // defpackage.ox8
    public final int l() {
        return this.o.c.a.i;
    }

    @Override // defpackage.ox8
    public final PlaybackException n() {
        return this.o.a;
    }

    @Override // defpackage.ox8
    public final long p() {
        wie wieVar = this.o.c;
        return !wieVar.b ? e() : wieVar.a.g;
    }

    @Override // defpackage.ox8
    public final void pause() {
        if (R(1)) {
            w(new zx8(this, 6));
            a0(false);
        }
    }

    @Override // defpackage.ox8
    public final void play() {
        MediaController mediaController;
        if (!R(1)) {
            a8i.l("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.z) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        w(new zx8(this, 7));
        a0(true);
    }

    @Override // defpackage.ox8
    public final void prepare() {
        if (R(2)) {
            w(new zx8(this, 1));
            q4c q4cVar = this.o;
            if (q4cVar.y == 1) {
                b0(q4cVar.e(q4cVar.j.p() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // defpackage.ox8
    public final kgg q() {
        return this.o.D;
    }

    public final ha8 r(eb7 eb7Var, jy8 jy8Var, boolean z) {
        if (eb7Var == null) {
            return a6a.c(new yie(-4));
        }
        yie yieVar = new yie(1);
        dy dyVar = this.b;
        kee keeVarS = dyVar.s(yieVar);
        int i = keeVarS.Z;
        xs xsVar = this.j;
        if (z) {
            if (xsVar.isEmpty()) {
                this.C = this.o;
            }
            xsVar.add(Integer.valueOf(i));
        }
        try {
            jy8Var.d(eb7Var, i);
            return keeVarS;
        } catch (RemoteException e) {
            a8i.m("MCImplBase", "Cannot connect to the service or the session is gone", e);
            xsVar.remove(Integer.valueOf(i));
            dyVar.A(i, new yie(-100));
            return keeVarS;
        }
    }

    @Override // defpackage.ox8
    public final void release() {
        eb7 eb7Var = this.y;
        if (this.n) {
            return;
        }
        this.n = true;
        this.l = null;
        this.k.removeCallbacksAndMessages(null);
        xt4 xt4Var = this.i;
        Handler handler = (Handler) xt4Var.b;
        if (handler.hasMessages(1)) {
            try {
                ly8 ly8Var = (ly8) xt4Var.c;
                ly8Var.y.M(ly8Var.c);
            } catch (RemoteException unused) {
                a8i.l("MCImplBase", "Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.y = null;
        if (eb7Var != null) {
            int iV = this.b.v();
            try {
                eb7Var.asBinder().unlinkToDeath(this.g, 0);
                eb7Var.G(this.c, iV);
            } catch (RemoteException unused2) {
            }
        }
        this.h.d();
        dy dyVar = this.b;
        gy8 gy8Var = new gy8(this, 0);
        synchronized (dyVar.d) {
            try {
                Handler handlerN = zxg.n(null);
                dyVar.Y = handlerN;
                dyVar.X = gy8Var;
                if (((us) dyVar.o).isEmpty()) {
                    dyVar.release();
                } else {
                    handlerN.postDelayed(new bee(2, dyVar), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ox8
    public final int s() {
        return this.o.c.a.h;
    }

    @Override // defpackage.ox8
    public final void seekTo(long j) {
        if (R(5)) {
            w(new ny1(this, j, 6));
            Y(z(this.o), j);
        }
    }

    @Override // defpackage.ox8
    public final void setPlaybackSpeed(float f) {
        if (R(13)) {
            w(new ay8(this, f, 1));
            c3c c3cVar = this.o.g;
            if (c3cVar.a != f) {
                c3c c3cVar2 = new c3c(f, c3cVar.b);
                this.o = this.o.d(c3cVar2);
                hy8 hy8Var = new hy8(c3cVar2);
                ua8 ua8Var = this.h;
                ua8Var.c(12, hy8Var);
                ua8Var.b();
            }
        }
    }

    @Override // defpackage.ox8
    public final void stop() {
        if (R(3)) {
            w(new zx8(this, 0));
            q4c q4cVar = this.o;
            wie wieVar = this.o.c;
            t3c t3cVar = wieVar.a;
            boolean z = wieVar.b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            wie wieVar2 = this.o.c;
            long j = wieVar2.d;
            long j2 = wieVar2.a.f;
            int iB = rei.b(j2, j);
            wie wieVar3 = this.o.c;
            q4c q4cVarG = q4cVar.g(new wie(t3cVar, z, jElapsedRealtime, j, j2, iB, 0L, wieVar3.h, wieVar3.i, wieVar3.a.f));
            this.o = q4cVarG;
            if (q4cVarG.y != 1) {
                this.o = q4cVarG.e(1, q4cVarG.a);
                zb8 zb8Var = new zb8(23);
                ua8 ua8Var = this.h;
                ua8Var.c(4, zb8Var);
                ua8Var.b();
            }
        }
    }

    @Override // defpackage.ox8
    public final int t() {
        return z(this.o);
    }

    @Override // defpackage.ox8
    public final int u() {
        return this.o.x;
    }

    @Override // defpackage.ox8
    public final s9g v() {
        return this.o.j;
    }

    public final void w(jy8 jy8Var) {
        xt4 xt4Var = this.i;
        Handler handler = (Handler) xt4Var.b;
        if (((ly8) xt4Var.c).y != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        r(this.y, jy8Var, true);
    }

    @Override // defpackage.ox8
    public final void x(k09 k09Var) {
        if (R(31)) {
            w(new cy8(this, k09Var, 1));
            Z(Collections.singletonList(k09Var), -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.ox8
    public final boolean y() {
        return this.o.i;
    }
}
