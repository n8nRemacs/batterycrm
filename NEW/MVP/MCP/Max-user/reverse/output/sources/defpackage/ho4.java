package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ho4 implements b99 {
    public final fo4 a;
    public oe4 b;
    public jbe c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public ho4(Context context, pm4 pm4Var) {
        bl4 bl4Var = new bl4(context);
        this.b = bl4Var;
        jbe jbeVar = new jbe(18);
        this.c = jbeVar;
        fo4 fo4Var = new fo4();
        fo4Var.b = pm4Var;
        fo4Var.X = jbeVar;
        fo4Var.c = new HashMap();
        fo4Var.d = new HashMap();
        fo4Var.a = true;
        this.a = fo4Var;
        if (bl4Var != ((oe4) fo4Var.o)) {
            fo4Var.o = bl4Var;
            ((HashMap) fo4Var.c).clear();
            ((HashMap) fo4Var.d).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static b99 c(Class cls, oe4 oe4Var) {
        try {
            return (b99) cls.getConstructor(oe4.class).newInstance(oe4Var);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.b99
    public final ck0 a(k09 k09Var) {
        k55 k55VarF;
        k09 k09VarA = k09Var;
        k09VarA.b.getClass();
        String scheme = k09VarA.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(k09VarA.b.b, "application/x-image-uri")) {
            long j = k09VarA.b.h;
            String str = zxg.a;
            throw null;
        }
        a09 a09Var = k09VarA.b;
        int iL = zxg.L(a09Var.a, a09Var.b);
        if (k09VarA.b.h != -9223372036854775807L) {
            pm4 pm4Var = (pm4) this.a.b;
            synchronized (pm4Var) {
                pm4Var.Y = 1;
            }
        }
        try {
            fo4 fo4Var = this.a;
            HashMap map = (HashMap) fo4Var.d;
            b99 b99Var = (b99) map.get(Integer.valueOf(iL));
            if (b99Var == null) {
                b99Var = (b99) fo4Var.c(iL).get();
                b99Var.b((jbe) fo4Var.X);
                b99Var.d(fo4Var.a);
                b99Var.f();
                map.put(Integer.valueOf(iL), b99Var);
            }
            wz8 wz8VarA = k09VarA.c.a();
            yz8 yz8Var = k09VarA.c;
            if (yz8Var.a == -9223372036854775807L) {
                wz8VarA.a = this.d;
            }
            if (yz8Var.d == -3.4028235E38f) {
                wz8VarA.d = this.g;
            }
            if (yz8Var.e == -3.4028235E38f) {
                wz8VarA.e = this.h;
            }
            if (yz8Var.b == -9223372036854775807L) {
                wz8VarA.b = this.e;
            }
            if (yz8Var.c == -9223372036854775807L) {
                wz8VarA.c = this.f;
            }
            yz8 yz8Var2 = new yz8(wz8VarA);
            if (!yz8Var2.equals(k09VarA.c)) {
                mz8 mz8VarA = k09VarA.a();
                mz8VarA.l = yz8Var2.a();
                k09VarA = mz8VarA.a();
            }
            ck0 ck0VarA = b99Var.a(k09VarA);
            wg7 wg7Var = k09VarA.b.g;
            if (!wg7Var.isEmpty()) {
                ck0[] ck0VarArr = new ck0[wg7Var.size() + 1];
                ck0VarArr[0] = ck0VarA;
                for (int i = 0; i < wg7Var.size(); i++) {
                    int i2 = 18;
                    if (this.i) {
                        ff6 ff6Var = new ff6();
                        ff6Var.m = xz9.n(((g09) wg7Var.get(i)).b);
                        ff6Var.d = ((g09) wg7Var.get(i)).c;
                        ff6Var.e = ((g09) wg7Var.get(i)).d;
                        ff6Var.f = ((g09) wg7Var.get(i)).e;
                        ff6Var.b = ((g09) wg7Var.get(i)).f;
                        ff6Var.a = ((g09) wg7Var.get(i)).g;
                        hf6 hf6Var = new hf6(ff6Var);
                        i00 i00Var = new i00(this, 27, hf6Var);
                        oe4 oe4Var = this.b;
                        xu9 xu9Var = new xu9(21, i00Var);
                        Object obj = new Object();
                        tha thaVar = new tha(i2);
                        if (this.c.f(hf6Var)) {
                            ff6 ff6VarA = hf6Var.a();
                            ff6VarA.m = xz9.n("application/x-media3-cues");
                            ff6VarA.j = hf6Var.n;
                            ff6VarA.K = this.c.J(hf6Var);
                            hf6Var = new hf6(ff6VarA);
                        }
                        hf6 hf6Var2 = hf6Var;
                        int i3 = i + 1;
                        String string = ((g09) wg7Var.get(i)).a.toString();
                        oz8 oz8Var = new oz8();
                        uz8 uz8Var = new uz8();
                        List list = Collections.EMPTY_LIST;
                        zjd zjdVar = zjd.o;
                        wz8 wz8Var = new wz8();
                        d09 d09Var = d09.d;
                        Uri uri = string == null ? null : Uri.parse(string);
                        hsi.g(uz8Var.b == null || uz8Var.a != null);
                        a09 a09Var2 = uri != null ? new a09(uri, null, uz8Var.a != null ? new vz8(uz8Var) : null, null, list, null, zjdVar, -9223372036854775807L) : null;
                        k09 k09Var2 = new k09("", new sz8(oz8Var), a09Var2, new yz8(wz8Var), w19.K, d09Var);
                        a09Var2.getClass();
                        k09Var2.b.getClass();
                        vz8 vz8Var = k09Var2.b.c;
                        if (vz8Var == null) {
                            k55VarF = k55.a;
                        } else {
                            synchronized (obj) {
                                try {
                                    k55VarF = !vz8Var.equals(null) ? te8.f(vz8Var) : null;
                                    k55VarF.getClass();
                                } finally {
                                }
                            }
                        }
                        ck0VarArr[i3] = new loc(k09Var2, oe4Var, xu9Var, k55VarF, thaVar, 1048576, hf6Var2);
                    } else {
                        oe4 oe4Var2 = this.b;
                        oe4Var2.getClass();
                        ck0VarArr[i + 1] = new g3f((g09) wg7Var.get(i), oe4Var2, new tha(i2));
                    }
                }
                ck0VarA = new ch9(ck0VarArr);
            }
            sz8 sz8Var = k09VarA.e;
            if (sz8Var.b != 0 || sz8Var.d != Long.MIN_VALUE || sz8Var.f) {
                cc3 cc3Var = new cc3(ck0VarA);
                long j2 = sz8Var.b;
                hsi.b(j2 >= 0);
                hsi.g(!cc3Var.h);
                cc3Var.b = j2;
                long j3 = sz8Var.d;
                hsi.g(!cc3Var.h);
                cc3Var.c = j3;
                boolean z = !sz8Var.g;
                hsi.g(!cc3Var.h);
                cc3Var.d = z;
                boolean z2 = sz8Var.e;
                hsi.g(!cc3Var.h);
                cc3Var.e = z2;
                boolean z3 = sz8Var.f;
                hsi.g(!cc3Var.h);
                cc3Var.f = z3;
                boolean z4 = sz8Var.h;
                hsi.g(!cc3Var.h);
                cc3Var.g = z4;
                cc3Var.h = true;
                ck0VarA = new gc3(cc3Var);
            }
            k09VarA.b.getClass();
            if (k09VarA.b.d == null) {
                return ck0VarA;
            }
            a8i.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return ck0VarA;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.b99
    public final void b(jbe jbeVar) {
        this.c = jbeVar;
        fo4 fo4Var = this.a;
        fo4Var.X = jbeVar;
        pm4 pm4Var = (pm4) fo4Var.b;
        synchronized (pm4Var) {
            pm4Var.X = jbeVar;
        }
        Iterator it = ((HashMap) fo4Var.d).values().iterator();
        while (it.hasNext()) {
            ((b99) it.next()).b(jbeVar);
        }
    }

    @Override // defpackage.b99
    public final void d(boolean z) {
        this.i = z;
        fo4 fo4Var = this.a;
        fo4Var.a = z;
        pm4 pm4Var = (pm4) fo4Var.b;
        synchronized (pm4Var) {
            pm4Var.o = z;
        }
        Iterator it = ((HashMap) fo4Var.d).values().iterator();
        while (it.hasNext()) {
            ((b99) it.next()).d(z);
        }
    }

    @Override // defpackage.b99
    public final void f() {
        fo4 fo4Var = this.a;
        fo4Var.getClass();
        synchronized (((pm4) fo4Var.b)) {
        }
    }
}
