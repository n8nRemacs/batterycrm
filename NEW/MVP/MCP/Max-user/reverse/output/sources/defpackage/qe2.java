package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class qe2 implements iu3 {
    public final /* synthetic */ ve2 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ zj2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;

    public /* synthetic */ qe2(ve2 ve2Var, Set set, zj2 zj2Var, int i, long j, int i2, long j2, long j3) {
        this.a = ve2Var;
        this.b = set;
        this.c = zj2Var;
        this.d = i;
        this.e = j;
        this.f = i2;
        this.g = j2;
        this.h = j3;
    }

    @Override // defpackage.iu3
    public final void accept(Object obj) throws Throwable {
        df2 df2Var;
        Set set;
        af2 af2Var = (af2) obj;
        ve2 ve2Var = this.a;
        kz4 kz4Var = ve2Var.t;
        HashSet hashSet = s00.C0;
        Set set2 = this.b;
        if (hashSet.equals(set2)) {
            df2Var = af2Var.p;
            if (df2Var == null) {
                df2Var = df2.g;
            }
        } else if (s00.D0.equals(set2)) {
            df2Var = af2Var.q;
            if (df2Var == null) {
                df2Var = df2.g;
            }
        } else if (s00.E0.equals(set2)) {
            df2Var = af2Var.r;
            if (df2Var == null) {
                df2Var = df2.g;
            }
        } else if (s00.F0.equals(set2)) {
            df2Var = af2Var.s;
            if (df2Var == null) {
                df2Var = df2.g;
            }
        } else if (s00.G0.equals(set2)) {
            df2Var = af2Var.t;
            if (df2Var == null) {
                df2Var = df2.g;
            }
        } else if (s00.H0.equals(set2)) {
            df2Var = af2Var.u;
            if (df2Var == null) {
                df2Var = df2.g;
            }
        } else if (s00.I0.equals(set2)) {
            df2Var = af2Var.v;
            if (df2Var == null) {
                df2Var = df2.g;
            }
        } else if (s00.J0.equals(set2)) {
            df2Var = af2Var.w;
            if (df2Var == null) {
                df2Var = df2.g;
            }
        } else {
            df2 df2Var2 = df2.f;
            df2Var = new df2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
        }
        cf2 cf2VarA = df2Var.a();
        zj2 zj2Var = this.c;
        cf2VarA.a = zj2Var.o;
        boolean zIsEmpty = zj2Var.e().isEmpty();
        int i = this.d;
        int i2 = this.f;
        long j = this.h;
        if (zIsEmpty) {
            long j2 = this.e;
            if (i > 0) {
                cf2VarA.b = j2;
            }
            if (i2 > 0) {
                cf2VarA.c = j2;
            }
            set = set2;
        } else {
            cf2VarA.o = p4j.c((List) cf2VarA.o, zj2Var.e(), this.g, i, 0L, i2, 0L);
            if (i <= 0 || zj2Var.e().size() >= i) {
                set = set2;
            } else {
                wqi.c("ve2", "onChatMediaNew firstMessageUpdate", new Object[0]);
                set = set2;
                si9 si9VarI = ((qi9) kz4Var.get()).i(j, ((fh9) zj2Var.e().get(0)).a);
                if (si9VarI != null) {
                    cf2VarA.b = si9VarI.a;
                } else {
                    wqi.o("ve2", null, "onChatMediaNew can't find message to update firstMessage", Arrays.copyOf(new Object[0], 0));
                }
            }
            if (i2 > 0 && zj2Var.e().size() < i2) {
                wqi.c("ve2", "onChatMediaNew lastMessageUpdate", new Object[0]);
                si9 si9VarI2 = ((qi9) kz4Var.get()).i(j, ((fh9) zj2Var.e().get(zj2Var.e().size() - 1)).a);
                if (si9VarI2 != null) {
                    cf2VarA.c = si9VarI2.a;
                } else {
                    wqi.o("ve2", null, "onChatMediaNew can't find message to update lastMessage", Arrays.copyOf(new Object[0], 0));
                }
            }
        }
        Set set3 = set;
        ve2Var.S(j).setValue(new q19(zj2Var.Y, zj2Var.X, set3, j));
        df2 df2VarA = cf2VarA.a();
        if (hashSet.equals(set3)) {
            af2Var.p = df2VarA;
            return;
        }
        if (s00.D0.equals(set3)) {
            af2Var.q = df2VarA;
            return;
        }
        if (s00.E0.equals(set3)) {
            af2Var.r = df2VarA;
            return;
        }
        if (s00.F0.equals(set3)) {
            af2Var.s = df2VarA;
            return;
        }
        if (s00.G0.equals(set3)) {
            af2Var.t = df2VarA;
            return;
        }
        if (s00.H0.equals(set3)) {
            af2Var.u = df2VarA;
        } else if (s00.I0.equals(set3)) {
            af2Var.v = df2VarA;
        } else if (s00.J0.equals(set3)) {
            af2Var.w = df2VarA;
        }
    }
}
