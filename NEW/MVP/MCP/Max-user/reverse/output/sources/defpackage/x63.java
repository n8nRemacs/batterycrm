package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class x63 {
    public final Context a;
    public final f8c b;
    public final h8c c;
    public final k18 d;

    public x63(Context context, f8c f8cVar, h8c h8cVar, k18 k18Var) {
        this.a = context;
        this.b = f8cVar;
        this.c = h8cVar;
        this.d = k18Var;
    }

    public final xx3 a(ku3 ku3Var) {
        CharSequence string;
        b8c b8cVarA = this.b.a(ku3Var.p());
        String strR = ku3Var.r(il0.b);
        int iM = ku3Var.m();
        k18 k18Var = this.d;
        if (iM != 0 || ku3Var.B()) {
            string = null;
        } else {
            boolean z = ku3Var.X;
            Context context = this.a;
            string = z ? context.getString(fvd.L) : (ku3Var.v() && ku3Var.A()) ? context.getString(mvd.R1) : ku3Var.y((rt5) k18Var.getValue()) ? context.getString(mvd.C) : ku3Var.v() ? context.getString(mvd.n) : this.c.b(ku3Var);
        }
        long jP = ku3Var.p();
        String strE = ku3Var.e();
        if (strE == null) {
            strE = "";
        }
        return new xx3(jP, strE, m6g.a(ku3Var.i()), Collections.singletonList(Long.valueOf(ku3Var.q())), string, null, strR != null ? Uri.parse(strR) : null, b8cVarA.a(), ku3Var.x(), ku3Var.o(), false, null, 0, ku3Var.v(), ku3Var.z(), ku3Var.w(), ku3Var.y((rt5) k18Var.getValue()), 27648);
    }

    public final icd b(ku3 ku3Var) {
        b8c b8cVarA = this.b.a(ku3Var.p());
        return new icd(ku3Var.p(), ku3Var.g(), ku3Var.r(il0.c), ku3Var.o(), b8cVarA.a(), ku3Var.x(), 192);
    }
}
