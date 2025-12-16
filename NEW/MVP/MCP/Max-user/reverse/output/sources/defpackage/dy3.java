package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dy3 extends dtf implements sm6 {
    public final /* synthetic */ iy3 X;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy3(Object obj, Continuation continuation, iy3 iy3Var) {
        super(2, continuation);
        this.o = obj;
        this.X = iy3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dy3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dy3(this.o, continuation, this.X);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        CharSequence string;
        g8j.b(obj);
        ku3 ku3Var = (ku3) this.o;
        iy3 iy3Var = this.X;
        k18 k18Var = iy3Var.k;
        Context context = iy3Var.c;
        k18 k18Var2 = iy3Var.e;
        b8c b8cVarA = ((f8c) k18Var2.getValue()).a(ku3Var.p());
        boolean zE = ((f8c) k18Var2.getValue()).e(ku3Var.p());
        String strR = ku3Var.r(il0.b);
        if (ku3Var.m() != 0 || ku3Var.B()) {
            string = null;
        } else {
            string = ku3Var.X ? context.getString(fvd.L) : ku3Var.y((rt5) k18Var.getValue()) ? context.getString(mvd.C) : (ku3Var.v() && ku3Var.A()) ? context.getString(mvd.R1) : ku3Var.v() ? context.getString(mvd.n) : ((h8c) iy3Var.f.getValue()).b(ku3Var);
        }
        long jP = ku3Var.p();
        String strE = ku3Var.e();
        if (strE != null) {
            return new xx3(jP, strE, m6g.a(ku3Var.i()), Collections.singletonList(new Long(ku3Var.q())), string, null, strR != null ? Uri.parse(strR) : null, zE, ku3Var.x(), ku3Var.o(), ku3Var.X, null, b8cVarA.b, ku3Var.v(), ku3Var.z(), ku3Var.w(), ku3Var.y((rt5) k18Var.getValue()), 14336);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
