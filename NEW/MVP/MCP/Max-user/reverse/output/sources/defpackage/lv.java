package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class lv implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lv(Object obj, boolean z, int i, long j) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                List list = (List) this.d;
                d93 d93Var = (d93) ue3.I(list);
                d93 d93Var2 = (d93) ue3.Q(list);
                Long lValueOf = d93Var != null ? Long.valueOf(d93Var.a()) : null;
                Long lValueOf2 = d93Var != null ? Long.valueOf(d93Var.c()) : null;
                Long lValueOf3 = d93Var2 != null ? Long.valueOf(d93Var2.a()) : null;
                Long lValueOf4 = d93Var2 != null ? Long.valueOf(d93Var2.c()) : null;
                StringBuilder sbJ = xc0.j(this.b, "insertDataSourceResult: \n                |loadTime: ", ", \n                |forward: ", this.c);
                sbJ.append(", \n                |firstChunk:");
                sbJ.append(lValueOf);
                sbJ.append("-");
                sbJ.append(lValueOf2);
                sbJ.append("\n                |lastChunk:");
                sbJ.append(lValueOf3);
                sbJ.append("-");
                sbJ.append(lValueOf4);
                sbJ.append("\n                |");
                return wmf.e(sbJ.toString());
            default:
                return ((ve2) ((si2) this.d)).q0(this.b, this.c);
        }
    }
}
