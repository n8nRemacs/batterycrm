package defpackage;

import java.util.regex.Pattern;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final /* synthetic */ class wg5 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wg5(int i, String str, xg5 xg5Var) {
        this.a = 0;
        this.b = i;
        this.c = str;
        this.d = xg5Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj2;
                xg5 xg5Var = (xg5) obj;
                ree[] reeVarArr = new ree[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    reeVarArr[i3] = r9j.a(str + '.' + xg5Var.e[i3], nnf.e, new ree[0]);
                }
                return reeVarArr;
            case 1:
                cn1 cn1Var = (cn1) obj2;
                Widget widget = (Widget) obj;
                uid uidVar = new uid();
                CharSequence charSequenceB = cn1Var.E.b(widget.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                Integer num = cn1Var.F;
                uye uyeVar = new uye(uidVar, 0);
                ccb ccbVar = new ccb(widget);
                ccbVar.h(charSequenceB);
                if (num != null) {
                    ccbVar.e(new qcb(num.intValue()));
                }
                ccbVar.d(new ns1(4, uyeVar));
                ccbVar.c(new kcb(0, 0, i2, 3));
                bcb bcbVarI = ccbVar.i();
                uidVar.a = bcbVarI;
                return bcbVarI;
            case 2:
                dn1 dn1Var = (dn1) obj;
                uid uidVar2 = new uid();
                p5g p5gVar = dn1Var.D;
                da1 da1Var = dn1Var.E;
                uye uyeVar2 = new uye(uidVar2, 1);
                ccb ccbVar2 = new ccb((Widget) obj2);
                ccbVar2.g(p5gVar);
                ccbVar2.e(tcb.a);
                ccbVar2.f(vcb.a);
                ccbVar2.d(new z9a(uyeVar2, 25, da1Var));
                ccbVar2.c(new kcb(0, 0, i2, 3));
                bcb bcbVarI2 = ccbVar2.i();
                uidVar2.a = bcbVarI2;
                return bcbVarI2;
            default:
                Pattern pattern = spf.b;
                return io5.a((String) obj2, i2, (pf2) ((a93) obj).a);
        }
    }

    public /* synthetic */ wg5(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public /* synthetic */ wg5(String str, int i, a93 a93Var) {
        this.a = 3;
        this.c = str;
        this.b = i;
        this.d = a93Var;
    }
}
