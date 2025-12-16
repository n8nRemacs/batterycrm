package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class s6a implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6a b;

    public /* synthetic */ s6a(u6a u6aVar, int i) {
        this.a = i;
        this.b = u6aVar;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        boolean zContains;
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                num.getClass();
                o6a o6aVar = this.b.c;
                List listD0 = ue3.d0(((f6a) o6aVar.d.getValue()).b);
                if (listD0.isEmpty()) {
                    o6aVar.a();
                } else {
                    o6aVar.c.invoke(listD0, num);
                }
                return qqg.a;
            default:
                int iIntValue = num.intValue();
                u6a u6aVar = this.b;
                fb6 fb6Var = u6aVar.b;
                if (fb6Var.j() < iIntValue || iIntValue < 0) {
                    zContains = false;
                } else {
                    fff fffVar = (fff) ((t98) fb6Var.C(iIntValue));
                    zContains = ((f6a) u6aVar.c.e.a.getValue()).b.contains(Long.valueOf(fffVar.a));
                }
                return Boolean.valueOf(zContains);
        }
    }
}
