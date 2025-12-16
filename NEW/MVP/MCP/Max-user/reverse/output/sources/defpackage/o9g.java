package defpackage;

import android.os.Bundle;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes.dex */
public final /* synthetic */ class o9g implements kw0, om6, ra8, rl3, lp5, gu3, m7c, tm6 {
    public final /* synthetic */ int a;
    public static final o9g b = new o9g(12);
    public static final o9g c = new o9g(13);
    public static final o9g d = new o9g(14);
    public static final o9g o = new o9g(15);
    public static final o9g X = new o9g(16);

    public /* synthetic */ o9g(int i) {
        this.a = i;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 22:
                wqi.c("aug", "getUploadFromRepository: found upload in cache, upload=%s", (ttg) obj);
                break;
            case 23:
                wqi.e("aug", "getUploadFromRepository: failed to get upload from cache", (Throwable) obj);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
            default:
                ((x00) obj).i = p10.d;
                break;
            case 25:
                wqi.e("aug", "clear: failed to clear uploads repository", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.om6, defpackage.tm6
    public Object apply(Object obj) {
        zjd zjdVarI;
        int i = 0;
        switch (this.a) {
            case 2:
                Bundle bundle = (Bundle) obj;
                hf6 hf6Var = hf6.Q;
                ff6 ff6Var = new ff6();
                if (bundle != null) {
                    ClassLoader classLoader = gw0.class.getClassLoader();
                    String str = zxg.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(hf6.R);
                String str2 = hf6Var.a;
                if (string == null) {
                    string = str2;
                }
                ff6Var.a = string;
                String string2 = bundle.getString(hf6.S);
                String str3 = hf6Var.b;
                if (string2 == null) {
                    string2 = str3;
                }
                ff6Var.b = string2;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(hf6.w0);
                if (parcelableArrayList == null) {
                    zjdVarI = zjd.o;
                } else {
                    tg7 tg7VarI = wg7.i();
                    for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                        Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                        bundle2.getClass();
                        String string3 = bundle2.getString(r08.c);
                        String string4 = bundle2.getString(r08.d);
                        string4.getClass();
                        tg7VarI.a(new r08(string3, string4));
                    }
                    zjdVarI = tg7VarI.i();
                }
                ff6Var.c = wg7.j(zjdVarI);
                String string5 = bundle.getString(hf6.T);
                String str4 = hf6Var.d;
                if (string5 == null) {
                    string5 = str4;
                }
                ff6Var.d = string5;
                ff6Var.e = bundle.getInt(hf6.U, hf6Var.e);
                ff6Var.f = bundle.getInt(hf6.V, hf6Var.f);
                ff6Var.g = bundle.getInt(hf6.x0, hf6Var.g);
                ff6Var.h = bundle.getInt(hf6.W, hf6Var.h);
                ff6Var.i = bundle.getInt(hf6.X, hf6Var.i);
                String string6 = bundle.getString(hf6.Y);
                String str5 = hf6Var.k;
                if (string6 == null) {
                    string6 = str5;
                }
                ff6Var.j = string6;
                String string7 = bundle.getString(hf6.Z);
                String str6 = hf6Var.m;
                if (string7 == null) {
                    string7 = str6;
                }
                ff6Var.l = xz9.n(string7);
                String string8 = bundle.getString(hf6.a0);
                String str7 = hf6Var.n;
                if (string8 == null) {
                    string8 = str7;
                }
                ff6Var.m = xz9.n(string8);
                ff6Var.n = bundle.getInt(hf6.b0, hf6Var.o);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(hf6.c0 + "_" + Integer.toString(i, 36));
                    if (byteArray == null) {
                        ff6Var.p = arrayList;
                        ff6Var.q = (y45) bundle.getParcelable(hf6.d0);
                        ff6Var.r = bundle.getLong(hf6.e0, hf6Var.s);
                        ff6Var.t = bundle.getInt(hf6.f0, hf6Var.u);
                        ff6Var.u = bundle.getInt(hf6.g0, hf6Var.v);
                        ff6Var.v = bundle.getInt(hf6.z0, hf6Var.w);
                        ff6Var.w = bundle.getInt(hf6.A0, hf6Var.x);
                        ff6Var.x = bundle.getFloat(hf6.h0, hf6Var.y);
                        ff6Var.y = bundle.getInt(hf6.i0, hf6Var.z);
                        ff6Var.z = bundle.getFloat(hf6.j0, hf6Var.A);
                        ff6Var.A = bundle.getByteArray(hf6.k0);
                        ff6Var.B = bundle.getInt(hf6.l0, hf6Var.C);
                        ff6Var.D = bundle.getInt(hf6.y0, hf6Var.E);
                        Bundle bundle3 = bundle.getBundle(hf6.m0);
                        if (bundle3 != null) {
                            ff6Var.C = new gf3(bundle3.getInt(gf3.j, -1), bundle3.getInt(gf3.k, -1), bundle3.getInt(gf3.l, -1), bundle3.getInt(gf3.n, -1), bundle3.getInt(gf3.o, -1), bundle3.getByteArray(gf3.m));
                        }
                        ff6Var.E = bundle.getInt(hf6.n0, hf6Var.F);
                        ff6Var.F = bundle.getInt(hf6.o0, hf6Var.G);
                        ff6Var.G = bundle.getInt(hf6.p0, hf6Var.H);
                        ff6Var.H = bundle.getInt(hf6.q0, hf6Var.I);
                        ff6Var.I = bundle.getInt(hf6.r0, hf6Var.J);
                        ff6Var.J = bundle.getInt(hf6.s0, hf6Var.K);
                        ff6Var.L = bundle.getInt(hf6.u0, hf6Var.M);
                        ff6Var.M = bundle.getInt(hf6.v0, hf6Var.N);
                        ff6Var.N = bundle.getInt(hf6.t0, hf6Var.O);
                        return new hf6(ff6Var);
                    }
                    arrayList.add(byteArray);
                    i++;
                }
            case 3:
            case 5:
            case 6:
            default:
                return gvg.b((um9) obj);
            case 4:
                return Integer.valueOf(((lfg) obj).c);
            case 7:
                xfg xfgVar = (xfg) obj;
                xfgVar.getClass();
                Bundle bundle4 = new Bundle();
                bundle4.putBundle(xfg.c, xfgVar.a.d());
                bundle4.putIntArray(xfg.d, jni.i(xfgVar.b));
                return bundle4;
            case 8:
                jgg jggVar = (jgg) obj;
                jggVar.getClass();
                Bundle bundle5 = new Bundle();
                bundle5.putBundle(jgg.f, jggVar.b.d());
                bundle5.putIntArray(jgg.g, jggVar.d);
                bundle5.putBooleanArray(jgg.h, jggVar.e);
                bundle5.putBoolean(jgg.i, jggVar.c);
                return bundle5;
            case 9:
                Bundle bundle6 = (Bundle) obj;
                Bundle bundle7 = bundle6.getBundle(jgg.f);
                bundle7.getClass();
                lfg lfgVarA = lfg.a(bundle7);
                int[] intArray = bundle6.getIntArray(jgg.g);
                int i3 = lfgVarA.a;
                int[] iArr = new int[i3];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle6.getBooleanArray(jgg.h);
                boolean[] zArr = new boolean[i3];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new jgg(lfgVarA, bundle6.getBoolean(jgg.i, false), intArray, booleanArray);
        }
    }

    @Override // defpackage.lp5
    public gp5[] c() {
        z9g z9gVar = new z9g(0L);
        t76 t76Var = wg7.b;
        return new gp5[]{new jjg(1, 1, rof.b0, z9gVar, new br4(zjd.o, 0, 1))};
    }

    @Override // defpackage.kw0
    public lw0 e(Bundle bundle) {
        kfg kfgVar = null;
        switch (this.a) {
            case 0:
                Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
                i09 i09Var = bundle2 != null ? (i09) i09.X.e(bundle2) : null;
                long j = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
                long j2 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
                long j3 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
                boolean z = bundle.getBoolean(Integer.toString(5, 36), false);
                boolean z2 = bundle.getBoolean(Integer.toString(6, 36), false);
                Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
                xz8 xz8Var = bundle3 != null ? new xz8(bundle3.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle3.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle3.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle3.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle3.getFloat(Integer.toString(4, 36), -3.4028235E38f)) : null;
                boolean z3 = bundle.getBoolean(Integer.toString(8, 36), false);
                long j4 = bundle.getLong(Integer.toString(9, 36), 0L);
                long j5 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
                int i = bundle.getInt(Integer.toString(11, 36), 0);
                int i2 = bundle.getInt(Integer.toString(12, 36), 0);
                long j6 = bundle.getLong(Integer.toString(13, 36), 0L);
                p9g p9gVar = new p9g();
                p9gVar.b(p9g.C0, i09Var, null, j, j2, j3, z, z2, xz8Var, j4, j5, i, i2, j6);
                p9gVar.v0 = z3;
                return p9gVar;
            case 1:
                os5 os5Var = gf6.R0;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
                t76 t76Var = wg7.b;
                zjd zjdVarB = zjd.o;
                if (parcelableArrayList != null) {
                    zjdVarB = mw0.b(os5Var, parcelableArrayList);
                }
                return new kfg(bundle.getString(Integer.toString(1, 36), ""), (gf6[]) zjdVarB.toArray(new gf6[0]));
            case 2:
            case 4:
            default:
                Bundle bundle4 = bundle.getBundle(Integer.toString(0, 36));
                if (bundle4 != null) {
                    os5 os5Var2 = gf6.R0;
                    ArrayList parcelableArrayList2 = bundle4.getParcelableArrayList(Integer.toString(0, 36));
                    t76 t76Var2 = wg7.b;
                    zjd zjdVarB2 = zjd.o;
                    if (parcelableArrayList2 != null) {
                        zjdVarB2 = mw0.b(os5Var2, parcelableArrayList2);
                    }
                    kfgVar = new kfg(bundle4.getString(Integer.toString(1, 36), ""), (gf6[]) zjdVarB2.toArray(new gf6[0]));
                }
                kfgVar.getClass();
                int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                int i3 = kfgVar.a;
                int[] iArr = new int[i3];
                if (intArray == null) {
                    intArray = iArr;
                }
                int i4 = bundle.getInt(Integer.toString(2, 36), -1);
                boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
                boolean[] zArr = new boolean[i3];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new lgg(kfgVar, intArray, i4, booleanArray);
            case 3:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                t76 t76Var3 = wg7.b;
                zjd zjdVarB3 = zjd.o;
                if (parcelableArrayList3 != null) {
                    zjdVarB3 = mw0.b(kfg.o, parcelableArrayList3);
                }
                return new mfg((kfg[]) zjdVarB3.toArray(new kfg[0]));
            case 5:
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                t76 t76Var4 = wg7.b;
                zjd zjdVarB4 = zjd.o;
                if (parcelableArrayList4 != null) {
                    zjdVarB4 = mw0.b(yfg.c, parcelableArrayList4);
                }
                lk6 lk6Var = new lk6(4);
                for (int i5 = 0; i5 < zjdVarB4.d; i5++) {
                    yfg yfgVar = (yfg) zjdVarB4.get(i5);
                    lk6Var.T(yfgVar.a, yfgVar);
                }
                return new zfg((ekd) lk6Var.u());
            case 6:
                Bundle bundle5 = bundle.getBundle(Integer.toString(0, 36));
                bundle5.getClass();
                os5 os5Var3 = gf6.R0;
                ArrayList parcelableArrayList5 = bundle5.getParcelableArrayList(Integer.toString(0, 36));
                t76 t76Var5 = wg7.b;
                zjd zjdVarB5 = zjd.o;
                if (parcelableArrayList5 != null) {
                    zjdVarB5 = mw0.b(os5Var3, parcelableArrayList5);
                }
                kfg kfgVar2 = new kfg(bundle5.getString(Integer.toString(1, 36), ""), (gf6[]) zjdVarB5.toArray(new gf6[0]));
                int[] intArray2 = bundle.getIntArray(Integer.toString(1, 36));
                return intArray2 == null ? new yfg(kfgVar2) : new yfg(kfgVar2, jni.a(intArray2));
        }
    }

    @Override // defpackage.ra8
    public void f(Object obj, a26 a26Var) {
        zjd zjdVar = fhg.q;
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        switch (this.a) {
            case 18:
                return TransportRegistrar.lambda$getComponents$0(v6dVar);
            case 19:
                return TransportRegistrar.lambda$getComponents$1(v6dVar);
            default:
                return TransportRegistrar.lambda$getComponents$2(v6dVar);
        }
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((ttg) obj).a();
            case 28:
                Throwable th = (Throwable) obj;
                return (th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b);
            default:
                return ((pb2) obj).b.c0 != null;
        }
    }
}
