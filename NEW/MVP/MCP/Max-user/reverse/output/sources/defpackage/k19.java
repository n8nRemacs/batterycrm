package defpackage;

import android.content.Context;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k19 extends dtf implements sm6 {
    public final /* synthetic */ p19 X;
    public final /* synthetic */ eh9 Y;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k19(p19 p19Var, eh9 eh9Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.o = obj;
        this.X = p19Var;
        this.Y = eh9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((k19) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new k19(this.X, this.Y, this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        w10 w10Var;
        long j;
        String str;
        u8d r8dVar;
        String str2;
        Object next;
        long j2;
        p19 p19Var = this.X;
        k18 k18Var = p19Var.i;
        Context context = p19Var.a;
        g8j.b(obj);
        w10 w10Var2 = (w10) this.o;
        if ((w10Var2 != null ? w10Var2.j : null) == null) {
            return null;
        }
        String str3 = w10Var2.r;
        f10 f10Var = w10Var2.j;
        long jHashCode = str3.hashCode();
        Locale localeU = ((w4e) p19Var.b).u();
        eh9 eh9Var = this.Y;
        si9 si9Var = eh9Var.a;
        si9 si9Var2 = eh9Var.a;
        String strH = ml6.h(context, localeU, si9Var.c, true);
        w10 w10Var3 = f10Var.d;
        long j3 = f10Var.b;
        int i = (w10Var3 == null || !w10Var3.h()) ? (w10Var3 == null || !w10Var3.f() || w10Var3.b.o) ? 3 : 1 : 2;
        p10 p10Var = w10Var2.o;
        int i2 = p10Var == null ? -1 : h19.$EnumSwitchMapping$1[p10Var.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            w10Var = w10Var3;
            j = jHashCode;
            str = null;
            r8dVar = new r8d(si9Var2.a, j3);
        } else if (i2 == 4) {
            w10Var = w10Var3;
            j = jHashCode;
            str = null;
            r8dVar = new s8d(si9Var2.a, j3);
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            long j4 = f10Var.a;
            if (j4 == 0) {
                str = null;
                j = jHashCode;
                j2 = (long) ((w10Var2.q / 100.0f) * j3);
            } else {
                j = jHashCode;
                str = null;
                j2 = w10Var2.v;
            }
            w10Var = w10Var3;
            r8dVar = new q8d(si9Var2.a, f10Var.b, w10Var2.q, j2, new Long(j4), new Long(j3));
        }
        hbd hbdVarA = ((f00) k18Var.getValue()).a(si9Var2.a, ((f00) k18Var.getValue()).b(r8dVar));
        long j5 = si9Var2.a;
        w10 w10Var4 = w10Var;
        long j6 = f10Var.a;
        String strE = w10Var4 != null ? jaj.e(w10Var4) : str;
        String str4 = f10Var.c;
        long j7 = f10Var.b;
        String strU = l6g.u(j7, false, context);
        String str5 = w10Var2.r;
        String str6 = w10Var2.s;
        String strE2 = ssi.e(f10Var);
        zg5 zg5Var = ev5.c;
        zg5Var.getClass();
        f2 f2Var = new f2(0, zg5Var);
        while (true) {
            if (!f2Var.hasNext()) {
                str2 = strE;
                next = str;
                break;
            }
            next = f2Var.next();
            str2 = strE;
            if (dnf.n(((ev5) next).name(), strE2, true)) {
                break;
            }
            strE = str2;
        }
        gv5 gv5VarB = (ev5) next;
        if (gv5VarB == null) {
            fv5 fv5Var = fv5.c;
            gv5VarB = fbj.b(strE2);
        }
        return new tb9(j, j5, j6, str2, str4, strH, j7, strU, str5, str6, i, gv5VarB, hbdVarA);
    }
}
