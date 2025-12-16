package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pa1 extends xfh {
    public final k18 X;
    public final k18 Y;
    public final i5i Z;
    public final bb1 b;
    public final kj1 c;
    public final g60 d;
    public final vw1 o;
    public final k18 s0;
    public final tcf t0;
    public final tcf u0;
    public final tcf v0;
    public final tcf w0;
    public Long x0;

    public pa1(Context context, bb1 bb1Var, kj1 kj1Var) {
        y4e y4eVar = y4e.a;
        g60 g60Var = new g60(((w4e) ((pb3) y4eVar.getAccessor().c(46))).s());
        vw1 vw1Var = (vw1) y4eVar.getAccessor().c(367);
        k18 k18Var = x4e.h;
        k18 k18Var2 = x4e.i;
        i5i i5iVar = new i5i(x4e.r, new a93(context, 3), false);
        bwf bwfVarD = u91.a.getAccessor().d(156);
        this.b = bb1Var;
        this.c = kj1Var;
        this.d = g60Var;
        this.o = vw1Var;
        this.X = k18Var;
        this.Y = k18Var2;
        this.Z = i5iVar;
        this.s0 = bwfVarD;
        tcf tcfVarA = ucf.a(bmb.a);
        this.t0 = tcfVarA;
        this.u0 = tcfVarA;
        tcf tcfVarA2 = ucf.a(Boolean.FALSE);
        this.v0 = tcfVarA2;
        this.w0 = tcfVarA2;
        w();
        vw1Var.getClass();
        vw1Var.g(new tw1(vw1Var, 5));
    }

    public final o37 t(long j) {
        w37 w37Var;
        cmb cmbVar = (cmb) this.t0.getValue();
        if (!(cmbVar instanceof amb) || (w37Var = (w37) ((amb) cmbVar).a.get(Long.valueOf(j))) == null) {
            return null;
        }
        return w37Var.u0;
    }

    public final yx1 u() {
        return (yx1) this.s0.getValue();
    }

    public final boolean v() {
        g60 g60Var = this.d;
        bb1 bb1Var = bb1.b;
        if (((ArrayList) (this.b == bb1.c ? g60Var.o : g60Var.d)).isEmpty()) {
            return false;
        }
        vw1 vw1Var = this.o;
        return vw1Var.c == null || vw1Var.c.d || !vw1Var.b;
    }

    public final void w() {
        wqi.c("CallHistoryPageViewModel", "register load history callbacks for type=" + this.b, new Object[0]);
        vw1 vw1Var = this.o;
        vw1Var.y0.b(new tw1(vw1Var, 3));
        vw1Var.X.add(this);
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f8  */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 1285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa1.x():void");
    }
}
