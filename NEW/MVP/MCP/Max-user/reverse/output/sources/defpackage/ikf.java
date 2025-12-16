package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class ikf extends xfh {
    public static final /* synthetic */ yy7[] z0 = {new z8a(ikf.class, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, ikf.class, "addSetInFavoriteJob", "getAddSetInFavoriteJob()Lkotlinx/coroutines/Job;"), new z8a(ikf.class, "clearRecentJob", "getClearRecentJob()Lkotlinx/coroutines/Job;")};
    public final k18 X;
    public final bwf Y;
    public final tcf Z;
    public final lzf b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final hbd s0;
    public final AtomicLong t0;
    public final tcf u0;
    public final hbd v0;
    public final t9f w0;
    public final t9f x0;
    public final t9f y0;

    public ikf(lzf lzfVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, bwf bwfVar) {
        this.b = lzfVar;
        this.c = k18Var;
        this.d = k18Var2;
        this.o = k18Var3;
        this.X = k18Var4;
        this.Y = bwfVar;
        hd5 hd5Var = hd5.a;
        tcf tcfVarA = ucf.a(new rjf(hd5Var, hd5Var));
        this.Z = tcfVarA;
        this.s0 = new hbd(tcfVarA);
        this.t0 = new AtomicLong();
        tcf tcfVarA2 = ucf.a(new qjf(0L, 0, 0, 7));
        this.u0 = tcfVarA2;
        this.v0 = new hbd(tcfVarA2);
        this.w0 = c7j.c();
        this.x0 = c7j.c();
        this.y0 = c7j.c();
    }

    public static void t(o98 o98Var, dgf dgfVar, ArrayList arrayList) {
        f62 f62Var = new f62(dgfVar.a, dgfVar);
        arrayList.add(f62Var);
        o98Var.add(f62Var);
        o98Var.addAll(dgfVar.o);
    }

    public static dgf u(sff sffVar, int i) {
        long j = sffVar.a;
        String str = sffVar.b;
        if (str == null) {
            str = "";
        }
        return new dgf(j, new r5g(str), sffVar.c, null, v(j, sffVar.h), i, false, false, 200);
    }

    public static List v(final long j, List list) {
        final boolean z = j == -9223372036854775807L || j == -9223372036854775806L || j == -9223372036854775805L;
        return lee.o(new nhg(lee.g(new at(2, list), new llc(18)), new em6() { // from class: ojf
            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                jef jefVar = (jef) obj;
                String str = jefVar.Z;
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    str = jefVar.d;
                }
                String str2 = str;
                long j2 = jefVar.a;
                long j3 = jefVar.u0;
                String str3 = jefVar.v0;
                String str4 = jefVar.y0;
                long j4 = j;
                return new fff(j2, j4, j3, str2, str3, str4, 0, 0, false, false, z ? Math.abs(j4) - jefVar.a : j2, 4032);
            }
        }));
    }

    public final void w(long j, k03 k03Var) {
        x9f x9fVarD = svi.d(this.a, ((q2b) this.b).b(), i84.b, new gkf(k03Var, j, this, null));
        this.w0.O(this, z0[0], x9fVarD);
    }
}
