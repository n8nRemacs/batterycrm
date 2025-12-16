package defpackage;

import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class ar4 extends oo8 {
    public static final ijb k = ijb.a(new o00(16));
    public final Object c;
    public final Context d;
    public final r8j e;
    public nq4 f;
    public Thread g;
    public dl6 h;
    public k20 i;
    public Boolean j;

    public ar4(Context context, egg eggVar, r8j r8jVar) {
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = r8jVar;
        if (eggVar instanceof nq4) {
            this.f = (nq4) eggVar;
        } else {
            nq4 nq4Var = nq4.x0;
            nq4Var.getClass();
            lq4 lq4Var = new lq4(nq4Var);
            lq4Var.d(eggVar);
            this.f = new nq4(lq4Var);
        }
        this.i = k20.h;
        if (this.f.s0 && context == null) {
            a8i.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(nfg nfgVar, nq4 nq4Var, HashMap map) {
        for (int i = 0; i < nfgVar.a; i++) {
            xfg xfgVar = (xfg) nq4Var.D.get(nfgVar.a(i));
            if (xfgVar != null) {
                lfg lfgVar = xfgVar.a;
                xfg xfgVar2 = (xfg) map.get(Integer.valueOf(lfgVar.c));
                if (xfgVar2 == null || (xfgVar2.b.isEmpty() && !xfgVar.b.isEmpty())) {
                    map.put(Integer.valueOf(lfgVar.c), xfgVar);
                }
            }
        }
    }

    public static int d(hf6 hf6Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(hf6Var.d)) {
            return 4;
        }
        String strG = g(str);
        String strG2 = g(hf6Var.d);
        if (strG2 == null || strG == null) {
            return (z && strG2 == null) ? 1 : 0;
        }
        if (strG2.startsWith(strG) || strG.startsWith(strG2)) {
            return 3;
        }
        String str2 = zxg.a;
        return strG2.split("-", 2)[0].equals(strG.split("-", 2)[0]) ? 2 : 0;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean h(nq4 nq4Var, int i, hf6 hf6Var) {
        if ((i & 3584) == 0) {
            return false;
        }
        agg aggVar = nq4Var.u;
        if (aggVar.c && (i & 2048) == 0) {
            return false;
        }
        if (aggVar.b) {
            boolean z = (hf6Var.I == 0 && hf6Var.J == 0) ? false : true;
            boolean z2 = (i & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    public static Pair i(int i, mo8 mo8Var, int[][][] iArr, uq4 uq4Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccessM;
        mo8 mo8Var2 = mo8Var;
        ArrayList arrayList = new ArrayList();
        int i3 = mo8Var2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == mo8Var2.b[i4]) {
                nfg nfgVar = mo8Var2.c[i4];
                for (int i5 = 0; i5 < nfgVar.a; i5++) {
                    lfg lfgVarA = nfgVar.a(i5);
                    zjd zjdVarF = uq4Var.f(i4, lfgVarA, iArr[i4][i5]);
                    int i6 = lfgVarA.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        wq4 wq4Var = (wq4) zjdVarF.get(i7);
                        int iA = wq4Var.a();
                        if (zArr[i7] || iA == 0) {
                            i2 = i3;
                        } else {
                            if (iA == 1) {
                                randomAccessM = wg7.m(wq4Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(wq4Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    wq4 wq4Var2 = (wq4) zjdVarF.get(i8);
                                    int i9 = i3;
                                    if (wq4Var2.a() == 2 && wq4Var.c(wq4Var2)) {
                                        arrayList2.add(wq4Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessM = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessM);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            mo8Var2 = mo8Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((wq4) list.get(i10)).c;
        }
        wq4 wq4Var3 = (wq4) list.get(0);
        return Pair.create(new zm5(0, wq4Var3.b, iArr2), Integer.valueOf(wq4Var3.a));
    }

    @Override // defpackage.oo8
    public final void a() {
        dl6 dl6Var;
        qq4 qq4Var;
        synchronized (this.c) {
            try {
                Thread thread = this.g;
                if (thread != null) {
                    hsi.f("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (dl6Var = this.h) != null) {
            Handler handler = (Handler) dl6Var.c;
            Spatializer spatializer = (Spatializer) dl6Var.b;
            if (spatializer != null && (qq4Var = (qq4) dl6Var.d) != null && handler != null) {
                spatializer.removeOnSpatializerStateChangedListener(qq4Var);
                handler.removeCallbacksAndMessages(null);
            }
            this.h = null;
        }
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.oo8
    public final void b(egg eggVar) {
        if (eggVar instanceof nq4) {
            j((nq4) eggVar);
        }
        lq4 lq4Var = new lq4(e());
        lq4Var.d(eggVar);
        j(new nq4(lq4Var));
    }

    public final nq4 e() {
        nq4 nq4Var;
        synchronized (this.c) {
            nq4Var = this.f;
        }
        return nq4Var;
    }

    public final void f() {
        boolean z;
        sm5 sm5Var;
        dl6 dl6Var;
        synchronized (this.c) {
            try {
                z = this.f.s0 && Build.VERSION.SDK_INT >= 32 && (dl6Var = this.h) != null && dl6Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (sm5Var = this.a) == null) {
            return;
        }
        sm5Var.Z.f(10);
    }

    public final void j(nq4 nq4Var) {
        boolean zEquals;
        nq4Var.getClass();
        synchronized (this.c) {
            zEquals = this.f.equals(nq4Var);
            this.f = nq4Var;
        }
        if (zEquals) {
            return;
        }
        if (nq4Var.s0 && this.d == null) {
            a8i.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        sm5 sm5Var = this.a;
        if (sm5Var != null) {
            sm5Var.Z.f(10);
        }
    }

    public ar4(Context context) {
        this(context, new r8j(12));
    }

    public ar4(Context context, r8j r8jVar) {
        this(context, nq4.x0, r8jVar);
    }
}
