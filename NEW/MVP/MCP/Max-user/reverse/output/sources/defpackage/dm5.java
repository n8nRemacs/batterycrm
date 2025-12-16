package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class dm5 extends i3 {
    public final boolean A0;
    public final mj4 B0;
    public final Looper C0;
    public final ch0 D0;
    public final kwf E0;
    public final xl5 F0;
    public final zl5 G0;
    public final n30 H0;
    public final amf I0;
    public final ewf J0;
    public final cyf K0;
    public final long L0;
    public int M0;
    public int N0;
    public int O0;
    public boolean P0;
    public int Q0;
    public final j9e R0;
    public gze S0;
    public n3c T0;
    public v19 U0;
    public final AudioTrack V0;
    public Object W0;
    public final Context X;
    public Surface X0;
    public final i3 Y;
    public final int Y0;
    public final sk0[] Z;
    public int Z0;
    public int a1;
    public final int b1;
    public final ggg c;
    public final j20 c1;
    public final n3c d;
    public float d1;
    public boolean e1;
    public final boolean f1;
    public boolean g1;
    public final kv4 h1;
    public v19 i1;
    public z2c j1;
    public int k1;
    public long l1;
    public final xn3 o;
    public final no8 s0;
    public final vwf t0;
    public final rl5 u0;
    public final rm5 v0;
    public final cb6 w0;
    public final CopyOnWriteArraySet x0;
    public final l9g y0;
    public final ArrayList z0;

    static {
        tm5.a("goog.exo.exoplayer");
    }

    public dm5(gl5 gl5Var, j1f j1fVar) {
        super(2);
        this.o = new xn3(0);
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = xxg.e;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [ExoPlayerLib/2.17.1] [");
            sb.append(str);
            sb.append("]");
            Log.i("ExoPlayerImpl", sb.toString());
            Context context = gl5Var.a;
            Looper looper = gl5Var.h;
            kwf kwfVar = gl5Var.b;
            this.X = context.getApplicationContext();
            this.B0 = new mj4(kwfVar);
            this.c1 = gl5Var.i;
            this.Y0 = gl5Var.j;
            this.e1 = false;
            this.L0 = gl5Var.n;
            xl5 xl5Var = new xl5(this);
            this.F0 = xl5Var;
            this.G0 = new zl5();
            Handler handler = new Handler(looper);
            sk0[] sk0VarArrD = ((fde) gl5Var.c.b).d(handler, xl5Var, xl5Var, xl5Var, xl5Var);
            this.Z = sk0VarArrD;
            fsi.d(sk0VarArrD.length > 0);
            this.s0 = (no8) gl5Var.e.get();
            gl5Var.d.get();
            this.D0 = (ch0) gl5Var.g.get();
            this.A0 = gl5Var.k;
            this.R0 = gl5Var.l;
            this.C0 = looper;
            this.E0 = kwfVar;
            this.Y = j1fVar;
            this.w0 = new cb6(looper, kwfVar, new dm4(25, this));
            this.x0 = new CopyOnWriteArraySet();
            this.z0 = new ArrayList();
            this.S0 = new gze();
            this.c = new ggg(new jld[sk0VarArrD.length], new an5[sk0VarArrD.length], mgg.b, (lo8) null);
            this.y0 = new l9g();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i = 0; i < 20; i++) {
                int i2 = iArr[i];
                fsi.d(!false);
                sparseBooleanArray.append(i2, true);
            }
            this.s0.getClass();
            fsi.d(!false);
            sparseBooleanArray.append(29, true);
            fsi.d(!false);
            z16 z16Var = new z16(sparseBooleanArray);
            this.d = new n3c(z16Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < z16Var.a.size(); i3++) {
                int iA = z16Var.a(i3);
                fsi.d(!false);
                sparseBooleanArray2.append(iA, true);
            }
            fsi.d(!false);
            sparseBooleanArray2.append(4, true);
            fsi.d(!false);
            sparseBooleanArray2.append(10, true);
            fsi.d(!false);
            this.T0 = new n3c(new z16(sparseBooleanArray2));
            this.t0 = this.E0.a(this.C0, null);
            rl5 rl5Var = new rl5(this);
            this.u0 = rl5Var;
            this.j1 = z2c.h(this.c);
            this.B0.L(this.Y, this.C0);
            int i4 = xxg.a;
            this.v0 = new rm5(this.Z, this.s0, this.c, (ao4) gl5Var.f.get(), this.D0, this.M0, this.B0, this.R0, gl5Var.m, this.C0, this.E0, rl5Var, i4 < 31 ? new m4c() : vl5.a());
            this.d1 = 1.0f;
            this.M0 = 0;
            v19 v19Var = v19.R0;
            this.U0 = v19Var;
            this.i1 = v19Var;
            int iGenerateAudioSessionId = -1;
            this.k1 = -1;
            if (i4 < 21) {
                AudioTrack audioTrack = this.V0;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.V0.release();
                    this.V0 = null;
                }
                if (this.V0 == null) {
                    this.V0 = new AudioTrack(3, q0f.CLOSE_SOCKET_CODE_TIMEOUT, 4, 2, 2, 0, 0);
                }
                this.b1 = this.V0.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.X.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.b1 = iGenerateAudioSessionId;
            }
            zjd zjdVar = zjd.o;
            this.f1 = true;
            mj4 mj4Var = this.B0;
            mj4Var.getClass();
            cb6 cb6Var = this.w0;
            cb6Var.getClass();
            ((CopyOnWriteArraySet) cb6Var.d).add(new sa8(mj4Var));
            ((dk4) this.D0).a(this.B0, new Handler(this.C0));
            this.x0.add(this.F0);
            vd vdVar = new vd(context, handler, this.F0);
            n20 n20Var = (n20) vdVar.d;
            Context context2 = (Context) vdVar.c;
            if (vdVar.b) {
                context2.unregisterReceiver(n20Var);
                vdVar.b = false;
            }
            this.H0 = new n30(context, handler, this.F0);
            amf amfVar = new amf(context, handler, this.F0);
            this.I0 = amfVar;
            int iW = xxg.w(this.c1.c);
            if (amfVar.d != iW) {
                amfVar.d = iW;
                amfVar.b();
                dm5 dm5Var = amfVar.b.a;
                kv4 kv4VarM0 = M0(dm5Var.I0);
                if (!kv4VarM0.equals(dm5Var.h1)) {
                    dm5Var.h1 = kv4VarM0;
                    dm5Var.w0.j(29, new wo4(19, kv4VarM0));
                }
            }
            ewf ewfVar = new ewf();
            this.J0 = ewfVar;
            cyf cyfVar = new cyf();
            this.K0 = cyfVar;
            this.h1 = M0(amfVar);
            V0(1, 10, Integer.valueOf(this.b1));
            V0(2, 10, Integer.valueOf(this.b1));
            V0(1, 3, this.c1);
            V0(2, 4, Integer.valueOf(this.Y0));
            V0(2, 5, 0);
            V0(1, 9, Boolean.valueOf(this.e1));
            V0(2, 7, this.G0);
            V0(6, 8, this.G0);
            this.o.e();
        } catch (Throwable th) {
            this.o.e();
            throw th;
        }
    }

    public static kv4 M0(amf amfVar) {
        amfVar.getClass();
        AudioManager audioManager = amfVar.c;
        return new kv4(0, xxg.a >= 28 ? audioManager.getStreamMinVolume(amfVar.d) : 0, audioManager.getStreamMaxVolume(amfVar.d));
    }

    public static long Q0(z2c z2cVar) {
        p9g p9gVar = new p9g();
        l9g l9gVar = new l9g();
        z2cVar.a.g(z2cVar.b.a, l9gVar);
        long j = z2cVar.c;
        return j == -9223372036854775807L ? z2cVar.a.m(l9gVar.c, p9gVar, 0L).w0 : l9gVar.o + j;
    }

    public static boolean R0(z2c z2cVar) {
        return z2cVar.e == 3 && z2cVar.l && z2cVar.m == 0;
    }

    public final v19 L0() {
        r9g r9gVarO0 = o0();
        if (r9gVarO0.p()) {
            return this.i1;
        }
        i09 i09Var = r9gVarO0.m(t(), (p9g) this.b, 0L).c;
        t19 t19VarA = this.i1.a();
        v19 v19Var = i09Var.d;
        if (v19Var != null) {
            CharSequence charSequence = v19Var.a;
            if (charSequence != null) {
                t19VarA.a = charSequence;
            }
            CharSequence charSequence2 = v19Var.b;
            if (charSequence2 != null) {
                t19VarA.b = charSequence2;
            }
            CharSequence charSequence3 = v19Var.c;
            if (charSequence3 != null) {
                t19VarA.c = charSequence3;
            }
            CharSequence charSequence4 = v19Var.d;
            if (charSequence4 != null) {
                t19VarA.d = charSequence4;
            }
            CharSequence charSequence5 = v19Var.o;
            if (charSequence5 != null) {
                t19VarA.e = charSequence5;
            }
            CharSequence charSequence6 = v19Var.X;
            if (charSequence6 != null) {
                t19VarA.f = charSequence6;
            }
            CharSequence charSequence7 = v19Var.Y;
            if (charSequence7 != null) {
                t19VarA.g = charSequence7;
            }
            Uri uri = v19Var.Z;
            if (uri != null) {
                t19VarA.h = uri;
            }
            f8d f8dVar = v19Var.s0;
            if (f8dVar != null) {
                t19VarA.i = f8dVar;
            }
            f8d f8dVar2 = v19Var.t0;
            if (f8dVar2 != null) {
                t19VarA.j = f8dVar2;
            }
            byte[] bArr = v19Var.u0;
            if (bArr != null) {
                Integer num = v19Var.v0;
                t19VarA.k = (byte[]) bArr.clone();
                t19VarA.l = num;
            }
            Uri uri2 = v19Var.w0;
            if (uri2 != null) {
                t19VarA.m = uri2;
            }
            Integer num2 = v19Var.x0;
            if (num2 != null) {
                t19VarA.n = num2;
            }
            Integer num3 = v19Var.y0;
            if (num3 != null) {
                t19VarA.o = num3;
            }
            Integer num4 = v19Var.z0;
            if (num4 != null) {
                t19VarA.p = num4;
            }
            Boolean bool = v19Var.A0;
            if (bool != null) {
                t19VarA.q = bool;
            }
            Integer num5 = v19Var.B0;
            if (num5 != null) {
                t19VarA.r = num5;
            }
            Integer num6 = v19Var.C0;
            if (num6 != null) {
                t19VarA.r = num6;
            }
            Integer num7 = v19Var.D0;
            if (num7 != null) {
                t19VarA.s = num7;
            }
            Integer num8 = v19Var.E0;
            if (num8 != null) {
                t19VarA.t = num8;
            }
            Integer num9 = v19Var.F0;
            if (num9 != null) {
                t19VarA.u = num9;
            }
            Integer num10 = v19Var.G0;
            if (num10 != null) {
                t19VarA.v = num10;
            }
            Integer num11 = v19Var.H0;
            if (num11 != null) {
                t19VarA.w = num11;
            }
            CharSequence charSequence8 = v19Var.I0;
            if (charSequence8 != null) {
                t19VarA.x = charSequence8;
            }
            CharSequence charSequence9 = v19Var.J0;
            if (charSequence9 != null) {
                t19VarA.y = charSequence9;
            }
            CharSequence charSequence10 = v19Var.K0;
            if (charSequence10 != null) {
                t19VarA.z = charSequence10;
            }
            Integer num12 = v19Var.L0;
            if (num12 != null) {
                t19VarA.A = num12;
            }
            Integer num13 = v19Var.M0;
            if (num13 != null) {
                t19VarA.B = num13;
            }
            CharSequence charSequence11 = v19Var.N0;
            if (charSequence11 != null) {
                t19VarA.C = charSequence11;
            }
            CharSequence charSequence12 = v19Var.O0;
            if (charSequence12 != null) {
                t19VarA.D = charSequence12;
            }
            CharSequence charSequence13 = v19Var.P0;
            if (charSequence13 != null) {
                t19VarA.E = charSequence13;
            }
            Bundle bundle = v19Var.Q0;
            if (bundle != null) {
                t19VarA.F = bundle;
            }
        }
        return new v19(t19VarA);
    }

    public final v4c N0(t4c t4cVar) {
        int iP0 = P0();
        r9g r9gVar = this.j1.a;
        if (iP0 == -1) {
            iP0 = 0;
        }
        kwf kwfVar = this.E0;
        rm5 rm5Var = this.v0;
        return new v4c(rm5Var, t4cVar, r9gVar, iP0, kwfVar, rm5Var.t0);
    }

    public final long O0(z2c z2cVar) {
        if (z2cVar.a.p()) {
            return xxg.B(this.l1);
        }
        if (z2cVar.b.a()) {
            return z2cVar.s;
        }
        r9g r9gVar = z2cVar.a;
        c99 c99Var = z2cVar.b;
        long j = z2cVar.s;
        Object obj = c99Var.a;
        l9g l9gVar = this.y0;
        r9gVar.g(obj, l9gVar);
        return j + l9gVar.o;
    }

    public final int P0() {
        if (this.j1.a.p()) {
            return this.k1;
        }
        z2c z2cVar = this.j1;
        return z2cVar.a.g(z2cVar.b.a, this.y0).c;
    }

    public final z2c S0(z2c z2cVar, r9g r9gVar, Pair pair) {
        List list;
        fsi.b(r9gVar.p() || pair != null);
        r9g r9gVar2 = z2cVar.a;
        z2c z2cVarG = z2cVar.g(r9gVar);
        if (r9gVar.p()) {
            c99 c99Var = z2c.t;
            long jB = xxg.B(this.l1);
            z2c z2cVarA = z2cVarG.b(c99Var, jB, jB, jB, 0L, mfg.d, this.c, zjd.o).a(c99Var);
            z2cVarA.q = z2cVarA.s;
            return z2cVarA;
        }
        Object obj = z2cVarG.b.a;
        int i = xxg.a;
        boolean zEquals = obj.equals(pair.first);
        c99 c99Var2 = !zEquals ? new c99(pair.first) : z2cVarG.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jB2 = xxg.B(p());
        if (!r9gVar2.p()) {
            jB2 -= r9gVar2.g(obj, this.y0).o;
        }
        if (!zEquals || jLongValue < jB2) {
            c99 c99Var3 = c99Var2;
            fsi.d(!c99Var3.a());
            mfg mfgVar = !zEquals ? mfg.d : z2cVarG.h;
            ggg gggVar = !zEquals ? this.c : z2cVarG.i;
            if (zEquals) {
                list = z2cVarG.j;
            } else {
                t76 t76Var = wg7.b;
                list = zjd.o;
            }
            z2c z2cVarA2 = z2cVarG.b(c99Var3, jLongValue, jLongValue, jLongValue, 0L, mfgVar, gggVar, list).a(c99Var3);
            z2cVarA2.q = jLongValue;
            return z2cVarA2;
        }
        if (jLongValue != jB2) {
            c99 c99Var4 = c99Var2;
            fsi.d(!c99Var4.a());
            long jMax = Math.max(0L, z2cVarG.r - (jLongValue - jB2));
            long j = z2cVarG.q;
            if (z2cVarG.k.equals(z2cVarG.b)) {
                j = jLongValue + jMax;
            }
            z2c z2cVarB = z2cVarG.b(c99Var4, jLongValue, jLongValue, jLongValue, jMax, z2cVarG.h, z2cVarG.i, z2cVarG.j);
            z2cVarB.q = j;
            return z2cVarB;
        }
        int iB = r9gVar.b(z2cVarG.k.a);
        if (iB != -1 && r9gVar.f(iB, this.y0, false).c == r9gVar.g(c99Var2.a, this.y0).c) {
            return z2cVarG;
        }
        r9gVar.g(c99Var2.a, this.y0);
        long jA = c99Var2.a() ? this.y0.a(c99Var2.b, c99Var2.c) : this.y0.d;
        c99 c99Var5 = c99Var2;
        z2c z2cVarA3 = z2cVarG.b(c99Var5, z2cVarG.s, z2cVarG.s, z2cVarG.d, jA - z2cVarG.s, z2cVarG.h, z2cVarG.i, z2cVarG.j).a(c99Var5);
        z2cVarA3.q = jA;
        return z2cVarA3;
    }

    public final Pair T0(r9g r9gVar, int i, long j) {
        if (r9gVar.p()) {
            this.k1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.l1 = j;
            return null;
        }
        if (i == -1 || i >= r9gVar.o()) {
            i = r9gVar.a(false);
            j = xxg.K(r9gVar.m(i, (p9g) this.b, 0L).w0);
        }
        return r9gVar.i((p9g) this.b, this.y0, i, xxg.B(j));
    }

    public final void U0(int i, int i2) {
        if (i == this.Z0 && i2 == this.a1) {
            return;
        }
        this.Z0 = i;
        this.a1 = i2;
        this.w0.j(24, new sl5(i, i2, 1));
    }

    public final void V0(int i, int i2, Object obj) {
        for (sk0 sk0Var : this.Z) {
            if (sk0Var.a == i) {
                v4c v4cVarN0 = N0(sk0Var);
                fsi.d(!v4cVarN0.g);
                v4cVarN0.d = i2;
                fsi.d(!v4cVarN0.g);
                v4cVarN0.e = obj;
                v4cVarN0.c();
            }
        }
    }

    public final void W0(List list, int i, long j, boolean z) {
        long j2;
        int iA = i;
        int iP0 = P0();
        long jE = e();
        this.N0++;
        ArrayList arrayList = this.z0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                this.z0.remove(i2);
            }
            gze gzeVar = this.S0;
            int[] iArr = gzeVar.b;
            int[] iArr2 = new int[iArr.length - size];
            int i3 = 0;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 < 0 || i5 >= size) {
                    int i6 = i4 - i3;
                    if (i5 >= 0) {
                        i5 -= size;
                    }
                    iArr2[i6] = i5;
                } else {
                    i3++;
                }
            }
            this.S0 = new gze(iArr2, new Random(gzeVar.a.nextLong()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            y99 y99Var = new y99((bk0) list.get(i7), this.A0);
            arrayList2.add(y99Var);
            arrayList.add(i7, new bm5(y99Var.b, y99Var.a.o));
        }
        gze gzeVarA = this.S0.a(arrayList2.size());
        this.S0 = gzeVarA;
        g5c g5cVar = new g5c(arrayList, gzeVarA);
        boolean zP = g5cVar.p();
        int i8 = g5cVar.d;
        if (!zP && iA >= i8) {
            throw new IllegalSeekPositionException();
        }
        if (z) {
            iA = g5cVar.a(false);
            j2 = -9223372036854775807L;
        } else if (iA == -1) {
            iA = iP0;
            j2 = jE;
        } else {
            j2 = j;
        }
        z2c z2cVarS0 = S0(this.j1, g5cVar, T0(g5cVar, iA, j2));
        int i9 = z2cVarS0.e;
        if (iA != -1 && i9 != 1) {
            i9 = (g5cVar.p() || iA >= i8) ? 4 : 2;
        }
        z2c z2cVarF = z2cVarS0.f(i9);
        this.v0.Z.a(17, new jm5(arrayList2, this.S0, iA, xxg.B(j2))).b();
        b1(z2cVarF, 0, 1, false, (this.j1.b.a.equals(z2cVarF.b.a) || this.j1.a.p()) ? false : true, 4, O0(z2cVarF), -1);
    }

    public final void X0(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (sk0 sk0Var : this.Z) {
            if (sk0Var.a == 2) {
                v4c v4cVarN0 = N0(sk0Var);
                fsi.d(!v4cVarN0.g);
                v4cVarN0.d = 1;
                fsi.d(true ^ v4cVarN0.g);
                v4cVarN0.e = surface;
                v4cVarN0.c();
                arrayList.add(v4cVarN0);
            }
        }
        Object obj = this.W0;
        if (obj != null && obj != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((v4c) it.next()).a(this.L0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj2 = this.W0;
            Surface surface2 = this.X0;
            if (obj2 == surface2) {
                surface2.release();
                this.X0 = null;
            }
        }
        this.W0 = surface;
        if (z) {
            Y0(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
        }
    }

    public final void Y0(ExoPlaybackException exoPlaybackException) {
        z2c z2cVar = this.j1;
        z2c z2cVarA = z2cVar.a(z2cVar.b);
        z2cVarA.q = z2cVarA.s;
        z2cVarA.r = 0L;
        z2c z2cVarF = z2cVarA.f(1);
        if (exoPlaybackException != null) {
            z2cVarF = z2cVarF.e(exoPlaybackException);
        }
        z2c z2cVar2 = z2cVarF;
        this.N0++;
        vwf vwfVar = this.v0.Z;
        vwfVar.getClass();
        twf twfVarB = vwf.b();
        twfVarB.a = vwfVar.a.obtainMessage(6);
        twfVarB.b();
        b1(z2cVar2, 0, 1, false, z2cVar2.a.p() && !this.j1.a.p(), 4, O0(z2cVar2), -1);
    }

    public final void Z0() {
        int iK;
        int iE;
        n3c n3cVar = this.T0;
        int i = xxg.a;
        i3 i3Var = this.Y;
        boolean zF = i3Var.f();
        p9g p9gVar = (p9g) i3Var.b;
        r9g r9gVarO0 = i3Var.o0();
        boolean z = false;
        boolean z2 = !r9gVarO0.p() && r9gVarO0.m(i3Var.t(), p9gVar, 0L).Z;
        r9g r9gVarO02 = i3Var.o0();
        if (r9gVarO02.p()) {
            iK = -1;
        } else {
            int iT = i3Var.t();
            int repeatMode = i3Var.getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            i3Var.q0();
            iK = r9gVarO02.k(iT, repeatMode, false);
        }
        boolean z3 = iK != -1;
        r9g r9gVarO03 = i3Var.o0();
        if (r9gVarO03.p()) {
            iE = -1;
        } else {
            int iT2 = i3Var.t();
            int repeatMode2 = i3Var.getRepeatMode();
            if (repeatMode2 == 1) {
                repeatMode2 = 0;
            }
            i3Var.q0();
            iE = r9gVarO03.e(iT2, repeatMode2, false);
        }
        boolean z4 = iE != -1;
        r9g r9gVarO04 = i3Var.o0();
        boolean z5 = !r9gVarO04.p() && r9gVarO04.m(i3Var.t(), p9gVar, 0L).a();
        r9g r9gVarO05 = i3Var.o0();
        boolean z6 = !r9gVarO05.p() && r9gVarO05.m(i3Var.t(), p9gVar, 0L).s0;
        boolean zP = i3Var.o0().p();
        zkb zkbVar = new zkb(1);
        y16 y16Var = (y16) zkbVar.b;
        z16 z16Var = this.d.a;
        y16Var.getClass();
        for (int i2 = 0; i2 < z16Var.a.size(); i2++) {
            y16Var.a(z16Var.a(i2));
        }
        boolean z7 = !zF;
        zkbVar.i(4, z7);
        zkbVar.i(5, z2 && !zF);
        zkbVar.i(6, z3 && !zF);
        zkbVar.i(7, !zP && (z3 || !z5 || z2) && !zF);
        zkbVar.i(8, z4 && !zF);
        zkbVar.i(9, !zP && (z4 || (z5 && z6)) && !zF);
        zkbVar.i(10, z7);
        zkbVar.i(11, z2 && !zF);
        if (z2 && !zF) {
            z = true;
        }
        zkbVar.i(12, z);
        n3c n3cVar2 = new n3c(y16Var.d());
        this.T0 = n3cVar2;
        if (n3cVar2.equals(n3cVar)) {
            return;
        }
        this.w0.i(13, new rl5(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void a1(int i, int i2, boolean z) {
        int i3 = 0;
        ?? r4 = (!z || i == -1) ? 0 : 1;
        if (r4 != 0 && i != 1) {
            i3 = 1;
        }
        z2c z2cVar = this.j1;
        if (z2cVar.l == r4 && z2cVar.m == i3) {
            return;
        }
        this.N0++;
        z2c z2cVarD = z2cVar.d(i3, r4);
        vwf vwfVar = this.v0.Z;
        vwfVar.getClass();
        twf twfVarB = vwf.b();
        twfVarB.a = vwfVar.a.obtainMessage(1, r4, i3);
        twfVarB.b();
        b1(z2cVarD, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    public final void b1(final z2c z2cVar, final int i, final int i2, boolean z, boolean z2, int i3, long j, int i4) {
        int i5;
        Pair pair;
        int i6;
        i09 i09Var;
        boolean z3;
        boolean z4;
        boolean z5;
        int i7;
        Object obj;
        i09 i09Var2;
        Object obj2;
        int i8;
        long j2;
        long j3;
        long jQ0;
        long jQ02;
        Object obj3;
        i09 i09Var3;
        Object obj4;
        int i9;
        z2c z2cVar2 = this.j1;
        this.j1 = z2cVar;
        boolean zEquals = z2cVar2.a.equals(z2cVar.a);
        p9g p9gVar = (p9g) this.b;
        l9g l9gVar = this.y0;
        r9g r9gVar = z2cVar2.a;
        c99 c99Var = z2cVar2.b;
        r9g r9gVar2 = z2cVar.a;
        c99 c99Var2 = z2cVar.b;
        if (r9gVar2.p() && r9gVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
            i5 = 3;
        } else {
            i5 = 3;
            if (r9gVar2.p() != r9gVar.p()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (r9gVar.m(r9gVar.g(c99Var.a, l9gVar).c, p9gVar, 0L).a.equals(r9gVar2.m(r9gVar2.g(c99Var2.a, l9gVar).c, p9gVar, 0L).a)) {
                pair = (z2 && i3 == 0 && c99Var.d < c99Var2.d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z2 && i3 == 0) {
                    i6 = 1;
                } else if (z2 && i3 == 1) {
                    i6 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i6 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i6));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        v19 v19VarL0 = this.U0;
        if (zBooleanValue) {
            i09Var = !z2cVar.a.p() ? z2cVar.a.m(z2cVar.a.g(z2cVar.b.a, this.y0).c, (p9g) this.b, 0L).c : null;
            this.i1 = v19.R0;
        } else {
            i09Var = null;
        }
        if (zBooleanValue || !z2cVar2.j.equals(z2cVar.j)) {
            t19 t19VarA = this.i1.a();
            List list = z2cVar.j;
            for (int i10 = 0; i10 < list.size(); i10++) {
                sy9 sy9Var = (sy9) list.get(i10);
                int i11 = 0;
                while (true) {
                    qy9[] qy9VarArr = sy9Var.a;
                    if (i11 < qy9VarArr.length) {
                        qy9VarArr[i11].p(t19VarA);
                        i11++;
                    }
                }
            }
            this.i1 = new v19(t19VarA);
            v19VarL0 = L0();
        }
        boolean zEquals2 = v19VarL0.equals(this.U0);
        this.U0 = v19VarL0;
        boolean z6 = z2cVar2.l != z2cVar.l;
        boolean z7 = z2cVar2.e != z2cVar.e;
        if (z7 || z6) {
            c1();
        }
        boolean z8 = z2cVar2.g != z2cVar.g;
        if (!z2cVar2.a.equals(z2cVar.a)) {
            final int i12 = 0;
            this.w0.i(0, new oa8() { // from class: ol5
                @Override // defpackage.oa8
                public final void invoke(Object obj5) {
                    q3c q3cVar = (q3c) obj5;
                    switch (i12) {
                        case 0:
                            r9g r9gVar3 = z2cVar.a;
                            q3cVar.y(i);
                            break;
                        default:
                            q3cVar.i(i, z2cVar.l);
                            break;
                    }
                }
            });
        }
        if (z2) {
            l9g l9gVar2 = new l9g();
            if (z2cVar2.a.p()) {
                z3 = zBooleanValue;
                z4 = z6;
                z5 = zEquals2;
                i7 = i4;
                obj = null;
                i09Var2 = null;
                obj2 = null;
                i8 = -1;
            } else {
                Object obj5 = z2cVar2.b.a;
                z2cVar2.a.g(obj5, l9gVar2);
                int i13 = l9gVar2.c;
                int iB = z2cVar2.a.b(obj5);
                z3 = zBooleanValue;
                z4 = z6;
                z5 = zEquals2;
                obj = z2cVar2.a.m(i13, (p9g) this.b, 0L).a;
                i09Var2 = ((p9g) this.b).c;
                obj2 = obj5;
                i7 = i13;
                i8 = iB;
            }
            if (i3 == 0) {
                if (z2cVar2.b.a()) {
                    c99 c99Var3 = z2cVar2.b;
                    jQ0 = l9gVar2.a(c99Var3.b, c99Var3.c);
                    jQ02 = Q0(z2cVar2);
                } else if (z2cVar2.b.e != -1) {
                    jQ0 = Q0(this.j1);
                    jQ02 = jQ0;
                } else {
                    j2 = l9gVar2.o;
                    j3 = l9gVar2.d;
                    jQ0 = j2 + j3;
                    jQ02 = jQ0;
                }
            } else if (z2cVar2.b.a()) {
                jQ0 = z2cVar2.s;
                jQ02 = Q0(z2cVar2);
            } else {
                j2 = l9gVar2.o;
                j3 = z2cVar2.s;
                jQ0 = j2 + j3;
                jQ02 = jQ0;
            }
            long jK = xxg.K(jQ0);
            long jK2 = xxg.K(jQ02);
            c99 c99Var4 = z2cVar2.b;
            s3c s3cVar = new s3c(obj, i7, i09Var2, obj2, i8, jK, jK2, c99Var4.b, c99Var4.c);
            p9g p9gVar2 = (p9g) this.b;
            int iT = t();
            if (this.j1.a.p()) {
                obj3 = null;
                i09Var3 = null;
                obj4 = null;
                i9 = -1;
            } else {
                z2c z2cVar3 = this.j1;
                Object obj6 = z2cVar3.b.a;
                z2cVar3.a.g(obj6, this.y0);
                int iB2 = this.j1.a.b(obj6);
                Object obj7 = this.j1.a.m(iT, p9gVar2, 0L).a;
                i09Var3 = p9gVar2.c;
                i9 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jK3 = xxg.K(j);
            long jK4 = this.j1.b.a() ? xxg.K(Q0(this.j1)) : jK3;
            c99 c99Var5 = this.j1.b;
            this.w0.i(11, new pz1(i3, s3cVar, new s3c(obj3, iT, i09Var3, obj4, i9, jK3, jK4, c99Var5.b, c99Var5.c), 3));
        } else {
            z3 = zBooleanValue;
            z4 = z6;
            z5 = zEquals2;
        }
        if (z3) {
            this.w0.i(1, new ad0(i09Var, iIntValue, 4));
        }
        if (z2cVar2.f != z2cVar.f) {
            final int i14 = 0;
            this.w0.i(10, new oa8() { // from class: ml5
                @Override // defpackage.oa8
                public final void invoke(Object obj8) {
                    q3c q3cVar = (q3c) obj8;
                    switch (i14) {
                        case 0:
                            q3cVar.E(z2cVar.f);
                            break;
                        case 1:
                            q3cVar.u(z2cVar.f);
                            break;
                        case 2:
                            q3cVar.w((mgg) z2cVar.i.X);
                            break;
                        case 3:
                            z2c z2cVar4 = z2cVar;
                            boolean z9 = z2cVar4.g;
                            q3cVar.getClass();
                            q3cVar.h(z2cVar4.g);
                            break;
                        case 4:
                            z2c z2cVar5 = z2cVar;
                            q3cVar.o(z2cVar5.e, z2cVar5.l);
                            break;
                        case 5:
                            q3cVar.k(z2cVar.e);
                            break;
                        case 6:
                            q3cVar.f(z2cVar.m);
                            break;
                        case 7:
                            q3cVar.q(dm5.R0(z2cVar));
                            break;
                        default:
                            q3cVar.x(z2cVar.n);
                            break;
                    }
                }
            });
            if (z2cVar.f != null) {
                final int i15 = 1;
                this.w0.i(10, new oa8() { // from class: ml5
                    @Override // defpackage.oa8
                    public final void invoke(Object obj8) {
                        q3c q3cVar = (q3c) obj8;
                        switch (i15) {
                            case 0:
                                q3cVar.E(z2cVar.f);
                                break;
                            case 1:
                                q3cVar.u(z2cVar.f);
                                break;
                            case 2:
                                q3cVar.w((mgg) z2cVar.i.X);
                                break;
                            case 3:
                                z2c z2cVar4 = z2cVar;
                                boolean z9 = z2cVar4.g;
                                q3cVar.getClass();
                                q3cVar.h(z2cVar4.g);
                                break;
                            case 4:
                                z2c z2cVar5 = z2cVar;
                                q3cVar.o(z2cVar5.e, z2cVar5.l);
                                break;
                            case 5:
                                q3cVar.k(z2cVar.e);
                                break;
                            case 6:
                                q3cVar.f(z2cVar.m);
                                break;
                            case 7:
                                q3cVar.q(dm5.R0(z2cVar));
                                break;
                            default:
                                q3cVar.x(z2cVar.n);
                                break;
                        }
                    }
                });
            }
        }
        ggg gggVar = z2cVar2.i;
        ggg gggVar2 = z2cVar.i;
        if (gggVar != gggVar2) {
            no8 no8Var = this.s0;
            Object obj8 = gggVar2.c;
            no8Var.getClass();
            no8Var.c = (lo8) obj8;
            this.w0.i(2, new dq4(z2cVar, 4, new vfg((an5[]) z2cVar.i.o)));
            final int i16 = 2;
            this.w0.i(2, new oa8() { // from class: ml5
                @Override // defpackage.oa8
                public final void invoke(Object obj82) {
                    q3c q3cVar = (q3c) obj82;
                    switch (i16) {
                        case 0:
                            q3cVar.E(z2cVar.f);
                            break;
                        case 1:
                            q3cVar.u(z2cVar.f);
                            break;
                        case 2:
                            q3cVar.w((mgg) z2cVar.i.X);
                            break;
                        case 3:
                            z2c z2cVar4 = z2cVar;
                            boolean z9 = z2cVar4.g;
                            q3cVar.getClass();
                            q3cVar.h(z2cVar4.g);
                            break;
                        case 4:
                            z2c z2cVar5 = z2cVar;
                            q3cVar.o(z2cVar5.e, z2cVar5.l);
                            break;
                        case 5:
                            q3cVar.k(z2cVar.e);
                            break;
                        case 6:
                            q3cVar.f(z2cVar.m);
                            break;
                        case 7:
                            q3cVar.q(dm5.R0(z2cVar));
                            break;
                        default:
                            q3cVar.x(z2cVar.n);
                            break;
                    }
                }
            });
        }
        if (!z5) {
            this.w0.i(14, new wo4(12, this.U0));
        }
        if (z8) {
            final int i17 = 3;
            this.w0.i(i5, new oa8() { // from class: ml5
                @Override // defpackage.oa8
                public final void invoke(Object obj82) {
                    q3c q3cVar = (q3c) obj82;
                    switch (i17) {
                        case 0:
                            q3cVar.E(z2cVar.f);
                            break;
                        case 1:
                            q3cVar.u(z2cVar.f);
                            break;
                        case 2:
                            q3cVar.w((mgg) z2cVar.i.X);
                            break;
                        case 3:
                            z2c z2cVar4 = z2cVar;
                            boolean z9 = z2cVar4.g;
                            q3cVar.getClass();
                            q3cVar.h(z2cVar4.g);
                            break;
                        case 4:
                            z2c z2cVar5 = z2cVar;
                            q3cVar.o(z2cVar5.e, z2cVar5.l);
                            break;
                        case 5:
                            q3cVar.k(z2cVar.e);
                            break;
                        case 6:
                            q3cVar.f(z2cVar.m);
                            break;
                        case 7:
                            q3cVar.q(dm5.R0(z2cVar));
                            break;
                        default:
                            q3cVar.x(z2cVar.n);
                            break;
                    }
                }
            });
        }
        if (z7 || z4) {
            final int i18 = 4;
            this.w0.i(-1, new oa8() { // from class: ml5
                @Override // defpackage.oa8
                public final void invoke(Object obj82) {
                    q3c q3cVar = (q3c) obj82;
                    switch (i18) {
                        case 0:
                            q3cVar.E(z2cVar.f);
                            break;
                        case 1:
                            q3cVar.u(z2cVar.f);
                            break;
                        case 2:
                            q3cVar.w((mgg) z2cVar.i.X);
                            break;
                        case 3:
                            z2c z2cVar4 = z2cVar;
                            boolean z9 = z2cVar4.g;
                            q3cVar.getClass();
                            q3cVar.h(z2cVar4.g);
                            break;
                        case 4:
                            z2c z2cVar5 = z2cVar;
                            q3cVar.o(z2cVar5.e, z2cVar5.l);
                            break;
                        case 5:
                            q3cVar.k(z2cVar.e);
                            break;
                        case 6:
                            q3cVar.f(z2cVar.m);
                            break;
                        case 7:
                            q3cVar.q(dm5.R0(z2cVar));
                            break;
                        default:
                            q3cVar.x(z2cVar.n);
                            break;
                    }
                }
            });
        }
        if (z7) {
            final int i19 = 5;
            this.w0.i(4, new oa8() { // from class: ml5
                @Override // defpackage.oa8
                public final void invoke(Object obj82) {
                    q3c q3cVar = (q3c) obj82;
                    switch (i19) {
                        case 0:
                            q3cVar.E(z2cVar.f);
                            break;
                        case 1:
                            q3cVar.u(z2cVar.f);
                            break;
                        case 2:
                            q3cVar.w((mgg) z2cVar.i.X);
                            break;
                        case 3:
                            z2c z2cVar4 = z2cVar;
                            boolean z9 = z2cVar4.g;
                            q3cVar.getClass();
                            q3cVar.h(z2cVar4.g);
                            break;
                        case 4:
                            z2c z2cVar5 = z2cVar;
                            q3cVar.o(z2cVar5.e, z2cVar5.l);
                            break;
                        case 5:
                            q3cVar.k(z2cVar.e);
                            break;
                        case 6:
                            q3cVar.f(z2cVar.m);
                            break;
                        case 7:
                            q3cVar.q(dm5.R0(z2cVar));
                            break;
                        default:
                            q3cVar.x(z2cVar.n);
                            break;
                    }
                }
            });
        }
        if (z4) {
            final int i20 = 1;
            this.w0.i(5, new oa8() { // from class: ol5
                @Override // defpackage.oa8
                public final void invoke(Object obj52) {
                    q3c q3cVar = (q3c) obj52;
                    switch (i20) {
                        case 0:
                            r9g r9gVar3 = z2cVar.a;
                            q3cVar.y(i2);
                            break;
                        default:
                            q3cVar.i(i2, z2cVar.l);
                            break;
                    }
                }
            });
        }
        if (z2cVar2.m != z2cVar.m) {
            final int i21 = 6;
            this.w0.i(6, new oa8() { // from class: ml5
                @Override // defpackage.oa8
                public final void invoke(Object obj82) {
                    q3c q3cVar = (q3c) obj82;
                    switch (i21) {
                        case 0:
                            q3cVar.E(z2cVar.f);
                            break;
                        case 1:
                            q3cVar.u(z2cVar.f);
                            break;
                        case 2:
                            q3cVar.w((mgg) z2cVar.i.X);
                            break;
                        case 3:
                            z2c z2cVar4 = z2cVar;
                            boolean z9 = z2cVar4.g;
                            q3cVar.getClass();
                            q3cVar.h(z2cVar4.g);
                            break;
                        case 4:
                            z2c z2cVar5 = z2cVar;
                            q3cVar.o(z2cVar5.e, z2cVar5.l);
                            break;
                        case 5:
                            q3cVar.k(z2cVar.e);
                            break;
                        case 6:
                            q3cVar.f(z2cVar.m);
                            break;
                        case 7:
                            q3cVar.q(dm5.R0(z2cVar));
                            break;
                        default:
                            q3cVar.x(z2cVar.n);
                            break;
                    }
                }
            });
        }
        if (R0(z2cVar2) != R0(z2cVar)) {
            final int i22 = 7;
            this.w0.i(7, new oa8() { // from class: ml5
                @Override // defpackage.oa8
                public final void invoke(Object obj82) {
                    q3c q3cVar = (q3c) obj82;
                    switch (i22) {
                        case 0:
                            q3cVar.E(z2cVar.f);
                            break;
                        case 1:
                            q3cVar.u(z2cVar.f);
                            break;
                        case 2:
                            q3cVar.w((mgg) z2cVar.i.X);
                            break;
                        case 3:
                            z2c z2cVar4 = z2cVar;
                            boolean z9 = z2cVar4.g;
                            q3cVar.getClass();
                            q3cVar.h(z2cVar4.g);
                            break;
                        case 4:
                            z2c z2cVar5 = z2cVar;
                            q3cVar.o(z2cVar5.e, z2cVar5.l);
                            break;
                        case 5:
                            q3cVar.k(z2cVar.e);
                            break;
                        case 6:
                            q3cVar.f(z2cVar.m);
                            break;
                        case 7:
                            q3cVar.q(dm5.R0(z2cVar));
                            break;
                        default:
                            q3cVar.x(z2cVar.n);
                            break;
                    }
                }
            });
        }
        if (!z2cVar2.n.equals(z2cVar.n)) {
            final int i23 = 8;
            this.w0.i(12, new oa8() { // from class: ml5
                @Override // defpackage.oa8
                public final void invoke(Object obj82) {
                    q3c q3cVar = (q3c) obj82;
                    switch (i23) {
                        case 0:
                            q3cVar.E(z2cVar.f);
                            break;
                        case 1:
                            q3cVar.u(z2cVar.f);
                            break;
                        case 2:
                            q3cVar.w((mgg) z2cVar.i.X);
                            break;
                        case 3:
                            z2c z2cVar4 = z2cVar;
                            boolean z9 = z2cVar4.g;
                            q3cVar.getClass();
                            q3cVar.h(z2cVar4.g);
                            break;
                        case 4:
                            z2c z2cVar5 = z2cVar;
                            q3cVar.o(z2cVar5.e, z2cVar5.l);
                            break;
                        case 5:
                            q3cVar.k(z2cVar.e);
                            break;
                        case 6:
                            q3cVar.f(z2cVar.m);
                            break;
                        case 7:
                            q3cVar.q(dm5.R0(z2cVar));
                            break;
                        default:
                            q3cVar.x(z2cVar.n);
                            break;
                    }
                }
            });
        }
        if (z) {
            this.w0.i(-1, new dm4(26));
        }
        Z0();
        this.w0.e();
        if (z2cVar2.o != z2cVar.o) {
            Iterator it = this.x0.iterator();
            while (it.hasNext()) {
                ((xl5) it.next()).getClass();
            }
        }
        if (z2cVar2.p != z2cVar.p) {
            Iterator it2 = this.x0.iterator();
            while (it2.hasNext()) {
                ((xl5) it2.next()).a.c1();
            }
        }
    }

    public final void c1() {
        d1();
        int i = this.j1.e;
        cyf cyfVar = this.K0;
        ewf ewfVar = this.J0;
        if (i != 1) {
            if (i == 2 || i == 3) {
                d1();
                boolean z = this.j1.p;
                i();
                ewfVar.getClass();
                i();
                cyfVar.getClass();
                return;
            }
            if (i != 4) {
                throw new IllegalStateException();
            }
        }
        ewfVar.getClass();
        cyfVar.getClass();
    }

    public final void d1() {
        this.o.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.C0;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = xxg.a;
            Locale locale = Locale.US;
            String strJ = wy1.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.f1) {
                throw new IllegalStateException(strJ);
            }
            pai.e("ExoPlayerImpl", strJ, this.g1 ? null : new IllegalStateException());
            this.g1 = true;
        }
    }

    @Override // defpackage.i3, defpackage.u3c
    public final long e() {
        d1();
        return xxg.K(O0(this.j1));
    }

    @Override // defpackage.i3, defpackage.u3c
    public final boolean f() {
        d1();
        return this.j1.b.a();
    }

    @Override // defpackage.i3, defpackage.u3c
    public final long g() {
        d1();
        return xxg.K(this.j1.r);
    }

    @Override // defpackage.u3c
    public final long getDuration() {
        d1();
        if (!f()) {
            r9g r9gVarO0 = o0();
            if (r9gVarO0.p()) {
                return -9223372036854775807L;
            }
            return xxg.K(r9gVarO0.m(t(), (p9g) this.b, 0L).x0);
        }
        z2c z2cVar = this.j1;
        c99 c99Var = z2cVar.b;
        r9g r9gVar = z2cVar.a;
        Object obj = c99Var.a;
        l9g l9gVar = this.y0;
        r9gVar.g(obj, l9gVar);
        return xxg.K(l9gVar.a(c99Var.b, c99Var.c));
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int getRepeatMode() {
        d1();
        return this.M0;
    }

    @Override // defpackage.u3c
    public final boolean i() {
        d1();
        return this.j1.l;
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int j() {
        d1();
        if (this.j1.a.p()) {
            return 0;
        }
        z2c z2cVar = this.j1;
        return z2cVar.a.b(z2cVar.b.a);
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int l() {
        d1();
        if (f()) {
            return this.j1.b.c;
        }
        return -1;
    }

    @Override // defpackage.i3
    public final r9g o0() {
        d1();
        return this.j1.a;
    }

    @Override // defpackage.i3, defpackage.u3c
    public final long p() {
        d1();
        if (!f()) {
            return e();
        }
        z2c z2cVar = this.j1;
        r9g r9gVar = z2cVar.a;
        Object obj = z2cVar.b.a;
        l9g l9gVar = this.y0;
        r9gVar.g(obj, l9gVar);
        z2c z2cVar2 = this.j1;
        if (z2cVar2.c == -9223372036854775807L) {
            return xxg.K(z2cVar2.a.m(t(), (p9g) this.b, 0L).w0);
        }
        return xxg.K(this.j1.c) + xxg.K(l9gVar.o);
    }

    @Override // defpackage.i3
    public final void q0() {
        d1();
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int s() {
        d1();
        if (f()) {
            return this.j1.b.b;
        }
        return -1;
    }

    @Override // defpackage.i3, defpackage.u3c
    public final int t() {
        d1();
        int iP0 = P0();
        if (iP0 == -1) {
            return 0;
        }
        return iP0;
    }
}
