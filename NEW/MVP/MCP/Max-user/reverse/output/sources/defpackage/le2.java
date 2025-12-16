package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class le2 implements iu3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ le2(ve2 ve2Var, int i) {
        this.c = ve2Var;
        this.b = i;
    }

    @Override // defpackage.iu3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                List<Long> list = (List) this.c;
                af2 af2Var = (af2) obj;
                us usVar = new us(0);
                for (Long l : list) {
                    ye2 ye2Var = new ye2();
                    ye2Var.b = l.longValue();
                    ye2Var.a = this.b;
                    usVar.put(l, new ze2(ye2Var));
                }
                af2Var.R.putAll(usVar);
                break;
            default:
                ((ve2) this.c).getClass();
                new me2(this.b).accept((af2) obj);
                break;
        }
    }

    public /* synthetic */ le2(ve2 ve2Var, List list, int i) {
        this.c = list;
        this.b = i;
    }
}
