package defpackage;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class rj2 {
    public final /* synthetic */ w5 a;

    public rj2(w5 w5Var) {
        this.a = w5Var;
    }

    public final xw a(long j, long j2, long j3, Set set, r19 r19Var, int i) {
        w5 w5Var = this.a;
        Context context = (Context) w5Var.c(12);
        lzf lzfVar = (lzf) w5Var.c(8);
        bwf bwfVarD = w5Var.d(109);
        bwf bwfVarD2 = w5Var.d(138);
        bwf bwfVarD3 = w5Var.d(143);
        bwf bwfVarD4 = w5Var.d(210);
        bwf bwfVarD5 = w5Var.d(123);
        g60 g60Var = new g60(j, j2, j3, bwfVarD, set);
        iv6 iv6Var = new iv6(19, vb9.e(j, "MediaLoader#"));
        am2 am2Var = new am2(bwfVarD, w5Var.d(521), w5Var.d(9), bwfVarD2, lzfVar, j, set);
        wm2 wm2Var = new wm2(bwfVarD, bwfVarD3, w5Var.d(46), w5Var.d(79), am2Var, j, set, r19Var);
        bwf bwfVar = new bwf(new qj2(context, w5Var, 1));
        bwf bwfVar2 = new bwf(new qj2(context, w5Var, 0));
        return new xw(bwfVarD, w5Var.d(387), j, lzfVar, iv6Var, mwi.a(j, (tw0) w5Var.c(49), lzfVar), bwfVar, bwfVar2, (a84) w5Var.c(84), new g2b(bwfVar, bwfVar2, bwfVarD4, bwfVarD5), g60Var, am2Var, wm2Var, (so3) w5Var.c(488), i, i);
    }
}
