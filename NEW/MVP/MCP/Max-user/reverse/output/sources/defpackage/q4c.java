package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Arrays;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class q4c {
    public static final q4c F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public final long A;
    public final long B;
    public final long C;
    public final kgg D;
    public final egg E;
    public final PlaybackException a;
    public final int b;
    public final wie c;
    public final t3c d;
    public final t3c e;
    public final int f;
    public final c3c g;
    public final int h;
    public final boolean i;
    public final s9g j;
    public final int k;
    public final sch l;
    public final w19 m;
    public final float n;
    public final k20 o;
    public final ib4 p;
    public final mv4 q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final w19 z;

    static {
        wie wieVar = wie.l;
        t3c t3cVar = wie.k;
        c3c c3cVar = c3c.d;
        sch schVar = sch.d;
        k9g k9gVar = s9g.a;
        w19 w19Var = w19.K;
        F = new q4c(null, 0, wieVar, t3cVar, t3cVar, 0, c3cVar, 0, false, schVar, k9gVar, 0, w19Var, 1.0f, k20.h, ib4.d, mv4.e, 0, false, false, 1, 0, 1, false, false, w19Var, MultiFileUploader.UPLOAD_NEXT_INTERVAL, BuildConfig.SILENCE_TIME_TO_UPLOAD, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, kgg.b, egg.F);
        String str = zxg.a;
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = Integer.toString(8, 36);
        O = Integer.toString(9, 36);
        P = Integer.toString(10, 36);
        Q = Integer.toString(11, 36);
        R = Integer.toString(12, 36);
        S = Integer.toString(13, 36);
        T = Integer.toString(14, 36);
        U = Integer.toString(15, 36);
        V = Integer.toString(16, 36);
        W = Integer.toString(17, 36);
        X = Integer.toString(18, 36);
        Y = Integer.toString(19, 36);
        Z = Integer.toString(20, 36);
        a0 = Integer.toString(21, 36);
        b0 = Integer.toString(22, 36);
        c0 = Integer.toString(23, 36);
        d0 = Integer.toString(24, 36);
        e0 = Integer.toString(25, 36);
        f0 = Integer.toString(26, 36);
        g0 = Integer.toString(27, 36);
        h0 = Integer.toString(28, 36);
        i0 = Integer.toString(29, 36);
        j0 = Integer.toString(30, 36);
        k0 = Integer.toString(31, 36);
        l0 = Integer.toString(32, 36);
    }

    public q4c(PlaybackException playbackException, int i, wie wieVar, t3c t3cVar, t3c t3cVar2, int i2, c3c c3cVar, int i3, boolean z, sch schVar, s9g s9gVar, int i4, w19 w19Var, float f, k20 k20Var, ib4 ib4Var, mv4 mv4Var, int i5, boolean z2, boolean z3, int i6, int i7, int i8, boolean z4, boolean z5, w19 w19Var2, long j, long j2, long j3, kgg kggVar, egg eggVar) {
        this.a = playbackException;
        this.b = i;
        this.c = wieVar;
        this.d = t3cVar;
        this.e = t3cVar2;
        this.f = i2;
        this.g = c3cVar;
        this.h = i3;
        this.i = z;
        this.l = schVar;
        this.j = s9gVar;
        this.k = i4;
        this.m = w19Var;
        this.n = f;
        this.o = k20Var;
        this.p = ib4Var;
        this.q = mv4Var;
        this.r = i5;
        this.s = z2;
        this.t = z3;
        this.u = i6;
        this.x = i7;
        this.y = i8;
        this.v = z4;
        this.w = z5;
        this.z = w19Var2;
        this.A = j;
        this.B = j2;
        this.C = j3;
        this.D = kggVar;
        this.E = eggVar;
    }

    public static q4c m(int i, Bundle bundle) {
        PlaybackException playbackException;
        zjd zjdVarV;
        zjd zjdVarV2;
        s9g n9gVar;
        s9g s9gVar;
        int i2;
        sch schVar;
        w19 w19Var;
        float f;
        sch schVar2;
        zjd zjdVarI;
        ib4 ib4Var;
        ib4 ib4Var2;
        mv4 mv4VarB;
        int i3;
        long j;
        kgg kggVar;
        IBinder binder = bundle.getBinder(l0);
        if (binder instanceof p4c) {
            return ((p4c) binder).c;
        }
        Bundle bundle2 = bundle.getBundle(X);
        if (bundle2 == null) {
            playbackException = null;
        } else {
            String string = bundle2.getString(PlaybackException.X);
            String string2 = bundle2.getString(PlaybackException.Y);
            String string3 = bundle2.getString(PlaybackException.Z);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th = remoteException;
            int i4 = bundle2.getInt(PlaybackException.d, 1000);
            Bundle bundle3 = bundle2.getBundle(PlaybackException.s0);
            if (bundle3 == null) {
                bundle3 = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th, i4, bundle3, bundle2.getLong(PlaybackException.o, SystemClock.elapsedRealtime()));
        }
        int i5 = bundle.getInt(Z, 0);
        Bundle bundle4 = bundle.getBundle(Y);
        wie wieVarB = bundle4 == null ? wie.l : wie.b(bundle4);
        Bundle bundle5 = bundle.getBundle(a0);
        t3c t3cVarC = bundle5 == null ? wie.k : t3c.c(bundle5);
        Bundle bundle6 = bundle.getBundle(b0);
        t3c t3cVarC2 = bundle6 == null ? wie.k : t3c.c(bundle6);
        int i6 = bundle.getInt(c0, 0);
        Bundle bundle7 = bundle.getBundle(G);
        c3c c3cVar = bundle7 == null ? c3c.d : new c3c(bundle7.getFloat(c3c.e, 1.0f), bundle7.getFloat(c3c.f, 1.0f));
        int i7 = bundle.getInt(H, 0);
        boolean z = bundle.getBoolean(I, false);
        Bundle bundle8 = bundle.getBundle(J);
        if (bundle8 == null) {
            n9gVar = s9g.a;
        } else {
            vef vefVar = new vef(27);
            IBinder binder2 = bundle8.getBinder(s9g.b);
            if (binder2 == null) {
                t76 t76Var = wg7.b;
                zjdVarV = zjd.o;
            } else {
                zjdVarV = gw0.v(vefVar, iw0.a(binder2));
            }
            vef vefVar2 = new vef(28);
            IBinder binder3 = bundle8.getBinder(s9g.c);
            if (binder3 == null) {
                t76 t76Var2 = wg7.b;
                zjdVarV2 = zjd.o;
            } else {
                zjdVarV2 = gw0.v(vefVar2, iw0.a(binder3));
            }
            int[] intArray = bundle8.getIntArray(s9g.d);
            if (intArray == null) {
                int i8 = zjdVarV.d;
                int[] iArr = new int[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    iArr[i9] = i9;
                }
                intArray = iArr;
            }
            n9gVar = new n9g(zjdVarV, zjdVarV2, intArray);
        }
        int i10 = bundle.getInt(k0, 0);
        Bundle bundle9 = bundle.getBundle(K);
        if (bundle9 == null) {
            schVar = sch.d;
            s9gVar = n9gVar;
            i2 = i10;
        } else {
            s9gVar = n9gVar;
            i2 = i10;
            schVar = new sch(bundle9.getInt(sch.e, 0), bundle9.getFloat(sch.g, 1.0f), bundle9.getInt(sch.f, 0));
        }
        Bundle bundle10 = bundle.getBundle(L);
        w19 w19VarB = bundle10 == null ? w19.K : w19.b(bundle10);
        float f2 = bundle.getFloat(M, 1.0f);
        Bundle bundle11 = bundle.getBundle(N);
        k20 k20VarA = bundle11 == null ? k20.h : k20.a(bundle11);
        Bundle bundle12 = bundle.getBundle(d0);
        if (bundle12 == null) {
            ib4Var = ib4.d;
            w19Var = w19VarB;
            f = f2;
            schVar2 = schVar;
        } else {
            ArrayList parcelableArrayList = bundle12.getParcelableArrayList(ib4.e);
            if (parcelableArrayList == null) {
                zjdVarI = zjd.o;
                w19Var = w19VarB;
                f = f2;
                schVar2 = schVar;
            } else {
                w19Var = w19VarB;
                tg7 tg7VarI = wg7.i();
                f = f2;
                schVar2 = schVar;
                for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                    Bundle bundle13 = (Bundle) parcelableArrayList.get(i11);
                    bundle13.getClass();
                    tg7VarI.a(hb4.b(bundle13));
                }
                zjdVarI = tg7VarI.i();
            }
            ib4Var = new ib4(bundle12.getLong(ib4.f), zjdVarI);
        }
        Bundle bundle14 = bundle.getBundle(O);
        if (bundle14 == null) {
            mv4VarB = mv4.e;
            ib4Var2 = ib4Var;
        } else {
            int i12 = bundle14.getInt(mv4.f, 0);
            int i13 = bundle14.getInt(mv4.g, 0);
            ib4Var2 = ib4Var;
            int i14 = bundle14.getInt(mv4.h, 0);
            String string4 = bundle14.getString(mv4.i);
            so0 so0Var = new so0(i12);
            so0Var.b = i13;
            so0Var.c = i14;
            hsi.b(i12 != 0 || string4 == null);
            so0Var.d = string4;
            mv4VarB = so0Var.b();
        }
        int i15 = bundle.getInt(P, 0);
        boolean z2 = bundle.getBoolean(Q, false);
        boolean z3 = bundle.getBoolean(R, false);
        int i16 = bundle.getInt(S, 1);
        int i17 = bundle.getInt(T, 0);
        int i18 = bundle.getInt(U, 1);
        boolean z4 = bundle.getBoolean(V, false);
        boolean z5 = bundle.getBoolean(W, false);
        Bundle bundle15 = bundle.getBundle(e0);
        w19 w19VarB2 = bundle15 == null ? w19.K : w19.b(bundle15);
        mv4 mv4Var = mv4VarB;
        long j2 = bundle.getLong(f0, i < 4 ? 0L : 5000L);
        long j3 = bundle.getLong(g0, i < 4 ? 0L : BuildConfig.SILENCE_TIME_TO_UPLOAD);
        if (i < 4) {
            i3 = i15;
            j = 0;
        } else {
            i3 = i15;
            j = 3000;
        }
        long j4 = bundle.getLong(h0, j);
        Bundle bundle16 = bundle.getBundle(j0);
        if (bundle16 == null) {
            kggVar = kgg.b;
        } else {
            ArrayList parcelableArrayList2 = bundle16.getParcelableArrayList(kgg.c);
            kggVar = new kgg(parcelableArrayList2 == null ? zjd.o : gw0.v(new o9g(9), parcelableArrayList2));
        }
        Bundle bundle17 = bundle.getBundle(i0);
        return new q4c(playbackException, i5, wieVarB, t3cVarC, t3cVarC2, i6, c3cVar, i7, z, schVar2, s9gVar, i2, w19Var, f, k20VarA, ib4Var2, mv4Var, i3, z2, z3, i16, i17, i18, z4, z5, w19VarB2, j2, j3, j4, kggVar, bundle17 == null ? egg.F : egg.b(bundle17));
    }

    public final q4c a(k20 k20Var) {
        s9g s9gVar = this.j;
        boolean zP = s9gVar.p();
        wie wieVar = this.c;
        hsi.g(zP || wieVar.a.b < s9gVar.o());
        return new q4c(this.a, this.b, wieVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, s9gVar, this.k, this.m, this.n, k20Var, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final q4c b(kgg kggVar) {
        s9g s9gVar = this.j;
        boolean zP = s9gVar.p();
        wie wieVar = this.c;
        hsi.g(zP || wieVar.a.b < s9gVar.o());
        return new q4c(this.a, this.b, wieVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, s9gVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, kggVar, this.E);
    }

    public final q4c c(int i, int i2, boolean z) {
        int i3 = this.y;
        boolean z2 = i3 == 3 && z && i2 == 0;
        s9g s9gVar = this.j;
        boolean zP = s9gVar.p();
        wie wieVar = this.c;
        hsi.g(zP || wieVar.a.b < s9gVar.o());
        return new q4c(this.a, this.b, wieVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, s9gVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z, i, i2, i3, z2, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final q4c d(c3c c3cVar) {
        s9g s9gVar = this.j;
        boolean zP = s9gVar.p();
        wie wieVar = this.c;
        hsi.g(zP || wieVar.a.b < s9gVar.o());
        return new q4c(this.a, this.b, wieVar, this.d, this.e, this.f, c3cVar, this.h, this.i, this.l, s9gVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final q4c e(int i, PlaybackException playbackException) {
        boolean z = this.t;
        int i2 = this.x;
        boolean z2 = i == 3 && z && i2 == 0;
        s9g s9gVar = this.j;
        boolean zP = s9gVar.p();
        wie wieVar = this.c;
        hsi.g(zP || wieVar.a.b < s9gVar.o());
        return new q4c(playbackException, this.b, wieVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, s9gVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z, this.u, i2, i, z2, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final q4c f(t3c t3cVar, t3c t3cVar2, int i) {
        s9g s9gVar = this.j;
        boolean zP = s9gVar.p();
        wie wieVar = this.c;
        hsi.g(zP || wieVar.a.b < s9gVar.o());
        return new q4c(this.a, this.b, wieVar, t3cVar, t3cVar2, i, this.g, this.h, this.i, this.l, s9gVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final q4c g(wie wieVar) {
        s9g s9gVar = this.j;
        hsi.g(s9gVar.p() || wieVar.a.b < s9gVar.o());
        return new q4c(this.a, this.b, wieVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, s9gVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final q4c h(s9g s9gVar) {
        boolean zP = s9gVar.p();
        wie wieVar = this.c;
        hsi.g(zP || wieVar.a.b < s9gVar.o());
        return new q4c(this.a, this.b, wieVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, s9gVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final q4c i(s9g s9gVar, wie wieVar, int i) {
        hsi.g(s9gVar.p() || wieVar.a.b < s9gVar.o());
        return new q4c(this.a, this.b, wieVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, s9gVar, i, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final q4c j(egg eggVar) {
        s9g s9gVar = this.j;
        boolean zP = s9gVar.p();
        wie wieVar = this.c;
        hsi.g(zP || wieVar.a.b < s9gVar.o());
        return new q4c(this.a, this.b, wieVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, s9gVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, eggVar);
    }

    public final q4c k(float f) {
        s9g s9gVar = this.j;
        boolean zP = s9gVar.p();
        wie wieVar = this.c;
        hsi.g(zP || wieVar.a.b < s9gVar.o());
        return new q4c(this.a, this.b, wieVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, s9gVar, this.k, this.m, f, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final q4c l(o3c o3cVar, boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        boolean zA = o3cVar.a(16);
        boolean zA2 = o3cVar.a(17);
        wie wieVar = this.c;
        wie wieVarA = wieVar.a(zA, zA2);
        t3c t3cVarB = this.d.b(zA, zA2);
        t3c t3cVarB2 = this.e.b(zA, zA2);
        boolean z4 = true;
        s9g n9gVar = this.j;
        if (!zA2 && zA && !n9gVar.p()) {
            int i3 = wieVar.a.b;
            if (n9gVar.o() != 1) {
                q9g q9gVarM = n9gVar.m(i3, new q9g(), 0L);
                tg7 tg7VarI = wg7.i();
                int i4 = q9gVarM.n;
                while (true) {
                    i2 = q9gVarM.o;
                    if (i4 > i2) {
                        break;
                    }
                    m9g m9gVarF = n9gVar.f(i4, new m9g(), true);
                    m9gVarF.c = 0;
                    tg7VarI.a(m9gVarF);
                    i4++;
                }
                q9gVarM.o = i2 - q9gVarM.n;
                q9gVarM.n = 0;
                n9gVar = new n9g(wg7.m(q9gVarM), tg7VarI.i(), new int[]{0});
            }
        } else if (z || !zA2) {
            n9gVar = s9g.a;
        }
        s9g s9gVar = n9gVar;
        w19 w19Var = !o3cVar.a(18) ? w19.K : this.m;
        float f = !o3cVar.a(22) ? 1.0f : this.n;
        k20 k20Var = !o3cVar.a(21) ? k20.h : this.o;
        ib4 ib4Var = !o3cVar.a(28) ? ib4.d : this.p;
        if (o3cVar.a(23)) {
            i = this.r;
            z3 = this.s;
        } else {
            i = 0;
            z3 = false;
        }
        w19 w19Var2 = !o3cVar.a(18) ? w19.K : this.z;
        kgg kggVar = (z2 || !o3cVar.a(30)) ? kgg.b : this.D;
        if (!s9gVar.p() && wieVarA.a.b >= s9gVar.o()) {
            z4 = false;
        }
        hsi.g(z4);
        return new q4c(this.a, this.b, wieVarA, t3cVarB, t3cVarB2, this.f, this.g, this.h, this.i, this.l, s9gVar, this.k, w19Var, f, k20Var, ib4Var, this.q, i, z3, this.t, this.u, this.x, this.y, this.v, this.w, w19Var2, this.A, this.B, this.C, kggVar, this.E);
    }

    public final k09 n() {
        s9g s9gVar = this.j;
        if (s9gVar.p()) {
            return null;
        }
        return s9gVar.m(this.c.a.b, new q9g(), 0L).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Bundle o(int i) {
        long j;
        boolean z;
        int i2;
        m9g m9gVar;
        int i3;
        int i4;
        Bundle bundleD;
        long j2;
        Bundle bundle = new Bundle();
        PlaybackException playbackException = this.a;
        if (playbackException != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(PlaybackException.d, playbackException.a);
            bundle2.putLong(PlaybackException.o, playbackException.b);
            bundle2.putString(PlaybackException.X, playbackException.getMessage());
            bundle2.putBundle(PlaybackException.s0, playbackException.c);
            Throwable cause = playbackException.getCause();
            if (cause != null) {
                bundle2.putString(PlaybackException.Y, cause.getClass().getName());
                bundle2.putString(PlaybackException.Z, cause.getMessage());
            }
            bundle.putBundle(X, bundle2);
        }
        int i5 = this.b;
        if (i5 != 0) {
            bundle.putInt(Z, i5);
        }
        wie wieVar = this.c;
        if (i < 3 || !wieVar.equals(wie.l)) {
            bundle.putBundle(Y, wieVar.c(i));
        }
        t3c t3cVar = this.d;
        if (i < 3 || !wie.k.a(t3cVar)) {
            bundle.putBundle(a0, t3cVar.d(i));
        }
        t3c t3cVar2 = this.e;
        if (i < 3 || !wie.k.a(t3cVar2)) {
            bundle.putBundle(b0, t3cVar2.d(i));
        }
        int i6 = this.f;
        if (i6 != 0) {
            bundle.putInt(c0, i6);
        }
        c3c c3cVar = c3c.d;
        c3c c3cVar2 = this.g;
        if (!c3cVar2.equals(c3cVar)) {
            Bundle bundle3 = new Bundle();
            bundle3.putFloat(c3c.e, c3cVar2.a);
            bundle3.putFloat(c3c.f, c3cVar2.b);
            bundle.putBundle(G, bundle3);
        }
        int i7 = this.h;
        if (i7 != 0) {
            bundle.putInt(H, i7);
        }
        boolean z2 = this.i;
        if (z2) {
            bundle.putBoolean(I, z2);
        }
        k9g k9gVar = s9g.a;
        s9g s9gVar = this.j;
        boolean z3 = false;
        long j3 = 0;
        if (s9gVar.equals(k9gVar)) {
            j = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            int iO = s9gVar.o();
            q9g q9gVar = new q9g();
            int i8 = 0;
            while (i8 < iO) {
                q9g q9gVarM = s9gVar.m(i8, q9gVar, j3);
                q9gVarM.getClass();
                Bundle bundle4 = new Bundle();
                long j4 = j3;
                if (!k09.g.equals(q9gVarM.c)) {
                    bundle4.putBundle(q9g.t, q9gVarM.c.d(false));
                }
                long j5 = q9gVarM.e;
                if (j5 != -9223372036854775807L) {
                    j2 = -9223372036854775807L;
                    bundle4.putLong(q9g.u, j5);
                } else {
                    j2 = -9223372036854775807L;
                }
                long j6 = q9gVarM.f;
                if (j6 != j2) {
                    bundle4.putLong(q9g.v, j6);
                }
                long j7 = q9gVarM.g;
                if (j7 != j2) {
                    bundle4.putLong(q9g.w, j7);
                }
                boolean z4 = q9gVarM.h;
                if (z4) {
                    bundle4.putBoolean(q9g.x, z4);
                }
                boolean z5 = q9gVarM.i;
                if (z5) {
                    bundle4.putBoolean(q9g.y, z5);
                }
                yz8 yz8Var = q9gVarM.j;
                if (yz8Var != null) {
                    bundle4.putBundle(q9g.z, yz8Var.c());
                }
                boolean z6 = q9gVarM.k;
                if (z6) {
                    bundle4.putBoolean(q9g.A, z6);
                }
                long j8 = q9gVarM.l;
                if (j8 != j4) {
                    bundle4.putLong(q9g.B, j8);
                }
                long j9 = q9gVarM.m;
                if (j9 != j2) {
                    bundle4.putLong(q9g.C, j9);
                }
                int i9 = q9gVarM.n;
                if (i9 != 0) {
                    bundle4.putInt(q9g.D, i9);
                }
                int i10 = q9gVarM.o;
                if (i10 != 0) {
                    bundle4.putInt(q9g.E, i10);
                }
                long j10 = q9gVarM.p;
                if (j10 != j4) {
                    bundle4.putLong(q9g.F, j10);
                }
                arrayList.add(bundle4);
                i8++;
                j3 = j4;
            }
            j = j3;
            ArrayList arrayList2 = new ArrayList();
            int iH = s9gVar.h();
            m9g m9gVar2 = new m9g();
            int i11 = 0;
            while (i11 < iH) {
                m9g m9gVarF = s9gVar.f(i11, m9gVar2, z3);
                m9gVarF.getClass();
                Bundle bundle5 = new Bundle();
                int i12 = m9gVarF.c;
                if (i12 != 0) {
                    bundle5.putInt(m9g.h, i12);
                }
                long j11 = m9gVarF.d;
                if (j11 != -9223372036854775807L) {
                    z = z3;
                    bundle5.putLong(m9g.i, j11);
                } else {
                    z = z3;
                }
                long j12 = m9gVarF.e;
                if (j12 != j) {
                    bundle5.putLong(m9g.j, j12);
                }
                boolean z7 = m9gVarF.f;
                if (z7) {
                    bundle5.putBoolean(m9g.k, z7);
                }
                if (m9gVarF.g.equals(v8.f)) {
                    i2 = iH;
                    m9gVar = m9gVar2;
                    i3 = i11;
                } else {
                    String str = m9g.l;
                    v8 v8Var = m9gVarF.g;
                    v8Var.getClass();
                    Bundle bundle6 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    t8[] t8VarArr = v8Var.e;
                    i2 = iH;
                    int length = t8VarArr.length;
                    ?? r6 = z;
                    while (r6 < length) {
                        int i13 = r6;
                        t8 t8Var = t8VarArr[i13];
                        t8Var.getClass();
                        int i14 = length;
                        Bundle bundle7 = new Bundle();
                        m9g m9gVar3 = m9gVar2;
                        bundle7.putLong(t8.l, t8Var.a);
                        bundle7.putInt(t8.m, t8Var.b);
                        bundle7.putInt(t8.s, t8Var.c);
                        bundle7.putParcelableArrayList(t8.n, new ArrayList<>(Arrays.asList(t8Var.d)));
                        String str2 = t8.t;
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        k09[] k09VarArr = t8Var.e;
                        int i15 = i11;
                        int length2 = k09VarArr.length;
                        ?? r10 = z;
                        while (r10 < length2) {
                            int i16 = r10;
                            k09 k09Var = k09VarArr[i16];
                            if (k09Var == null) {
                                bundleD = null;
                                i4 = length2;
                            } else {
                                i4 = length2;
                                bundleD = k09Var.d(true);
                            }
                            arrayList4.add(bundleD);
                            length2 = i4;
                            r10 = i16 + 1;
                        }
                        bundle7.putParcelableArrayList(str2, arrayList4);
                        bundle7.putIntArray(t8.o, t8Var.f);
                        bundle7.putLongArray(t8.p, t8Var.g);
                        bundle7.putLong(t8.q, t8Var.i);
                        bundle7.putBoolean(t8.r, t8Var.j);
                        bundle7.putStringArrayList(t8.u, new ArrayList<>(Arrays.asList(t8Var.h)));
                        bundle7.putBoolean(t8.v, t8Var.k);
                        arrayList3.add(bundle7);
                        length = i14;
                        m9gVar2 = m9gVar3;
                        i11 = i15;
                        r6 = i13 + 1;
                    }
                    m9gVar = m9gVar2;
                    i3 = i11;
                    if (!arrayList3.isEmpty()) {
                        bundle6.putParcelableArrayList(v8.h, arrayList3);
                    }
                    long j13 = v8Var.b;
                    if (j13 != j) {
                        bundle6.putLong(v8.i, j13);
                    }
                    long j14 = v8Var.c;
                    if (j14 != -9223372036854775807L) {
                        bundle6.putLong(v8.j, j14);
                    }
                    int i17 = v8Var.d;
                    if (i17 != 0) {
                        bundle6.putInt(v8.k, i17);
                    }
                    bundle5.putBundle(str, bundle6);
                }
                arrayList2.add(bundle5);
                i11 = i3 + 1;
                z3 = z;
                iH = i2;
                m9gVar2 = m9gVar;
            }
            int i18 = z3;
            int[] iArr = new int[iO];
            boolean z8 = true;
            if (iO > 0) {
                iArr[i18] = s9gVar.a(true);
            }
            int i19 = 1;
            while (i19 < iO) {
                iArr[i19] = s9gVar.e(iArr[i19 - 1], i18, z8);
                i19++;
                z8 = true;
                i18 = 0;
            }
            Bundle bundle8 = new Bundle();
            bundle8.putBinder(s9g.b, new iw0(arrayList));
            bundle8.putBinder(s9g.c, new iw0(arrayList2));
            bundle8.putIntArray(s9g.d, iArr);
            bundle.putBundle(J, bundle8);
        }
        int i20 = this.k;
        if (i20 != 0) {
            bundle.putInt(k0, i20);
        }
        sch schVar = sch.d;
        sch schVar2 = this.l;
        if (!schVar2.equals(schVar)) {
            Bundle bundle9 = new Bundle();
            int i21 = schVar2.a;
            if (i21 != 0) {
                bundle9.putInt(sch.e, i21);
            }
            int i22 = schVar2.b;
            if (i22 != 0) {
                bundle9.putInt(sch.f, i22);
            }
            float f = schVar2.c;
            if (f != 1.0f) {
                bundle9.putFloat(sch.g, f);
            }
            bundle.putBundle(K, bundle9);
        }
        w19 w19Var = w19.K;
        w19 w19Var2 = this.m;
        if (!w19Var2.equals(w19Var)) {
            bundle.putBundle(L, w19Var2.c());
        }
        float f2 = this.n;
        if (f2 != 1.0f) {
            bundle.putFloat(M, f2);
        }
        k20 k20Var = k20.h;
        k20 k20Var2 = this.o;
        if (!k20Var2.equals(k20Var)) {
            bundle.putBundle(N, k20Var2.c());
        }
        ib4 ib4Var = ib4.d;
        ib4 ib4Var2 = this.p;
        if (!ib4Var2.equals(ib4Var)) {
            Bundle bundle10 = new Bundle();
            String str3 = ib4.e;
            zjd zjdVar = ib4Var2.a;
            tg7 tg7VarI = wg7.i();
            for (int i23 = 0; i23 < zjdVar.d; i23++) {
                if (((hb4) zjdVar.get(i23)).d == null) {
                    tg7VarI.a((hb4) zjdVar.get(i23));
                }
            }
            zjd zjdVarI = tg7VarI.i();
            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>(zjdVarI.d);
            t76 t76VarListIterator = zjdVarI.listIterator(0);
            while (t76VarListIterator.hasNext()) {
                hb4 hb4Var = (hb4) t76VarListIterator.next();
                Bundle bundleC = hb4Var.c();
                Bitmap bitmap = hb4Var.d;
                if (bitmap != null) {
                    bundleC.putParcelable(hb4.w, bitmap);
                }
                arrayList5.add(bundleC);
            }
            bundle10.putParcelableArrayList(str3, arrayList5);
            bundle10.putLong(ib4.f, ib4Var2.b);
            bundle.putBundle(d0, bundle10);
        }
        mv4 mv4Var = mv4.e;
        mv4 mv4Var2 = this.q;
        if (!mv4Var2.equals(mv4Var)) {
            Bundle bundle11 = new Bundle();
            int i24 = mv4Var2.a;
            if (i24 != 0) {
                bundle11.putInt(mv4.f, i24);
            }
            int i25 = mv4Var2.b;
            if (i25 != 0) {
                bundle11.putInt(mv4.g, i25);
            }
            int i26 = mv4Var2.c;
            if (i26 != 0) {
                bundle11.putInt(mv4.h, i26);
            }
            String str4 = mv4Var2.d;
            if (str4 != null) {
                bundle11.putString(mv4.i, str4);
            }
            bundle.putBundle(O, bundle11);
        }
        int i27 = this.r;
        if (i27 != 0) {
            bundle.putInt(P, i27);
        }
        boolean z9 = this.s;
        if (z9) {
            bundle.putBoolean(Q, z9);
        }
        boolean z10 = this.t;
        if (z10) {
            bundle.putBoolean(R, z10);
        }
        int i28 = this.u;
        if (i28 != 1) {
            bundle.putInt(S, i28);
        }
        int i29 = this.x;
        if (i29 != 0) {
            bundle.putInt(T, i29);
        }
        int i30 = this.y;
        if (i30 != 1) {
            bundle.putInt(U, i30);
        }
        boolean z11 = this.v;
        if (z11) {
            bundle.putBoolean(V, z11);
        }
        boolean z12 = this.w;
        if (z12) {
            bundle.putBoolean(W, z12);
        }
        w19 w19Var3 = w19.K;
        w19 w19Var4 = this.z;
        if (!w19Var4.equals(w19Var3)) {
            bundle.putBundle(e0, w19Var4.c());
        }
        long j15 = i < 6 ? j : MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        long j16 = this.A;
        if (j16 != j15) {
            bundle.putLong(f0, j16);
        }
        long j17 = i < 6 ? j : BuildConfig.SILENCE_TIME_TO_UPLOAD;
        long j18 = this.B;
        if (j18 != j17) {
            bundle.putLong(g0, j18);
        }
        long j19 = i < 6 ? j : CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        long j20 = this.C;
        if (j20 != j19) {
            bundle.putLong(h0, j20);
        }
        kgg kggVar = kgg.b;
        kgg kggVar2 = this.D;
        if (!kggVar2.equals(kggVar)) {
            Bundle bundle12 = new Bundle();
            bundle12.putParcelableArrayList(kgg.c, gw0.D(kggVar2.a, new o9g(8)));
            bundle.putBundle(j0, bundle12);
        }
        egg eggVar = egg.F;
        egg eggVar2 = this.E;
        if (!eggVar2.equals(eggVar)) {
            bundle.putBundle(i0, eggVar2.c());
        }
        return bundle;
    }
}
